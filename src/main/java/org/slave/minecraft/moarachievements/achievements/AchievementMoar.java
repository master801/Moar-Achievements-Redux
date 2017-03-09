package org.slave.minecraft.moarachievements.achievements;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;

/**
 * Created by Master801 on 12/28/2016 at 12:06 AM.
 *
 * @author Master801
 */
public class AchievementMoar extends Achievement {

    public AchievementMoar(final String achievementId, final int displayColumn, final int displayRow, final Item item, final Achievement parent) {
        super(
                achievementId,
                achievementId,
                displayColumn,
                displayRow,
                item,
                parent
        );
    }

    public AchievementMoar(final String achievementId, final int displayColumn, final int displayRow, final Block block, final Achievement parent) {
        super(
                achievementId,
                achievementId,
                displayColumn,
                displayRow,
                block,
                parent
        );
    }

    public AchievementMoar(final String achievementId, final int displayColumn, final int displayRow, final ItemStack itemStack, final Achievement parent) {
        super(
                achievementId,
                achievementId,
                displayColumn,
                displayRow,
                itemStack,
                parent
        );
    }

    @Override
    public Achievement registerStat() {
        return super.registerStat();
    }

}
