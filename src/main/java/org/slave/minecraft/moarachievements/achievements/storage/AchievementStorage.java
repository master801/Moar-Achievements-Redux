package org.slave.minecraft.moarachievements.achievements.storage;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
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
            MoarAchievements.moarConfiguration.getAchievementIdMakeShovel(),
            "buildShovel",
            5,
            -3,
            Item.shovelWood,
            AchievementList.buildWorkBench
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_AXE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeAxe(),
            "buildAxe",
            -1,
            -1,
            Item.axeWood,
            AchievementList.buildWorkBench
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_IRON_PICK_AXE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeIronPickaxe(),
            "buildSteelPickaxe",
            9,
            2,
            Item.pickaxeIron,
            AchievementList.buildBetterPickaxe
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_GOLD_PICK_AXE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGoldPickaxe(),
            "buildGoldPickaxe",
            10,
            4,
            Item.pickaxeGold,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeDiamondPickaxe(),
            "buildDiamondPickaxe",
            11,
            2,
            Item.pickaxeDiamond,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_REDSTONE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineRedstone(),
            "mineRedstone",
            9,
            6,
            Item.redstone,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_DISPENSER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeDispenser(),
            "buildDispenser",
            7,
            12,
            Block.dispenser,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_NOTEBLOCK = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeNoteBlock(),
            "buildNoteBlock",
            7,
            10,
            Block.music,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_PISTON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakePiston(),
            "buildPiston",
            11,
            12,
            Block.pistonBase,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_STICKY_PISTON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeStickyPiston(),
            "buildStickyPiston",
            13,
            12,
            Block.pistonStickyBase,
            AchievementStorage.ACHIEVEMENT_MAKE_PISTON
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_REDSTONE_TORCH = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeRedstoneTorch(),
            "buildRedstoneTorch",
            11,
            10,
            Block.torchRedstoneActive,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_REDSTONE_REPEATER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeRedstoneRepeater(),
            "buildRedstoneRepeater",
            13,
            10,
            Item.redstoneRepeater,
            AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_CLOCK = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeClock(),
            "buildClock",
            11,
            8,
            Item.pocketSundial,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_JUKEBOX = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeJukebox(),
            "buildJukebox",
            9,
            14,
            Block.jukebox,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_COMPASS = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeCompass(),
            "buildCompass",
            11,
            6,
            Item.compass,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_COLLECT_RED_APPLE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdCollectRedApple(),
            "collectRedApple",
            -5,
            -4,
            Item.appleRed,
            AchievementStorage.ACHIEVEMENT_MAKE_AXE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_GOLDEN_APPLE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGoldenApple(),
            "buildGoldenApple",
            -6,
            -6,
            Item.goldNugget,
            AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_COOKIE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeCookie(),
            "buildCookie",
            -4,
            -6,
            Item.cookie,
            AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_CHEST = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeChest(),
            "buildChest",
            -1,
            -5,
            Block.chest,
            AchievementStorage.ACHIEVEMENT_MAKE_AXE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_COAL = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineCoal(),
            "mineCoal",
            6,
            4,
            Item.coal,
            AchievementList.buildPickaxe
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_SMELT_COBBLESTONE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementSmeltCobblestone(),
            "smeltCobbleStone",
            5,
            6,
            Block.stone,
            AchievementList.buildFurnace
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_FLINT_AND_IRON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeFlintAndIron(),
            "buildFlintAndSteel",
            3,
            7,
            Item.flintAndSteel,
            AchievementList.acquireIron
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_SHEARS = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeShears(),
            "buildShears",
            1,
            2,
            Item.shears,
            AchievementList.acquireIron
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_COLLECT_WOOL = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdCollectWool(),
            "collectWool",
            -1,
            3,
            Block.cloth,
            AchievementStorage.ACHIEVEMENT_MAKE_SHEARS
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_BED = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBed(),
            "buildBed",
            -1,
            1,
            Item.bed,
            AchievementStorage.ACHIEVEMENT_COLLECT_WOOL
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_ENTER_CAVE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdEnterCave(),
            "enterCave",
            11,
            1,
            Block.bedrock,
            AchievementList.killEnemy
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_KILL_SPIDER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillSpider(),
            "killSpider",
            14,
            1,
            Item.silk,
            AchievementStorage.ACHIEVEMENT_ENTER_CAVE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_KILL_SKELETON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillSkeleton(),
            "killSkeleton",
            16,
            1,
            Item.arrow,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_KILL_SLIME = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillSlime(),
            "killSlime",
            16,
            -1,
            Item.slimeBall,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_KILL_ENDERMAN = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillEnderman(),
            "killEnderman",
            11,
            0,
            Item.enderPearl,
            AchievementList.buildSword
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillPassiveMobForMeat(),
            "killPassiveMobForMeat",
            11,
            -2,
            Item.porkRaw,
            AchievementList.buildSword
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_BOW = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBow(),
            "buildBow",
            14,
            -3,
            Item.bow,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_EAT_BACON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdEatBacon(),
            "eatBacon",
            12,
            -4,
            Item.porkCooked,
            AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_COLLECT_EGG = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdCollectEgg(),
            "collectEgg",
            11,
            -4,
            Item.egg,
            AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_DIRT = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineDirt(),
            "mineDirt",
            -5,
            0,
            Block.dirt,
            AchievementList.openInventory
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_COBBLESTONE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineCobblestone(),
            "mineCobblestone",
            -5,
            -2,
            Block.cobblestone,
            AchievementStorage.ACHIEVEMENT_MINE_DIRT
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_CACTUS = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineCactus(),
            "mineCactus",
            -5,
            2,
            Block.cactus,
            AchievementStorage.ACHIEVEMENT_MINE_DIRT
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_SOUL_SAND = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineSoulSand(),
            "mineSoulSand",
            -3,
            10,
            Block.slowSand,
            AchievementList.portal
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_NETHER_WART = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineNetherWart(),
            "mineNetherWart",
            -3,
            12,
            Item.netherStalkSeeds,
            AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_NETHERRACK = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineNetherrack(),
            "mineNetherrack",
            -1,
            9,
            Block.netherrack,
            AchievementList.portal
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_BREWING_STAND = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBrewingStand(),
            "buildBrewingStand",
            1,
            12,
            Block.brewingStand,
            AchievementList.blazeRod
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_SUGAR_CANE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineSugarCane(),
            "mineSugarCane",
            3,
            -7,
            Item.reed,
            AchievementList.buildHoe
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_PAPER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakePaper(),
            "buildPaper",
            1,
            -7,
            Item.paper,
            AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_MAP = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeMap(),
            "buildMap",
            -1,
            -7,
            Item.map,
            AchievementStorage.ACHIEVEMENT_MAKE_PAPER
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_DRAGON_EGG = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineDragonEgg(),
            "mineDragonEgg",
            5,
            10,
            Block.dragonEgg,
            AchievementList.theEnd2
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MINE_WHEAT = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineWheat(),
            "mineWheat",
            1,
            -5,
            Item.wheat,
            AchievementList.buildHoe
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_LIVE_FALLING = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLiveFalling(),
            "liveFalling",
            11,
            -1,
            Item.feather,
            null
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_KILL_ZOMBIE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillZombie(),
            "killZombie",
            14,
            -5,
            Item.rottenFlesh,
            AchievementStorage.ACHIEVEMENT_MAKE_BOW
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_KILL_CREEPER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillCreeper(),
            "killCreeper",
            16,
            -3,
            Item.gunpowder,
            AchievementStorage.ACHIEVEMENT_MAKE_BOW
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_MAKE_TNT = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeTnt(),
            "buildTNT",
            17,
            -2,
            Block.tnt,
            AchievementStorage.ACHIEVEMENT_KILL_CREEPER
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdGetSkeletonToKillCreeper(),
            "getSkeletonToKillCreeper",
            18,
            -3,
            Item.record13,
            AchievementStorage.ACHIEVEMENT_KILL_CREEPER
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_LEVEL_1 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel1(),
            "level1",
            19,
            3,
            Item.swordWood,
            null
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_LEVEL_2 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel2(),
            "level2",
            21,
            3,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_1
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_LEVEL_3 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel3(),
            "level3",
            22,
            4,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_2
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_LEVEL_4 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel4(),
            "level4",
            20,
            4,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_3
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_LEVEL_5 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel5(),
            "level5",
            18,
            4,
            Item.swordStone,
            AchievementStorage.ACHIEVEMENT_LEVEL_4
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_LEVEL_10 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel10(),
            "level10",
            17,
            5,
            Item.swordStone,
            AchievementStorage.ACHIEVEMENT_LEVEL_5
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_1 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian1(),
            "obsidian1",
            16,
            12,
            Block.obsidian,
            null
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_2 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian2(),
            "obsidian2",
            17,
            12,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_1
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_3 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian3(),
            "obsidian3",
            18,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_2
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_4 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian4(),
            "obsidian4",
            18,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_3
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_5 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian5(),
            "obsidian5",
            18,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_4
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_6 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian6(),
            "portal6",
            17,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_5
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_7 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian7(),
            "obsidian7",
            15,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_6
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_8 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian8(),
            "obsidian8",
            15,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_7
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_9 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian9(),
            "obsidian9",
            16,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_8
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_OBSIDIAN_10 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian10(),
            "obsidian10",
            17,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_9
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_1 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal1(),
            "portal1",
            16,
            12,
            Block.obsidian,
            null
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_2 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal2(),
            "portal2",
            17,
            12,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_1
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_3 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal3(),
            "portal3",
            18,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_2
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_4 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal4(),
            "portal4",
            18,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_3
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_5 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal5(),
            "portal5",
            18,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_4
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_6 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal6(),
            "portal6",
            15,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_5
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_7 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal7(),
            "portal7",
            15,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_6
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_8 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal8(),
            "portal8",
            15,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_7
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_9 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal9(),
            "portal9",
            16,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_8
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_10 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal10(),
            "portal10",
            17,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_9
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_11 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal11(),
            "portal1",
            16,
            11,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_10
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_12 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal12(),
            "portal2",
            16,
            10,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_11
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_13 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal13(),
            "portal3",
            16,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_12
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_14 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal14(),
            "portal4",
            17,
            11,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_13
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_15 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal15(),
            "portal5",
            17,
            10,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_14
    ).registerAchievement();

    public static final Achievement ACHIEVEMENT_PORTAL_16 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal16(),
            "portal6",
            17,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_15
    ).registerAchievement();

}
