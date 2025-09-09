package com.noprayerfightcaveguide.data;

import com.noprayerfightcaveguide.FightCaveNpcID;
import com.noprayerfightcaveguide.FightCaveWave;
import com.noprayerfightcaveguide.KillTarget;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegularWaveData
{
    public static final Map<Integer, FightCaveWave> waveTileMap = new HashMap<>();

    static {
        waveTileMap.put(1, new FightCaveWave.Builder(
                List.of(new Point(2413, 5117), new Point(2404, 5082)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1)
                ))
                .build());

        waveTileMap.put(2, new FightCaveWave.Builder(
                List.of(new Point(2404, 5082), new Point(2412, 5082)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2)
                ))
                .build());

        waveTileMap.put(3, new FightCaveWave.Builder(
                List.of(new Point(2412, 5082), new Point(2391, 5079)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI)
                ))
                .build());

        waveTileMap.put(4, new FightCaveWave.Builder(
                List.of(new Point(2391, 5079), new Point(2392, 5087)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI)
                ))
                .build());

        waveTileMap.put(5, new FightCaveWave.Builder(
                List.of(new Point(2392, 5087), new Point(2385, 5085), new Point(2385, 5081)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI)
                ))
                .build());

        waveTileMap.put(6, new FightCaveWave.Builder(
                List.of(new Point(2385, 5081), new Point(2380, 5073)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI)
                ))
                .build());

        waveTileMap.put(7, new FightCaveWave.Builder(
                List.of(new Point(2380, 5073), new Point(2409, 5073)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1)
                ))
                .build());

        waveTileMap.put(8, new FightCaveWave.Builder(
                List.of(new Point(2409, 5073), new Point(2403, 5072)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 2)
                ))
                .build());

        waveTileMap.put(9, new FightCaveWave.Builder(
                List.of(new Point(2403, 5072), new Point(2392, 5080)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 2)
                ))
                .build());

        waveTileMap.put(10, new FightCaveWave.Builder(
                List.of(new Point(2392, 5080), new Point(2386, 5076), new Point(2384, 5076), new Point(2384, 5081), new Point(2398, 5086)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 3)
                ))
                .build());

        waveTileMap.put(11, new FightCaveWave.Builder(
                List.of(new Point(2398, 5086), new Point(2420, 5083)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 3)
                ))
                .build());

        waveTileMap.put(12, new FightCaveWave.Builder(
                List.of(new Point(2420, 5083), new Point(2404, 5100), new Point(2384, 5100)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3)
                ))
                .build());

        waveTileMap.put(13, new FightCaveWave.Builder(
                List.of(
                    new Point(2384, 5100),
                    new Point(2384, 5095),
                    new Point(2381, 5101)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 5)
                ))
                .build());

        waveTileMap.put(14, new FightCaveWave.Builder(
                List.of(
                    new Point(2381, 5101),
                    new Point(2384, 5095)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TOK_XIL_2)
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
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1)
                ))
                .build());

        waveTileMap.put(16, new FightCaveWave.Builder(
                List.of(
                    new Point(2383, 5081)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2)
                ))
                .build());

        waveTileMap.put(17, new FightCaveWave.Builder(
                List.of(new Point(2383, 5081)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 3)
                ))
                .build());

        waveTileMap.put(18, new FightCaveWave.Builder(
                List.of(
                    new Point(2383, 5081),
                    new Point(2391, 5086),
                    new Point(2391, 5106),
                    new Point(2384, 5106)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3)
                ))
                .build());

        waveTileMap.put(19, new FightCaveWave.Builder(
                List.of(new Point(2384, 5106), new Point(2391, 5106)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1,2 ),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 4)
                ))
                .build());

        waveTileMap.put(20, new FightCaveWave.Builder(
                List.of(new Point(2391, 5106), new Point(2413, 5091)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1 ),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 4),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 4)
                ))
                .build());

        waveTileMap.put(21, new FightCaveWave.Builder(
                List.of(
                    new Point(2413, 5091),
                    new Point(2415, 5089),
                    new Point(2415, 5088)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 5)
                ))
                .nextWaveMessages(List.of("The 90 will spawn next to you"))
                .build());

        waveTileMap.put(22, new FightCaveWave.Builder(
                List.of(
                    new Point(2415, 5088),
                    new Point(2413, 5089),
                    new Point(2413, 5100),
                    new Point(2422, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2)
                ))
                .currentWaveMessages(List.of("Run around the corner after killing the 180"))
                .build());

        waveTileMap.put(23, new FightCaveWave.Builder(
                List.of(new Point(2422, 5100), new Point(2414, 5100), new Point(2404, 5093), new Point(2383, 5081)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3)
                ))
                .build());

        waveTileMap.put(24, new FightCaveWave.Builder(
                List.of(new Point(2383, 5081), new Point(2371, 5081)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 3),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 4)
                ))
                .build());

        waveTileMap.put(25, new FightCaveWave.Builder(
                List.of(new Point(2371, 5081), new Point(2383, 5081), new Point(2391, 5106)))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 4)
                ))
                .currentWaveMessages(List.of("Run towards the end tile after killing the 180"))
                .build());

        waveTileMap.put(26, new FightCaveWave.Builder(
                List.of(
                    new Point(2391, 5106),
                    new Point(2383, 5101)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 3)
                ))
                .build());

        waveTileMap.put(27, new FightCaveWave.Builder(
                List.of(
                    new Point(2384, 5101),
                    new Point(2372, 5099),
                    new Point(2384, 5095)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 5)
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(28, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 3),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 5),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 5),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 6)
                ))
                .requiresLogout()
                .currentWaveMessages(List.of(
                    "Kill the first 45/22s",
                    "Kill the second 45 and use a 22 to block the 180"
                ))
                .build());

        waveTileMap.put(29, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2371, 5081)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 3)
                ))
                .nextWaveMessages(List.of("~27hp"))
                .build());

        waveTileMap.put(30, new FightCaveWave.Builder(
                List.of(
                    new Point(2383, 5081),
                    new Point(2415, 5089),
                    new Point(2407, 5091)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2)
                ))
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(31, new FightCaveWave.Builder(
                List.of(
                    new Point(2407, 5091),
                    new Point(2422, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.KET_ZEK_2)
                ))
                .requiresAutoRetaliate()
                .nextWaveMessages(List.of("Wait at the END TILE until the 360 sits next to the bat"))
                .build());

        waveTileMap.put(32, new FightCaveWave.Builder(
                List.of(
                    new Point(2411, 5097),
                    new Point(2422, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.KET_ZEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2)
                ))
                .currentWaveMessages(List.of("Wait at the end tile until the 360 sits next to the bat"))
                .build());

        waveTileMap.put(33, new FightCaveWave.Builder(
                List.of(
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 3)
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(34, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2384, 5100),
                    new Point(2384, 5095)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 2)
                ))
                .requiresLogout()
                .nextWaveMessages(List.of("Center 360 spawn"))
                .build());

        waveTileMap.put(35, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2407, 5088),
                    new Point(2407, 5070),
                    new Point(2384, 5076)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.KET_ZEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_2, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2)
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
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 2),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 3)
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(37, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2384, 5100),
                    new Point(2372, 5100),
                    new Point(2384, 5095)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 5)
                ))
                .currentWaveMessages(List.of("No need to eat up for the next wave"))
                .requiresLogout()
                .build());

        waveTileMap.put(38, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2422, 5100),
                    new Point(2414, 5100),
                    new Point(2422, 5105)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 2)
                ))
                .currentWaveMessages(List.of("Wait at tile 2; get the 90 next to the 360"))
                .nextWaveMessages(List.of("Eat sweets and blowpipe spec the bat"))
                .build());

        waveTileMap.put(39, new FightCaveWave.Builder(
                List.of(
                    new Point(2422, 5105),
                    new Point(2422, 5100),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 2),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 3)
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(40, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2371, 5081),
                    new Point(2384, 5081)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_2),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 3),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 4)
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
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.KET_ZEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 4)
                ))
                .requiresLogout()
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(42, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2414, 5117),
                    new Point(2422, 5117),
                    new Point(2415, 5100),
                    new Point(2384, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 5),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 5)
                ))
                .currentWaveMessages(List.of(
                "Trap the 45 behind the 360 before running into the corner"
                ))
                .nextWaveMessages(List.of(
                "Keep standing on the end tile to corner block the 90"
                ))
                .build());

        waveTileMap.put(43, new FightCaveWave.Builder(
                List.of(
                    new Point(2384, 5100),
                    new Point(2384, 5095)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 4),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 5)
                ))
                .currentWaveMessages(List.of(
                "Keep standing on the end tile to corner block the 90"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(44, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2414, 5105),
                    new Point(2422, 5100),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 3),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_2, 5),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 6),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 6)
                ))
                .nextWaveMessages(List.of(
                "~30+hp"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(45, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2422, 5117),
                    new Point(2415, 5108),
                    new Point(2404, 5117),
                    new Point(2404, 5106),
                    new Point(2399, 5095)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TOK_XIL_2, 2),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 3)
                ))
                .currentWaveMessages(List.of(
                    "Eat to ~30+hp",
                    "Preferably save special attack for the next wave"
                ))
                .nextWaveMessages(List.of(
                    "360 mid spawn",
                    "Auto-retaliate on"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(46, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2400, 5095),
                    new Point(2391, 5106)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.KET_ZEK_1),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2)
                ))
                .requiresAutoRetaliate()
                .requiresLogout()
                .build());

        waveTileMap.put(47, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2422, 5100),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3)
                ))
                .requiresLogout()
                .nextWaveMessages(List.of(
                    "Just keep standing on the end tile",
                    "Use the FIRST bat to block the 180"
                ))
                .build());

        waveTileMap.put(48, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 2),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 4)
                ))
                .currentWaveMessages(List.of(
                    "Use the FIRST bat to block the 180",
                    "Heal to ~10hp at the end of the wave"
                ))
                .nextWaveMessages(List.of(
                    "~20hp"
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
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_1),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 4)
                ))
                .currentWaveMessages(List.of(
                    "Kill the 45, block the 180 with 22s",
                    "At the end of the wave eat up to full"
                )).nextWaveMessages(List.of(
                    "Heal to full",
                    "Run towards tile 2 and kill the bat as quickly as possible",
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
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 5)
                ))
                .currentWaveMessages(List.of(
                    "Run towards tile 2 and kill the bat",
                    "After killing the bat, quickly get within tick-eat range of the 360"
                ))
                .build());

        waveTileMap.put(51, new FightCaveWave.Builder(
                List.of(
                    new Point(2384, 5062),
                    new Point(2384, 5081)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 3),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 4),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 5),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 6)
                ))
                .nextWaveMessages(List.of(
                    "Kill the first 45/22s",
                    "Kill the second 45 and use the 22s to block the 180"
                ))
                .nextWaveMessages(List.of("~20hp"))
                .requiresLogout()
                .build());

        waveTileMap.put(52, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2384, 5100),
                    new Point(2372, 5098),
                    new Point(2384, 5095)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KEK_2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 2),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 3),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 5),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 5),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 6)
                ))
                .currentWaveMessages(List.of(
                    "Kill the first 45/22s",
                    "Kill the second 45 and use the 22s to block the 180"
                ))
                .nextWaveMessages(List.of(
                "~27hp, wait at tile 2 until the 90 attacks"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(53, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2422, 5100),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 3)
                ))
                .currentWaveMessages(List.of(
                "~27hp, wait at tile 2 until the 90 attacks"
                ))
                .nextWaveMessages(List.of(
                "~27hp, run towards to tile in front of the entrance (tile 2)"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(54, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2414, 5117),
                    new Point(2414, 5105),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 3),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 4)
                ))
                .currentWaveMessages(List.of(
                    "Run towards to tile in front of the entrance (tile 2)",
                    "Kill the 90, then lure the bat and use it to block the 180"
                ))
                .nextWaveMessages(List.of(
                    "~15-20hp"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(55, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2384, 5062),
                    new Point(2384, 5081)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 2),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 3),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 4),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 5)
                ))
                .currentWaveMessages(List.of("~15-20hp"))
                .nextWaveMessages(List.of(
                        "P-neck wave",
                        "As soon as the 360 attacks run towards the corner (TILE 3)",
                        "After killing the 360, FIRST EAT, then run towards tile 4",
                        "Kill the 45 and leave the 22s to block the 180"
                ))
                .requiresLogout()
                .build());
        
        waveTileMap.put(56, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2372, 5098),
                    new Point(2384, 5095),
                    new Point(2374, 5098)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.KET_ZEK_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 5)
                ))
                .requiresLogout()
                .requiresAutoRetaliate()
                .currentWaveMessages(List.of(
                   "P-neck wave",
                    "As soon as the 360 attacks run towards the corner (TILE 3)",
                    "After killing the 360, EAT ONCE, then run towards tile 4",
                    "Kill the 45 and leave the 22s to block the 180"
                ))
                .build());

        waveTileMap.put(57, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2422, 5100),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZ_KIH_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TOK_XIL_1, 5),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 6)
                ))
                .currentWaveMessages(List.of(
                    "WAIT AT TILE 2 (get the 90 next to the 360)",
                    "Kill the bat and 45 and leave the 22s to block the 180"
                ))
                .nextWaveMessages(List.of(
                    "~30hp+ before starting the next wave",
                    "Kill the 90 as fast as possible"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(58, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2382, 5102),
                    new Point(2372, 5098),
                    new Point(2384, 5095)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KIH_1, 4),
                    new KillTarget(FightCaveNpcID.TZ_KIH_2, 4),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 5)
                ))
                .currentWaveMessages(List.of(
                "~30hp, preferably blowpipe spec the 90"
                ))
                .nextWaveMessages(List.of(
                "~27hp, run towards to tile in front of the entrance (tile 2)"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(59, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2414, 5117),
                    new Point(2414, 5106),
                    new Point(2414, 5100),
                    new Point(2384, 5062)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TZ_KEK_2, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 4),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 5),
                    new KillTarget(FightCaveNpcID.TZ_KEK_1, 6),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 7),
                    new KillTarget(FightCaveNpcID.TZ_KEK_MINI, 7)
                ))
                .currentWaveMessages(List.of(
                    "~27hp, run towards to tile in front of the entrance (tile 2)",
                    "After killing the 90, step out 2 tiles to lure the 45 to the corner",
                    "Kill the 45 and use a 22 to block the 180",
                    "Eat up and run SOUTH WEST before killing the last 45"
                ))
                .nextWaveMessages(List.of(
                    "~30hp"
                ))
                .build());

        waveTileMap.put(60, new FightCaveWave.Builder(
                List.of(
                    new Point(2384, 5062),
                    new Point(2384, 5081)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TOK_XIL_1),
                    new KillTarget(FightCaveNpcID.TOK_XIL_2, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 3),
                    new KillTarget(FightCaveNpcID.KET_ZEK_1, 4)
                ))
                .nextWaveMessages(List.of(
                "P-neck wave"
                ))
                .requiresLogout()
                .build());

        waveTileMap.put(61, new FightCaveWave.Builder(
                List.of(
                    new Point(2400, 5088),
                    new Point(2422, 5100),
                    new Point(2414, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.KET_ZEK_1),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_1, 2),
                    new KillTarget(FightCaveNpcID.YT_MEJKOT_2, 3)
                ))
                .currentWaveMessages(List.of(
                "P-neck wave"
                ))
                .requiresAutoRetaliate()
                .build());

        waveTileMap.put(62, new FightCaveWave.Builder(
                List.of(
                    new Point(2414, 5100),
                    new Point(2422, 5100)
                ))
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.KET_ZEK_1),
                    new KillTarget(FightCaveNpcID.KET_ZEK_2, 2)
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
                .killOrder(List.of(
                    new KillTarget(FightCaveNpcID.TZTOK_JAD)
                ))
                .currentWaveMessages(List.of(
                    "Run to tile 2 and attack Jad",
                    "After tick eating jad's first attack, lure jad 1 or 2 tiles SOUTH",
                    "Do this by stepping on tile 3 for a tick and IMMEDIATELY run to the end tile"
                ))
                .build());
    }
}
