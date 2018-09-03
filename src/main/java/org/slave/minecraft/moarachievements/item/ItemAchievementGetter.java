package org.slave.minecraft.moarachievements.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public final class ItemAchievementGetter extends Item {

    public ItemAchievementGetter() {
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabMisc);
        setFull3D();
        setUnlocalizedName("achievementGetter");
    }

    @SuppressWarnings("unchecked")
    @Override
    public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
        if (!world.isRemote && entityPlayer.capabilities.isCreativeMode) {
            for(Achievement achievement : (List<Achievement>)AchievementList.achievementList) {
                entityPlayer.triggerAchievement(achievement);
            }
        }
        return itemStack;
    }

    @Override
    public IIcon getIconFromDamage(final int p_77617_1_) {
        return Items.book.getIconFromDamage(0);
    }

    @Override
    public boolean hasEffect(final ItemStack par1ItemStack, final int pass) {
        return true;
    }

}
