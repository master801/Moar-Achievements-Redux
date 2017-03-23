package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import org.slave.minecraft.moarachievements.achievements.AchievementMoar;

/**
 * Created by Master801 on 12/21/2016 at 4:18 PM.
 *
 * @author Master801
 */
public final class AchievementStorageDeath {

    public static final Achievement ACHIEVEMENT_KILLED_BY_ANY = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByAny",
            "moarachievementsredux.death.killedByAny",
            0,
            0,
            Items.bone,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_KILLED_BY_CREEPER = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByCreeper",
            "moarachievementsredux.death.killedByCreeper",
            -2,
            0,
            Blocks.tnt,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ENDERMAN = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByEnderman",
            "moarachievementsredux.death.killedByEnderman",
            2,
            0,
            Blocks.end_stone,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ANVIL = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByAnvil",
            "moarachievementsredux.death.killedByAnvil",
            0,
            -1,
            Blocks.anvil,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WALL = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByWall",
            "moarachievementsredux.death.killedByWall",
            1,
            -1,
            Blocks.gravel,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FLAME = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByFlame",
            "moarachievementsredux.death.killedByFlame",
            -1,
            -1,
            Items.fire_charge,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FIRE = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByFire",
            "moarachievementsredux.death.killedByFire",
            2,
            -1,
            Blocks.fire,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_BLAZE = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByBlaze",
            "moarachievementsredux.death.killedByBlaze",
            -2,
            -1,
            Items.blaze_rod,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_GHAST = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByGhast",
            "moarachievementsredux.death.killedByGhast",
            0,
            -2,
            Items.ghast_tear,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FALL = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByFall",
            "moarachievementsredux.death.killedByFall",
            1,
            -2,
            Blocks.brick_block,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByFireDispenser",
            "moarachievementsredux.death.killedByFireDispenser",
            -1,
            -2,
            Blocks.dispenser,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ARROW_DISPENSER = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByArrowDispenser",
            "moarachievementsredux.death.killedByArrowDispenser",
            2,
            -2,
            Blocks.dispenser,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WATER = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByWater",
            "moarachievementsredux.death.killedByWater",
            -2,
            -2,
            Blocks.water,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_IRON = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByIron",
            "moarachievementsredux.death.killedByIron",
            3,
            -2,
            Blocks.iron_block,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SPACE = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedBySpace",
            "moarachievementsredux.death.killedBySpace",
            -3,
            -2,
            Blocks.bedrock,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByZombie",
            "moarachievementsredux.death.killedByZombie",
            0,
            -3,
            Items.rotten_flesh,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByZombieVillager",
            "moarachievementsredux.death.killedByZombieVillager",
            3,
            -3,
            Items.emerald,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByZombieVillagerChild",
            "moarachievementsredux.death.killedByZombieVillagerChild",
            -3,
            -3,
            Blocks.red_flower,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByZombieSword",
            "moarachievementsredux.death.killedByZombieSword",
            0,
            -4,
            Items.iron_sword,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByZombieDiamond",
            "moarachievementsredux.death.killedByZombieDiamond",
            1,
            -4,
            Items.diamond,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SKELETON = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedBySkeleton",
            "moarachievementsredux.death.killedBySkeleton",
            -1,
            -4,
            Items.arrow,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SPIDER = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedBySpider",
            "moarachievementsredux.death.killedBySpider",
            2,
            -4,
            Items.spider_eye,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_DRAGON = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByDragon",
            "moarachievementsredux.death.killedByDragon",
            -2,
            -4,
            Blocks.end_portal_frame,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_WITHER = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByWither",
            "moarachievementsredux.death.killedByWither",
            3,
            -4,
            Blocks.skull,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_THROWN_POTION = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByThrownPotion",
            "moarachievementsredux.death.killedByThrownPotion",
            -3,
            -4,
            Items.potionitem,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_POTION = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByPotion",
            "moarachievementsredux.death.killedByPotion",
            0,
            -5,
            Items.potionitem,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SMALL_SLIME = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedBySmallSlime",
            "moarachievementsredux.death.killedBySmallSlime",
            1,
            -5,
            Items.slime_ball,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByMediumSlime",
            "moarachievementsredux.death.killedByMediumSlime",
            -1,
            -5,
            Items.slime_ball,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_LARGE_SLIME = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByLargeSlime",
            "moarachievementsredux.death.killedByLargeSlime",
            2,
            -5,
            Items.slime_ball,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_HUGE_SLIME = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedByHugeSlime",
            "moarachievementsredux.death.killedByHugeSlime",
            -2,
            -5,
            Items.slime_ball,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static final Achievement ACHIEVEMENT_KILLED_BY_SELF = new AchievementMoar(
            "achievement.moarachievementsredux.death.killedBySelf",
            "moarachievementsredux.death.killedBySelf",
            0,
            1,
            Items.arrow,
            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
    );

    public static void registerAchievements() {
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_CREEPER.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ENDERMAN.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANVIL.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WALL.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FLAME.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_BLAZE.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_GHAST.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FALL.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ARROW_DISPENSER.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WATER.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_IRON.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPACE.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SKELETON.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPIDER.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_DRAGON.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_THROWN_POTION.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_POTION.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SMALL_SLIME.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_LARGE_SLIME.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_HUGE_SLIME.registerStat();
        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF.registerStat();
    }

}
