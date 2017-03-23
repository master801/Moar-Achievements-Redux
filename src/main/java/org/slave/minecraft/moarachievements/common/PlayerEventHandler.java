package org.slave.minecraft.moarachievements.common;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;

/**
 * Created by Master801 on 3/9/17 at 7:24 PM.
 *
 * @author Master801
 */
public final class PlayerEventHandler {

    public static final Object INSTANCE = new PlayerEventHandler();

    @SubscribeEvent
    public void onPlayerPickupXP(final PlayerPickupXpEvent playerPickupXpEvent) {
        if (playerPickupXpEvent.entityPlayer.worldObj.isRemote) return;

        if (playerPickupXpEvent.entityPlayer.experienceLevel >= 1) {
            playerPickupXpEvent.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_LEVEL_1
            );
        }
        if (playerPickupXpEvent.entityPlayer.experienceLevel >= 2) {
            playerPickupXpEvent.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_LEVEL_2
            );
        }
        if (playerPickupXpEvent.entityPlayer.experienceLevel >= 3) {
            playerPickupXpEvent.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_LEVEL_3
            );
        }
        if (playerPickupXpEvent.entityPlayer.experienceLevel >= 4) {
            playerPickupXpEvent.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_LEVEL_4
            );
        }
        if (playerPickupXpEvent.entityPlayer.experienceLevel >= 5) {
            playerPickupXpEvent.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_LEVEL_5
            );
        }
        if (playerPickupXpEvent.entityPlayer.experienceLevel >= 10) {
            playerPickupXpEvent.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_LEVEL_10
            );
        }
    }

    /*
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
    boolean annoyed_tick = false;
    private boolean ticking = false;
    public boolean playerDiedRecently = false;

    @SubscribeEvent
    public void onPlayerTick(final PlayerTickEvent playerTickEvent) {
        if (!playerTickEvent.player.worldObj.isRemote) return;
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
                if (achievement != null && entityPlayer != null) {
                    if (achievement.statId.equals(AchievementStorage.ACHIEVEMENT_LIVE_FALLING.statId)) {
                        if (playerDiedRecently) return;
                        entityPlayer.triggerAchievement(
                                achievement
                        );
                    }
                    entityPlayer.addStat(
                            achievement,
                            1
                    );
                } else if (!annoyed_tick && FMLCommonHandler.instance().getSide().isClient()) {
                    Minecraft mc = FMLClientHandler.instance().getClient();
                    mc.ingameGUI.getChatGUI().printChatMessage(
                            new ChatComponentText("If you are playing in multiplayer, this falling bug is being fixed.")
                    );
                    annoyed_tick = true;
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
        Block block = world.getBlock(posX, posY, posZ);
        if (block == Blocks.obsidian) {
            if (obsidianPlaced >= 0 && obsidianChieve < 1) {
                obsidianChieve = 1;
            } else if (obsidianPlaced >= 1 && obsidianChieve < 2) {
                if (world.getBlock(posX + 1, posY, posZ) == Blocks.obsidian || world.getBlock(posX - 1, posY, posZ) == Blocks.obsidian || world.getBlock(posX, posY, posZ + 1) == Blocks.obsidian || world.getBlock(posX, posY, posZ - 1) == Blocks.obsidian) {
                    obsidianChieve = 2;
                }
            } else if (obsidianPlaced >= 4 && obsidianChieve < 3) {
                if (world.getBlock(posX, posY + 1, posZ) == Blocks.obsidian && world.getBlock(posX, posY - 1, posZ) == Blocks.obsidian || world.getBlock(posX, posY + 1, posZ) == Blocks.obsidian && world.getBlock(posX, posY + 2, posZ) == Blocks.obsidian || world.getBlock(posX, posY - 1, posZ) == Blocks.obsidian && world.getBlock(posX, posY - 2, posZ) == Blocks.obsidian) {
                    tempX1 = posX;
                    tempZ1 = posZ;
                    obsidianChieve = 3;
                }
            } else if (obsidianPlaced >= 7 && obsidianChieve < 4) {
                if (world.getBlock(posX, posY + 1, posZ) == Blocks.obsidian && world.getBlock(posX, posY - 1, posZ) == Blocks.obsidian || world.getBlock(posX, posY + 1, posZ) == Blocks.obsidian && world.getBlock(posX, posY + 2, posZ) == Blocks.obsidian || world.getBlock(posX, posY - 1, posZ) == Blocks.obsidian && world.getBlock(posX, posY - 2, posZ) == Blocks.obsidian && tempX1 != posX || tempZ1 != posZ) {
                    obsidianChieve = 4;
                }
            } else if (obsidianPlaced >= 9 && obsidianChieve < 5 && (world.getBlock(posX + 1, posY, posZ) == Blocks.obsidian || world.getBlock(posX - 1, posY, posZ) == Blocks.obsidian || world.getBlock(posX, posY, posZ + 1) == Blocks.obsidian || world.getBlock(posX, posY, posZ - 1) == Blocks.obsidian)) {
                obsidianChieve = 5;
            }
            ++obsidianPlaced;
        }

        if (block == Blocks.fire && obsidianChieve == 5 && world.getBlock(posX, posY - 1, posZ) == Blocks.obsidian) {
            obsidianChieve = 6;
        }
    }
    */

}
