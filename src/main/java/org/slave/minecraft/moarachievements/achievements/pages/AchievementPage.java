package org.slave.minecraft.moarachievements.achievements.pages;

/**
 * Created by Master801 on 12/20/2016 at 3:24 PM.
 *
 * @author Master801
 */
public enum AchievementPage {

    PAGE_DEATH(
            new AchievementPageDeath()
    ),

    PAGE_LEVEL(
            new AchievementPageLevel()
    ),

    PAGE_NETHER(
            new AchievementPageNether()
    ),

    PAGE_TIERED(
            new AchievementPageTiered()
    );

    private final net.minecraftforge.common.AchievementPage achievementPage;

    AchievementPage(final net.minecraftforge.common.AchievementPage achievementPage) {
        this.achievementPage = achievementPage;
    }

    public net.minecraftforge.common.AchievementPage getAchievementPage() {
        return achievementPage;
    }

}
