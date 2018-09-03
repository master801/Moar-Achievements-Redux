package org.slave.minecraft.moarachievements.asm;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.Name;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;
import org.slave.minecraft.moarachievements.asm.transformers.TransformerBlockPortal;

import java.util.Map;

/**
 * Created by Master on 9/3/2018 at 11:05 AM.
 *
 * @author Master
 */
@Name("Moar Achievements Redux ASM")
@MCVersion("1.7.10")
@TransformerExclusions("org.slave.minecraft.moarachievements.asm.")
public final class MA_ASM implements IFMLLoadingPlugin {

    public static final Boolean DEBUG = Boolean.parseBoolean(System.getProperty("org.slave.minecraft.moarachievements.debug", Boolean.FALSE.toString()));

    @Override
    public String[] getASMTransformerClass() {
        return new String[] {
                TransformerBlockPortal.class.getName()
        };
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(final Map<String, Object> data) {
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}
