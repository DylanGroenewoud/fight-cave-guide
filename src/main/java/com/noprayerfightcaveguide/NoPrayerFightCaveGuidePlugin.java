package com.noprayerfightcaveguide;

import com.noprayerfightcaveguide.config.PluginConfig;
import com.noprayerfightcaveguide.overlays.FightCaveTileOverlay;
import com.noprayerfightcaveguide.overlays.StatusOverlay;
import com.noprayerfightcaveguide.overlays.WaveInfoOverlay;
import lombok.Getter;
import net.runelite.client.events.ConfigChanged;
import org.apache.commons.lang3.ArrayUtils;
import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@PluginDescriptor(
		name = "No Prayer Fight Cave Guide"
)
public class NoPrayerFightCaveGuidePlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private FightCaveTileOverlay fightCaveTileOverlay;

	@Inject
	private StatusOverlay statusOverlay;

	@Inject
	private WaveInfoOverlay waveInfoOverlay;

	@Inject
	private PluginConfig config;

	@Getter
    private int currentWave;

	@Getter
	private boolean logoutRequested = false;

	private boolean hasBeenInFightCaves = false;

	private final Pattern WAVE_PATTERN = Pattern.compile(".*Wave: (\\d+).*");

	@Override
	protected void startUp()
	{
		currentWave = config.waveNumber();
		overlayManager.add(fightCaveTileOverlay);
		overlayManager.add(statusOverlay);
		overlayManager.add(waveInfoOverlay);
	}

	@Override
	protected void shutDown() {
		overlayManager.remove(fightCaveTileOverlay);
		overlayManager.remove(statusOverlay);
		overlayManager.remove(waveInfoOverlay);
	}

    public boolean isFightCavesActive()
	{
		return ArrayUtils.contains(client.getTopLevelWorldView().getMapRegions(), 9551) && client.getTopLevelWorldView().isInstance();
	}

	public boolean isAutoRetaliateActive()
	{
		// 1 = on, 0 = off
		return client.getVarpValue(172) == 0;
	}

	public boolean isSpeedrunMode() {
		return config.speedrunMode();
	}

	private void resetWave()
	{
		currentWave = 1;
		config.setWaveNumber(1);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN && isFightCavesActive())
		{
			currentWave = config.waveNumber();
			logoutRequested = false;
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		boolean currentlyInCave = isFightCavesActive();

		if (currentlyInCave)
		{
			hasBeenInFightCaves = true;
		}
		else if (hasBeenInFightCaves)
		{
			// Player was inside the cave before, now left it
			resetWave();
			hasBeenInFightCaves = false;
		}
	}

	@Subscribe
	private void onChatMessage(ChatMessage event)
	{
		handleWaveMessage(event);
		handleLogoutRequest(event);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("noprayerfightcaveguide"))
		{
			return;
		}

		if (event.getKey().equals("waveNumber"))
		{
			currentWave = config.waveNumber();
		}
	}

	private void handleWaveMessage(ChatMessage event)
	{
		if (event.getType() != ChatMessageType.GAMEMESSAGE) {
			return;
		}

		String message = Text.removeTags(event.getMessage());
		Matcher waveMatcher = WAVE_PATTERN.matcher(message);

		if (waveMatcher.matches()) {
			int parsedWave = Integer.parseInt(waveMatcher.group(1));

			if (parsedWave > currentWave) {
				logoutRequested = false;
			}

			currentWave = parsedWave;
			config.setWaveNumber(currentWave);
		}
	}

	private void handleLogoutRequest(ChatMessage event)
	{
		if (event.getType() != ChatMessageType.GAMEMESSAGE)
		{
			return;
		}

		String message = Text.removeTags(event.getMessage());

		if (message.contains("Your logout request has been received")) {
			logoutRequested = true;
		}

		if (message.contains("The Fight Cave has been paused. You may now log out.")) {

			if (isLogoutRequested()) {
				int nextWave = currentWave + 1;
				currentWave = nextWave;
				config.setWaveNumber(nextWave);
			}
		}
	}

	@Provides
	PluginConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PluginConfig.class);
	}
}