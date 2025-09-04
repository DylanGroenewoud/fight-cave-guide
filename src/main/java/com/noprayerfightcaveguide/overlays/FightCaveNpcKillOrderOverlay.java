package com.noprayerfightcaveguide.overlays;

import com.noprayerfightcaveguide.FightCaveWave;
import com.noprayerfightcaveguide.KillTarget;
import com.noprayerfightcaveguide.NoPrayerFightCaveGuidePlugin;
import com.noprayerfightcaveguide.config.PluginConfig;
import com.noprayerfightcaveguide.data.RegularWaveData;
import com.noprayerfightcaveguide.data.SpeedrunWaveData;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;

import javax.inject.Inject;
import java.awt.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class FightCaveNpcKillOrderOverlay extends OverlayPanel {
    private final NoPrayerFightCaveGuidePlugin plugin;

    private final Client client;
    private final PluginConfig config;
    private int currentPriority = 1;
    private int lastWave = -1;

    @Inject
    public FightCaveNpcKillOrderOverlay(Client client, NoPrayerFightCaveGuidePlugin plugin, PluginConfig config) {
        this.plugin = plugin;
        this.client = client;
        this.config = config;

        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (!plugin.isFightCavesActive()) {
            return null;
        }

        Map<Integer, FightCaveWave> waveMapping = plugin.isSpeedrunMode()
                ? SpeedrunWaveData.waveTileMap
                : RegularWaveData.waveTileMap;

        FightCaveWave currentWave = waveMapping.get(plugin.getCurrentWave());

        if (plugin.getCurrentWave() != lastWave) {
            lastWave = plugin.getCurrentWave();
            resetKillOrder(currentWave);
        }

        renderKillOrder(graphics, currentWave);

        return null;
    }

    private void renderKillOrder(Graphics2D graphics, FightCaveWave wave) {
        if (wave == null) return;

        IndexedObjectSet<NPC> npcs = (IndexedObjectSet<NPC>) client.getTopLevelWorldView().npcs();

        boolean anyNpcSpawned = npcs.stream()
                .anyMatch(npc -> wave.getKillOrder().stream()
                        .anyMatch(t -> t.getNpcId() == npc.getId()));
        if (!anyNpcSpawned) return;

        List<KillTarget> currentGroup = wave.getKillOrder().stream()
                .filter(t -> t.getPriority() == currentPriority)
                .collect(Collectors.toList());

        boolean anyAlive = currentGroup.stream()
                .anyMatch(t -> npcs.stream().anyMatch(npc -> npc.getId() == t.getNpcId()));

        if (!anyAlive) {
            int maxPriority = wave.getKillOrder().stream()
                    .mapToInt(KillTarget::getPriority)
                    .max()
                    .orElse(currentPriority);
            if (currentPriority < maxPriority) {
                currentPriority++;
                currentGroup = wave.getKillOrder().stream()
                        .filter(t -> t.getPriority() == currentPriority)
                        .collect(Collectors.toList());
            }
        }

        for (KillTarget target : currentGroup) {
            for (NPC npc : npcs) {
                if (npc.getId() == target.getNpcId()) {
                    renderNpcOutline(graphics, npc);
                }
            }
        }
    }

    private void resetKillOrder(FightCaveWave wave) {
        if (wave == null) return;

        // Reset priority for the new wave
        currentPriority = wave.getKillOrder().stream()
                .mapToInt(KillTarget::getPriority)
                .min()
                .orElse(1);

        log.debug("Reset kill order for wave {}, currentPriority={}",
                plugin.getCurrentWave(), currentPriority);
    }

    private void renderNpcOutline(Graphics2D graphics, NPC npc) {
        Shape hull = npc.getConvexHull();
        if (hull != null) {
            graphics.setColor(config.npcOutlineColor());
            graphics.setStroke(new BasicStroke(2.0f));
            graphics.draw(hull);
        }
    }
}
