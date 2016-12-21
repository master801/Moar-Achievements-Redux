package org.slave.minecraft.moarachievements.achievements.pages;

import net.minecraftforge.common.AchievementPage;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageDeath;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageLevel;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageNether;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageTiered;

/**
 * Created by Master801 on 12/20/2016 at 3:24 PM.
 *
 * @author Master801
 */
public enum AchievementPages {

    PAGE_DEATH(
            new AchievementPageDeath(),
            AchievementStorageDeath.class
    ),

    PAGE_LEVEL(
            new AchievementPageLevel(),
            AchievementStorageLevel.class
    ),

    PAGE_NETHER(
            new AchievementPageNether(),
            AchievementStorageNether.class
    ),

    PAGE_TIERED(
            new AchievementPageTiered(),
            AchievementStorageTiered.class
    );

    private final AchievementPage achievementPage;
    private final Class achievementStorageClass;

    AchievementPages(final AchievementPage achievementPage, final Class achievementStorageClass) {
        this.achievementPage = achievementPage;
        this.achievementStorageClass = achievementStorageClass;
    }

    public AchievementPage getAchievementPage() {
        return achievementPage;
    }

    public Class getAchievementStorageClass() {
        return achievementStorageClass;
    }

}
