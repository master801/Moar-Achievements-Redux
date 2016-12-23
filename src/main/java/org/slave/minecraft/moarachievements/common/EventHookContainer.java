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
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SAND,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.snowball.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.coal.itemID && event.item.getEntityItem().getItemDamage() == 0) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_COAL,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.glowstone.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.redstone.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_REDSTONE,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.cloth.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_COLLECT_WOOL,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.egg.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_COLLECT_EGG,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.cactus.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_CACTUS,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.appleRed.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.slowSand.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.netherrack.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_NETHERRACK,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.reed.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.netherStalkSeeds.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_NETHER_WART,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.dragonEgg.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_DRAGON_EGG,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.dirt.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_DIRT,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.mushroomBrown.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_BROWN,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.mushroomRed.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_RED,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.blockSnow.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Block.cobblestone.blockID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_COBBLESTONE,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.clay.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorageTiered.ACHIEVEMENT_MINE_CLAY,
                    1
            );
        } else if (event.item.getEntityItem().itemID == Item.wheat.itemID) {
            MoarAchievements.addStat(
                    event.entityPlayer,
                    AchievementStorage.ACHIEVEMENT_MINE_WHEAT,
                    1
            );
        }

    }

    @ForgeSubscribe
    public void entityDeath(LivingDeathEvent event) {
        if (event.source.getSourceOfDamage() instanceof EntityPlayer) {
            if (event.entity instanceof EntityZombie) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.source.getSourceOfDamage(),
                        AchievementStorage.ACHIEVEMENT_KILL_ZOMBIE,
                        1
                );
            }
            if (event.entity instanceof EntitySkeleton) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.source.getSourceOfDamage(),
                        AchievementStorage.ACHIEVEMENT_KILL_SKELETON,
                        1
                );
            }
            if (event.entity instanceof EntityCow || event.entity instanceof EntityPig || event.entity instanceof EntityChicken) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.source.getSourceOfDamage(),
//                        Achievements.killPassiveMobForMeat,
                        AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT,
                        1
                );
            }
            if (event.entity instanceof EntityEnderman) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.source.getSourceOfDamage(),
//                        Achievements.killEnderman,
                        AchievementStorage.ACHIEVEMENT_KILL_ENDERMAN,
                        1
                );
            }
            if (event.entity instanceof EntityCreeper) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.source.getSourceOfDamage(),
//                        Achievements.killCreeper,
                        AchievementStorage.ACHIEVEMENT_KILL_CREEPER,
                        1
                );
            }
            if (event.entity instanceof EntitySpider) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.source.getSourceOfDamage(),
//                        Achievements.killSpider,
                        AchievementStorage.ACHIEVEMENT_KILL_SPIDER,
                        1
                );
            }
            if (event.entity instanceof EntitySlime) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.source.getSourceOfDamage(),
