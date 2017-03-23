package org.slave.minecraft.moarachievements.common;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageDeath;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageTiered;

public final class EventHookContainer {

    boolean annoyed = false;

    public static final EventHookContainer INSTANCE = new EventHookContainer();

    @SubscribeEvent
    public void itemPickup(final EntityItemPickupEvent event) {
        if (event.item == null || event.item.getEntityItem() == null) return;
        ItemStack itemStack = event.item.getEntityItem();

        if (itemStack.getItem() == Item.getItemFromBlock(Blocks.sand)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
            );
        } else if (itemStack.getItem() == Items.snowball) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW
            );
        } else if (itemStack.getItem() == Items.coal && itemStack.getItemDamage() == 0) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_COAL
            );
        } else if (itemStack.getItem() == Items.glowstone_dust) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST
            );
        } else if (itemStack.getItem() == Items.redstone) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.wool)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_COLLECT_WOOL
            );
        } else if (itemStack.getItem() == Items.egg) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_COLLECT_EGG
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.cactus)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_CACTUS
            );
        } else if (itemStack.getItem() == Items.apple) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.soul_sand)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.netherrack)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_NETHERRACK
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.reeds)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE
            );
        } else if (itemStack.getItem() == Items.nether_wart) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_NETHER_WART
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.dragon_egg)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_DRAGON_EGG
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.dirt)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_DIRT
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.brown_mushroom)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_BROWN
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.red_mushroom)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_RED
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.snow)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.cobblestone)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_COBBLESTONE
            );
        } else if (itemStack.getItem() == Items.clay_ball) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_CLAY
            );
        } else if (itemStack.getItem() == Items.wheat) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MINE_WHEAT
            );
        }
    }

    @SubscribeEvent
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

            ItemStack zombieHeldItem = ((EntityLivingBase)event.source.getSourceOfDamage()).getHeldItem();
            if (zombieHeldItem != null) {
                if (zombieHeldItem.getItem() == Items.diamond) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND
                    );
                }

                if (zombieHeldItem.getItem() == Items.wooden_sword || zombieHeldItem.getItem() == Items.stone_sword || zombieHeldItem.getItem() == Items.golden_sword || zombieHeldItem.getItem() == Items.iron_sword || zombieHeldItem.getItem() == Items.diamond_sword) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD
                    );
                }
            }

            if (!((EntityZombie)event.source.getSourceOfDamage()).isVillager() && !((EntityLivingBase)event.source.getSourceOfDamage()).isChild() && zombieHeldItem == null) {
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

//        if (event.source.getSourceOfDamage() instanceof EntityPlayer && event.entity instanceof EntityPlayer && event.entityLiving.getEntityName().equals(MoarAchievements.entityPlayer.getEntityName())) {
        if (event.source.getSourceOfDamage() instanceof EntityPlayer && event.entity instanceof EntityPlayer && event.entityLiving.getUniqueID().equals(MoarAchievements.entityPlayer.getUniqueID())) {
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

//            setPlayerDiedRecently();
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
            );
            int posX = (int)event.entity.posX;
            int posY = (int)event.entity.posY;
            int posZ = (int)event.entity.posZ;
            if (MoarAchievements.mc.theWorld.getBlock(posX, posY - 1, posZ) == Blocks.iron_block) {
                ((EntityPlayer)event.entity).triggerAchievement(
                        AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_IRON
                );
            }
            ((EntityPlayer)event.entity).triggerAchievement(
                    AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY
            );
        }
    }

    /*
    @SubscribeEvent
    public void fallEvent(LivingFallEvent event) {
        if (event.entityLiving instanceof EntityPlayer) {
            if (event.distance >= 21.0F && !playerDiedRecently) {
                registerAchievementToGet(
                        event.entityLiving,
                        AchievementStorage.ACHIEVEMENT_LIVE_FALLING,
                        5
                );
            }
        }
    }

    @SubscribeEvent
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

            setPassback(
                    MoarAchievements.mc.theWorld,
                    posX,
                    posY,
                    posZ
            );
        }
    }
    */

    @SubscribeEvent
    public void livingEvent(LivingEvent event) {
        if (event.entityLiving instanceof EntityPlayer) {
//            ItemStack usedItems = event.entityLiving.getCurrentItemsOrArmor(0);
            ItemStack usedItems = event.entityLiving.getHeldItem();//FIXME? This may not be the correct function to use
            if (!event.entityLiving.isSneaking() && MoarAchievements.entityPlayer == null) {
                if (usedItems != null && usedItems.getItem() == Items.cooked_porkchop && !annoyed) {
                    annoyed = true;
                }
            } else {
                if (usedItems != null && usedItems.getItem() == Items.cooked_porkchop) {
                    MoarAchievements.entityPlayer.triggerAchievement(
                            AchievementStorage.ACHIEVEMENT_EAT_BACON
                    );
                }
                if (usedItems != null && usedItems.getItem() == Items.mushroom_stew) {
                    MoarAchievements.entityPlayer.triggerAchievement(
                            AchievementStorageTiered.ACHIEVEMENT_EAT_MUSHROOM_STEW
                    );
                }
            }
        }
    }

    @SubscribeEvent
    public void onCrafting(final ItemCraftedEvent itemCraftedEvent) {
        if (itemCraftedEvent.player.worldObj.isRemote) return;
        ItemStack itemStack = itemCraftedEvent.crafting;
        if (itemStack == null) return;
        if (itemStack.getItem() == Items.wooden_shovel) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_SHOVEL
            );
        } else if (itemStack.getItem() == Items.iron_pickaxe) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
            );
        } else if (itemStack.getItem() == Items.golden_pickaxe) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_GOLD_PICK_AXE
            );
        } else if (itemStack.getItem() == Items.diamond_pickaxe) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE
            );
        } else if (itemStack.getItem() == Items.wooden_axe) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_AXE
            );
        } else if (itemStack.getItem() == Items.compass) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_COMPASS
            );
        } else if (itemStack.getItem() == Items.flint_and_steel) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_FLINT_AND_IRON
            );
        } else if (itemStack.getItem() == Items.shears) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_SHEARS
            );
        } else if (itemStack.getItem() == Items.bed) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_BED
            );
        } else if (itemStack.getItem() == Items.bow) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_BOW
            );
        } else if (itemStack.getItem() == Items.golden_apple) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_GOLDEN_APPLE
            );
        } else if (itemStack.getItem() == Items.clock) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_CLOCK
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.brewing_stand)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_BREWING_STAND
            );
        } else if (itemStack.getItem() == Items.paper) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_PAPER
            );
        } else if (itemStack.getItem().isMap()) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_MAP
            );
        } else if (itemStack.getItem() == Items.cookie) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_COOKIE
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.sandstone)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_SANDSTONE
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.snow)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_SNOW
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.chest)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_CHEST
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.glowstone)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_GLOWSTONE
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.tnt)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_TNT
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.jukebox)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_JUKEBOX
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.powered_repeater) || itemStack.getItem() == Item.getItemFromBlock(Blocks.unpowered_repeater)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_REPEATER
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.redstone_torch) || itemStack.getItem() == Item.getItemFromBlock(Blocks.unlit_redstone_torch)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.piston)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_PISTON
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.sticky_piston)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_STICKY_PISTON
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.jukebox)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_NOTEBLOCK
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.dispenser)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_MAKE_DISPENSER
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.glass_pane)) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_GLASS_PANE
            );
        } else if (itemStack.getItem() == Items.mushroom_stew) {
            itemCraftedEvent.player.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW
            );
        }
    }

    @SubscribeEvent
    public void onSmelted(final ItemSmeltedEvent itemSmeltedEvent) {
        if (itemSmeltedEvent.player.worldObj.isRemote) return;
        ItemStack itemStack = itemSmeltedEvent.smelting;

        if (itemStack.getItem() == Item.getItemFromBlock(Blocks.stone)) {
            itemSmeltedEvent.player.triggerAchievement(
                    AchievementStorage.ACHIEVEMENT_SMELT_COBBLESTONE
            );
        } else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.glass)) {
            itemSmeltedEvent.player.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS
            );
        }
    }

}
