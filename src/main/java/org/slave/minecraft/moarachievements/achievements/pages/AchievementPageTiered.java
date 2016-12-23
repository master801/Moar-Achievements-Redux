package org.slave.minecraft.moarachievements.achievements.pages;

import net.minecraftforge.common.AchievementPage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageTiered;

public final class AchievementPageTiered extends AchievementPage {

    public AchievementPageTiered() {
        super(
                "Tiers",

                AchievementStorageTiered.ACHIEVEMENT_MINE_SAND,
                AchievementStorageTiered.ACHIEVEMENT_MAKE_SANDSTONE,
                AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS,
                AchievementStorageTiered.ACHIEVEMENT_MAKE_GLASS_PANE,
                AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW,
                AchievementStorageTiered.ACHIEVEMENT_MAKE_SNOW,
                AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST,
                AchievementStorageTiered.ACHIEVEMENT_MAKE_GLOWSTONE,
                AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_BROWN,
                AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_RED,
                AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW,
                AchievementStorageTiered.ACHIEVEMENT_EAT_MUSHROOM_STEW,
                AchievementStorageTiered.ACHIEVEMENT_MINE_CLAY
        );
    }

}
