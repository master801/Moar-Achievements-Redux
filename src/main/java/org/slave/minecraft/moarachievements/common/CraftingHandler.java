package org.slave.minecraft.moarachievements.common;

import cpw.mods.fml.common.ICraftingHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageTiered;

public final class CraftingHandler implements ICraftingHandler {

    @Override
    public void onCrafting(final EntityPlayer entityPlayer, final ItemStack itemStack, final IInventory craftMatrix) {
        if (entityPlayer.worldObj.isRemote) return;
        if (itemStack.itemID == Item.shovelWood.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_SHOVEL
            );
        } else if (itemStack.itemID == Item.pickaxeIron.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
            );
        } else if (itemStack.itemID == Item.pickaxeGold.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_GOLD_PICK_AXE
            );
        } else if (itemStack.itemID == Item.pickaxeDiamond.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE
            );
        } else if (itemStack.itemID == Item.axeWood.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_AXE
            );
        } else if (itemStack.itemID == Item.compass.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_COMPASS
            );
        } else if (itemStack.itemID == Item.flintAndSteel.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_FLINT_AND_IRON
            );
        } else if (itemStack.itemID == Item.shears.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_SHEARS
            );
        } else if (itemStack.itemID == Item.bed.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_BED
            );
        } else if (itemStack.itemID == Item.bow.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_BOW
            );
        } else if (itemStack.itemID == Item.appleGold.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_GOLDEN_APPLE
            );
        } else if (itemStack.itemID == Item.pocketSundial.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_CLOCK
            );
        } else if (itemStack.itemID == Item.brewingStand.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_BREWING_STAND
            );
        } else if (itemStack.itemID == Item.paper.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_PAPER
            );
        } else if (itemStack.getItem().isMap()) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_MAP
            );
        } else if (itemStack.itemID == Item.cookie.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_COOKIE
            );
        } else if (itemStack.itemID == Block.sandStone.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_SANDSTONE
            );
        } else if (itemStack.itemID == Block.blockSnow.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_SNOW
            );
        } else if (itemStack.itemID == Block.chest.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_CHEST
            );
        } else if (itemStack.itemID == Block.glowStone.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_GLOWSTONE
            );
        } else if (itemStack.itemID == Block.tnt.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_TNT
            );
        } else if (itemStack.itemID == Block.jukebox.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_JUKEBOX
            );
        } else if (itemStack.itemID == Block.torchRedstoneIdle.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH
            );
        } else if (itemStack.itemID == Block.redstoneRepeaterActive.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_REPEATER
            );
        } else if (itemStack.itemID == Block.redstoneRepeaterIdle.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_REPEATER
            );
        } else if (itemStack.itemID == Item.redstoneRepeater.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_REPEATER
            );
        } else if (itemStack.itemID == Block.torchRedstoneActive.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH
            );
        } else if (itemStack.itemID == Block.pistonBase.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_PISTON
            );
        } else if (itemStack.itemID == Block.pistonStickyBase.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_STICKY_PISTON
            );
        } else if (itemStack.itemID == Block.music.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_NOTEBLOCK
            );
        } else if (itemStack.itemID == Block.dispenser.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_DISPENSER
            );
        } else if (itemStack.itemID == Block.thinGlass.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_GLASS_PANE
            );
        } else if (itemStack.itemID == Item.bowlSoup.itemID) {
            entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW
            );
        }
    }

    @Override
    public void onSmelting(final EntityPlayer entityPlayer, final ItemStack itemStack) {
        if (entityPlayer.worldObj.isRemote) return;
        if (itemStack.itemID == Block.stone.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_SMELT_COBBLESTONE
            );
        } else if (itemStack.itemID == Block.glass.blockID) {
            entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS
            );
        }

    }
}
