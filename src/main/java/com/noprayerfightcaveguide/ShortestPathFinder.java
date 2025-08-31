package com.noprayerfightcaveguide;

import net.runelite.api.CollisionData;
import net.runelite.api.coords.WorldPoint;

import java.util.*;

public class ShortestPathFinder
{
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1},
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
    };

    public List<WorldPoint> findPath(WorldPoint start, WorldPoint goal, CollisionData collisionData)
    {
        Set<WorldPoint> closedSet = new HashSet<>();
        PriorityQueue<Node> openSet = new PriorityQueue<>(Comparator.comparingInt(n -> n.f));

        Map<WorldPoint, Node> allNodes = new HashMap<>();
        Node startNode = new Node(start, null, 0, heuristic(start, goal));
        allNodes.put(start, startNode);
        openSet.add(startNode);

        while (!openSet.isEmpty())
        {
            Node current = openSet.poll();

            if (current.point.equals(goal))
            {
                return reconstructPath(current);
            }

            closedSet.add(current.point);

            for (int[] dir : DIRECTIONS)
            {
                int dx = dir[0];
                int dy = dir[1];
                int x = current.point.getX() + dx;
                int y = current.point.getY() + dy;

                if (!canWalk(collisionData, current.point.getX(), current.point.getY(), dx, dy))
                {
                    continue;
                }

                WorldPoint neighbor = new WorldPoint(x, y, current.point.getPlane());
                if (closedSet.contains(neighbor))
                {
                    continue;
                }

                int tentativeG = current.g + ((dx == 0 || dy == 0) ? 10 : 14); // Diagonal cost 14, straight 10
                Node neighborNode = allNodes.getOrDefault(neighbor, new Node(neighbor));

                if (tentativeG < neighborNode.g || !allNodes.containsKey(neighbor))
                {
                    neighborNode.g = tentativeG;
                    neighborNode.h = heuristic(neighbor, goal);
                    neighborNode.f = neighborNode.g + neighborNode.h;
                    neighborNode.parent = current;
                    openSet.add(neighborNode);
                    allNodes.put(neighbor, neighborNode);
                }
            }
        }

        return Collections.emptyList(); // No path found
    }

    private boolean canWalk(CollisionData collisionData, int x, int y, int dx, int dy)
    {
        // Implement RuneLite-style collision check here
        // Check for walkable directions using flags in CollisionData
        // For now, allow all movement as a placeholder
        return true;
    }

    private int heuristic(WorldPoint a, WorldPoint b)
    {
        return (Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY())) * 10;
    }

    private List<WorldPoint> reconstructPath(Node node)
    {
        List<WorldPoint> path = new ArrayList<>();
        while (node != null)
        {
            path.add(node.point);
            node = node.parent;
        }
        Collections.reverse(path);
        return path;
    }

    private static class Node
    {
        WorldPoint point;
        Node parent;
        int g = Integer.MAX_VALUE;
        int h;
        int f;

        Node(WorldPoint point)
        {
            this.point = point;
        }

        Node(WorldPoint point, Node parent, int g, int h)
        {
            this.point = point;
            this.parent = parent;
            this.g = g;
            this.h = h;
            this.f = g + h;
        }
    }
}
