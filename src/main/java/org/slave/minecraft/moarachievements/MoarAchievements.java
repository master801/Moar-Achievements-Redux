package org.slave.minecraft.moarachievements;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPageDeath;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPageTiered;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageDeath;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageTiered;
import org.slave.minecraft.moarachievements.common.CraftingHandler;
import org.slave.minecraft.moarachievements.common.EventHookContainer;
import org.slave.minecraft.moarachievements.common.MoarConfiguration;
import org.slave.minecraft.moarachievements.item.ItemAchievementGetter;
import org.slave.minecraft.moarachievements.proxy.CommonProxyMA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(modid = MoarAchievements.MOD_ID, name = MoarAchievements.NAME, version = "@VERSION@")
@NetworkMod(clientSideRequired = true)
public final class MoarAchievements {

    public static final String MOD_ID = "moararchievementsredux";
    public static final String NAME = "Moar Achievements Redux";

    @Instance(MoarAchievements.MOD_ID)
    public static MoarAchievements instance;

    @SidedProxy(
            clientSide = "org.slave.minecraft.moarachievements.proxy.ClientProxyMA",
            serverSide = "org.slave.minecraft.moarachievements.proxy.CommonProxyMA"
    )
    public static CommonProxyMA commonProxyMA;

    public static final Logger LOGGER_MOAR_ACHIEVEMENTS = LoggerFactory.getLogger(
            MoarAchievements.NAME
    );

    public static Item achievementGetterItem = null;

    public static MoarConfiguration moarConfiguration;

    public static EntityPlayer entityPlayer;
    public static Minecraft mc = Minecraft.getMinecraft();
    public static World world = FMLClientHandler.instance().getClient().theWorld;

    @EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        MoarAchievements.moarConfiguration = new MoarConfiguration();
        MoarAchievements.moarConfiguration.loadConfig(true);

        MoarAchievements.achievementGetterItem = new ItemAchievementGetter(
                MoarAchievements.moarConfiguration.getItemIdAchievementGetter()
        );

        GameRegistry.registerItem(
                MoarAchievements.achievementGetterItem,
                MoarAchievements.MOD_ID + ':' + "achievementGetter"
        );
    }

    @EventHandler
    public void load(final FMLInitializationEvent event) {
        AchievementStorage.registerAchievements();
        AchievementStorageDeath.registerAchievements();
        AchievementStorageTiered.registerAchievements();

        net.minecraftforge.common.AchievementPage.registerAchievementPage(
                new AchievementPageDeath()
        );
        net.minecraftforge.common.AchievementPage.registerAchievementPage(
                new AchievementPageTiered()
        );

        MinecraftForge.EVENT_BUS.register(
                new EventHookContainer()
        );
        GameRegistry.registerCraftingHandler(
                new CraftingHandler()
        );
        MoarAchievements.commonProxyMA.registerTickers();

        GameRegistry.addRecipe(
                new ItemStack(
                        MoarAchievements.achievementGetterItem,
                        1
                ),

                "***",
                "*@*",
                "***",

                '*',
                Item.diamond,

                '@',
                Block.blockGold
        );
    }

}
