package org.slave.minecraft.moarachievements.common;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageDeath;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageTiered;

public final class EventHookContainer {

    boolean annoyed = false;

    @SubscribeEvent
    public void itemPickup(EntityItemPickupEvent event) {
        if (event.item == null || event.item.getEntityItem() == null) return;
        ItemStack itemStack = event.item.getEntityItem();

        if (itemStack.getItem() == Item.getItemFromBlock(Blocks.sand)) {
            event.entityPlayer.triggerAchievement(
                    AchievementStorageTiered.ACHIEVEMENT_MINE_SAND
            );
        } else if (itemStack.getItem() == Items.snowball) {
            event.entityPlayer.triggerAchievement(AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW
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

            ItemStack slime2 = ((EntityLivingBase)event.source.getSourceOfDamage()).getHeldItem();
            if (slime2 != null) {
                if (slime2.getItem() == Items.diamond) {
                    ((EntityPlayer)event.entity).triggerAchievement(
                            AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND
                    );
                }

                if (slime2.getItem() == Items.wooden_sword || slime2.getItem() == Items.stone_sword || slime2.getItem() == Items.golden_sword || slime2.getItem() == Items.iron_sword || slime2.getItem() == Items.diamond_sword) {
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

            setPlayerDiedRecently();
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

    @SubscribeEvent
    public void livingEvent(LivingEvent event) {
        if (event.entityLiving instanceof EntityPlayer) {
//            ItemStack usedItems = event.entityLiving.getCurrentItemsOrArmor(0);
            ItemStack usedItems = ((EntityPlayer)event.entityLiving).getHeldItem();//FIXME? This may not be the correct function to use
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

    //Tick handler stuff

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

}
