package com.noprayerfightcaveguide.data;

import com.noprayerfightcaveguide.FightCaveWave;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegularWaveData {
    public static final Map<Integer, FightCaveWave> waveTileMap = new HashMap<>();

    static {
        waveTileMap.put(1, new FightCaveWave.Builder(
                List.of(new Point(2413, 5117), new Point(2404, 5082)))
                .build());

        waveTileMap.put(2, new FightCaveWave.Builder(
                List.of(new Point(2404, 5082), new Point(2412, 5082)))
                .build());

        waveTileMap.put(3, new FightCaveWave.Builder(
                List.of(new Point(2412, 5082), new Point(2391, 5079)))
                .build());

        waveTileMap.put(4, new FightCaveWave.Builder(
                List.of(new Point(2391, 5079), new Point(2392, 5087)))
                .build());

        waveTileMap.put(5, new FightCaveWave.Builder(
                List.of(new Point(2392, 5087), new Point(2385, 5085), new Point(2385, 5081)))
                .build());

        waveTileMap.put(6, new FightCaveWave.Builder(
                List.of(new Point(2385, 5081), new Point(2380, 5073)))
                .build());

        waveTileMap.put(7, new FightCaveWave.Builder(
                List.of(new Point(2380, 5073), new Point(2409, 5073)))
                .build());

        waveTileMap.put(8, new FightCaveWave.Builder(
                List.of(new Point(2409, 5073), new Point(2403, 5072)))
                .build());

        waveTileMap.put(9, new FightCaveWave.Builder(
                List.of(new Point(2403, 5072), new Point(2392, 5080)))
                .build());

        waveTileMap.put(10, new FightCaveWave.Builder(
                List.of(new Point(2392, 5080), new Point(2386, 5076), new Point(2384, 5076), new Point(2384, 5081), new Point(2398, 5086)))
                .build());

        waveTileMap.put(11, new FightCaveWave.Builder(
                List.of(new Point(2398, 5086), new Point(2420, 5083)))
                .build());

        waveTileMap.put(12, new FightCaveWave.Builder(
                List.of(new Point(2420, 5083), new Point(2404, 5100), new Point(2384, 5100)))
                .build());

        waveTileMap.put(13, new FightCaveWave.Builder(
                List.of(
                        new Point(2384, 5100),
                        new Point(2384, 5095),
                        new Point(2381, 5101)
                ))
                .build());

        waveTileMap.put(14, new FightCaveWave.Builder(
                List.of(
                        new Point(2381, 5101),
                        new Point(2384, 5095)
                ))
                .currentWaveMessages(List.of("Corner trap the other 90"))
                .build());

        waveTileMap.put(15, new FightCaveWave.Builder(
                List.of(
                        new Point(2384, 5095),
                        new Point(2385, 5095),
                        new Point(2385, 5081),
                        new Point(2383, 5081)
                ))
                .build());

        waveTileMap.put(16, new FightCaveWave.Builder(
                List.of(
                        new Point(2383, 5081)
                ))
                .build());

        waveTileMap.put(17, new FightCaveWave.Builder(
                List.of(new Point(2383, 5081)))
                .build());

        waveTileMap.put(18, new FightCaveWave.Builder(
                List.of(
                        new Point(2383, 5081),
                        new Point(2391, 5086),
                        new Point(2391, 5106),
                        new Point(2384, 5106)
                ))
                .build());

        waveTileMap.put(19, new FightCaveWave.Builder(
                List.of(new Point(2384, 5106), new Point(2391, 5106), new Point(2384, 5103)))
                .build());

        waveTileMap.put(20, new FightCaveWave.Builder(
                List.of(new Point(2384, 5103), new Point(2391, 5106), new Point(2415, 5089)))
                .build());

        waveTileMap.put(21, new FightCaveWave.Builder(
                List.of(
                        new Point(2415, 5089),
                        new Point(2418, 5083)
                ))
                .build());

        waveTileMap.put(22, new FightCaveWave.Builder(
                List.of(
                        new Point(2418, 5083),
                        new Point(2415, 5089),
                        new Point(2413, 5089),
                        new Point(2413, 5100),
                        new Point(2422, 5100)
                ))
                .build());

        waveTileMap.put(23, new FightCaveWave.Builder(
                List.of(new Point(2422, 5100), new Point(2414, 5100), new Point(2404, 5093), new Point(2383, 5081)))
                .build());

        waveTileMap.put(24, new FightCaveWave.Builder(
                List.of(new Point(2383, 5081), new Point(2384, 5076), new Point(2384, 5081), new Point(2371, 5081)))
                .build());

        waveTileMap.put(25, new FightCaveWave.Builder(
                List.of(new Point(2371, 5081), new Point(2383, 5081), new Point(2391, 5106)))
                .build());

        waveTileMap.put(26, new FightCaveWave.Builder(
                List.of(
                        new Point(2391, 5106),
                        new Point(2383, 5101)
                ))
                .build());

        waveTileMap.put(27, new FightCaveWave.Builder(
                List.of(
                        new Point(2383, 5101),
                        new Point(2372, 5099),
                        new Point(2384, 5095)
                ))
                .nextWaveMessages(List.of(
                    "Blowpipe spec the 45 and then corner block the 90"
                ))
                .build());

        waveTileMap.put(28, new FightCaveWave.Builder(
                List.of(
                        new Point(2384, 5095),
                        new Point(2391, 5106)
                ))
                .requiresLogout()
                .currentWaveMessages(List.of(
                    "Keep standing on the start tile and corner trap the 90"
                ))
                .build());

        waveTileMap.put(29, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2371, 5081)
                ))
                .build());

        waveTileMap.put(30, new FightCaveWave.Builder(
                List.of(
                        new Point(2383, 5081),
                        new Point(2415, 5089),
                        new Point(2407, 5091)
                ))
                .build());

        waveTileMap.put(31, new FightCaveWave.Builder(
                List.of(
                        new Point(2407, 5091),
                        new Point(2422, 5100)
                ))
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(32, new FightCaveWave.Builder(
                List.of(
                        new Point(2411, 5097),
                        new Point(2422, 5100)
                ))
                .build());

        waveTileMap.put(33, new FightCaveWave.Builder(
                List.of(
                        new Point(2414, 5100)
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(34, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2384, 5100),
                        new Point(2384, 5095)
                ))
                .requiresLogout()
                .nextWaveMessages(List.of(
                    "Center 360 spawn"
                ))
                .build());

        waveTileMap.put(35, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2407, 5088),
                        new Point(2407, 5070),
                        new Point(2384, 5076)
                ))
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(36, new FightCaveWave.Builder(
                List.of(
                        new Point(2384, 5076),
                        new Point(2384, 5081),
                        new Point(2371, 5081),
                        new Point(2384, 5081)
                ))
                .requiresLogout()
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(37, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2384, 5100),
                        new Point(2372, 5100),
                        new Point(2384, 5095)
                ))
                .currentWaveMessages(List.of(
                "No need to eat up for the next wave"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(38, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2422, 5100),
                        new Point(2414, 5100),
                        new Point(2422, 5105)
                ))
                .currentWaveMessages(List.of(
                "Wait at tile 2; get the 90 next to the 360"
                ))
                .nextWaveMessages(List.of(
                "Eat sweets and blowpipe spec the bat"
                ))
                .build());

        waveTileMap.put(39, new FightCaveWave.Builder(
                List.of(
                        new Point(2422, 5105),
                        new Point(2422, 5100),
                        new Point(2414, 5100)
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(40, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2371, 5081),
                        new Point(2384, 5081)
                ))
                .requiresLogout()
                .nextWaveMessages(List.of("P-neck wave"))
                .build());

        waveTileMap.put(41, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2422, 5117),
                        new Point(2418, 5100),
                        new Point(2414, 5100)
                ))
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(42, new FightCaveWave.Builder(
                List.of(
                        new Point(2414, 5100),
                        new Point(2414, 5117),
                        new Point(2422, 5117),
                        new Point(2415, 5100),
                        new Point(2384, 5100)
                ))
                .currentWaveMessages(List.of(
                    "Trap the 45 behind the 360 before running into the corner"
                ))
                .build());

        waveTileMap.put(43, new FightCaveWave.Builder(
                List.of(
                        new Point(2384, 5100),
                        new Point(2384, 5095)
                ))
                .nextWaveMessages(List.of(
                        "Blowpipe spec the 45 and run far EAST"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(44, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2414, 5105),
                        new Point(2422, 5102),
                        new Point(2414, 5100),
                        new Point(2422, 5117)
                ))
                .currentWaveMessages(List.of(
                    "Blowpipe spec the 45 and run EAST"
                ))
                .nextWaveMessages(List.of(
                    "~30+hp, start in the NE corner"
                ))
                .build());

        waveTileMap.put(45, new FightCaveWave.Builder(
                List.of(
                        new Point(2422, 5117),
                        new Point(2416, 5107),
                        new Point(2404, 5117),
                        new Point(2404, 5106),
                        new Point(2399, 5095)
                ))
                .currentWaveMessages(List.of(
                        "Eat to ~30+hp",
                        "Preferably save special attack for the next wave"
                ))
                .nextWaveMessages(List.of(
                        "360 mid spawn",
                        "Auto-retaliate on"
                ))
                .build());

        waveTileMap.put(46, new FightCaveWave.Builder(
                List.of(
                        new Point(2399, 5095),
                        new Point(2408, 5111),
                        new Point(2422, 5100)
                ))
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(47, new FightCaveWave.Builder(
                List.of(
                        new Point(2422, 5100),
                        new Point(2414, 5100)
                ))
                .build());

        waveTileMap.put(48, new FightCaveWave.Builder(
                List.of(
                        new Point(2414, 5100)
                ))
                .currentWaveMessages(List.of(
                        "Use the FIRST 22 to block the 180",
                        "Heal to ~10hp at the end of the wave"
                ))
                .nextWaveMessages(List.of(
                    "Blowpipe spec the 45"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(49, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2384, 5100),
                        new Point(2372, 5098),
                        new Point(2384, 5095)
                ))
                .currentWaveMessages(List.of(
                    "Blowpipe spec the 45, block 180 with 22s",
                    "At the end of the wave eat up to full"
                )).nextWaveMessages(List.of(
                    "Run towards tile 2 and kill the bat",
                    "After killing the bat run into tick-eat range of the 360"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(50, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2413, 5083),
                        new Point(2407, 5088),
                        new Point(2407, 5072),
                        new Point(2384, 5062)
                ))
                .currentWaveMessages(List.of(
                    "Run towards tile 2 and kill the bat",
                    "Quickly get within tick-eat range of the 360"
                ))
                .build());

        waveTileMap.put(51, new FightCaveWave.Builder(
                List.of(
                        new Point(2384, 5062),
                        new Point(2384, 5081),
                        new Point(2384, 5081),
                        new Point(2385, 5081),
                        new Point(2385, 5095),
                        new Point(2384, 5100)
                ))
                .nextWaveMessages(List.of(
                    "Kill the first 45, use second to block 180"
                ))
                .build());

        waveTileMap.put(52, new FightCaveWave.Builder(
                List.of(
                        new Point(2384, 5100),
                        new Point(2384, 5097),
                        new Point(2372, 5098),
                        new Point(2384, 5095)
                ))
                .currentWaveMessages(List.of(
                        "Kill the first 45, use second to block 180"
                ))
                .nextWaveMessages(List.of(
                    "WAIT AT TILE 2 (get the 180 stuck behind the 360)"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(53, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2414, 5102),
                        new Point(2422, 5102),
                        new Point(2414, 5100),
                        new Point(2422, 5117)
                ))
                .currentWaveMessages(List.of(
                        "WAIT AT TILE 2 (get the 180 stuck behind the 360)",
                        "At the end of the wave run into the NE corner"
                ))
                .build());

        waveTileMap.put(54, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2414, 5117),
                        new Point(2414, 5105),
                        new Point(2414, 5105),
                        new Point(2414, 5100)
                ))
                .requiresLogout()
                .currentWaveMessages(List.of(
                    "Run towards to tile in front of the entrance",
                    "After killing the 90, step out and lure the bat to block the 180"
                ))
                .build());

        waveTileMap.put(55, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2384, 5062),
                        new Point(2384, 5081),
                        new Point(2386, 5079),
                        new Point(2392, 5078),
                        new Point(2384, 5095),
                        new Point(2372, 5098)
                ))
                .currentWaveMessages(List.of(
                    "Run around the 360 to the other opposite corner"
                ))
                .nextWaveMessages(List.of(
                    "P-neck wave"
                ))
                .build());

        waveTileMap.put(56, new FightCaveWave.Builder(
                List.of(
                        new Point(2372, 5098),
                        new Point(2384, 5095)
                ))
                .requiresLogout()
                .requiresAutoRetaliate()
                .currentWaveMessages(List.of(
                       "P-neck wave"
                ))
                .build());

        waveTileMap.put(57, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2422, 5100),
                        new Point(2414, 5100)
                ))
                .requiresLogout()
                .currentWaveMessages(List.of(
                       "WAIT AT TILE 2 (get the 90 next to the 360)"
                ))
                .nextWaveMessages(List.of(
                        "~15hp+ before starting the next wave"
                ))
                .build());

        waveTileMap.put(58, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2382, 5102),
                        new Point(2372, 5098),
                        new Point(2384, 5095)
                ))
                .requiresLogout()
                .currentWaveMessages(List.of(
                    "Blowpipe spec the 90"
                ))
                .nextWaveMessages(List.of(
                    "~10hp"
                ))
                .build());

        waveTileMap.put(59, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2414, 5117),
                        new Point(2412, 5106),
                        new Point(2414, 5106),
                        new Point(2414, 5100),
                        new Point(2384, 5062)
                ))
                .currentWaveMessages(List.of(
                    "Blowpipe spec the 90",
                    "Corner block the 180"
                ))
                .build());

        waveTileMap.put(60, new FightCaveWave.Builder(
                List.of(
                        new Point(2384, 5062),
                        new Point(2384, 5081)
                ))
                .currentWaveMessages(List.of(
                    "Try to save special attack for the next wave",
                    "Turn on auto-retaliate the next wave"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(61, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2422, 5100),
                        new Point(2414, 5100)
                ))
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(62, new FightCaveWave.Builder(
                List.of(
                        new Point(2414, 5100)
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(63, new FightCaveWave.Builder(
                List.of(
                        new Point(2400, 5088),
                        new Point(2411, 5074),
                        new Point(2412, 5072),
                        new Point(2410, 5079)
                ))
                .build());
    }

    public static FightCaveWave getWaveTiles(int wave)
    {
        return waveTileMap.get(wave);
    }
}
