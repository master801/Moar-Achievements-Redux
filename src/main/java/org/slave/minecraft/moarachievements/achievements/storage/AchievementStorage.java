package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import org.slave.minecraft.moarachievements.MoarAchievements;

/**
 * Created by Master801 on 12/21/2016 at 4:16 PM.
 *
 * @author Master801
 */
public final class AchievementStorage {

    public static final Achievement ACHIEVEMENT_MAKE_SHOVEL = new Achievement(
            "achievement.moarachievementsredux.buildShovel",
            "moarachievementsredux.buildShovel",
            5,
            -3,
            Items.wooden_shovel,
            AchievementList.buildWorkBench
    );

    public static final Achievement ACHIEVEMENT_MAKE_AXE = new Achievement(
            "achievement.moarachievementsredux.buildAxe",
            "moarachievementsredux.buildAxe",
            -2,
            -1,
            Items.wooden_axe,
            AchievementList.buildWorkBench
    );

    public static final Achievement ACHIEVEMENT_MAKE_IRON_PICK_AXE = new Achievement(
            "achievement.moarachievementsredux.buildSteelPickaxe",
            "moarachievementsredux.buildSteelPickaxe",
            9,
            2,
            Items.iron_pickaxe,
            AchievementList.buildBetterPickaxe
    );

