package org.slave.minecraft.moarachievements.common;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageDeath;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageTiered;
import org.slave.minecraft.moarachievements.proxy.ClientProxyMA;

public final class EventHookContainer {

    boolean annoyed = false;

    @ForgeSubscribe
    public void itemPickup(EntityItemPickupEvent event) {
        if (event.item.getEntityItem().itemID == Block.sand.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
            );
        } else if (event.item.getEntityItem().itemID == Item.snowball.itemID) {
            event.entityPlayer.triggerAchievement(AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW
            );
        } else if (event.item.getEntityItem().itemID == Item.coal.itemID && event.item.getEntityItem().getItemDamage() == 0) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_COAL
            );
        } else if (event.item.getEntityItem().itemID == Item.glowstone.itemID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST
            );
        } else if (event.item.getEntityItem().itemID == Item.redstone.itemID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
            );
        } else if (event.item.getEntityItem().itemID == Block.cloth.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_COLLECT_WOOL
            );
        } else if (event.item.getEntityItem().itemID == Item.egg.itemID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_COLLECT_EGG
            );
        } else if (event.item.getEntityItem().itemID == Block.cactus.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_CACTUS
            );
        } else if (event.item.getEntityItem().itemID == Item.appleRed.itemID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
            );
        } else if (event.item.getEntityItem().itemID == Block.slowSand.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND
            );
        } else if (event.item.getEntityItem().itemID == Block.netherrack.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_NETHERRACK
            );
        } else if (event.item.getEntityItem().itemID == Item.reed.itemID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE
            );
        } else if (event.item.getEntityItem().itemID == Item.netherStalkSeeds.itemID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_NETHER_WART
            );
        } else if (event.item.getEntityItem().itemID == Block.dragonEgg.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_DRAGON_EGG
            );
        } else if (event.item.getEntityItem().itemID == Block.dirt.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_DIRT
            );
        } else if (event.item.getEntityItem().itemID == Block.mushroomBrown.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_BROWN
            );
        } else if (event.item.getEntityItem().itemID == Block.mushroomRed.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_RED
            );
        } else if (event.item.getEntityItem().itemID == Block.blockSnow.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW
            );
        } else if (event.item.getEntityItem().itemID == Block.cobblestone.blockID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_COBBLESTONE
            );
        } else if (event.item.getEntityItem().itemID == Item.clay.itemID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_CLAY
            );
        } else if (event.item.getEntityItem().itemID == Item.wheat.itemID) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_WHEAT
            );
        }

    }

    @ForgeSubscribe
    public void entityDeath(LivingDeathEvent event) {
        if (event.source.getSourceOfDamage() instanceof EntityPlayer) {
            if (event.entity instanceof EntityZombie) {
                ((EntityPlayer)event.source.getSourceOfDamage()).triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_KILL_ZOMBIE
                );
            }
            if (event.entity instanceof EntitySkeleton) {
                ((EntityPlayer)event.source.getSourceOfDamage()).triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_KILL_SKELETON
                );
            }
            if (event.entity instanceof EntityCow || event.entity instanceof EntityPig || event.entity instanceof EntityChicken) {
                ((EntityPlayer)event.source.getSourceOfDamage()).triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
                );
            }
            if (event.entity instanceof EntityEnderman) {
                ((EntityPlayer)event.source.getSourceOfDamage()).triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_KILL_ENDERMAN
                );
            }
            if (event.entity instanceof EntityCreeper) {
                ((EntityPlayer)event.source.getSourceOfDamage()).triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_KILL_CREEPER
                );
            }
            if (event.entity instanceof EntitySpider) {
                ((EntityPlayer)event.source.getSourceOfDamage()).triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_KILL_SPIDER
                );
            }
            if (event.entity instanceof EntitySlime) {
                ((EntityPlayer)event.source.getSourceOfDamage()).triggerAchievement(
                        AchievementStorage.ACHIEVEMENT_KILL_SLIME
                );
            }
        }

        boolean passFireCheck = false;
        if (event.source.getSourceOfDamage() instanceof EntityArrow) {
            EntityArrow entityArrow = (EntityArrow)event.source.getSourceOfDamage();
            if (entityArrow.shootingEntity != null) {
                if (entityArrow.shootingEntity instanceof EntitySkeleton) {
                    EntityLivingBase living = (EntityLivingBase)((EntityCreature)entityArrow.shootingEntity).getEntityToAttack();
                    if (event.entity instanceof EntityCreeper && living instanceof EntityPlayer) {
                        ((EntityPlayer)living).triggerAchievement(
                                AchievementStorage.ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER
                        );
                    }
                    if (event.entity instanceof EntityPlayer) {
                        ((EntityPlayer)living).triggerAchievement(
                                AchievementStorage.ACHIEVEMENT_KILL_SKELETON
                        );
                    }
                }
                if (entityArrow.shootingEntity instanceof EntityPlayer && entityArrow.shootingEntity == MoarAchievements.entityPlayer && event.entity instanceof EntityPlayer) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF
                    );
                }
            }
        }
        if (event.source.getSourceOfDamage() instanceof EntityFireball) {
            EntityFireball slime1 = (EntityFireball)event.source.getSourceOfDamage();
            if (slime1.shootingEntity instanceof EntityBlaze && event.entity instanceof EntityPlayer) {
                ((EntityPlayer)event.entity).triggerAchievement(
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_BLAZE
                );
            }
            if (slime1.shootingEntity instanceof EntityGhast && event.entity instanceof EntityPlayer) {
                ((EntityPlayer)event.entity).triggerAchievement(
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_GHAST
                );
            }
            if (slime1.shootingEntity == null && event.entity instanceof EntityPlayer) {
                ((EntityPlayer)event.entity).triggerAchievement(
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER
                );
                passFireCheck = true;
            }
        }
        if (event.source.getSourceOfDamage() instanceof EntityWither && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER
            );
        }
        if (event.source.getDamageType().equals("wither") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER
            );
        }
        if (event.source.getDamageType().equals("explosion") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_CREEPER
            );
        }
        if (event.source.getDamageType().equals("anvil") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANVIL
            );
        }
        if (event.source.getDamageType().equals("inWall") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WALL
            );
        }
        if (event.source.getDamageType().equals("inFire") && !passFireCheck && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FLAME
            );
        }
        if (event.source.getDamageType().equals("onFire") && !passFireCheck && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE
            );
        }
        if (event.source.getDamageType().equals("fall") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FALL
            );
        }
        if (event.source.getDamageType().equals("drown") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WATER
            );
        }
        if (event.source.getDamageType().equals("outOfWorld") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPACE
            );
        }
        if (event.source.getDamageType().equals("indirectMagic") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_THROWN_POTION
            );
        }
        if (event.source.getDamageType().equals("magic") && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_POTION
            );
        }
        if (event.source.getSourceOfDamage() instanceof EntityEnderman && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ENDERMAN
            );
        }
        if (event.source.getSourceOfDamage() instanceof EntityZombie && event.entity instanceof EntityPlayer) {
            if (((EntityZombie)event.source.getSourceOfDamage()).isVillager()) {
                ((EntityPlayer)event.entity).triggerAchievement(
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER
                );
            }

            if (((EntityLivingBase)event.source.getSourceOfDamage()).isChild()) {
                ((EntityPlayer)event.entity).triggerAchievement(
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD
                );
            }

            ItemStack slime2 = ((EntityLivingBase)event.source.getSourceOfDamage()).getHeldItem();
            if (slime2 != null) {
                if (slime2.itemID == Item.diamond.itemID) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND
                    );
                }

                if (slime2.itemID == Item.swordWood.itemID || slime2.itemID == Item.swordStone.itemID || slime2.itemID == Item.swordGold.itemID || slime2.itemID == Item.swordIron.itemID || slime2.itemID == Item.swordDiamond.itemID) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD
                    );
                }
            }

            if (!((EntityZombie)event.source.getSourceOfDamage()).isVillager() && !((EntityLivingBase)event.source.getSourceOfDamage()).isChild() && slime2 == null) {
                ((EntityPlayer)event.entity).triggerAchievement(
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE
                );
            }
        }

        if (event.source.getSourceOfDamage() instanceof EntitySpider && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPIDER
            );
        }

        if (event.source.getSourceOfDamage() instanceof EntityPlayer && event.entity instanceof EntityPlayer && event.entityLiving.getEntityName().equals(MoarAchievements.entityPlayer.getEntityName())) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF
            );
        }

        if (event.source.getSourceOfDamage() instanceof EntitySlime) {
            EntitySlime slime3 = (EntitySlime)event.source.getSourceOfDamage();
            if (event.entity instanceof EntityPlayer) {
                System.out.println(slime3.getSlimeSize());
                if (slime3.getSlimeSize() == 1) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SMALL_SLIME
                    );
                }

                if (slime3.getSlimeSize() == 2) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME
                    );
                }

                if (slime3.getSlimeSize() == 4) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_LARGE_SLIME
                    );
                }

                if (slime3.getSlimeSize() >= 5) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_HUGE_SLIME
                    );
                }
            }
        }

        if (event.source.getSourceOfDamage() instanceof EntityDragon && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_DRAGON
            );
        }

        if (event.entity instanceof EntityPlayer) {
            if (event.source.getSourceOfDamage() instanceof EntityArrow) {
                EntityArrow entityArrow = (EntityArrow)event.source.getSourceOfDamage();
            }

            if (event.source.getSourceOfDamage() instanceof EntityFireball) {
                EntityFireball living1 = (EntityFireball)event.source.getSourceOfDamage();
            }

            ClientProxyMA.tickHandler.setPlayerDiedRecently();
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
            );
            int posX = (int)event.entity.posX;
            int posY = (int)event.entity.posY;
            int posZ = (int)event.entity.posZ;
            if (MoarAchievements.mc.theWorld.getBlockId(posX, posY - 1, posZ) == Block.blockIron.blockID) {
                ((EntityPlayer)event.entity).triggerAchievement(
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_IRON
                );
            }
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
            );
        }
    }

    @ForgeSubscribe
    public void fallEvent(LivingFallEvent event) {
        if (event.entityLiving instanceof EntityPlayer) {
            ClientTickHandlerMA ticker = ClientProxyMA.tickHandler;
            if (event.distance >= 21.0F && !ticker.playerDiedRecently) {
                ticker.registerAchievementToGet(
                        event.entityLiving,
                        AchievementStorage.ACHIEVEMENT_LIVE_FALLING,
                        5
                );
            }
        }
    }

    @ForgeSubscribe
    public void playerInteractEvent(PlayerInteractEvent event) {
        if (event.entityPlayer instanceof EntityPlayerMP && Action.RIGHT_CLICK_BLOCK == event.action) {
            int posX = event.x;
            int posY = event.y;
            int posZ = event.z;
            switch(event.face) {
                case 0:
                    --posY;
                    break;
                case 1:
                    ++posY;
                    break;
                case 2:
                    --posZ;
                    break;
                case 3:
                    ++posZ;
                    break;
                case 4:
                    --posX;
                    break;
                case 5:
                    ++posX;
                    break;
            }
            ClientProxyMA.tickHandler.setPassback(
                    MoarAchievements.mc.theWorld,
                    posX,
                    posY,
                    posZ
            );
        }
    }

    @ForgeSubscribe
    public void livingEvent(LivingEvent event) {
        if (event.entityLiving instanceof EntityPlayer) {
            ItemStack usedItem = event.entityLiving.getCurrentItemOrArmor(0);
            if (!event.entityLiving.isSneaking() && MoarAchievements.entityPlayer == null) {
                if (usedItem != null && usedItem.itemID == Item.porkCooked.itemID && !annoyed) {
                    annoyed = true;
                }
            } else {
                if (usedItem != null && usedItem.itemID == Item.porkCooked.itemID) {
                    MoarAchievements.entityPlayer.triggerAchievement(
                            AchievementStorage.ACHIEVEMENT_EAT_BACON
                    );
                }
                if (usedItem != null && usedItem.itemID == Item.bowlSoup.itemID) {
                    MoarAchievements.entityPlayer.triggerAchievement(
                            AchievementStorageTiered.ACHIEVEMENT_EAT_MUSHROOM_STEW
                    );
                }
            }
        }
    }

}
