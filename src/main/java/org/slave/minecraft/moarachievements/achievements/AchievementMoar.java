package org.slave.minecraft.moarachievements.achievements;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import org.slave.minecraft.moarachievements.MoarAchievements;

/**
 * Created by Master801 on 12/28/2016 at 12:06 AM.
 *
 * @author Master801
 */
public class AchievementMoar extends Achievement {

    public AchievementMoar(final int p_i1539_1_, final String p_i1539_2_, final int p_i1539_3_, final int p_i1539_4_, final Item p_i1539_5_, final Achievement p_i1539_6_) {
        super(
                p_i1539_1_,
                p_i1539_2_,
                p_i1539_3_,
                p_i1539_4_,
                p_i1539_5_,
                p_i1539_6_
        );
    }

    public AchievementMoar(final int p_i1540_1_, final String p_i1540_2_, final int p_i1540_3_, final int p_i1540_4_, final Block p_i1540_5_, final Achievement p_i1540_6_) {
        super(
                p_i1540_1_,
                p_i1540_2_,
                p_i1540_3_,
                p_i1540_4_,
                p_i1540_5_,
                p_i1540_6_
        );
    }

    public AchievementMoar(final int p_i1541_1_, final String p_i1541_2_, final int p_i1541_3_, final int p_i1541_4_, final ItemStack p_i1541_5_, final Achievement p_i1541_6_) {
        super(
                p_i1541_1_,
                p_i1541_2_,
                p_i1541_3_,
                p_i1541_4_,
                p_i1541_5_,
                p_i1541_6_
        );
    }

    @Override
    public Achievement registerAchievement() {
        //TODO

        MoarAchievements.LOGGER_MOAR_ACHIEVEMENTS.info("");

        return super.registerAchievement();
    }

}
