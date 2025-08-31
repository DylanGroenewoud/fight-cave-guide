package com.noprayerfightcaveguide.overlays;

import javax.inject.Inject;

import com.noprayerfightcaveguide.NoPrayerFightCaveGuidePlugin;
import com.noprayerfightcaveguide.FightCaveWave;
import com.noprayerfightcaveguide.ShortestPathFinder;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.api.CollisionData;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.Perspective;

import static com.noprayerfightcaveguide.FightCaveWaveData.waveTileMap;

import java.util.*;
import java.awt.*;
import java.util.List;

@Slf4j
public class FightCaveTileOverlay extends OverlayPanel {
    private final NoPrayerFightCaveGuidePlugin plugin;

    private final Client client;

    private final ShortestPathFinder shortestPathFinder;

    @Inject
    public FightCaveTileOverlay(Client client, NoPrayerFightCaveGuidePlugin plugin) {
        this.plugin = plugin;
        this.client = client;
        this.shortestPathFinder = new ShortestPathFinder();

        setPosition(OverlayPosition.DYNAMIC);
        setPriority(OverlayPriority.MED);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (client.getLocalPlayer() == null || !plugin.isFightCavesActive()) {
            return null;
        }

        int plane = client.getPlane();
        CollisionData collisionData = client.getCollisionMaps()[plane];

        FightCaveWave currentWave = waveTileMap.get(plugin.getCurrentWave());

        // Draw the current wave
        if (currentWave != null) {
            List<Point> currentWaveCoords = currentWave.getCoords();
            drawWaveTiles(graphics, currentWaveCoords, plane);
            drawWavePath(graphics, currentWaveCoords, plane, collisionData, false);

        }

        // Draw the next wave
        FightCaveWave nextWave = waveTileMap.get(plugin.getCurrentWave() + 1);
        if (nextWave != null) {
            List<Point> nextWaveCoords = nextWave.getCoords();
            if (nextWaveCoords.size() > 1) {
                drawWavePath(graphics, nextWaveCoords, plane, collisionData, true);
            }
        }

        return super.render(graphics);
    }

    private void drawWaveTiles(Graphics2D graphics, List<Point> coords, int plane) {
        for (int i = 0; i < coords.size(); i++) {
            Point p = coords.get(i);

            WorldPoint wp = new WorldPoint(p.x, p.y, plane);
            Collection<WorldPoint> instanceTiles = WorldPoint.toLocalInstance(client, wp);
            if (instanceTiles == null || instanceTiles.isEmpty()) {
                continue;
            }

            WorldPoint instanceTile = instanceTiles.iterator().next();
            LocalPoint lp = LocalPoint.fromWorld(client, instanceTile);
            if (lp == null) {
                continue;
            }

            Polygon poly = Perspective.getCanvasTilePoly(client, lp);
            if (poly == null) {
                continue;
            }

            Rectangle bounds = poly.getBounds();
            FontMetrics metrics = graphics.getFontMetrics();

            // Start tile
            if (i == 0) {

                // Draw tile
                graphics.setColor(new Color(45, 221, 53, 25));
                graphics.fill(poly);

                // Draw text
                graphics.setColor(Color.WHITE);
                String label = "start";
                int labelWidth = metrics.stringWidth(label);
                graphics.drawString(label,
                        bounds.x + (bounds.width - labelWidth) / 2,
                        bounds.y + bounds.height / 2 + metrics.getAscent() / 2
                );
            }

            // End tile
            else if (i == coords.size() - 1) {

                // Draw tile
                graphics.setColor(new Color(255, 23, 23, 25));
                graphics.fill(poly);

                // Draw text
                graphics.setColor(Color.WHITE);
                String label = "end";
                int labelWidth = metrics.stringWidth(label);
                graphics.drawString(label,
                        bounds.x + (bounds.width - labelWidth) / 2,
                        bounds.y + bounds.height / 2 + metrics.getAscent() / 2
                );
            }

            // Tiles in between
            else {
                float progress = (float) i / (coords.size() - 1);
                Color tileColor = getGradientColor(progress);
                graphics.setColor(tileColor);
                graphics.fill(poly);
                graphics.setColor(Color.WHITE);
                String label = String.valueOf(i + 1);
                int labelWidth = metrics.stringWidth(label);
                graphics.drawString(label,
                        bounds.x + (bounds.width - labelWidth) / 2,
                        bounds.y + bounds.height / 2 + metrics.getAscent() / 2
                );
            }

            graphics.setColor(Color.BLACK);
            graphics.draw(poly);
        }
    }

    private void drawWavePath(Graphics2D graphics, List<Point> coords, int plane, CollisionData collisionData, boolean isGray) {
        List<WorldPoint> fullPath = new ArrayList<>();

        for (int i = 0; i < coords.size() - 1; i++) {
            Point start = coords.get(i);
            Point end = coords.get(i + 1);

            WorldPoint wpStart = new WorldPoint(start.x, start.y, plane);
            WorldPoint wpEnd = new WorldPoint(end.x, end.y, plane);

            List<WorldPoint> segmentPath = shortestPathFinder.findPath(wpStart, wpEnd, collisionData);
            if (segmentPath != null && !segmentPath.isEmpty()) {
                fullPath.addAll(segmentPath);
            }
        }

        for (int i = 0; i < fullPath.size(); i++) {

            WorldPoint wp = fullPath.get(i);

            Collection<WorldPoint> instanceTiles = WorldPoint.toLocalInstance(client, wp);
            if (instanceTiles == null || instanceTiles.isEmpty()) {
                continue;
            }

            WorldPoint instanceTile = instanceTiles.iterator().next();
            LocalPoint lp = LocalPoint.fromWorld(client, instanceTile);
            if (lp == null) {
                continue;
            }

            Polygon poly = Perspective.getCanvasTilePoly(client, lp);
            if (poly != null) {
                if (isGray) {
                    graphics.setColor(new Color(200, 200, 200, 10));
                    graphics.fill(poly);
                } else {
                    float t = (float) i / (fullPath.size() - 1);
                    Color baseColor = getGradientColor(t);
                    Color translucent = new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), 25);
                    graphics.setColor(translucent);
                    graphics.fill(poly);
                }

                graphics.draw(poly);
            }
        }
    }

    private Color getGradientColor(float t)
    {
        // Clamp t between 0 and 1
        t = Math.max(0f, Math.min(1f, t));

        int r = (int) (45 + t * (255 - 45));
        int g = (int) (221 + t * (23 - 221));
        int b = (int) (53 + t * (23 - 53));

        return new Color(r, g, b, 25);
    }
}
