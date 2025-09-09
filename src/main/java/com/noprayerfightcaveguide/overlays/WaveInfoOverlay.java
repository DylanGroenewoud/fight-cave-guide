package com.noprayerfightcaveguide.overlays;

import com.noprayerfightcaveguide.FightCaveWave;
import com.noprayerfightcaveguide.data.RegularWaveData;
import com.noprayerfightcaveguide.data.SpeedrunWaveData;
import com.noprayerfightcaveguide.NoPrayerFightCaveGuidePlugin;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.*;
import net.runelite.client.ui.overlay.components.*;

import javax.inject.Inject;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
public class WaveInfoOverlay extends OverlayPanel
{
    private final NoPrayerFightCaveGuidePlugin plugin;
    private final Client client;

    @Inject
    public WaveInfoOverlay(Client client, NoPrayerFightCaveGuidePlugin plugin)
    {
        this.plugin = plugin;
        this.client = client;

        setPosition(OverlayPosition.BOTTOM_LEFT);
        setLayer(OverlayLayer.ABOVE_WIDGETS);
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        if (client.getLocalPlayer() == null || !plugin.isFightCavesActive())
            return null;

        panelComponent.getChildren().clear();

        int currentWaveNum = plugin.getCurrentWave();

        Map<Integer, FightCaveWave> waveMapping = plugin.isSpeedrunMode()
                ? SpeedrunWaveData.waveTileMap
                : RegularWaveData.waveTileMap;

        FightCaveWave currentWave = waveMapping.get(currentWaveNum);

        List<ColoredText> waveTexts = new ArrayList<>();
        waveTexts.add(new ColoredText("Current wave: " + currentWaveNum, Color.WHITE));

        if (currentWave != null) {
            currentWave.getCurrentWaveMessages().forEach(msg ->
                    waveTexts.add(new ColoredText("- " + msg, Color.WHITE))
            );

            if (!currentWave.getNextWaveMessages().isEmpty()) {
                waveTexts.add(new ColoredText("", Color.WHITE)); // spacer
                waveTexts.add(new ColoredText("Next wave (" + (currentWaveNum + 1) + "):", Color.WHITE));
                currentWave.getNextWaveMessages().forEach(msg ->
                        waveTexts.add(new ColoredText("- " + msg, Color.WHITE))
                );
            }
        }

        int width = populatePanel(panelComponent, waveTexts, graphics);
        FontMetrics fm = graphics.getFontMetrics();
        int height = panelComponent.getChildren().size() * fm.getHeight();

        panelComponent.setPreferredSize(new Dimension(width, height));

        return super.render(graphics);
    }

    private int populatePanel(PanelComponent panel, List<ColoredText> texts, Graphics2D graphics)
    {
        FontMetrics fm = graphics.getFontMetrics();
        int longest = 0;
        int padding = 20;
        int maxWidth = 450;

        for (ColoredText ct : texts) {
            if (ct.text.trim().isEmpty()) {
                panel.getChildren().add(LineComponent.builder().left(" ").build());
                continue;
            }

            panel.getChildren().add(LineComponent.builder()
                    .left(ct.text)
                    .leftColor(ct.color)
                    .build());

            longest = Math.max(longest, fm.stringWidth(ct.text) + padding);
        }

        return Math.min(longest, maxWidth);
    }

    private static class ColoredText
    {
        final String text;
        final Color color;

        ColoredText(String text, Color color) {
            this.text = text;
            this.color = color != null ? color : Color.WHITE;
        }
    }
}
