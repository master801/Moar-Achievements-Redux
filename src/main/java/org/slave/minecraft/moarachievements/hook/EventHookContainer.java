package org.slave.minecraft.moarachievements.hook;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
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
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageDeath;

public final class EventHookContainer {

    public static final EventHookContainer INSTANCE = new EventHookContainer();

    private EventHookContainer() {
    }

    @SubscribeEvent
    public void entityDeath(final LivingDeathEvent event) {
        if (event.source.getSourceOfDamage() instanceof EntityPlayer) {
            EntityPlayer playerSource = (EntityPlayer)event.source.getSourceOfDamage();
            if (event.entity instanceof EntityZombie) {
                playerSource.triggerAchievement(AchievementStorage.ACHIEVEMENT_KILL_ZOMBIE);
            }
            if (event.entity instanceof EntitySkeleton) {
                playerSource.triggerAchievement(AchievementStorage.ACHIEVEMENT_KILL_SKELETON);
            }
            if (event.entity instanceof EntityCow || event.entity instanceof EntityPig || event.entity instanceof EntityChicken) {
                playerSource.triggerAchievement(AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT);
            }
            if (event.entity instanceof EntityEnderman) {
                playerSource.triggerAchievement(AchievementStorage.ACHIEVEMENT_KILL_ENDERMAN);
            }
            if (event.entity instanceof EntityCreeper) {
                playerSource.triggerAchievement(AchievementStorage.ACHIEVEMENT_KILL_CREEPER);
            }
            if (event.entity instanceof EntitySpider) {
                playerSource.triggerAchievement(AchievementStorage.ACHIEVEMENT_KILL_SPIDER);
            }
            if (event.entity instanceof EntitySlime) {
                playerSource.triggerAchievement(AchievementStorage.ACHIEVEMENT_KILL_SLIME);
            }
        }

        boolean passFireCheck = false;
        if (event.source.getSourceOfDamage() instanceof EntityArrow) {
            EntityArrow entityArrow = (EntityArrow) event.source.getSourceOfDamage();
            if (entityArrow.shootingEntity instanceof EntitySkeleton) {
                EntityLivingBase living = (EntityLivingBase) ((EntityCreature) entityArrow.shootingEntity).getEntityToAttack();
                if (living instanceof EntityPlayer) {
                    EntityPlayer player = (EntityPlayer) living;
                    if (event.entity instanceof EntityCreeper) {
                        player.triggerAchievement(AchievementStorage.ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER);
                    } else if (event.entity instanceof EntityPlayer) {
                        player.triggerAchievement(AchievementStorage.ACHIEVEMENT_KILL_SKELETON);
                    }
                }
            }
//            if (entityArrow.shootingEntity instanceof EntityPlayer && entityArrow.shootingEntity == MoarAchievements.entityPlayer && event.entity instanceof EntityPlayer) {//TODO
//                ((EntityPlayer) event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF);
//            }
        }
        if (event.source.getSourceOfDamage() instanceof EntityFireball) {
            EntityFireball slime1 = (EntityFireball)event.source.getSourceOfDamage();
            if (slime1.shootingEntity instanceof EntityBlaze && event.entity instanceof EntityPlayer) {
                ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_BLAZE);
            }
            if (slime1.shootingEntity instanceof EntityGhast && event.entity instanceof EntityPlayer) {
                ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_GHAST);
            }
            if (slime1.shootingEntity == null && event.entity instanceof EntityPlayer) {
                ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER);
                passFireCheck = true;
            }
        }

        if (event.source.getSourceOfDamage() instanceof EntityWither && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WITHER);
        }

        if (event.entity instanceof EntityPlayer) {
            achievePlayerDamageType(event.source.getDamageType(), (EntityPlayer)event.entity, passFireCheck);
        }

        if (event.source.getSourceOfDamage() instanceof EntityEnderman && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ENDERMAN);
        }
        if (event.source.getSourceOfDamage() instanceof EntityZombie && event.entity instanceof EntityPlayer) {
            if (((EntityZombie)event.source.getSourceOfDamage()).isVillager()) {
                ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER);
            }

            if (((EntityLivingBase)event.source.getSourceOfDamage()).isChild()) {
                ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD);
            }

            ItemStack zombieHeldItem = ((EntityLivingBase)event.source.getSourceOfDamage()).getHeldItem();
            if (zombieHeldItem != null) {
                if (zombieHeldItem.getItem() == Items.diamond) {
                    ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND);
                }

                if (zombieHeldItem.getItem() == Items.wooden_sword || zombieHeldItem.getItem() == Items.stone_sword || zombieHeldItem.getItem() == Items.golden_sword || zombieHeldItem.getItem() == Items.iron_sword || zombieHeldItem.getItem() == Items.diamond_sword) {
                    ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD);
                }
            }

            if (!((EntityZombie)event.source.getSourceOfDamage()).isVillager() && !((EntityLivingBase)event.source.getSourceOfDamage()).isChild() && zombieHeldItem == null) {
                ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE);
            }
        }

        if (event.source.getSourceOfDamage() instanceof EntitySpider && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPIDER);
        }

