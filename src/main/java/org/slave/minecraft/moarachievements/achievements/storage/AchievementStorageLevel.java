package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import org.slave.minecraft.moarachievements.MoarAchievements;

/**
 * Created by Master801 on 12/21/2016 at 4:19 PM.
 *
 * @author Master801
 */
public final class AchievementStorageLevel {

    public static final Achievement ARGUMENT_ACHIEVE1 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdAchieve1(),
            "achieve1",
            0,
            0,
            Item.egg,
            null
    ).registerAchievement();

    public static final Achievement ARGUMENT_ACHIEVE2 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdAchieve2(),
            "achieve2",
            1,
            0,
            Item.bow,
            AchievementStorageLevel.ARGUMENT_ACHIEVE1
    ).registerAchievement();

}
