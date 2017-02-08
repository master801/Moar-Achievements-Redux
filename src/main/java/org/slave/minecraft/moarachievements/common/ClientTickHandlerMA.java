package org.slave.minecraft.moarachievements.common;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;

import java.util.EnumSet;

public final class ClientTickHandlerMA implements ITickHandler {

    private EntityPlayer player;
    private EntityLivingBase entity;
    private Achievement achievement;
    private int ticksLeft;
    private int recentDeathTicks;
    private int tempX1 = 0;
    private int tempZ1 = 0;
    public int obsidianPlaced = 0;
    public int obsidianChieve = 0;
    private World world;
    boolean annoyed = false;
    private boolean ticking = false;
    public boolean playerDiedRecently = false;

    @Override
    public void tickStart(EnumSet type, Object[] tickData) {
    }

    @Override
    public void tickEnd(EnumSet type, Object[] tickData) {
        if (type.equals(EnumSet.of(TickType.CLIENT))) {
            GuiScreen guiscreen = Minecraft.getMinecraft().currentScreen;
            if (guiscreen == null) onTickInGame();
        }

    }

    @Override
    public EnumSet<TickType> ticks() {
        return EnumSet.of(
                TickType.RENDER,
                TickType.CLIENT
        );
    }

    @Override
    public String getLabel() {
        return null;
    }

    private void onTickInGame() {
        checkPlayerInCave();
        runAchievementTicker(
                MoarAchievements.entityPlayer
        );
        checkPlayerLevel(
                MoarAchievements.entityPlayer
        );
        checkPlayerDeath();
        checkObsidian(
                MoarAchievements.entityPlayer
        );
    }

    private void checkPlayerLevel(final EntityPlayer entityPlayer) {
        if (entityPlayer != null) {
            if (entityPlayer.experienceLevel >= 1) {
                entityPlayer.triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_LEVEL_1
                );
            }

            if (entityPlayer.experienceLevel >= 2) {
                entityPlayer.triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_LEVEL_2
                );
            }

            if (entityPlayer.experienceLevel >= 3) {
                entityPlayer.triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_LEVEL_3
                );
            }

            if (entityPlayer.experienceLevel >= 4) {
                entityPlayer.triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_LEVEL_4
                );
            }

            if (entityPlayer.experienceLevel >= 5) {
                entityPlayer.triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_LEVEL_5
                );
            }

            if (entityPlayer.experienceLevel >= 10) {
                entityPlayer.triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_LEVEL_10
                );
            }
        }

    }

    public void checkPlayerInCave() {
        player = FMLClientHandler.instance().getClient().thePlayer;
        world = FMLClientHandler.instance().getClient().theWorld;
        if (player != null && world != null && player.posY <= 55.0D && world.getBlockLightValue((int)player.posX, (int)player.posY, (int)player.posZ) <= 5) {
            player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_ENTER_CAVE
            );
        }
    }

    public void runAchievementTicker(final EntityPlayer entityPlayer) {
        if (ticking) {
            if (ticksLeft > 0) {
                --ticksLeft;
            } else {
                ticking = false;
                if (entityPlayer != null) {
                    if (achievement.statId == AchievementStorage.ACHIEVEMENT_LIVE_FALLING.statId) {
                        if (playerDiedRecently) return;
                        entityPlayer.triggerAchievement(
                                achievement
                        );
                    }
                    entityPlayer.addStat(
                            achievement,
                            1
                    );
                } else if (!annoyed) {
                    Minecraft mc = FMLClientHandler.instance().getClient();
                    mc.ingameGUI.getChatGUI().printChatMessage(
                            "If you are playing in multiplayer, this falling bug is being fixed."
                    );
                    annoyed = true;
                }
            }
        }

    }

    public void checkPlayerDeath() {
        if (playerDiedRecently && recentDeathTicks == 0) recentDeathTicks = 20;
        if (recentDeathTicks > 0) {
            --recentDeathTicks;
            if (recentDeathTicks == 0) playerDiedRecently = false;
        }
    }

    public void registerAchievementToGet(final EntityLivingBase entity, final Achievement achievement, final int ticks) {
        if (!ticking) {
            this.entity = entity;
            this.achievement = achievement;
            ticksLeft = ticks;
            ticking = true;
        }
    }

    public void setPlayerDiedRecently() {
        playerDiedRecently = true;
    }

    private void checkObsidian(final EntityPlayer entityPlayer) {
        if (obsidianChieve >= 1) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_1
            );
        }

        if (obsidianChieve >= 2) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_2
            );
        }

        if (obsidianChieve >= 3) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_3
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_4
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_5
            );
        }

        if (obsidianChieve >= 4) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_6
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_7
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_8
            );
        }

        if (obsidianChieve >= 5) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_9
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_10
            );
        }

        if (obsidianChieve >= 6) {
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_PORTAL_11
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_PORTAL_12
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_PORTAL_13
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_PORTAL_14
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_PORTAL_15
            );
            entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_PORTAL_16
            );
        }
    }

    public void setPassback(final World world, final int posX, final int posY, final int posZ) {
        int blockNum = world.getBlockId(posX, posY, posZ);
        if (blockNum == Block.obsidian.blockID) {
            if (obsidianPlaced >= 0 && obsidianChieve < 1) {
                obsidianChieve = 1;
            } else if (obsidianPlaced >= 1 && obsidianChieve < 2) {
                if (world.getBlockId(posX + 1, posY, posZ) == Block.obsidian.blockID || world.getBlockId(posX - 1, posY, posZ) == Block.obsidian.blockID || world.getBlockId(posX, posY, posZ + 1) == Block.obsidian.blockID || world.getBlockId(posX, posY, posZ - 1) == Block.obsidian.blockID) {
                    obsidianChieve = 2;
                }
            } else if (obsidianPlaced >= 4 && obsidianChieve < 3) {
                if (world.getBlockId(posX, posY + 1, posZ) == Block.obsidian.blockID && world.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID || world.getBlockId(posX, posY + 1, posZ) == Block.obsidian.blockID && world.getBlockId(posX, posY + 2, posZ) == Block.obsidian.blockID || world.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID && world.getBlockId(posX, posY - 2, posZ) == Block.obsidian.blockID) {
                    tempX1 = posX;
                    tempZ1 = posZ;
                    obsidianChieve = 3;
                }
            } else if (obsidianPlaced >= 7 && obsidianChieve < 4) {
                if (world.getBlockId(posX, posY + 1, posZ) == Block.obsidian.blockID && world.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID || world.getBlockId(posX, posY + 1, posZ) == Block.obsidian.blockID && world.getBlockId(posX, posY + 2, posZ) == Block.obsidian.blockID || world.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID && world.getBlockId(posX, posY - 2, posZ) == Block.obsidian.blockID && tempX1 != posX || tempZ1 != posZ) {
                    obsidianChieve = 4;
                }
            } else if (obsidianPlaced >= 9 && obsidianChieve < 5 && (world.getBlockId(posX + 1, posY, posZ) == Block.obsidian.blockID || world.getBlockId(posX - 1, posY, posZ) == Block.obsidian.blockID || world.getBlockId(posX, posY, posZ + 1) == Block.obsidian.blockID || world.getBlockId(posX, posY, posZ - 1) == Block.obsidian.blockID)) {
                obsidianChieve = 5;
            }
            ++obsidianPlaced;
        }

        if (blockNum == Block.fire.blockID && obsidianChieve == 5 && world.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID) {
            obsidianChieve = 6;
        }
    }

}
