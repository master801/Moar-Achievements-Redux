package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.AchievementMoar;

/**
 * Created by Master801 on 12/21/2016 at 4:18 PM.
 *
 * @author Master801
 */
public final class AchievementStorageDeath {

    public static final Achievement ACHIEVEMENT_KILLED_BY_ANY = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByAny(),
            "moarachievementsredux.death.killedByAny",
            0,
            0,
            Item.bone,
            null
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_CREEPER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByCreeper(),
            "moarachievementsredux.death.killedByCreeper",
            -2,
            0,
            Block.tnt,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ENDERMAN = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByEnderman(),
            "moarachievementsredux.death.killedByEnderman",
            2,
            0,
            Block.whiteStone,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ANVIL = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByAnvil(),
            "moarachievementsredux.death.killedByAnvil",
            0,
            -1,
            Block.anvil,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WALL = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByWall(),
            "moarachievementsredux.death.killedByWall",
            1,
            -1,
            Block.gravel,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FLAME = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByFlame(),
            "moarachievementsredux.death.killedByFlame",
            -1,
            -1,
            Item.fireballCharge,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FIRE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByFire(),
            "moarachievementsredux.death.killedByFire",
            2,
            -1,
            Block.fire,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_BLAZE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByBlaze(),
            "moarachievementsredux.death.killedByBlaze",
            -2,
            -1,
            Item.blazeRod,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_GHAST = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByGhast(),
            "moarachievementsredux.death.killedByGhast",
            0,
            -2,
            Item.ghastTear,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FALL = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByFall(),
            "moarachievementsredux.death.killedByFall",
            1,
            -2,
            Item.brick,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByFireDispenser(),
            "moarachievementsredux.death.killedByFireDispenser",
            -1,
            -2,
            Block.dispenser,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ARROW_DISPENSER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByArrowDispenser(),
            "moarachievementsredux.death.killedByArrowDispenser",
            2,
            -2,
            Block.dispenser,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WATER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByWater(),
            "moarachievementsredux.death.killedByWater",
            -2,
            -2,
            Block.waterStill,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_IRON = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByIron(),
            "moarachievementsredux.death.killedByIron",
            3,
            -2,
            Block.blockIron,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SPACE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySpace(),
            "moarachievementsredux.death.killedBySpace",
            -3,
            -2,
            Block.bedrock,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombie(),
            "moarachievementsredux.death.killedByZombie",
            0,
            -3,
            Item.rottenFlesh,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombieVillager(),
            "moarachievementsredux.death.killedByZombieVillager",
            3,
            -3,
            Item.emerald,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombieVillagerChild(),
            "moarachievementsredux.death.killedByZombieVillagerChild",
            -3,
            -3,
            Block.plantRed,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombieSword(),
            "moarachievementsredux.death.killedByZombieSword",
            0,
            -4,
            Item.swordIron,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByZombieDiamond(),
            "moarachievementsredux.death.killedByZombieDiamond",
            1,
            -4,
            Item.diamond,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SKELETON = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySkeleton(),
            "moarachievementsredux.death.killedBySkeleton",
            -1,
            -4,
            Item.arrow,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SPIDER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySpider(),
            "moarachievementsredux.death.killedBySpider",
            2,
            -4,
            Item.spiderEye,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_DRAGON = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByDragon(),
            "moarachievementsredux.death.killedByDragon",
            -2,
            -4,
            Block.endPortalFrame,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WITHER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByWither(),
            "moarachievementsredux.death.killedByWither",
            3,
            -4,
            Block.skull,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_THROWN_POTION = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByThrownPotion(),
            "moarachievementsredux.death.killedByThrownPotion",
            -3,
            -4,
            Item.potion,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_POTION = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByPotion(),
            "moarachievementsredux.death.killedByPotion",
            0,
            -5,
            Item.potion,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SMALL_SLIME = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySmallSlime(),
            "moarachievementsredux.death.killedBySmallSlime",
            1,
            -5,
            Item.slimeBall,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByMediumSlime(),
            "moarachievementsredux.death.killedByMediumSlime",
            -1,
            -5,
            Item.slimeBall,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_LARGE_SLIME = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByLargeSlime(),
            "moarachievementsredux.death.killedByLargeSlime",
            2,
            -5,
            Item.slimeBall,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_HUGE_SLIME = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledByHugeSlime(),
            "moarachievementsredux.death.killedByHugeSlime",
            -2,
            -5,
            Item.slimeBall,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SELF = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKilledBySelf(),
            "moarachievementsredux.death.killedBySelf",
            0,
            1,
            Item.arrow,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static void registerAchievements() {
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_CREEPER.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ENDERMAN.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANVIL.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WALL.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FLAME.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_BLAZE.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_GHAST.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FALL.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ARROW_DISPENSER.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WATER.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_IRON.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPACE.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SKELETON.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPIDER.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_DRAGON.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_THROWN_POTION.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_POTION.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SMALL_SLIME.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_LARGE_SLIME.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_HUGE_SLIME.registerAchievement();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF.registerAchievement();
    }

}
