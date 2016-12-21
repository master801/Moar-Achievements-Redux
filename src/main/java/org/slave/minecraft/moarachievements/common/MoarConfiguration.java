package org.slave.minecraft.moarachievements.common;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import org.slave.lib.helpers.ReflectionHelper;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.AchievementMeta;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPages;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Master801 on 12/20/2016 at 3:14 PM.
 *
 * @author Master801
 */
public final class MoarConfiguration {

    private static final String CATEGORY_ACHIEVEMENT_ID = "achievementIds";

    private static int fallBackAchievementId = 1000;

    private Configuration configuration;
    private int achievementGetterItemId;

    public MoarConfiguration() {
        configuration = new Configuration(
                new File(
                        new File(
                                "config"
                        ),
                        "MoarAchievementsRedux.cfg"
                )
        );
    }

    public int getAchievementID(final AchievementMeta achievementMeta) {
        return configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                achievementMeta.getAchievementDescription(),
                MoarConfiguration.fallBackAchievementId += 1
        ).getInt(
                MoarConfiguration.fallBackAchievementId += 1
        );
    }

    public int getAchievementGetterItemId() {
        return achievementGetterItemId;
    }

    public void loadConfig(final boolean shouldLoad) {
        if (shouldLoad) configuration.load();
        achievementGetterItemId = configuration.getItem(
                "achievementGetter",
                4000
        ).getInt(
        );
        for(AchievementPages achievementPageStorage : AchievementPages.values()) {
            Class achievementStorageClass = achievementPageStorage.getAchievementStorageClass();
            Enum[] enumValues = ReflectionHelper.getEnumValues(
                    achievementStorageClass
            );

            for(Enum enumValue : enumValues) {
                AchievementMeta achievementMeta = null;
                try {
                    achievementMeta = (AchievementMeta)ReflectionHelper.invokeMethod(
                            ReflectionHelper.getMethod(
                                    achievementStorageClass,
                                    "getAchievementMeta",
                                    new Class<?>[0]
                            ),
                            enumValue,
                            new Object[0]
                    );
                } catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    MoarAchievements.LOGGER_MOAR_ACHIEVEMENTS.warn(
                            "Failed to get achievement meta!"
                    );
                }

                if (achievementMeta != null) {
                    Property property = configuration.get(
                            MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                            achievementMeta.getAchievementDescription(),
                            MoarConfiguration.fallBackAchievementId += 1
                    );

                    property.setName(
                            achievementMeta.getAchievementDescription()
                    );
                    property.comment = "Achievement Id\n" + achievementMeta.getAchievementDescription();
                }
            }
        }
        configuration.save();
    }

}
