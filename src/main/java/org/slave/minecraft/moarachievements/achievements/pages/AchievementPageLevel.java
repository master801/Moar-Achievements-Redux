package org.slave.minecraft.moarachievements.achievements.pages;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageLevel;

public final class AchievementPageLevel extends AchievementPage {

    public AchievementPageLevel() {
        super(
                "Level",
                new Achievement[] {
                        AchievementStorageLevel.ARGUMENT_ACHIEVE1.getAchievement(),
                        AchievementStorageLevel.ARGUMENT_ACHIEVE2.getAchievement()
                }
        );
    }

}
