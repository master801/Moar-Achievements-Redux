package org.slave.minecraft.moarachievements.common;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.StatBase;
import net.minecraft.world.World;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;

import java.util.EnumSet;

public final class ClientTickHandlerMA implements ITickHandler {

    private EntityPlayer player;
    private EntityLivingBase entity;
    private StatBase chieve;
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
        runAchievementTicker();
        checkPlayerLevel();
        checkPlayerDeath();
        checkObsidian();
    }

    private void checkPlayerLevel() {
        if (MoarAchievements.entityPlayer != null) {
            if (MoarAchievements.entityPlayer.experienceLevel >= 1) {
                MoarAchievements.addStat(
                        MoarAchievements.entityPlayer,
                        AchievementStorage.ACHIEVEMENT_LEVEL_1,
                        1
                );
            }

            if (MoarAchievements.entityPlayer.experienceLevel >= 2) {
                MoarAchievements.addStat(
                        MoarAchievements.entityPlayer,
                        AchievementStorage.ACHIEVEMENT_LEVEL_2,
                        1
                );
            }

            if (MoarAchievements.entityPlayer.experienceLevel >= 3) {
                MoarAchievements.addStat(
                        MoarAchievements.entityPlayer,
                        AchievementStorage.ACHIEVEMENT_LEVEL_3,
                        1
                );
            }

            if (MoarAchievements.entityPlayer.experienceLevel >= 4) {
                MoarAchievements.addStat(
                        MoarAchievements.entityPlayer,
                        AchievementStorage.ACHIEVEMENT_LEVEL_4,
                        1
                );
            }

            if (MoarAchievements.entityPlayer.experienceLevel >= 5) {
                MoarAchievements.addStat(
                        MoarAchievements.entityPlayer,
                        AchievementStorage.ACHIEVEMENT_LEVEL_5,
                        1
                );
            }

            if (MoarAchievements.entityPlayer.experienceLevel >= 10) {
                MoarAchievements.addStat(
                        MoarAchievements.entityPlayer,
                        AchievementStorage.ACHIEVEMENT_LEVEL_10,
                        1
                );
            }
        }

    }

    public void checkPlayerInCave() {
        player = FMLClientHandler.instance().getClient().thePlayer;
        world = FMLClientHandler.instance().getClient().theWorld;
        if (MoarAchievements.entityPlayer != null && world != null && player.posY <= 55.0D && world.getBlockLightValue((int)player.posX, (int)player.posY, (int)player.posZ) <= 5) {
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_ENTER_CAVE,
                    1
            );
        }
    }

    public void runAchievementTicker() {
        if (ticking) {
            if (ticksLeft > 0) {
                --ticksLeft;
            } else {
                ticking = false;
                if (MoarAchievements.entityPlayer != null) {
                    if (chieve.statId == AchievementStorage.ACHIEVEMENT_LIVE_FALLING.statId) {
                        if (playerDiedRecently) return;
                        MoarAchievements.addStat(
                                MoarAchievements.entityPlayer,
                                chieve,
                                1
                        );
                    }
                    MoarAchievements.entityPlayer.addStat(
                            chieve,
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

    public void registerAchievementToGet(EntityLivingBase entity, StatBase chieve, int ticks) {
        if (!ticking) {
            this.entity = entity;
            this.chieve = chieve;
            ticksLeft = ticks;
            ticking = true;
        }
    }

    public void setPlayerDiedRecently() {
        playerDiedRecently = true;
    }

    private void checkObsidian() {
        if (obsidianChieve >= 1) {
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_1,
                    1
            );
        }

        if (obsidianChieve >= 2) {
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_2,
                    1
            );
        }

        if (obsidianChieve >= 3) {
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_3,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_4,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_5,
                    1
            );
        }

        if (obsidianChieve >= 4) {
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_6,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_7,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_8,
                    1
            );
        }

        if (obsidianChieve >= 5) {
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_9,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_OBSIDIAN_10,
                    1
            );
        }

        if (obsidianChieve >= 6) {
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_PORTAL_11,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_PORTAL_12,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_PORTAL_13,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_PORTAL_14,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_PORTAL_15,
                    1
            );
            MoarAchievements.addStat(
                    MoarAchievements.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_PORTAL_16,
                    1
            );
        }

    }

    public void setPassback(int posX, int posY, int posZ) {
        int blockNum = MoarAchievements.mc.theWorld.getBlockId(posX, posY, posZ);
        if (blockNum == Block.obsidian.blockID) {
            if (obsidianPlaced >= 0 && obsidianChieve < 1) {
                obsidianChieve = 1;
            } else if (obsidianPlaced >= 1 && obsidianChieve < 2) {
                if (MoarAchievements.mc.theWorld.getBlockId(posX + 1, posY, posZ) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX - 1, posY, posZ) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX, posY, posZ + 1) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX, posY, posZ - 1) == Block.obsidian.blockID) {
                    obsidianChieve = 2;
                }
            } else if (obsidianPlaced >= 4 && obsidianChieve < 3) {
                if (MoarAchievements.mc.theWorld.getBlockId(posX, posY + 1, posZ) == Block.obsidian.blockID && MoarAchievements.mc.theWorld.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX, posY + 1, posZ) == Block.obsidian.blockID && MoarAchievements.mc.theWorld.getBlockId(posX, posY + 2, posZ) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID && MoarAchievements.mc.theWorld.getBlockId(posX, posY - 2, posZ) == Block.obsidian.blockID) {
                    tempX1 = posX;
                    tempZ1 = posZ;
                    obsidianChieve = 3;
                }
            } else if (obsidianPlaced >= 7 && obsidianChieve < 4) {
                if (MoarAchievements.mc.theWorld.getBlockId(posX, posY + 1, posZ) == Block.obsidian.blockID && MoarAchievements.mc.theWorld.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX, posY + 1, posZ) == Block.obsidian.blockID && MoarAchievements.mc.theWorld.getBlockId(posX, posY + 2, posZ) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID && MoarAchievements.mc.theWorld.getBlockId(posX, posY - 2, posZ) == Block.obsidian.blockID && tempX1 != posX || tempZ1 != posZ) {
                    obsidianChieve = 4;
                }
            } else if (obsidianPlaced >= 9 && obsidianChieve < 5 && (MoarAchievements.mc.theWorld.getBlockId(posX + 1, posY, posZ) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX - 1, posY, posZ) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX, posY, posZ + 1) == Block.obsidian.blockID || MoarAchievements.mc.theWorld.getBlockId(posX, posY, posZ - 1) == Block.obsidian.blockID)) {
                obsidianChieve = 5;
            }
            ++obsidianPlaced;
        }

        if (blockNum == Block.fire.blockID && obsidianChieve == 5 && MoarAchievements.mc.theWorld.getBlockId(posX, posY - 1, posZ) == Block.obsidian.blockID) {
            obsidianChieve = 6;
        }
    }

}
