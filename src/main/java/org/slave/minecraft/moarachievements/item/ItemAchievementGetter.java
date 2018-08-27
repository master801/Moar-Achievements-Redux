package org.slave.minecraft.moarachievements.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPageDeath;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPageTiered;

import java.util.ArrayList;
import java.util.List;

public final class ItemAchievementGetter extends Item {

    public ItemAchievementGetter() {
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabMisc);
        setFull3D();
        setUnlocalizedName("achievementGetter");
        setTextureName(MoarAchievements.MOD_ID + ":" + "achievementGetter");
    }

    @Override
    public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
        if (!world.isRemote && entityPlayer.capabilities.isCreativeMode) {

            List<Achievement> achievements = new ArrayList<>();
            achievements.addAll(AchievementPageTiered.ACHIEVEMENT_PAGE_TIERED.getAchievements());
            achievements.addAll(AchievementPageDeath.ACHIEVEMENT_PAGE_DEATH.getAchievements());

            for(Achievement achievement : achievements) {
                if (!AchievementList.achievementList.contains(achievement)) continue;
                entityPlayer.triggerAchievement(achievement);
            }

            //FIXME
//            --itemStack.stackSize;
//            if (itemStack.stackSize < 1) return null;
        }
        return itemStack;
    }

}
