package org.slave.minecraft.moarachievements.common;

import cpw.mods.fml.common.Loader;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Master801 on 12/20/2016 at 3:14 PM.
 *
 * @author Master801
 */
public final class MoarConfiguration {

    private Configuration configuration;

    public MoarConfiguration() {
        configuration = new Configuration(
                new File(
                        Loader.instance().getConfigDir(),
                        "MoarAchievementsRedux.cfg"
                )
        );
    }

    public void loadConfig(final boolean shouldLoad) {
        if (shouldLoad) configuration.load();
        //NOOP
        configuration.save();
    }

}
