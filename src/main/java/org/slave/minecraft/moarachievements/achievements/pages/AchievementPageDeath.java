package org.slave.minecraft.moarachievements.achievements.pages;

import net.minecraftforge.common.AchievementPage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageDeath;

public final class AchievementPageDeath extends AchievementPage {

    public AchievementPageDeath() {
        super(
                "Death",

                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_CREEPER,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ENDERMAN,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANVIL,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WALL,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FLAME,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_BLAZE,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_GHAST,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FALL,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ARROW_DISPENSER,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WATER,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_IRON,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPACE,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SKELETON,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPIDER,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_DRAGON,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_THROWN_POTION,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_POTION,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SMALL_SLIME,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_LARGE_SLIME,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_HUGE_SLIME,
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF
        );
    }

}