//        if (event.source.getSourceOfDamage() instanceof EntityPlayer && event.entity instanceof EntityPlayer && event.entityLiving.getEntityName().equals(MoarAchievements.entityPlayer.getEntityName())) {
//        if (event.source.getSourceOfDamage() instanceof EntityPlayer && event.entity instanceof EntityPlayer && event.entityLiving.getUniqueID().equals(MoarAchievements.entityPlayer.getUniqueID())) {//TODO
//            ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SELF);
//        }

        if (event.source.getSourceOfDamage() instanceof EntitySlime) {
            EntitySlime slime3 = (EntitySlime)event.source.getSourceOfDamage();
            if (event.entity instanceof EntityPlayer) {
                System.out.println(slime3.getSlimeSize());
                if (slime3.getSlimeSize() == 1) {
                    ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SMALL_SLIME);
                }

                if (slime3.getSlimeSize() == 2) {
                    ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME);
                }

                if (slime3.getSlimeSize() == 4) {
                    ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_LARGE_SLIME);
                }

                if (slime3.getSlimeSize() >= 5) {
                    ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_HUGE_SLIME);
                }
            }
        }

        if (event.source.getSourceOfDamage() instanceof EntityDragon && event.entity instanceof EntityPlayer) {
            ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_DRAGON);
        }

        if (event.entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)event.entity;
            if (event.source.getSourceOfDamage() instanceof EntityArrow) {
                EntityArrow entityArrow = (EntityArrow)event.source.getSourceOfDamage();
            }

            if (event.source.getSourceOfDamage() instanceof EntityFireball) {
                EntityFireball living1 = (EntityFireball)event.source.getSourceOfDamage();
            }

//            setPlayerDiedRecently();
            ((EntityPlayer)event.entity).triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY);
            int posX = (int)event.entity.posX;
            int posY = (int)event.entity.posY;
            int posZ = (int)event.entity.posZ;
            if (player.worldObj.getBlock(posX, posY - 1, posZ) == Blocks.iron_block) {
                player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_IRON);
            }
            player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY);
        }
    }

    private void achievePlayerDamageType(final String damageType, final EntityPlayer player, final boolean passFireCheck) {
        switch (damageType) {
            case "wither":
                break;
            case "explosion":
                break;
            case "anvil":
                player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANVIL);
                break;
            case "inWall":
                player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WALL);
                break;
            case "inFire":
                if (!passFireCheck) {
                    player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FLAME);
                }
                break;
            case "onFire":
                if (!passFireCheck) {
                    player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FIRE);
                }
                break;
            case "fall":
                player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_FALL);
                break;
            case "drown":
                player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_WATER);
                break;
            case "outOfWorld":
                player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_SPACE);
                break;
            case "indirectMagic":
                player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_THROWN_POTION);
                break;
            case "magic":
                player.triggerAchievement(AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_POTION);
                break;
        }
    }

    @SubscribeEvent
    public void onBlockPlaced(final PlaceEvent placeEvent) {
        if (placeEvent.placedBlock == Blocks.obsidian) {
            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_1);
        }
        //TODO
        if (placeEvent.world.getBlock(placeEvent.x + 1, placeEvent.y, placeEvent.z) == Blocks.obsidian|| placeEvent.world.getBlock(placeEvent.x - 1, placeEvent.y, placeEvent.z) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x, placeEvent.y, placeEvent.z + 1) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x, placeEvent.y, placeEvent.z - 1) == Blocks.obsidian) {
            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_2);
        }
        //TODO
        if (placeEvent.world.getBlock(placeEvent.x, placeEvent.y + 1, placeEvent.z) == Blocks.obsidian && placeEvent.world.getBlock(placeEvent.x, placeEvent.y - 1, placeEvent.z) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x, placeEvent.y + 1, placeEvent.z) == Blocks.obsidian && placeEvent.world.getBlock(placeEvent.x, placeEvent.y + 2, placeEvent.z) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x, placeEvent.y - 1, placeEvent.z) == Blocks.obsidian && placeEvent.world.getBlock(placeEvent.x, placeEvent.y - 2, placeEvent.z) == Blocks.obsidian) {
            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_3);
            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_4);
            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_5);
        }
        //TODO
        if (placeEvent.world.getBlock(placeEvent.x, placeEvent.y + 1, placeEvent.z) == Blocks.obsidian && placeEvent.world.getBlock(placeEvent.x, placeEvent.y - 1, placeEvent.z) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x, placeEvent.y + 1, placeEvent.z) == Blocks.obsidian && placeEvent.world.getBlock(placeEvent.x, placeEvent.y + 2, placeEvent.z) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x, placeEvent.y - 1, placeEvent.z) == Blocks.obsidian && placeEvent.world.getBlock(placeEvent.x, placeEvent.y - 2, placeEvent.z) == Blocks.obsidian/* && tempX1 != placeEvent.x || tempZ1 != placeEvent.z*/) {
            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_6);
            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_7);
            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_8);
        }
//        if (obsidianPlaced >= 9 && obsidianChieve < 5 && (placeEvent.world.getBlock(placeEvent.x + 1, placeEvent.y, placeEvent.z) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x - 1, placeEvent.y, placeEvent.z) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x, placeEvent.y, placeEvent.z + 1) == Blocks.obsidian || placeEvent.world.getBlock(placeEvent.x, placeEvent.y, placeEvent.z - 1) == Blocks.obsidian)) {
//            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_9);
//            placeEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_OBSIDIAN_10);
//        }
    }

}