//                        Achievements.killSlime,
                        AchievementStorage.ACHIEVEMENT_KILL_SLIME,
                        1
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
                        MoarAchievements.addStat(
                                (EntityPlayer)living,
//                                Achievements.getSkeletonToKillCreeper,
                                AchievementStorage.ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER,
                                1
                        );
                    }
                    if (event.entity instanceof EntityPlayer) {
                        MoarAchievements.addStat(
                                (EntityPlayer)event.entity,
//                                Achievements.killedBySkeleton,
                                AchievementStorage.ACHIEVEMENT_KILL_SKELETON,
                                1
                        );
                    }
                }
                if (entityArrow.shootingEntity instanceof EntityPlayer && entityArrow.shootingEntity == MoarAchievements.entityPlayer && event.entity instanceof EntityPlayer) {
                    MoarAchievements.addStat(
                            (EntityPlayer)event.entity,
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF,
                            1
                    );
                }
            }
        }
        if (event.source.getSourceOfDamage() instanceof EntityFireball) {
            EntityFireball slime1 = (EntityFireball)event.source.getSourceOfDamage();
            if (slime1.shootingEntity instanceof EntityBlaze && event.entity instanceof EntityPlayer) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.entity,
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_BLAZE,
                        1
                );
            }
            if (slime1.shootingEntity instanceof EntityGhast && event.entity instanceof EntityPlayer) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.entity,
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_GHAST,
                        1
                );
            }
            if (slime1.shootingEntity == null && event.entity instanceof EntityPlayer) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.entity,
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER,
                        1
                );
                passFireCheck = true;
            }
        }
        if (event.source.getSourceOfDamage() instanceof EntityWither && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER,
                    1
            );
        }
        if (event.source.getDamageType().equals("wither") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER,
                    1
            );
        }
        if (event.source.getDamageType().equals("explosion") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_CREEPER,
                    1
            );
        }
        if (event.source.getDamageType().equals("anvil") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANVIL,
                    1
            );
        }
        if (event.source.getDamageType().equals("inWall") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WALL,
                    1
            );
        }
        if (event.source.getDamageType().equals("inFire") && !passFireCheck && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FLAME,
                    1
            );
        }
        if (event.source.getDamageType().equals("onFire") && !passFireCheck && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE,
                    1
            );
        }
        if (event.source.getDamageType().equals("fall") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FALL,
                    1
            );
        }
        if (event.source.getDamageType().equals("drown") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WATER,
                    1
            );
        }
        if (event.source.getDamageType().equals("outOfWorld") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPACE,
                    1
            );
        }
        if (event.source.getDamageType().equals("indirectMagic") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_THROWN_POTION,
                    1
            );
        }
        if (event.source.getDamageType().equals("magic") && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_POTION,
                    1
            );
        }
        if (event.source.getSourceOfDamage() instanceof EntityEnderman && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ENDERMAN,
                    1
            );
        }
        if (event.source.getSourceOfDamage() instanceof EntityZombie && event.entity instanceof EntityPlayer) {
            if (((EntityZombie)event.source.getSourceOfDamage()).isVillager()) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.entity,
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER,
                        1
                );
            }

            if (((EntityLivingBase)event.source.getSourceOfDamage()).isChild()) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.entity,
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD,
                        1
                );
            }

            ItemStack slime2 = ((EntityLivingBase)event.source.getSourceOfDamage()).getHeldItem();
            if (slime2 != null) {
                if (slime2.itemID == Item.diamond.itemID) {
                    MoarAchievements.addStat(
                            (EntityPlayer)event.entity,
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND,
                            1
                    );
                }

                if (slime2.itemID == Item.swordWood.itemID || slime2.itemID == Item.swordStone.itemID || slime2.itemID == Item.swordGold.itemID || slime2.itemID == Item.swordIron.itemID || slime2.itemID == Item.swordDiamond.itemID) {
                    MoarAchievements.addStat(
                            (EntityPlayer)event.entity,
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD,
                            1
                    );
                }
            }

            if (!((EntityZombie)event.source.getSourceOfDamage()).isVillager() && !((EntityLivingBase)event.source.getSourceOfDamage()).isChild() && slime2 == null) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.entity,
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE,
                        1
                );
            }
        }

        if (event.source.getSourceOfDamage() instanceof EntitySpider && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPIDER,
                    1
            );
        }

        if (event.source.getSourceOfDamage() instanceof EntityPlayer && event.entity instanceof EntityPlayer && event.entityLiving.getEntityName().equals(MoarAchievements.entityPlayer.getEntityName())) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF,
                    1
            );
        }

        if (event.source.getSourceOfDamage() instanceof EntitySlime) {
            EntitySlime slime3 = (EntitySlime)event.source.getSourceOfDamage();
            if (event.entity instanceof EntityPlayer) {
                System.out.println(slime3.getSlimeSize());
                if (slime3.getSlimeSize() == 1) {
                    MoarAchievements.addStat(
                            (EntityPlayer)event.entity,
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SMALL_SLIME,
                            1
                    );
                }

                if (slime3.getSlimeSize() == 2) {
                    MoarAchievements.addStat(
                            (EntityPlayer)event.entity,
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME,
                            1
                    );
                }

                if (slime3.getSlimeSize() == 4) {
                    MoarAchievements.addStat(
                            (EntityPlayer)event.entity,
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_LARGE_SLIME,
                            1
                    );
                }

                if (slime3.getSlimeSize() >= 5) {
                    MoarAchievements.addStat(
                            (EntityPlayer)event.entity,
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_HUGE_SLIME,
                            1
                    );
                }
            }
        }

        if (event.source.getSourceOfDamage() instanceof EntityDragon && event.entity instanceof EntityPlayer) {
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_DRAGON,
                    1
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
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY,
                    1
            );
            int posX = (int)event.entity.posX;
            int posY = (int)event.entity.posY;
            int posZ = (int)event.entity.posZ;
            if (MoarAchievements.mc.theWorld.getBlockId(posX, posY - 1, posZ) == Block.blockIron.blockID) {
                MoarAchievements.addStat(
                        (EntityPlayer)event.entity,
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_IRON,
                        1
                );
            }
            MoarAchievements.addStat(
                    (EntityPlayer)event.entity,
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY,
                    1
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
                    MoarAchievements.addStat(
                            MoarAchievements.entityPlayer,
                            AchievementStorage.ACHIEVEMENT_EAT_BACON,
                            1
                    );
                }
                if (usedItem != null && usedItem.itemID == Item.bowlSoup.itemID) {
                    MoarAchievements.addStat(
                            MoarAchievements.entityPlayer,
                            AchievementStorageTiered.ACHIEVEMENT_EAT_MUSHROOM_STEW,
                            1
                    );
                }
            }
        }
    }

}
