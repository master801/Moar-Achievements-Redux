package org.slave.minecraft.moarachievements.achievements.pages;

import net.minecraftforge.common.AchievementPage;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageDeath;

public final class AchievementPageDeath extends AchievementPage {

    public AchievementPageDeath() {
        super(
                "Death",

                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_CREEPER.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ENDERMAN.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANVIL.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WALL.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FLAME.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_BLAZE.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_GHAST.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FALL.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ARROW_DISPENSER.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WATER.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_IRON.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPACE.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SKELETON.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPIDER.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_DRAGON.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_THROWN_POTION.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_POTION.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SMALL_SLIME.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_LARGE_SLIME.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_HUGE_SLIME.getAchievement(),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF.getAchievement()
        );
    }

}
