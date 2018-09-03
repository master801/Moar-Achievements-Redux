package org.slave.minecraft.moarachievements;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPageDeath;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPageTiered;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageDeath;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageTiered;
import org.slave.minecraft.moarachievements.common.MoarConfiguration;
import org.slave.minecraft.moarachievements.common.PlayerEventHandler;
import org.slave.minecraft.moarachievements.hook.EventHookContainer;
import org.slave.minecraft.moarachievements.hook.PlayerEventHook;
import org.slave.minecraft.moarachievements.item.ItemAchievementGetter;

@Mod(modid = MoarAchievements.MOD_ID, name = MoarAchievements.NAME, version = "@VERSION@")
public final class MoarAchievements {

    public static final String MOD_ID = "moar_archievements_redux";
    public static final String NAME = "Moar Achievements Redux";

    @Instance(MoarAchievements.MOD_ID)
    public static MoarAchievements instance;

    public static final Logger LOGGER_MOAR_ACHIEVEMENTS = LogManager.getLogger(MoarAchievements.NAME);

    public static final Item ITEM_ACHIEVEMENT_GETTER = new ItemAchievementGetter();

    public static MoarConfiguration moarConfiguration;

    @EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        MoarAchievements.moarConfiguration = new MoarConfiguration();
        MoarAchievements.moarConfiguration.loadConfig(true);

        GameRegistry.registerItem(
                MoarAchievements.ITEM_ACHIEVEMENT_GETTER,
                "achievementGetter"
        );
    }

    @EventHandler
    public void load(final FMLInitializationEvent event) {
        registerAchievements();

        MinecraftForge.EVENT_BUS.register(EventHookContainer.INSTANCE);
        FMLCommonHandler.instance().bus().register(PlayerEventHandler.INSTANCE);

        MinecraftForge.EVENT_BUS.register(PlayerEventHook.INSTANCE);
        FMLCommonHandler.instance().bus().register(PlayerEventHook.INSTANCE);

        /*
        GameRegistry.addRecipe(
                new ItemStack(MoarAchievements.ITEM_ACHIEVEMENT_GETTER),

                "***",
                "*@*",
                "***",

                '*',
                Items.diamond,

                '@',
                Blocks.gold_block
        );
        */
    }

    private void registerAchievements() {
        AchievementStorage.registerAchievements();
        AchievementStorageDeath.registerAchievements();
        AchievementStorageTiered.registerAchievements();

        AchievementPage.registerAchievementPage(AchievementPageDeath.ACHIEVEMENT_PAGE_DEATH);
        AchievementPage.registerAchievementPage(AchievementPageTiered.ACHIEVEMENT_PAGE_TIERED);
    }

}
