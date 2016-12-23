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
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPage;
import org.slave.minecraft.moarachievements.common.CraftingHandler;
import org.slave.minecraft.moarachievements.common.EventHookContainer;
import org.slave.minecraft.moarachievements.common.MoarConfiguration;
import org.slave.minecraft.moarachievements.item.ItemAchievementGetter;
import org.slave.minecraft.moarachievements.proxy.CommonProxyMA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Achievement> achievementList = new ArrayList<>();

    public static MoarConfiguration moarConfiguration;

    public static EntityPlayer entityPlayer;
    public static Minecraft mc = Minecraft.getMinecraft();
    public static World world = FMLClientHandler.instance().getClient().theWorld;

    public static void addStat(EntityPlayer par1EntityPlayer, StatBase par2StatBase, int par3) {
        par1EntityPlayer.addStat(
                par2StatBase,
                par3
        );
    }

    @Deprecated
    public static void addAchievementLocalizations(Achievement ach, String name, String desc, String langFile) {
        MoarAchievements.achievementList.add(ach);
        LanguageRegistry.instance().addStringLocalization(
                ach.toString(),
                langFile,
                name
        );
        LanguageRegistry.instance().addStringLocalization(
                ach.toString() + ".desc",
                langFile,
                desc
        );
    }

    @EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        MoarAchievements.moarConfiguration = new MoarConfiguration();
        MoarAchievements.moarConfiguration.loadConfig(true);

        for(AchievementPage achievementPage : AchievementPage.values()) {
            for(Achievement achievement : achievementPage.getAchievementPage().getAchievements()) achievement.registerAchievement();
        }

        MoarAchievements.achievementGetterItem = new ItemAchievementGetter(
                MoarAchievements.moarConfiguration.getAchievementGetterItemId()
        );

        GameRegistry.registerItem(
                MoarAchievements.achievementGetterItem,
                MoarAchievements.MOD_ID + ':' + "achievementGetter"
        );

//        English.initializeLang();
//        Chinese.initializeLang();//TODO
    }

    @EventHandler
    public void load(final FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(
                new EventHookContainer()
        );
        GameRegistry.registerCraftingHandler(
                new CraftingHandler()
        );
        MoarAchievements.commonProxyMA.registerTickers();
        net.minecraftforge.common.AchievementPage.registerAchievementPage(
                AchievementPage.PAGE_DEATH.getAchievementPage()
        );
        net.minecraftforge.common.AchievementPage.registerAchievementPage(
                AchievementPage.PAGE_TIERED.getAchievementPage()
        );

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
