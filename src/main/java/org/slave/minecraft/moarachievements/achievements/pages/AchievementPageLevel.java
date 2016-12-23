package org.slave.minecraft.moarachievements.achievements.pages;

import net.minecraftforge.common.AchievementPage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageLevel;

public final class AchievementPageLevel extends AchievementPage {

    public AchievementPageLevel() {
        super(
                "Level",

                AchievementStorageLevel.ARGUMENT_ACHIEVE1,
                AchievementStorageLevel.ARGUMENT_ACHIEVE2
        );
    }

}
