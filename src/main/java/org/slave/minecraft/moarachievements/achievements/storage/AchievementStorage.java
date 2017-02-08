package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.AchievementMoar;

/**
 * Created by Master801 on 12/21/2016 at 4:16 PM.
 *
 * @author Master801
 */
public final class AchievementStorage {

    public static final Achievement ACHIEVEMENT_MAKE_SHOVEL = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeShovel(),
            "moarachievementsredux.buildShovel",
            5,
            -3,
            Item.shovelWood,
            AchievementList.buildWorkBench
    );

    public static final Achievement ACHIEVEMENT_MAKE_AXE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeAxe(),
            "moarachievementsredux.buildAxe",
            -1,
            -1,
            Item.axeWood,
            AchievementList.buildWorkBench
    );

    public static final Achievement ACHIEVEMENT_MAKE_IRON_PICK_AXE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeIronPickaxe(),
            "moarachievementsredux.buildSteelPickaxe",
            9,
            2,
            Item.pickaxeIron,
            AchievementList.buildBetterPickaxe
    );

    public static final Achievement ACHIEVEMENT_MAKE_GOLD_PICK_AXE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGoldPickaxe(),
            "moarachievementsredux.buildGoldPickaxe",
            10,
            4,
            Item.pickaxeGold,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeDiamondPickaxe(),
            "moarachievementsredux.buildDiamondPickaxe",
            11,
            2,
            Item.pickaxeDiamond,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MINE_REDSTONE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineRedstone(),
            "moarachievementsredux.mineRedstone",
            9,
            6,
            Item.redstone,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_DISPENSER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeDispenser(),
            "moarachievementsredux.buildDispenser",
            7,
            12,
            Block.dispenser,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_NOTEBLOCK = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeNoteBlock(),
            "moarachievementsredux.buildNoteBlock",
            7,
            10,
            Block.music,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_PISTON = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakePiston(),
            "moarachievementsredux.buildPiston",
            11,
            12,
            Block.pistonBase,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_STICKY_PISTON = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeStickyPiston(),
            "moarachievementsredux.buildStickyPiston",
            13,
            12,
            Block.pistonStickyBase,
            AchievementStorage.ACHIEVEMENT_MAKE_PISTON
    );

    public static final Achievement ACHIEVEMENT_MAKE_REDSTONE_TORCH = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeRedstoneTorch(),
            "moarachievementsredux.buildRedstoneTorch",
            11,
            10,
            Block.torchRedstoneActive,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_REDSTONE_REPEATER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeRedstoneRepeater(),
            "moarachievementsredux.buildRedstoneRepeater",
            13,
            10,
            Item.redstoneRepeater,
            AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH
    );

    public static final Achievement ACHIEVEMENT_MAKE_CLOCK = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeClock(),
            "moarachievementsredux.buildClock",
            11,
            8,
            Item.pocketSundial,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_JUKEBOX = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeJukebox(),
            "moarachievementsredux.buildJukebox",
            9,
            14,
            Block.jukebox,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_COMPASS = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeCompass(),
            "moarachievementsredux.buildCompass",
            11,
            6,
            Item.compass,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_COLLECT_RED_APPLE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdCollectRedApple(),
            "moarachievementsredux.collectRedApple",
            -5,
            -4,
            Item.appleRed,
            AchievementStorage.ACHIEVEMENT_MAKE_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_GOLDEN_APPLE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGoldenApple(),
            "moarachievementsredux.buildGoldenApple",
            -6,
            -6,
            Item.goldNugget,
            AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
    );

    public static final Achievement ACHIEVEMENT_MAKE_COOKIE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeCookie(),
            "moarachievementsredux.buildCookie",
            -4,
            -6,
            Item.cookie,
            AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
    );

    public static final Achievement ACHIEVEMENT_MAKE_CHEST = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeChest(),
            "moarachievementsredux.buildChest",
            -1,
            -5,
            Block.chest,
            AchievementStorage.ACHIEVEMENT_MAKE_AXE
    );

    public static final Achievement ACHIEVEMENT_MINE_COAL = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineCoal(),
            "moarachievementsredux.mineCoal",
            6,
            4,
            Item.coal,
            AchievementList.buildPickaxe
    );

    public static final Achievement ACHIEVEMENT_SMELT_COBBLESTONE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementSmeltCobblestone(),
            "moarachievementsredux.smeltCobbleStone",
            5,
            6,
            Block.stone,
            AchievementList.buildFurnace
    );

    public static final Achievement ACHIEVEMENT_MAKE_FLINT_AND_IRON = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeFlintAndIron(),
            "moarachievementsredux.buildFlintAndSteel",
            3,
            7,
            Item.flintAndSteel,
            AchievementList.acquireIron
    );

    public static final Achievement ACHIEVEMENT_MAKE_SHEARS = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeShears(),
            "moarachievementsredux.buildShears",
            1,
            2,
            Item.shears,
            AchievementList.acquireIron
    );

    public static final Achievement ACHIEVEMENT_COLLECT_WOOL = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdCollectWool(),
            "moarachievementsredux.collectWool",
            -1,
            3,
            Block.cloth,
            AchievementStorage.ACHIEVEMENT_MAKE_SHEARS
    );

    public static final Achievement ACHIEVEMENT_MAKE_BED = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBed(),
            "moarachievementsredux.buildBed",
            -1,
            1,
            Item.bed,
            AchievementStorage.ACHIEVEMENT_COLLECT_WOOL
    );

    public static final Achievement ACHIEVEMENT_ENTER_CAVE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdEnterCave(),
            "moarachievementsredux.enterCave",
            11,
            1,
            Block.bedrock,
            AchievementList.killEnemy
    );

    public static final Achievement ACHIEVEMENT_KILL_SPIDER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKillSpider(),
            "moarachievementsredux.killSpider",
            14,
            1,
            Item.silk,
            AchievementStorage.ACHIEVEMENT_ENTER_CAVE
    );

    public static final Achievement ACHIEVEMENT_KILL_SKELETON = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKillSkeleton(),
            "moarachievementsredux.killSkeleton",
            16,
            1,
            Item.arrow,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    );

    public static final Achievement ACHIEVEMENT_KILL_SLIME = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKillSlime(),
            "moarachievementsredux.killSlime",
            16,
            -1,
            Item.slimeBall,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    );

    public static final Achievement ACHIEVEMENT_KILL_ENDERMAN = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKillEnderman(),
            "moarachievementsredux.killEnderman",
            11,
            0,
            Item.enderPearl,
            AchievementList.buildSword
    );

    public static final Achievement ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKillPassiveMobForMeat(),
            "moarachievementsredux.killPassiveMobForMeat",
            11,
            -2,
            Item.porkRaw,
            AchievementList.buildSword
    );

    public static final Achievement ACHIEVEMENT_MAKE_BOW = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBow(),
            "moarachievementsredux.buildBow",
            14,
            -3,
            Item.bow,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    );

    public static final Achievement ACHIEVEMENT_EAT_BACON = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdEatBacon(),
            "moarachievementsredux.eatBacon",
            12,
            -4,
            Item.porkCooked,
            AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
    );

    public static final Achievement ACHIEVEMENT_COLLECT_EGG = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdCollectEgg(),
            "moarachievementsredux.collectEgg",
            11,
            -4,
            Item.egg,
            AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
    );

    public static final Achievement ACHIEVEMENT_MINE_DIRT = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineDirt(),
            "moarachievementsredux.mineDirt",
            -5,
            0,
            Block.dirt,
            AchievementList.openInventory
    );

    public static final Achievement ACHIEVEMENT_MINE_COBBLESTONE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineCobblestone(),
            "moarachievementsredux.mineCobblestone",
            -5,
            -2,
            Block.cobblestone,
            AchievementStorage.ACHIEVEMENT_MINE_DIRT
    );

    public static final Achievement ACHIEVEMENT_MINE_CACTUS = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineCactus(),
            "moarachievementsredux.mineCactus",
            -5,
            2,
            Block.cactus,
            AchievementStorage.ACHIEVEMENT_MINE_DIRT
    );

    public static final Achievement ACHIEVEMENT_MINE_SOUL_SAND = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineSoulSand(),
            "moarachievementsredux.mineSoulSand",
            -3,
            10,
            Block.slowSand,
            AchievementList.portal
    );

    public static final Achievement ACHIEVEMENT_MINE_NETHER_WART = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineNetherWart(),
            "moarachievementsredux.mineNetherWart",
            -3,
            12,
            Item.netherStalkSeeds,
            AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND
    );

    public static final Achievement ACHIEVEMENT_MINE_NETHERRACK = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineNetherrack(),
            "moarachievementsredux.mineNetherrack",
            -1,
            9,
            Block.netherrack,
            AchievementList.portal
    );

    public static final Achievement ACHIEVEMENT_MAKE_BREWING_STAND = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBrewingStand(),
            "moarachievementsredux.buildBrewingStand",
            1,
            12,
            Block.brewingStand,
            AchievementList.blazeRod
    );

    public static final Achievement ACHIEVEMENT_MINE_SUGAR_CANE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineSugarCane(),
            "moarachievementsredux.mineSugarCane",
            3,
            -7,
            Item.reed,
            AchievementList.buildHoe
    );

    public static final Achievement ACHIEVEMENT_MAKE_PAPER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakePaper(),
            "moarachievementsredux.buildPaper",
            1,
            -7,
            Item.paper,
            AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE
    );

    public static final Achievement ACHIEVEMENT_MAKE_MAP = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeMap(),
            "moarachievementsredux.buildMap",
            -1,
            -7,
            Item.map,
            AchievementStorage.ACHIEVEMENT_MAKE_PAPER
    );

    public static final Achievement ACHIEVEMENT_MINE_DRAGON_EGG = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineDragonEgg(),
            "moarachievementsredux.mineDragonEgg",
            5,
            10,
            Block.dragonEgg,
            AchievementList.theEnd2
    );

    public static final Achievement ACHIEVEMENT_MINE_WHEAT = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMineWheat(),
            "moarachievementsredux.mineWheat",
            1,
            -5,
            Item.wheat,
            AchievementList.buildHoe
    );

    public static final Achievement ACHIEVEMENT_LIVE_FALLING = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdLiveFalling(),
            "moarachievementsredux.liveFalling",
            11,
            -1,
            Item.feather,
            null
    );

    public static final Achievement ACHIEVEMENT_KILL_ZOMBIE = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKillZombie(),
            "moarachievementsredux.killZombie",
            14,
            -5,
            Item.rottenFlesh,
            AchievementStorage.ACHIEVEMENT_MAKE_BOW
    );

    public static final Achievement ACHIEVEMENT_KILL_CREEPER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdKillCreeper(),
            "moarachievementsredux.killCreeper",
            16,
            -3,
            Item.gunpowder,
            AchievementStorage.ACHIEVEMENT_MAKE_BOW
    );

    public static final Achievement ACHIEVEMENT_MAKE_TNT = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdMakeTnt(),
            "moarachievementsredux.buildTNT",
            17,
            -2,
            Block.tnt,
            AchievementStorage.ACHIEVEMENT_KILL_CREEPER
    );

    public static final Achievement ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdGetSkeletonToKillCreeper(),
            "moarachievementsredux.getSkeletonToKillCreeper",
            18,
            -3,
            Item.record13,
            AchievementStorage.ACHIEVEMENT_KILL_CREEPER
    );

    public static final Achievement ACHIEVEMENT_LEVEL_1 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdLevel1(),
            "moarachievementsredux.level1",
            19,
            3,
            Item.swordWood,
            null
    );

    public static final Achievement ACHIEVEMENT_LEVEL_2 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdLevel2(),
            "moarachievementsredux.level2",
            21,
            3,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_1
    );

    public static final Achievement ACHIEVEMENT_LEVEL_3 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdLevel3(),
            "moarachievementsredux.level3",
            22,
            4,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_2
    );

    public static final Achievement ACHIEVEMENT_LEVEL_4 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdLevel4(),
            "moarachievementsredux.level4",
            20,
            4,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_3
    );

    public static final Achievement ACHIEVEMENT_LEVEL_5 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdLevel5(),
            "moarachievementsredux.level5",
            18,
            4,
            Item.swordStone,
            AchievementStorage.ACHIEVEMENT_LEVEL_4
    );

    public static final Achievement ACHIEVEMENT_LEVEL_10 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdLevel10(),
            "moarachievementsredux.level10",
            17,
            5,
            Item.swordStone,
            AchievementStorage.ACHIEVEMENT_LEVEL_5
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_1 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian1(),
            "moarachievementsredux.obsidian1",
            16,
            12,
            Block.obsidian,
            null
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_2 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian2(),
            "moarachievementsredux.obsidian2",
            17,
            12,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_1
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_3 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian3(),
            "moarachievementsredux.obsidian3",
            18,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_2
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_4 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian4(),
            "moarachievementsredux.obsidian4",
            18,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_3
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_5 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian5(),
            "moarachievementsredux.obsidian5",
            18,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_4
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_6 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian6(),
            "moarachievementsredux.portal6",
            17,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_5
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_7 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian7(),
            "moarachievementsredux.obsidian7",
            15,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_6
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_8 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian8(),
            "moarachievementsredux.obsidian8",
            15,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_7
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_9 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian9(),
            "moarachievementsredux.obsidian9",
            16,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_8
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_10 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian10(),
            "moarachievementsredux.obsidian10",
            17,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_9
    );

    public static final Achievement ACHIEVEMENT_PORTAL_1 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal1(),
            "moarachievementsredux.portal1",
            16,
            12,
            Block.obsidian,
            null
    );

    public static final Achievement ACHIEVEMENT_PORTAL_2 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal2(),
            "moarachievementsredux.portal2",
            17,
            12,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_1
    );

    public static final Achievement ACHIEVEMENT_PORTAL_3 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal3(),
            "moarachievementsredux.portal3",
            18,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_2
    );

    public static final Achievement ACHIEVEMENT_PORTAL_4 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal4(),
            "moarachievementsredux.portal4",
            18,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_3
    );

    public static final Achievement ACHIEVEMENT_PORTAL_5 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal5(),
            "moarachievementsredux.portal5",
            18,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_4
    );

    public static final Achievement ACHIEVEMENT_PORTAL_6 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal6(),
            "moarachievementsredux.portal6",
            15,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_5
    );

    public static final Achievement ACHIEVEMENT_PORTAL_7 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal7(),
            "moarachievementsredux.portal7",
            15,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_6
    );

    public static final Achievement ACHIEVEMENT_PORTAL_8 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal8(),
            "moarachievementsredux.portal8",
            15,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_7
    );

    public static final Achievement ACHIEVEMENT_PORTAL_9 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal9(),
            "moarachievementsredux.portal9",
            16,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_8
    );

    public static final Achievement ACHIEVEMENT_PORTAL_10 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal10(),
            "moarachievementsredux.portal10",
            17,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_9
    );

    public static final Achievement ACHIEVEMENT_PORTAL_11 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal11(),
            "moarachievementsredux.portal1",
            16,
            11,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_10
    );

    public static final Achievement ACHIEVEMENT_PORTAL_12 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal12(),
            "moarachievementsredux.portal2",
            16,
            10,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_11
    );

    public static final Achievement ACHIEVEMENT_PORTAL_13 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal13(),
            "moarachievementsredux.portal3",
            16,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_12
    );

    public static final Achievement ACHIEVEMENT_PORTAL_14 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal14(),
            "moarachievementsredux.portal4",
            17,
            11,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_13
    );

    public static final Achievement ACHIEVEMENT_PORTAL_15 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal15(),
            "moarachievementsredux.portal5",
            17,
            10,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_14
    );

    public static final Achievement ACHIEVEMENT_PORTAL_16 = new AchievementMoar(
            MoarAchievements.moarConfiguration.getAchievementIdPortal16(),
            "moarachievementsredux.portal6",
            17,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_15
    );

    public static void registerAchievements() {
        AchievementStorage.ACHIEVEMENT_MAKE_SHOVEL.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_AXE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_GOLD_PICK_AXE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_REDSTONE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_DISPENSER.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_NOTEBLOCK.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_PISTON.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_STICKY_PISTON.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_REPEATER.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_CLOCK.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_JUKEBOX.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_COMPASS.registerAchievement();
        AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_GOLDEN_APPLE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_COOKIE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_CHEST.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_COAL.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_COBBLESTONE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_FLINT_AND_IRON.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_SHEARS.registerAchievement();
        AchievementStorage.ACHIEVEMENT_COLLECT_WOOL.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_BED.registerAchievement();
        AchievementStorage.ACHIEVEMENT_ENTER_CAVE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_KILL_SPIDER.registerAchievement();
        AchievementStorage.ACHIEVEMENT_KILL_SKELETON.registerAchievement();
        AchievementStorage.ACHIEVEMENT_KILL_SLIME.registerAchievement();
        AchievementStorage.ACHIEVEMENT_KILL_ENDERMAN.registerAchievement();
        AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_BOW.registerAchievement();
        AchievementStorage.ACHIEVEMENT_EAT_BACON.registerAchievement();
        AchievementStorage.ACHIEVEMENT_COLLECT_EGG.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_DIRT.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_CACTUS.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_NETHER_WART.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_NETHERRACK.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_BREWING_STAND.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_PAPER.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_MAP.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_DRAGON_EGG.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MINE_WHEAT.registerAchievement();
        AchievementStorage.ACHIEVEMENT_LIVE_FALLING.registerAchievement();
        AchievementStorage.ACHIEVEMENT_KILL_ZOMBIE.registerAchievement();
        AchievementStorage.ACHIEVEMENT_KILL_CREEPER.registerAchievement();
        AchievementStorage.ACHIEVEMENT_MAKE_TNT.registerAchievement();
        AchievementStorage.ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER.registerAchievement();
        AchievementStorage.ACHIEVEMENT_LEVEL_1.registerAchievement();
        AchievementStorage.ACHIEVEMENT_LEVEL_2.registerAchievement();
        AchievementStorage.ACHIEVEMENT_LEVEL_3.registerAchievement();
        AchievementStorage.ACHIEVEMENT_LEVEL_4.registerAchievement();
        AchievementStorage.ACHIEVEMENT_LEVEL_5.registerAchievement();
        AchievementStorage.ACHIEVEMENT_LEVEL_10.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_1.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_2.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_3.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_4.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_5.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_6.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_7.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_8.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_9.registerAchievement();
        AchievementStorage.ACHIEVEMENT_OBSIDIAN_10.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_1.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_2.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_3.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_4.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_5.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_6.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_7.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_8.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_9.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_10.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_11.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_12.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_13.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_14.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_15.registerAchievement();
        AchievementStorage.ACHIEVEMENT_PORTAL_16.registerAchievement();
    }

}
