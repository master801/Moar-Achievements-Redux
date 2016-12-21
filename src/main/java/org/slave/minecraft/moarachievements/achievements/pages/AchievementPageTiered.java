package org.slave.minecraft.moarachievements.achievements.pages;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageTiered;

public final class AchievementPageTiered extends AchievementPage {

    public AchievementPageTiered() {
        super(
                "Tiers",
                new Achievement[] {
                        AchievementStorageTiered.ACHIEVEMENT_MINE_SAND.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MAKE_SANDSTONE.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MAKE_GLASS_PANE.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MAKE_SNOW.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MAKE_GLOWSTONE.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_BROWN.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_RED.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_EAT_MUSHROOM_STEW.getAchievement(),
                        AchievementStorageTiered.ACHIEVEMENT_MINE_CLAY.getAchievement()
                }
        );
    }

}
