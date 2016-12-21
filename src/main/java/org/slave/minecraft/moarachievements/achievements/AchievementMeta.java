package org.slave.minecraft.moarachievements.achievements;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Master801 on 12/20/2016 at 10:59 PM.
 *
 * @author Master801
 */
public final class AchievementMeta {

    private final String achievementDescription;
    private final int displayColumn, displayRow;
    private final ItemStack theItemStack;

    public AchievementMeta(final String achievementDescription, final int displayColumn, final int displayRow, final Item item) {
        this(
                achievementDescription,
                displayColumn,
                displayRow,
                new ItemStack(item)
        );
    }

    public AchievementMeta(final String achievementDescription, final int displayColumn, final int displayRow, final Block block) {
        this(
                achievementDescription,
                displayColumn,
                displayRow,
                new ItemStack(block)
        );
    }

    public AchievementMeta(final String achievementDescription, final int displayColumn, final int displayRow, final ItemStack theItemStack) {
        this.achievementDescription = achievementDescription;
        this.displayColumn = displayColumn;
        this.displayRow = displayRow;
        this.theItemStack = theItemStack;
    }

    public String getAchievementDescription() {
        return achievementDescription;
    }

    public int getDisplayColumn() {
        return displayColumn;
    }

    public int getDisplayRow() {
        return displayRow;
    }

    public ItemStack getItemStack() {
        return theItemStack;
    }

}
