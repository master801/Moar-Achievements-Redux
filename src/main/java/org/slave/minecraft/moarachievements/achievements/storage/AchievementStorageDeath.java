package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import org.slave.minecraft.moarachievements.MoarAchievements;

/**
 * Created by Master801 on 12/21/2016 at 4:18 PM.
 *
 * @author Master801
 */
public final class AchievementStorageDeath {

    public static final Achievement ACHIEVEMENT_KILLED_BY_ANY = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByAny(),
            "moararchievementsredux.death.killedByAny",
            0,
            0,
            Item.bone,
            null
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_CREEPER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByCreeper(),
            "moararchievementsredux.death.killedByCreeper",
            -2,
            0,
            Block.tnt,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ENDERMAN = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByEnderman(),
            "moararchievementsredux.death.killedByEnderman",
            2,
            0,
            Block.whiteStone,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ANVIL = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByAnvil(),
            "moararchievementsredux.death.killedByAnvil",
            0,
            -1,
            Block.anvil,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WALL = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByWall(),
            "moararchievementsredux.death.killedByWall",
            1,
            -1,
            Block.gravel,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FLAME = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByFlame(),
            "moararchievementsredux.death.killedByFlame",
            -1,
            -1,
            Item.fireballCharge,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FIRE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByFire(),
            "moararchievementsredux.death.killedByFire",
            2,
            -1,
            Block.fire,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_BLAZE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByBlaze(),
            "moararchievementsredux.death.killedByBlaze",
            -2,
            -1,
            Item.blazeRod,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_GHAST = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByGhast(),
            "moararchievementsredux.death.killedByGhast",
            0,
            -2,
            Item.ghastTear,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FALL = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByFall(),
            "moararchievementsredux.death.killedByFall",
            1,
            -2,
            Item.brick,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByFireDispenser(),
            "moararchievementsredux.death.killedByFireDispenser",
            -1,
            -2,
            Block.dispenser,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ARROW_DISPENSER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByArrowDispenser(),
            "moararchievementsredux.death.killedByArrowDispenser",
            2,
            -2,
            Block.dispenser,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WATER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByWater(),
            "moararchievementsredux.death.killedByWater",
            -2,
            -2,
            Block.waterStill,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_IRON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByIron(),
            "moararchievementsredux.death.killedByIron",
            3,
            -2,
            Block.blockIron,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SPACE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySpace(),
            "moararchievementsredux.death.killedBySpace",
            -3,
            -2,
            Block.bedrock,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombie(),
            "moararchievementsredux.death.killedByZombie",
            0,
            -3,
            Item.rottenFlesh,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombieVillager(),
            "moararchievementsredux.death.killedByZombieVillager",
            3,
            -3,
            Item.emerald,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombieVillagerChild(),
            "moararchievementsredux.death.killedByZombieVillagerChild",
            -3,
            -3,
            Block.plantRed,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombieSword(),
            "moararchievementsredux.death.killedByZombieSword",
            0,
            -4,
            Item.swordIron,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombieDiamond(),
            "moararchievementsredux.death.killedByZombieDiamond",
            1,
            -4,
            Item.diamond,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SKELETON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySkeleton(),
            "moararchievementsredux.death.killedBySkeleton",
            -1,
            -4,
            Item.arrow,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SPIDER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySpider(),
            "moararchievementsredux.death.killedBySpider",
            2,
            -4,
            Item.spiderEye,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_DRAGON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByDragon(),
            "moararchievementsredux.death.killedByDragon",
            -2,
            -4,
            Block.endPortalFrame,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WITHER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByWither(),
            "moararchievementsredux.death.killedByWither",
            3,
            -4,
            Block.skull,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_THROWN_POTION = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByThrownPotion(),
            "moararchievementsredux.death.killedByThrownPotion",
            -3,
            -4,
            Item.potion,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_POTION = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByPotion(),
            "moararchievementsredux.death.killedByPotion",
            0,
            -5,
            Item.potion,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SMALL_SLIME = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySmallSlime(),
            "moararchievementsredux.death.killedBySmallSlime",
            1,
            -5,
            Item.slimeBall,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByMediumSlime(),
            "moararchievementsredux.death.killedByMediumSlime",
            -1,
            -5,
            Item.slimeBall,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_LARGE_SLIME = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByLargeSlime(),
            "moararchievementsredux.death.killedByLargeSlime",
            2,
            -5,
            Item.slimeBall,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_HUGE_SLIME = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByHugeSlime(),
            "moararchievementsredux.death.killedByHugeSlime",
            -2,
            -5,
            Item.slimeBall,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SELF = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySelf(),
            "moararchievementsredux.death.killedBySelf",
            0,
            1,
            Item.arrow,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

}
