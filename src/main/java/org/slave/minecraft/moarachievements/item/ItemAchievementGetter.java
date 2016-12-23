package org.slave.minecraft.moarachievements.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
        if (!world.isRemote) --itemStack.stackSize;
        return itemStack;
    }

}
