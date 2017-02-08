package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.AchievementMoar;

/**
 * Created by Master801 on 12/21/2016 at 4:19 PM.
 *
 * @author Master801
 */
public final class AchievementStorageTiered {

    public static final Achievement ACHIEVEMENT_MINE_SAND = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineSand(),
            "moarachievementsredux.tiered.mineSand",
            -7,
            -7,
            Block.sand,
            null
    );

    public static final Achievement ACHIEVEMENT_MAKE_SANDSTONE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeSandstone(),
            "moarachievementsredux.tiered.buildSandstone",
            -8,
            -5,
            Block.sandStone,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
    );

    public static final Achievement ACHIEVEMENT_SMELT_GLASS = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdSmeltGlass(),
            "moarachievementsredux.tiered.smeltGlass",
            -6,
            -5,
            Block.glass,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
    );

    public static final Achievement ACHIEVEMENT_MAKE_GLASS_PANE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGlassPane(),
            "moarachievementsredux.tiered.buildGlassPane",
            -6,
            -3,
            Block.thinGlass,
            AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS
    );

    public static final Achievement ACHIEVEMENT_MINE_SNOW = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineSnow(),
            "moarachievementsredux.tiered.mineSnow",
            -5,
            -7,
            Item.snowball,
            null
    );

    public static final Achievement ACHIEVEMENT_MAKE_SNOW = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeSnow(),
            "moarachievementsredux.tiered.buildSnow",
            -5,
            -5,
            Block.blockSnow,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW
    );

    public static final Achievement ACHIEVEMENT_MINE_GLOWSTONE_DUST = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineGlowstoneDust(),
            "moarachievementsredux.tiered.mineGlowStoneDust",
            -3,
            -7,
            Item.glowstone,
            null
    );

    public static final Achievement ACHIEVEMENT_MAKE_GLOWSTONE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGlowstone(),
            "moarachievementsredux.tiered.buildGlowStone",
            -3,
            -5,
            Block.glowStone,
            AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST
    );

    public static final Achievement ACHIEVEMENT_MINE_MUSHROOM_RED = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineMushroomRed(),
            "moarachievementsredux.tiered.mineMushroomRed",
            0,
            -7,
            Block.mushroomRed,
            null
    );

    public static final Achievement ACHIEVEMENT_MINE_MUSHROOM_BROWN = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineMushroomBrown(),
            "moarachievementsredux.tiered.mineMushroomBrown",
            -2,
            -7,
            Block.mushroomBrown,
            null
    );

    public static final Achievement ACHIEVEMENT_MAKE_MUSHROOM_STEW = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeMushroomStew(),
            "moarachievementsredux.tiered.makeMushroomStew",
            -1,
            -5,
            Item.bowlSoup,
            null
    );

    public static final Achievement ACHIEVEMENT_EAT_MUSHROOM_STEW = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdEatMushroomStew(),
            "moarachievementsredux.tiered.eatMushroomStew",
            -1,
            -3,
            Item.bowlEmpty,
            AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW
    );

    public static final Achievement ACHIEVEMENT_MINE_CLAY = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineClay(),
            "moarachievementsredux.tiered.mineClay",
            1,
            -7,
            Item.clay,
            null
    );

    public static void registerAchievements() {
        AchievementStorageTiered.ACHIEVEMENT_MINE_SAND.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_SANDSTONE.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_GLASS_PANE.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_SNOW.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_GLOWSTONE.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_RED.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_BROWN.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_EAT_MUSHROOM_STEW.registerAchievement();
        AchievementStorageTiered.ACHIEVEMENT_MINE_CLAY.registerAchievement();
    }

}
