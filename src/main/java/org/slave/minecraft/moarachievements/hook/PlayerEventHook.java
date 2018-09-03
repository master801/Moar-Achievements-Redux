package org.slave.minecraft.moarachievements.hook;

import com.google.common.collect.Maps;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatBase;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.player.AchievementEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorage;
import org.slave.minecraft.moarachievements.achievements.storage.AchievementStorageTiered;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by Master on 8/27/2018 at 5:21 PM.
 *
 * @author Master
 */
public final class PlayerEventHook {

    public static final PlayerEventHook INSTANCE = new PlayerEventHook();

    private final Map<Item, Entry<Integer, StatBase>> achievementItemPickup = Maps.newHashMap();
    private final Map<Item, StatBase> achievementItemAte = Maps.newHashMap();
    private final Map<Item, StatBase> achievementItemCrafted = Maps.newHashMap();
    private final Map<Item, StatBase> achievementItemSmelted = Maps.newHashMap();

    private boolean annoyed = false;

    private PlayerEventHook() {
        initItemPickupAchievements();
        initItemAteAchievements();
        initItemCraftedAchievements();
        initItemSmeltedAchievements();
    }

    private void initItemPickupAchievements() {
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.sand), new SimpleEntry<>(0, AchievementStorageTiered.ACHIEVEMENT_MINE_SAND));
        achievementItemPickup.put(Items.snowball, new SimpleEntry<>(0, AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW));
        achievementItemPickup.put(Items.coal, new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_COAL));
        achievementItemPickup.put(Items.glowstone_dust, new SimpleEntry<>(0, AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST));
        achievementItemPickup.put(Items.redstone, new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_REDSTONE));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.wool), new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_COLLECT_WOOL));
        achievementItemPickup.put(Items.egg, new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_COLLECT_EGG));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.cactus), new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_CACTUS));
        achievementItemPickup.put(Items.apple, new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.soul_sand), new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.netherrack), new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_NETHERRACK));
        achievementItemPickup.put(Items.reeds, new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE));
        achievementItemPickup.put(Items.nether_wart, new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_NETHER_WART));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.dragon_egg), new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_DRAGON_EGG));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.dirt), new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_DIRT));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.brown_mushroom), new SimpleEntry<>(0, AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_BROWN));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.red_mushroom), new SimpleEntry<>(0, AchievementStorageTiered.ACHIEVEMENT_MINE_MUSHROOM_RED));
        achievementItemPickup.put(Item.getItemFromBlock(Blocks.cobblestone), new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_COBBLESTONE));
        achievementItemPickup.put(Items.clay_ball, new SimpleEntry<>(0, AchievementStorageTiered.ACHIEVEMENT_MINE_CLAY));
        achievementItemPickup.put(Items.wheat, new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_MINE_WHEAT));

        achievementItemPickup.put(MoarAchievements.ITEM_ACHIEVEMENT_GETTER, new SimpleEntry<>(0, AchievementStorage.ACHIEVEMENT_HOW_IS_THIS_POSSIBLE));
    }

    private void initItemAteAchievements() {
        achievementItemAte.put(Items.cooked_porkchop, AchievementStorage.ACHIEVEMENT_EAT_BACON);
        achievementItemAte.put(Items.mushroom_stew, AchievementStorageTiered.ACHIEVEMENT_EAT_MUSHROOM_STEW);
    }

    private void initItemCraftedAchievements() {
        achievementItemCrafted.put(Items.wooden_shovel, AchievementStorage.ACHIEVEMENT_MAKE_SHOVEL);
        achievementItemCrafted.put(Items.iron_pickaxe, AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE);
        achievementItemCrafted.put(Items.golden_pickaxe, AchievementStorage.ACHIEVEMENT_MAKE_GOLD_PICK_AXE);
        achievementItemCrafted.put(Items.diamond_pickaxe, AchievementStorage.ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE);
        achievementItemCrafted.put(Items.wooden_axe, AchievementStorage.ACHIEVEMENT_MAKE_AXE);
        achievementItemCrafted.put(Items.compass, AchievementStorage.ACHIEVEMENT_MAKE_COMPASS);
        achievementItemCrafted.put(Items.flint_and_steel, AchievementStorage.ACHIEVEMENT_MAKE_FLINT_AND_IRON);
        achievementItemCrafted.put(Items.shears, AchievementStorage.ACHIEVEMENT_MAKE_SHEARS);
        achievementItemCrafted.put(Items.bed, AchievementStorage.ACHIEVEMENT_MAKE_BED);
        achievementItemCrafted.put(Items.bow, AchievementStorage.ACHIEVEMENT_MAKE_BOW);
        achievementItemCrafted.put(Items.golden_apple, AchievementStorage.ACHIEVEMENT_MAKE_GOLDEN_APPLE);
        achievementItemCrafted.put(Items.clock, AchievementStorage.ACHIEVEMENT_MAKE_CLOCK);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.brewing_stand), AchievementStorage.ACHIEVEMENT_MAKE_BREWING_STAND);
        achievementItemCrafted.put(Items.paper, AchievementStorage.ACHIEVEMENT_MAKE_PAPER);
        achievementItemCrafted.put(Items.map, AchievementStorage.ACHIEVEMENT_MAKE_MAP);
        achievementItemCrafted.put(Items.filled_map, AchievementStorage.ACHIEVEMENT_MAKE_MAP);
        achievementItemCrafted.put(Items.cookie, AchievementStorage.ACHIEVEMENT_MAKE_COOKIE);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.sandstone), AchievementStorageTiered.ACHIEVEMENT_MAKE_SANDSTONE);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.snow), AchievementStorageTiered.ACHIEVEMENT_MAKE_SNOW);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.chest), AchievementStorage.ACHIEVEMENT_MAKE_CHEST);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.glowstone), AchievementStorageTiered.ACHIEVEMENT_MAKE_GLOWSTONE);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.tnt), AchievementStorage.ACHIEVEMENT_MAKE_TNT);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.jukebox), AchievementStorage.ACHIEVEMENT_MAKE_JUKEBOX);
        achievementItemCrafted.put(Items.repeater, AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_REPEATER);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.redstone_torch), AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.unlit_redstone_torch), AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.piston), AchievementStorage.ACHIEVEMENT_MAKE_PISTON);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.sticky_piston), AchievementStorage.ACHIEVEMENT_MAKE_STICKY_PISTON);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.jukebox), AchievementStorage.ACHIEVEMENT_MAKE_NOTEBLOCK);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.dispenser), AchievementStorage.ACHIEVEMENT_MAKE_DISPENSER);
        achievementItemCrafted.put(Item.getItemFromBlock(Blocks.glass_pane), AchievementStorageTiered.ACHIEVEMENT_MAKE_GLASS_PANE);
        achievementItemCrafted.put(Items.mushroom_stew, AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW);
    }

    private void initItemSmeltedAchievements() {
        achievementItemSmelted.put(Item.getItemFromBlock(Blocks.stone), AchievementStorage.ACHIEVEMENT_SMELT_COBBLESTONE);
        achievementItemSmelted.put(Item.getItemFromBlock(Blocks.glass), AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS);
    }

    @SubscribeEvent
    public void onCrafting(final ItemCraftedEvent itemCraftedEvent) {
        ItemStack itemStack = itemCraftedEvent.crafting;
        if (itemStack == null) return;

        if (achievementItemCrafted.containsKey(itemStack.getItem())) {
            itemCraftedEvent.player.triggerAchievement(achievementItemCrafted.get(itemStack.getItem()));
        } else if (itemStack.getItem().isMap()) {
            itemCraftedEvent.player.triggerAchievement(AchievementStorage.ACHIEVEMENT_MAKE_MAP);
        }
    }

    @SubscribeEvent
    public void onSmelted(final ItemSmeltedEvent itemSmeltedEvent) {
        ItemStack itemStack = itemSmeltedEvent.smelting;
        if (itemStack == null) return;

        if (achievementItemSmelted.containsKey(itemStack.getItem())) {
            itemSmeltedEvent.player.triggerAchievement(achievementItemSmelted.get(itemStack.getItem()));
        }
    }

    @SubscribeEvent
    public void onEntityUpdate(final LivingUpdateEvent livingUpdateEvent) {
        if (livingUpdateEvent.entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)livingUpdateEvent.entityLiving;
            if (player.posY <= 55.0D && player.worldObj.getBlockLightValue((int)player.posX, (int)player.posY, (int)player.posZ) <= 5) {//Cave
                player.triggerAchievement(AchievementStorage.ACHIEVEMENT_ENTER_CAVE);
            }
            if (player.experienceLevel >= 1) {
                player.triggerAchievement(AchievementStorage.ACHIEVEMENT_LEVEL_1);
            }
            if (player.experienceLevel >= 2) {
                player.triggerAchievement(AchievementStorage.ACHIEVEMENT_LEVEL_2);
            }
            if (player.experienceLevel >= 3) {
                player.triggerAchievement(AchievementStorage.ACHIEVEMENT_LEVEL_3);
            }
            if (player.experienceLevel >= 4) {
                player.triggerAchievement(AchievementStorage.ACHIEVEMENT_LEVEL_4);
            }
            if (player.experienceLevel >= 5) {
                player.triggerAchievement(AchievementStorage.ACHIEVEMENT_LEVEL_5);
            }
            if (player.experienceLevel >= 10) {
                player.triggerAchievement(AchievementStorage.ACHIEVEMENT_LEVEL_10);
            }
        }
    }

    @SubscribeEvent
    public void itemPickup(final EntityItemPickupEvent event) {
        if (event.item == null || event.item.getEntityItem() == null) return;
        ItemStack itemStack = event.item.getEntityItem();

        if (achievementItemPickup.containsKey(itemStack.getItem())) {
            Entry<Integer, StatBase> achievementEntry = achievementItemPickup.get(itemStack.getItem());
            if (achievementEntry.getKey() == event.item.getEntityItem().getItemDamage()) {
                event.entityPlayer.triggerAchievement(achievementEntry.getValue());
            }
        }
    }

    @SubscribeEvent
    public void onItemUseFinish(final PlayerUseItemEvent.Finish playerUseItemEvent) {
        if (!playerUseItemEvent.entityPlayer.isSneaking()) {
            if (playerUseItemEvent.item.getItem() == Items.cooked_porkchop && !annoyed) {
                annoyed = true;
            }
        } else {
            if (achievementItemAte.containsKey(playerUseItemEvent.item.getItem())) {
                playerUseItemEvent.entityPlayer.triggerAchievement(achievementItemAte.get(playerUseItemEvent.item.getItem()));
            }
        }
    }

    @SubscribeEvent
    public void fallEvent(final LivingFallEvent event) {
        if (event.entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.entityLiving;

            if (player.onGround && player.deathTime == 0 && event.distance >= 21.0F) {//TODO Death time may not be correct?
                player.triggerAchievement(AchievementStorage.ACHIEVEMENT_LIVE_FALLING);
//                registerAchievementToGet(event.entityLiving, AchievementStorage.ACHIEVEMENT_LIVE_FALLING, 5);//TODO
            }
        }
    }

    @SubscribeEvent
    public void onAchievement(final AchievementEvent event) {
//        MoarAchievements.LOGGER_MOAR_ACHIEVEMENTS.info(event.achievement.toString());
    }

}
