package com.noprayerfightcaveguide.overlays;

import com.noprayerfightcaveguide.FightCaveWave;
import com.noprayerfightcaveguide.FightCaveWaveData;
import com.noprayerfightcaveguide.NoPrayerFightCaveGuidePlugin;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.*;
import net.runelite.client.ui.overlay.components.*;

import javax.inject.Inject;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StatusOverlay extends OverlayPanel
{
    private final NoPrayerFightCaveGuidePlugin plugin;
    private final Client client;

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
        if (client.getLocalPlayer() == null || !plugin.isFightCavesActive())
            return null;

        panelComponent.getChildren().clear();

        int currentWaveNum = plugin.getCurrentWave();
        FightCaveWave currentWave = FightCaveWaveData.waveTileMap.get(currentWaveNum);

        List<ColoredText> statusTexts = new ArrayList<>();

        if (currentWave != null && currentWave.requiresLogout() && !plugin.isLogoutRequested())
            statusTexts.add(new ColoredText("Logout required", Color.RED));

        if (plugin.isLogoutRequested())
            statusTexts.add(new ColoredText("Logout requested", Color.GREEN));

        if (currentWave != null && currentWave.requiresAutoRetaliate())
        {
            boolean on = plugin.isAutoRetaliateActive();
            statusTexts.add(new ColoredText("Auto-retaliate: " + (on ? "ON" : "OFF"),
                    on ? Color.GREEN : Color.RED));
        }
        else if (plugin.isAutoRetaliateActive())
            statusTexts.add(new ColoredText("Auto-retaliate: ON", Color.ORANGE));

        int width = populatePanel(panelComponent, statusTexts, graphics);
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

        for (ColoredText ct : texts)
        {
            if (ct.text.trim().isEmpty())
            {
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

        ColoredText(String text, Color color)
        {
            this.text = text;
            this.color = color != null ? color : Color.WHITE;
        }
    }
}
