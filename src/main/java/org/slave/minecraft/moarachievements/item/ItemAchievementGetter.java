package org.slave.minecraft.moarachievements.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPage;

public final class ItemAchievementGetter extends Item {

    public ItemAchievementGetter(int itemID) {
        super(itemID);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabMisc);
        setFull3D();
        setUnlocalizedName("achievementGetter");
    }

    @Override
    public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
        if (!world.isRemote && entityPlayer.capabilities.isCreativeMode) {
            for(AchievementPage achievementPage : AchievementPage.values()) {
                for(Achievement achievement : achievementPage.getAchievementPage().getAchievements()) {
                    entityPlayer.triggerAchievement(
                            achievement
                    );
                }
            }
            --itemStack.stackSize;
            if (itemStack.stackSize < 1) return null;
        }
        return itemStack;
    }

}
