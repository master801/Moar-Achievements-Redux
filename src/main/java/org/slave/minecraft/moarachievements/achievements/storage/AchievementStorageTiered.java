package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import org.slave.minecraft.moarachievements.MoarAchievements;

/**
 * Created by Master801 on 12/21/2016 at 4:19 PM.
 *
 * @author Master801
 */
public final class AchievementStorageTiered {

    public static final Achievement ACHIEVEMENT_MINE_SAND = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineSand(),
            "moararchievementsredux.tiered.mineSand",
            -7,
            -7,
            Block.sand,
            null
    );

    public static final Achievement ACHIEVEMENT_MAKE_SANDSTONE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeSandstone(),
            "moararchievementsredux.tiered.buildSandstone",
            -8,
            -5,
            Block.sandStone,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
    );

    public static final Achievement ACHIEVEMENT_SMELT_GLASS = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdSmeltGlass(),
            "moararchievementsredux.tiered.smeltGlass",
            -6,
            -5,
            Block.glass,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
    );

    public static final Achievement ACHIEVEMENT_MAKE_GLASS_PANE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGlassPane(),
            "moararchievementsredux.tiered.buildGlassPane",
            -6,
            -3,
            Block.thinGlass,
            AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS
    );

    public static final Achievement ACHIEVEMENT_MINE_SNOW = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineSnow(),
            "moararchievementsredux.tiered.mineSnow",
            -5,
            -7,
            Item.snowball,
            null
    );

    public static final Achievement ACHIEVEMENT_MAKE_SNOW = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeSnow(),
            "moararchievementsredux.tiered.buildSnow",
            -5,
            -5,
            Block.blockSnow,
            AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW
    );

    public static final Achievement ACHIEVEMENT_MINE_GLOWSTONE_DUST = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineGlowstoneDust(),
            "moararchievementsredux.tiered.mineGlowStoneDust",
            -3,
            -7,
            Item.glowstone,
            null
    );

    public static final Achievement ACHIEVEMENT_MAKE_GLOWSTONE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGlowstone(),
            "moararchievementsredux.tiered.buildGlowStone",
            -3,
            -5,
            Block.glowStone,
            AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST
    );

    public static final Achievement ACHIEVEMENT_MINE_MUSHROOM_RED = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineMushroomRed(),
            "moararchievementsredux.tiered.mineMushroomRed",
            0,
            -7,
            Block.mushroomRed,
            null
    );

    public static final Achievement ACHIEVEMENT_MINE_MUSHROOM_BROWN = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineMushroomBrown(),
            "moararchievementsredux.tiered.mineMushroomBrown",
            -2,
            -7,
            Block.mushroomBrown,
            null
    );

    public static final Achievement ACHIEVEMENT_MAKE_MUSHROOM_STEW = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeMushroomStew(),
            "moararchievementsredux.tiered.makeMushroomStew",
            -1,
            -5,
            Item.bowlSoup,
            null
    );

    public static final Achievement ACHIEVEMENT_EAT_MUSHROOM_STEW = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdEatMushroomStew(),
            "moararchievementsredux.tiered.eatMushroomStew",
            -1,
            -3,
            Item.bowlEmpty,
            AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW
    );

    public static final Achievement ACHIEVEMENT_MINE_CLAY = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineClay(),
            "moararchievementsredux.tiered.mineClay",
            1,
            -7,
            Item.clay,
            null
    );

}