    public static final Achievement ACHIEVEMENT_MAKE_GOLD_PICK_AXE = new Achievement(
            "achievement.moarachievementsredux.buildGoldPickaxe",
            "moarachievementsredux.buildGoldPickaxe",
            10,
            4,
            Items.golden_pickaxe,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE = new Achievement(
            "achievement.moarachievementsredux.buildDiamondPickaxe",
            "moarachievementsredux.buildDiamondPickaxe",
            11,
            2,
            Items.diamond_pickaxe,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MINE_REDSTONE = new Achievement(
            "achievement.moarachievementsredux.mineRedstone",
            "moarachievementsredux.mineRedstone",
            9,
            6,
            Items.redstone,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_DISPENSER = new Achievement(
            "achievement.moarachievementsredux.buildDispenser",
            "moarachievementsredux.buildDispenser",
            7,
            12,
            Blocks.dispenser,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_NOTEBLOCK = new Achievement(
            "achievement.moarachievementsredux.buildNoteBlock",
            "moarachievementsredux.buildNoteBlock",
            7,
            10,
            Blocks.jukebox,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_PISTON = new Achievement(
            "achievement.moarachievementsredux.buildPiston",
            "moarachievementsredux.buildPiston",
            11,
            12,
            Blocks.piston,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_STICKY_PISTON = new Achievement(
            "achievement.moarachievementsredux.buildStickyPiston",
            "moarachievementsredux.buildStickyPiston",
            13,
            12,
            Blocks.sticky_piston,
            AchievementStorage.ACHIEVEMENT_MAKE_PISTON
    );

    public static final Achievement ACHIEVEMENT_MAKE_REDSTONE_TORCH = new Achievement(
            "achievement.moarachievementsredux.buildRedstoneTorch",
            "moarachievementsredux.buildRedstoneTorch",
            11,
            10,
            Blocks.redstone_torch,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_REDSTONE_REPEATER = new Achievement(
            "achievement.moarachievementsredux.buildRedstoneRepeater",
            "moarachievementsredux.buildRedstoneRepeater",
            13,
            10,
            Items.repeater,
            AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH
    );

    public static final Achievement ACHIEVEMENT_MAKE_CLOCK = new Achievement(
            "achievement.moarachievementsredux.buildClock",
            "moarachievementsredux.buildClock",
            11,
            8,
            Items.clock,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_JUKEBOX = new Achievement(
            "achievement.moarachievementsredux.buildJukebox",
            "moarachievementsredux.buildJukebox",
            9,
            14,
            Blocks.jukebox,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_COMPASS = new Achievement(
            "achievement.moarachievementsredux.buildCompass",
            "moarachievementsredux.buildCompass",
            11,
            6,
            Items.compass,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_COLLECT_RED_APPLE = new Achievement(
            "achievement.moarachievementsredux.collectRedApple",
            "moarachievementsredux.collectRedApple",
            -5,
            -4,
            Items.apple,
            AchievementStorage.ACHIEVEMENT_MAKE_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_GOLDEN_APPLE = new Achievement(
            "achievement.moarachievementsredux.buildGoldenApple",
            "moarachievementsredux.buildGoldenApple",
            -6,
            -6,
            Items.gold_nugget,
            AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
    );

    public static final Achievement ACHIEVEMENT_MAKE_COOKIE = new Achievement(
            "achievement.moarachievementsredux.buildCookie",
            "moarachievementsredux.buildCookie",
            -4,
            -6,
            Items.cookie,
            AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
    );

    public static final Achievement ACHIEVEMENT_MAKE_CHEST = new Achievement(
            "achievement.moarachievementsredux.buildChest",
            "moarachievementsredux.buildChest",
            -2,
            -5,
            Blocks.chest,
            AchievementStorage.ACHIEVEMENT_MAKE_AXE
    );

    public static final Achievement ACHIEVEMENT_MINE_COAL = new Achievement(
            "achievement.moarachievementsredux.mineCoal",
            "moarachievementsredux.mineCoal",
            6,
            4,
            Items.coal,
            AchievementList.buildPickaxe
    );

    public static final Achievement ACHIEVEMENT_SMELT_COBBLESTONE = new Achievement(
            "achievement.moarachievementsredux.smeltCobbleStone",
            "moarachievementsredux.smeltCobbleStone",
            5,
            6,
            Blocks.stone,
            AchievementList.buildFurnace
    );

    public static final Achievement ACHIEVEMENT_MAKE_FLINT_AND_IRON = new Achievement(
            "achievement.moarachievementsredux.buildFlintAndSteel",
            "moarachievementsredux.buildFlintAndSteel",
            3,
            7,
            Items.flint_and_steel,
            AchievementList.acquireIron
    );

    public static final Achievement ACHIEVEMENT_MAKE_SHEARS = new Achievement(
            "achievement.moarachievementsredux.buildShears",
            "moarachievementsredux.buildShears",
            -1,
            6,
            Items.shears,
            AchievementList.acquireIron
    );

    public static final Achievement ACHIEVEMENT_COLLECT_WOOL = new Achievement(
            "achievement.moarachievementsredux.collectWool",
            "moarachievementsredux.collectWool",
            -1,
            3,
            Blocks.wool,
            AchievementStorage.ACHIEVEMENT_MAKE_SHEARS
    );

    public static final Achievement ACHIEVEMENT_MAKE_BED = new Achievement(
            "achievement.moarachievementsredux.buildBed",
            "moarachievementsredux.buildBed",
            -1,
            1,
            Items.bed,
            AchievementStorage.ACHIEVEMENT_COLLECT_WOOL
    );

    public static final Achievement ACHIEVEMENT_ENTER_CAVE = new Achievement(
            "achievement.moarachievementsredux.enterCave",
            "moarachievementsredux.enterCave",
            11,
            1,
            Blocks.bedrock,
            AchievementList.killEnemy
    );

    public static final Achievement ACHIEVEMENT_KILL_CAVE_SPIDER = new Achievement(
            "achievement.moarachievementsredux.killCaveSpider",
            "moarachievementsredux.killCaveSpider",
            14,
            1,
            Items.string,
            AchievementStorage.ACHIEVEMENT_ENTER_CAVE
    );

    public static final Achievement ACHIEVEMENT_KILL_SKELETON = new Achievement(
            "achievement.moarachievementsredux.killSkeleton",
            "moarachievementsredux.killSkeleton",
            16,
            1,
            Items.arrow,
            AchievementStorage.ACHIEVEMENT_KILL_CAVE_SPIDER
    );

    public static final Achievement ACHIEVEMENT_KILL_SLIME = new Achievement(
            "achievement.moarachievementsredux.killSlime",
            "moarachievementsredux.killSlime",
            16,
            -1,
            Items.slime_ball,
            AchievementStorage.ACHIEVEMENT_KILL_CAVE_SPIDER
    );

    public static final Achievement ACHIEVEMENT_KILL_ENDERMAN = new Achievement(
            "achievement.moarachievementsredux.killEnderman",
            "moarachievementsredux.killEnderman",
            11,
            0,
            Items.ender_pearl,
            AchievementList.buildSword
    );

    public static final Achievement ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT = new Achievement(
            "achievement.moarachievementsredux.killPassiveMobForMeat",
            "moarachievementsredux.killPassiveMobForMeat",
            11,
            -2,
            Items.porkchop,
            AchievementList.buildSword
    );

    public static final Achievement ACHIEVEMENT_MAKE_BOW = new Achievement(
            "achievement.moarachievementsredux.buildBow",
            "moarachievementsredux.buildBow",
            14,
            -3,
            Items.bow,
            AchievementStorage.ACHIEVEMENT_KILL_CAVE_SPIDER
    );

    public static final Achievement ACHIEVEMENT_EAT_BACON = new Achievement(
            "achievement.moarachievementsredux.eatBacon",
            "moarachievementsredux.eatBacon",
            12,
            -4,
            Items.cooked_porkchop,
            AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
    );

    public static final Achievement ACHIEVEMENT_COLLECT_EGG = new Achievement(
            "achievement.moarachievementsredux.collectEgg",
            "moarachievementsredux.collectEgg",
            11,
            -4,
            Items.egg,
            AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
    );

    public static final Achievement ACHIEVEMENT_MINE_DIRT = new Achievement(
            "achievement.moarachievementsredux.mineDirt",
            "moarachievementsredux.mineDirt",
            -5,
            0,
            Blocks.dirt,
            AchievementList.openInventory
    );

    public static final Achievement ACHIEVEMENT_MINE_COBBLESTONE = new Achievement(
            "achievement.moarachievementsredux.mineCobblestone",
            "moarachievementsredux.mineCobblestone",
            -5,
            -2,
            Blocks.cobblestone,
            AchievementStorage.ACHIEVEMENT_MINE_DIRT
    );

    public static final Achievement ACHIEVEMENT_MINE_CACTUS = new Achievement(
            "achievement.moarachievementsredux.mineCactus",
            "moarachievementsredux.mineCactus",
            -5,
            2,
            Blocks.cactus,
            AchievementStorage.ACHIEVEMENT_MINE_DIRT
    );

    public static final Achievement ACHIEVEMENT_MINE_SOUL_SAND = new Achievement(
            "achievement.moarachievementsredux.mineSoulSand",
            "moarachievementsredux.mineSoulSand",
            -3,
            10,
            Blocks.soul_sand,
            AchievementList.portal
    );

    public static final Achievement ACHIEVEMENT_MINE_NETHER_WART = new Achievement(
            "achievement.moarachievementsredux.mineNetherWart",
            "moarachievementsredux.mineNetherWart",
            -3,
            12,
            Items.nether_wart,
            AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND
    );

    public static final Achievement ACHIEVEMENT_MINE_NETHERRACK = new Achievement(
            "achievement.moarachievementsredux.mineNetherrack",
            "moarachievementsredux.mineNetherrack",
            -1,
            9,
            Blocks.netherrack,
            AchievementList.portal
    );

    public static final Achievement ACHIEVEMENT_MAKE_BREWING_STAND = new Achievement(
            "achievement.moarachievementsredux.buildBrewingStand",
            "moarachievementsredux.buildBrewingStand",
            1,
            12,
            Items.brewing_stand,
            AchievementList.blazeRod
    );

    public static final Achievement ACHIEVEMENT_MINE_SUGAR_CANE = new Achievement(
            "achievement.moarachievementsredux.mineSugarCane",
            "moarachievementsredux.mineSugarCane",
            3,
            -7,
            Items.reeds,
            AchievementList.buildHoe
    );

    public static final Achievement ACHIEVEMENT_MAKE_PAPER = new Achievement(
            "achievement.moarachievementsredux.buildPaper",
            "moarachievementsredux.buildPaper",
            1,
            -7,
            Items.paper,
            AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE
    );

    public static final Achievement ACHIEVEMENT_MAKE_MAP = new Achievement(
            "achievement.moarachievementsredux.buildMap",
            "moarachievementsredux.buildMap",
            -1,
            -7,
            Items.map,
            AchievementStorage.ACHIEVEMENT_MAKE_PAPER
    );

    public static final Achievement ACHIEVEMENT_MINE_DRAGON_EGG = new Achievement(
            "achievement.moarachievementsredux.mineDragonEgg",
            "moarachievementsredux.mineDragonEgg",
            5,
            10,
            Blocks.dragon_egg,
            AchievementList.theEnd2
    );

    public static final Achievement ACHIEVEMENT_MINE_WHEAT = new Achievement(
            "achievement.moarachievementsredux.mineWheat",
            "moarachievementsredux.mineWheat",
            1,
            -5,
            Items.wheat,
            AchievementList.buildHoe
    );

    public static final Achievement ACHIEVEMENT_LIVE_FALLING = new Achievement(
            "achievement.moarachievementsredux.liveFalling",
            "moarachievementsredux.liveFalling",
            11,
            -1,
            Items.feather,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_KILL_ZOMBIE = new Achievement(
            "achievement.moarachievementsredux.killZombie",
            "moarachievementsredux.killZombie",
            14,
            -5,
            Items.rotten_flesh,
            AchievementStorage.ACHIEVEMENT_MAKE_BOW
    );

    public static final Achievement ACHIEVEMENT_KILL_CREEPER = new Achievement(
            "achievement.moarachievementsredux.killCreeper",
            "moarachievementsredux.killCreeper",
            16,
            -3,
            Items.gunpowder,
            AchievementStorage.ACHIEVEMENT_MAKE_BOW
    );

    public static final Achievement ACHIEVEMENT_MAKE_TNT = new Achievement(
            "achievement.moarachievementsredux.buildTNT",
            "moarachievementsredux.buildTNT",
            17,
            -2,
            Blocks.tnt,
            AchievementStorage.ACHIEVEMENT_KILL_CREEPER
    );

    public static final Achievement ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER = new Achievement(
            "achievement.moarachievementsredux.getSkeletonToKillCreeper",
            "moarachievementsredux.getSkeletonToKillCreeper",
            18,
            -3,
            Items.record_13,
            AchievementStorage.ACHIEVEMENT_KILL_CREEPER
    );

    public static final Achievement ACHIEVEMENT_LEVEL_1 = new Achievement(
            "achievement.moarachievementsredux.level1",
            "moarachievementsredux.level1",
            19,
            3,
            Items.wooden_sword,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_LEVEL_2 = new Achievement(
            "achievement.moarachievementsredux.level2",
            "moarachievementsredux.level2",
            21,
            3,
            Items.wooden_sword,
            AchievementStorage.ACHIEVEMENT_LEVEL_1
    );

    public static final Achievement ACHIEVEMENT_LEVEL_3 = new Achievement(
            "achievement.moarachievementsredux.level3",
            "moarachievementsredux.level3",
            22,
            4,
            Items.wooden_sword,
            AchievementStorage.ACHIEVEMENT_LEVEL_2
    );

    public static final Achievement ACHIEVEMENT_LEVEL_4 = new Achievement(
            "achievement.moarachievementsredux.level4",
            "moarachievementsredux.level4",
            20,
            4,
            Items.wooden_sword,
            AchievementStorage.ACHIEVEMENT_LEVEL_3
    );

    public static final Achievement ACHIEVEMENT_LEVEL_5 = new Achievement(
            "achievement.moarachievementsredux.level5",
            "moarachievementsredux.level5",
            18,
            4,
            Items.stone_sword,
            AchievementStorage.ACHIEVEMENT_LEVEL_4
    );

    public static final Achievement ACHIEVEMENT_LEVEL_10 = new Achievement(
            "achievement.moarachievementsredux.level10",
            "moarachievementsredux.level10",
            17,
            5,
            Items.stone_sword,
            AchievementStorage.ACHIEVEMENT_LEVEL_5
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_1 = new Achievement(
            "achievement.moarachievementsredux.obsidian1",
            "moarachievementsredux.obsidian1",
            16,
            12,
            Blocks.obsidian,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_2 = new Achievement(
            "achievement.moarachievementsredux.obsidian2",
            "moarachievementsredux.obsidian2",
            17,
            12,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_1
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_3 = new Achievement(
            "achievement.moarachievementsredux.obsidian3",
            "moarachievementsredux.obsidian3",
            18,
            11,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_2
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_4 = new Achievement(
            "achievement.moarachievementsredux.obsidian4",
            "moarachievementsredux.obsidian4",
            18,
            10,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_3
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_5 = new Achievement(
            "achievement.moarachievementsredux.obsidian5",
            "moarachievementsredux.obsidian5",
            18,
            9,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_4
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_6 = new Achievement(
            "achievement.moarachievementsredux.obsidian6",
            "moarachievementsredux.obsidian6",
            17,
            9,
            Blocks.portal,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_5
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_7 = new Achievement(
            "achievement.moarachievementsredux.obsidian7",
            "moarachievementsredux.obsidian7",
            15,
            10,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_6
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_8 = new Achievement(
            "achievement.moarachievementsredux.obsidian8",
            "moarachievementsredux.obsidian8",
            15,
            9,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_7
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_9 = new Achievement(
            "achievement.moarachievementsredux.obsidian9",
            "moarachievementsredux.obsidian9",
            16,
            8,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_8
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_10 = new Achievement(
            "achievement.moarachievementsredux.obsidian10",
            "moarachievementsredux.obsidian10",
            17,
            8,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_9
    );

    public static final Achievement ACHIEVEMENT_PORTAL_1 = new Achievement(
            "achievement.moarachievementsredux.portal1",
            "moarachievementsredux.portal1",
            16,
            12,
            Blocks.obsidian,
            null
    ).initIndependentStat();

    public static final Achievement ACHIEVEMENT_PORTAL_2 = new Achievement(
            "achievement.moarachievementsredux.portal2",
            "moarachievementsredux.portal2",
            17,
            12,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_1
    );

    public static final Achievement ACHIEVEMENT_PORTAL_3 = new Achievement(
            "achievement.moarachievementsredux.portal3",
            "moarachievementsredux.portal3",
            18,
            11,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_2
    );

    public static final Achievement ACHIEVEMENT_PORTAL_4 = new Achievement(
            "achievement.moarachievementsredux.portal4",
            "moarachievementsredux.portal4",
            18,
            10,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_3
    );

    public static final Achievement ACHIEVEMENT_PORTAL_5 = new Achievement(
            "achievement.moarachievementsredux.portal5",
            "moarachievementsredux.portal5",
            18,
            9,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_4
    );

    public static final Achievement ACHIEVEMENT_PORTAL_6 = new Achievement(
            "achievement.moarachievementsredux.portal6",
            "moarachievementsredux.portal6",
            15,
            11,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_5
    );

    public static final Achievement ACHIEVEMENT_PORTAL_7 = new Achievement(
            "achievement.moarachievementsredux.portal7",
            "moarachievementsredux.portal7",
            15,
            10,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_6
    );

    public static final Achievement ACHIEVEMENT_PORTAL_8 = new Achievement(
            "achievement.moarachievementsredux.portal8",
            "moarachievementsredux.portal8",
            15,
            9,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_7
    );

    public static final Achievement ACHIEVEMENT_PORTAL_9 = new Achievement(
            "achievement.moarachievementsredux.portal9",
            "moarachievementsredux.portal9",
            16,
            8,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_8
    );

    public static final Achievement ACHIEVEMENT_PORTAL_10 = new Achievement(
            "achievement.moarachievementsredux.portal10",
            "moarachievementsredux.portal10",
            17,
            8,
            Blocks.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_9
    );

    public static final Achievement ACHIEVEMENT_PORTAL_11 = new Achievement(
            "achievement.moarachievementsredux.portal11",
            "moarachievementsredux.portal11",
            16,
            11,
            Blocks.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_10
    );

    public static final Achievement ACHIEVEMENT_PORTAL_12 = new Achievement(
            "achievement.moarachievementsredux.portal12",
            "moarachievementsredux.portal12",
            16,
            10,
            Blocks.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_11
    );

    public static final Achievement ACHIEVEMENT_PORTAL_13 = new Achievement(
            "achievement.moarachievementsredux.portal13",
            "moarachievementsredux.portal13",
            16,
            9,
            Blocks.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_12
    );

    public static final Achievement ACHIEVEMENT_PORTAL_14 = new Achievement(
            "achievement.moarachievementsredux.portal14",
            "moarachievementsredux.portal14",
            17,
            11,
            Blocks.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_13
    );

    public static final Achievement ACHIEVEMENT_PORTAL_15 = new Achievement(
            "achievement.moarachievementsredux.portal15",
            "moarachievementsredux.portal15",
            17,
            10,
            Blocks.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_14
    );

    public static final Achievement ACHIEVEMENT_PORTAL_16 = new Achievement(
            "achievement.moarachievementsredux.portal16",
            "moarachievementsredux.portal16",
            17,
            9,
            Blocks.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_15
    );

    public static final Achievement ACHIEVEMENT_HOW_IS_THIS_POSSIBLE = new Achievement(
            "achievement.moarachievementsredux.how_is_this_possible",
            "moarachievementsredux.how_is_this_possible",
            -4,
            7,
            MoarAchievements.ITEM_ACHIEVEMENT_GETTER,
            null
    )
            .initIndependentStat()
            .setSpecial();

    public static void registerAchievements() {
        AchievementStorage.ACHIEVEMENT_MAKE_SHOVEL.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_AXE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_GOLD_PICK_AXE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_REDSTONE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_DISPENSER.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_NOTEBLOCK.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_PISTON.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_STICKY_PISTON.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_REPEATER.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_CLOCK.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_JUKEBOX.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_COMPASS.registerStat();
        AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_GOLDEN_APPLE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_COOKIE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_CHEST.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_COAL.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_COBBLESTONE.registerStat();
        AchievementStorage.ACHIEVEMENT_SMELT_COBBLESTONE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_FLINT_AND_IRON.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_SHEARS.registerStat();
        AchievementStorage.ACHIEVEMENT_COLLECT_WOOL.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_BED.registerStat();
        AchievementStorage.ACHIEVEMENT_ENTER_CAVE.registerStat();
        AchievementStorage.ACHIEVEMENT_KILL_CAVE_SPIDER.registerStat();
        AchievementStorage.ACHIEVEMENT_KILL_SKELETON.registerStat();
        AchievementStorage.ACHIEVEMENT_KILL_SLIME.registerStat();
        AchievementStorage.ACHIEVEMENT_KILL_ENDERMAN.registerStat();
        AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_BOW.registerStat();
        AchievementStorage.ACHIEVEMENT_EAT_BACON.registerStat();
        AchievementStorage.ACHIEVEMENT_COLLECT_EGG.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_DIRT.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_CACTUS.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_NETHER_WART.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_NETHERRACK.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_BREWING_STAND.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_PAPER.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_MAP.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_DRAGON_EGG.registerStat();
        AchievementStorage.ACHIEVEMENT_MINE_WHEAT.registerStat();
        AchievementStorage.ACHIEVEMENT_LIVE_FALLING.registerStat();
        AchievementStorage.ACHIEVEMENT_KILL_ZOMBIE.registerStat();
        AchievementStorage.ACHIEVEMENT_KILL_CREEPER.registerStat();
        AchievementStorage.ACHIEVEMENT_MAKE_TNT.registerStat();
        AchievementStorage.ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER.registerStat();
        AchievementStorage.ACHIEVEMENT_LEVEL_1.registerStat();
        AchievementStorage.ACHIEVEMENT_LEVEL_2.registerStat();
        AchievementStorage.ACHIEVEMENT_LEVEL_3.registerStat();
        AchievementStorage.ACHIEVEMENT_LEVEL_4.registerStat();
        AchievementStorage.ACHIEVEMENT_LEVEL_5.registerStat();
        AchievementStorage.ACHIEVEMENT_LEVEL_10.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_1.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_2.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_3.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_4.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_5.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_6.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_7.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_8.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_9.registerStat();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_10.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_1.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_2.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_3.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_4.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_5.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_6.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_7.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_8.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_9.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_10.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_11.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_12.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_13.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_14.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_15.registerStat();
        AchievementStorage.ACHIEVEMENT_PORTAL_16.registerStat();
        AchievementStorage.ACHIEVEMENT_HOW_IS_THIS_POSSIBLE.registerStat();
    }

}
