package org.slave.minecraft.moarachievements.common;

import cpw.mods.fml.common.ICraftingHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageMain;
import org.slave.minecraft.moarachievements.achievements.AchievementStorage.AchievementStorageTiered;

public final class CraftingHandler implements ICraftingHandler {

    @Override
    public void onCrafting(final EntityPlayer entityPlayer, final ItemStack itemStack, final IInventory craftMatrix) {
        if (itemStack.itemID == Item.shovelWood.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_SHOVEL.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.pickaxeIron.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_IRON_PICK_AXE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.pickaxeGold.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_GOLD_PICK_AXE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.pickaxeDiamond.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.axeWood.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_AXE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.compass.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_COMPASS.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.flintAndSteel.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_FLINT_AND_IRON.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.shears.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_SHEARS.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.bed.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_BED.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.bow.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_BOW.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.appleGold.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_GOLDEN_APPLE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.pocketSundial.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_CLOCK.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.brewingStand.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_BREWING_STAND.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.paper.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_PAPER.getAchievement(),
                    1
            );
        } else if (itemStack.getItem().isMap()) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_MAP.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.cookie.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_COOKIE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.sandStone.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_SANDSTONE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.blockSnow.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_SNOW.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.chest.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_CHEST.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.glowStone.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_GLOWSTONE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.tnt.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_TNT.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.jukebox.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_JUKEBOX.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.torchRedstoneIdle.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_REDSTONE_TORCH.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.redstoneRepeaterActive.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_REDSTONE_REPEATER.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.redstoneRepeaterIdle.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_REDSTONE_REPEATER.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Item.redstoneRepeater.itemID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_REDSTONE_REPEATER.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.torchRedstoneActive.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_REDSTONE_TORCH.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.pistonBase.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_PISTON.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.pistonStickyBase.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_STICKY_PISTON.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.music.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_NOTEBLOCK.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.dispenser.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_MAKE_DISPENSER.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.thinGlass.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_GLASS_PANE.getAchievement(),
                    1
            );
        }
    }

    @Override
    public void onSmelting(final EntityPlayer entityPlayer, final ItemStack itemStack) {
        if (itemStack.itemID == Block.stone.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageMain.ACHIEVEMENT_SMELT_COBBLESTONE.getAchievement(),
                    1
            );
        } else if (itemStack.itemID == Block.glass.blockID) {
            MoarAchievements.addStat(
                    entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS.getAchievement(),
                    1
            );
        }

    }
}
