package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;

/**
 * Created by Master801 on 12/21/2016 at 4:19 PM.
 *
 * @author Master801
 */
public final class AchievementStorageTiered {

    public static final Achievement ACHIEVEMENT_MINE_SAND = new Achievement(
            "achievement.moarachievementsredux.tiered.mineSand",
            "moarachievementsredux.tiered.mineSand",
            -7,
            -7,
            Blocks.sand,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MAKE_SANDSTONE = new Achievement(
            "achievement.moarachievementsredux.tiered.buildSandstone",
            "moarachievementsredux.tiered.buildSandstone",
            -8,
            -5,
            Blocks.sandstone,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_SMELT_GLASS = new Achievement(
            "achievement.moarachievementsredux.tiered.smeltGlass",
            "moarachievementsredux.tiered.smeltGlass",
            -6,
            -5,
            Blocks.glass,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MAKE_GLASS_PANE = new Achievement(
            "achievement.moarachievementsredux.tiered.buildGlassPane",
            "moarachievementsredux.tiered.buildGlassPane",
            -6,
            -3,
            Blocks.glass_pane,
            AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MINE_SNOW = new Achievement(
            "achievement.moarachievementsredux.tiered.mineSnow",
            "moarachievementsredux.tiered.mineSnow",
            -5,
            -7,
            Items.snowball,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MAKE_SNOW = new Achievement(
            "achievement.moarachievementsredux.tiered.buildSnow",
            "moarachievementsredux.tiered.buildSnow",
            -5,
            -5,
            Blocks.snow,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MINE_GLOWSTONE_DUST = new Achievement(
            "achievement.moarachievementsredux.tiered.mineGlowStoneDust",
            "moarachievementsredux.tiered.mineGlowStoneDust",
            -3,
            -7,
            Items.glowstone_dust,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MAKE_GLOWSTONE = new Achievement(
            "achievement.moarachievementsredux.tiered.buildGlowStone",
            "moarachievementsredux.tiered.buildGlowStone",
            -3,
            -5,
            Blocks.glowstone,
            AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MINE_MUSHROOM_RED = new Achievement(
            "achievement.moarachievementsredux.tiered.mineMushroomRed",
            "moarachievementsredux.tiered.mineMushroomRed",
            0,
            -7,
            Blocks.red_mushroom,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MINE_MUSHROOM_BROWN = new Achievement(
            "achievement.moarachievementsredux.tiered.mineMushroomBrown",
            "moarachievementsredux.tiered.mineMushroomBrown",
            -2,
            -7,
            Blocks.brown_mushroom,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_MAKE_MUSHROOM_STEW = new Achievement(
            "achievement.moarachievementsredux.tiered.makeMushroomStew",
            "moarachievementsredux.tiered.makeMushroomStew",
            -1,
            -5,
            Items.mushroom_stew,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_EAT_MUSHROOM_STEW = new Achievement(
            "achievement.moarachievementsredux.tiered.eatMushroomStew",
            "moarachievementsredux.tiered.eatMushroomStew",
            -1,
            -3,
            Items.bowl,
            AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW
    );

    public static final Achievement ACHIEVEMENT_MINE_CLAY = new Achievement(
            "achievement.moarachievementsredux.tiered.mineClay",
            "moarachievementsredux.tiered.mineClay",
            1,
            -7,
            Items.clay_ball,
            null
    ).initIndependentStat();

    public static void registerAchievements() {
        AchievementStorageTiered.ACHIEVEMENT_MINE_SAND.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_SANDSTONE.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_GLASS_PANE.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_SNOW.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_GLOWSTONE.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_RED.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_BROWN.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_EAT_MUSHROOM_STEW.registerStat();
        AchievementStorageTiered.ACHIEVEMENT_MINE_CLAY.registerStat();
    }

}
