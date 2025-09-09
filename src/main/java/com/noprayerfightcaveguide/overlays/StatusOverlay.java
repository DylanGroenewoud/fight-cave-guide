package com.noprayerfightcaveguide.overlays;

import com.noprayerfightcaveguide.FightCaveWave;
import com.noprayerfightcaveguide.data.RegularWaveData;
import com.noprayerfightcaveguide.data.SpeedrunWaveData;
import com.noprayerfightcaveguide.NoPrayerFightCaveGuidePlugin;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.ui.overlay.*;
import net.runelite.client.ui.overlay.components.*;

import javax.inject.Inject;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class StatusOverlay extends OverlayPanel
{
    private final NoPrayerFightCaveGuidePlugin plugin;
    private final Client client;

    private static final int PADDING = 20;
    private static final int MAX_WIDTH = 450;

    @Inject
    private PluginManager pluginManager;

    @Inject
    private ConfigManager configManager;

    @Inject
    public StatusOverlay(Client client, NoPrayerFightCaveGuidePlugin plugin)
    {
        this.plugin = plugin;
        this.client = client;

        setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        setLayer(OverlayLayer.ABOVE_WIDGETS);
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        FontMetrics fm = graphics.getFontMetrics();

        if (plugin.isInTzhaarArea() && plugin.getEntrance() != null) {
            renderPreCaveMessages(fm);
            return super.render(graphics);
        }

        if (client.getLocalPlayer() == null || !plugin.isFightCavesActive()) {
            return null;
        }

        renderInCaveMessages(fm);
        return super.render(graphics);
    }

    private void renderPreCaveMessages(FontMetrics fm)
    {
        panelComponent.getChildren().clear();
        AtomicInteger longest = new AtomicInteger();

        renderSpawnPredictorMessage(fm, longest);
        renderGroundHiderMessage(fm, longest);

        int height = panelComponent.getChildren().size() * fm.getHeight();
        panelComponent.setPreferredSize(new Dimension(longest.get() + 10, height)); // +10 padding
    }

    private void renderSpawnPredictorMessage(FontMetrics fm, AtomicInteger longest)
    {
        Optional<Plugin> fcSpawnPlugin = pluginManager.getPlugins().stream()
                .filter(p -> p.getClass().getSimpleName().equals("SpawnPredictorPlugin"))
                .findFirst();

        fcSpawnPlugin.ifPresentOrElse(p -> {
            String text = null;

            if (pluginManager.isPluginActive(p)) {
                String preferredRotation = configManager.getConfiguration("spawnpredictor", "desiredRotation");
                if (!"2".equals(preferredRotation)) {
                    text = "Rotation 2 is preferred";
                }
            } else {
                text = "Enable the FC Spawn Predictor plugin for rotation info";
            }

            if (text != null) {
                panelComponent.getChildren().add(LineComponent.builder()
                        .left(text)
                        .leftColor(Color.ORANGE)
                        .build());
                longest.set(Math.max(longest.get(), fm.stringWidth(text)));
            }
        }, () -> {
            String text = "Install the FC Spawn Predictor plugin to see rotation info";
            panelComponent.getChildren().add(LineComponent.builder()
                    .left(text)
                    .leftColor(Color.ORANGE)
                    .build());
            longest.set(Math.max(longest.get(), fm.stringWidth(text)));
        });
    }

    private void renderGroundHiderMessage(FontMetrics fm, AtomicInteger longest)
    {
        Optional<Plugin> groundHiderPlugin = pluginManager.getPlugins().stream()
                .filter(p -> p.getClass().getSimpleName().equals("ObjectHiderPlugin"))
                .findFirst();

        groundHiderPlugin.ifPresentOrElse(p -> {
            if (pluginManager.isPluginActive(p)) {
                String hiddenIds = configManager.getConfiguration("objecthider", "toHide");
                List<String> targetIds = List.of("11847", "11848", "11849", "11850");

                for (String id : targetIds) {
                    if (!hiddenIds.contains(id)) {
                        String text = "Object ID " + id + " is NOT hidden";
                        panelComponent.getChildren().add(LineComponent.builder()
                                .left(text)
                                .leftColor(Color.RED)
                                .build());
                        longest.set(Math.max(longest.get(), fm.stringWidth(text)));
                    }
                }
            } else {
                String text = "Enable the Ground Object Hider plugin";
                panelComponent.getChildren().add(LineComponent.builder()
                        .left(text)
                        .leftColor(Color.ORANGE)
                        .build());
                longest.set(Math.max(longest.get(), fm.stringWidth(text)));
            }
        }, () -> {
            String text = "This plugin works best with Ground Object Hider";
            panelComponent.getChildren().add(LineComponent.builder()
                    .left(text)
                    .leftColor(Color.ORANGE)
                    .build());
            longest.set(Math.max(longest.get(), fm.stringWidth(text)));
        });
    }

    private void renderInCaveMessages(FontMetrics fm)
    {
        panelComponent.getChildren().clear();
        int longest = 0;

        int currentWaveNum = plugin.getCurrentWave();
        Map<Integer, FightCaveWave> waveMapping = plugin.isSpeedrunMode()
                ? SpeedrunWaveData.waveTileMap
                : RegularWaveData.waveTileMap;
        FightCaveWave currentWave = waveMapping.get(currentWaveNum);

        // --- Logout status ---
        if (currentWave != null && currentWave.requiresLogout() && !plugin.isLogoutRequested()) {
            String text = "Logout required";
            panelComponent.getChildren().add(LineComponent.builder().left(text).leftColor(Color.RED).build());
            longest = Math.max(longest, fm.stringWidth(text) + PADDING);
        }

        if (plugin.isLogoutRequested()) {
            String text = "Logout requested";
            panelComponent.getChildren().add(LineComponent.builder().left(text).leftColor(Color.GREEN).build());
            longest = Math.max(longest, fm.stringWidth(text) + PADDING);
        }

        // --- Auto-retaliate status ---
        if (currentWave != null && currentWave.requiresAutoRetaliate()) {
            boolean on = plugin.isAutoRetaliateActive();
            String text = "Auto-retaliate: " + (on ? "ON" : "OFF");
            Color color = on ? Color.GREEN : Color.RED;

            panelComponent.getChildren().add(LineComponent.builder().left(text).leftColor(color).build());
            longest = Math.max(longest, fm.stringWidth(text) + PADDING);
        } else if (plugin.isAutoRetaliateActive()) {
            String text = "Auto-retaliate: ON";
            panelComponent.getChildren().add(LineComponent.builder().left(text).leftColor(Color.ORANGE).build());
            longest = Math.max(longest, fm.stringWidth(text) + PADDING);
        }

        panelComponent.setPreferredSize(new Dimension(Math.min(longest, MAX_WIDTH),
                panelComponent.getChildren().size() * fm.getHeight()));
    }
}
