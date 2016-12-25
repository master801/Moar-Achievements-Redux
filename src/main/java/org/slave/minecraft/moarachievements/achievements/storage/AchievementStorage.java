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
            "moararchievementsredux.buildShovel",
            5,
            -3,
            Item.shovelWood,
            AchievementList.buildWorkBench
    );

    public static final Achievement ACHIEVEMENT_MAKE_AXE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeAxe(),
            "moararchievementsredux.buildAxe",
            -1,
            -1,
            Item.axeWood,
            AchievementList.buildWorkBench
    );

    public static final Achievement ACHIEVEMENT_MAKE_IRON_PICK_AXE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeIronPickaxe(),
            "moararchievementsredux.buildSteelPickaxe",
            9,
            2,
            Item.pickaxeIron,
            AchievementList.buildBetterPickaxe
    );

    public static final Achievement ACHIEVEMENT_MAKE_GOLD_PICK_AXE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGoldPickaxe(),
            "moararchievementsredux.buildGoldPickaxe",
            10,
            4,
            Item.pickaxeGold,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeDiamondPickaxe(),
            "moararchievementsredux.buildDiamondPickaxe",
            11,
            2,
            Item.pickaxeDiamond,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MINE_REDSTONE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineRedstone(),
            "moararchievementsredux.mineRedstone",
            9,
            6,
            Item.redstone,
            AchievementStorage.ACHIEVEMENT_MAKE_IRON_PICK_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_DISPENSER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeDispenser(),
            "moararchievementsredux.buildDispenser",
            7,
            12,
            Block.dispenser,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_NOTEBLOCK = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeNoteBlock(),
            "moararchievementsredux.buildNoteBlock",
            7,
            10,
            Block.music,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_PISTON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakePiston(),
            "moararchievementsredux.buildPiston",
            11,
            12,
            Block.pistonBase,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_STICKY_PISTON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeStickyPiston(),
            "moararchievementsredux.buildStickyPiston",
            13,
            12,
            Block.pistonStickyBase,
            AchievementStorage.ACHIEVEMENT_MAKE_PISTON
    );

    public static final Achievement ACHIEVEMENT_MAKE_REDSTONE_TORCH = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeRedstoneTorch(),
            "moararchievementsredux.buildRedstoneTorch",
            11,
            10,
            Block.torchRedstoneActive,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_REDSTONE_REPEATER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeRedstoneRepeater(),
            "moararchievementsredux.buildRedstoneRepeater",
            13,
            10,
            Item.redstoneRepeater,
            AchievementStorage.ACHIEVEMENT_MAKE_REDSTONE_TORCH
    );

    public static final Achievement ACHIEVEMENT_MAKE_CLOCK = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeClock(),
            "moararchievementsredux.buildClock",
            11,
            8,
            Item.pocketSundial,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_JUKEBOX = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeJukebox(),
            "moararchievementsredux.buildJukebox",
            9,
            14,
            Block.jukebox,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_MAKE_COMPASS = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeCompass(),
            "moararchievementsredux.buildCompass",
            11,
            6,
            Item.compass,
            AchievementStorage.ACHIEVEMENT_MINE_REDSTONE
    );

    public static final Achievement ACHIEVEMENT_COLLECT_RED_APPLE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdCollectRedApple(),
            "moararchievementsredux.collectRedApple",
            -5,
            -4,
            Item.appleRed,
            AchievementStorage.ACHIEVEMENT_MAKE_AXE
    );

    public static final Achievement ACHIEVEMENT_MAKE_GOLDEN_APPLE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeGoldenApple(),
            "moararchievementsredux.buildGoldenApple",
            -6,
            -6,
            Item.goldNugget,
            AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
    );

    public static final Achievement ACHIEVEMENT_MAKE_COOKIE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeCookie(),
            "moararchievementsredux.buildCookie",
            -4,
            -6,
            Item.cookie,
            AchievementStorage.ACHIEVEMENT_COLLECT_RED_APPLE
    );

    public static final Achievement ACHIEVEMENT_MAKE_CHEST = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeChest(),
            "moararchievementsredux.buildChest",
            -1,
            -5,
            Block.chest,
            AchievementStorage.ACHIEVEMENT_MAKE_AXE
    );

    public static final Achievement ACHIEVEMENT_MINE_COAL = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineCoal(),
            "moararchievementsredux.mineCoal",
            6,
            4,
            Item.coal,
            AchievementList.buildPickaxe
    );

    public static final Achievement ACHIEVEMENT_SMELT_COBBLESTONE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementSmeltCobblestone(),
            "moararchievementsredux.smeltCobbleStone",
            5,
            6,
            Block.stone,
            AchievementList.buildFurnace
    );

    public static final Achievement ACHIEVEMENT_MAKE_FLINT_AND_IRON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeFlintAndIron(),
            "moararchievementsredux.buildFlintAndSteel",
            3,
            7,
            Item.flintAndSteel,
            AchievementList.acquireIron
    );

    public static final Achievement ACHIEVEMENT_MAKE_SHEARS = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeShears(),
            "moararchievementsredux.buildShears",
            1,
            2,
            Item.shears,
            AchievementList.acquireIron
    );

    public static final Achievement ACHIEVEMENT_COLLECT_WOOL = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdCollectWool(),
            "moararchievementsredux.collectWool",
            -1,
            3,
            Block.cloth,
            AchievementStorage.ACHIEVEMENT_MAKE_SHEARS
    );

    public static final Achievement ACHIEVEMENT_MAKE_BED = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBed(),
            "moararchievementsredux.buildBed",
            -1,
            1,
            Item.bed,
            AchievementStorage.ACHIEVEMENT_COLLECT_WOOL
    );

    public static final Achievement ACHIEVEMENT_ENTER_CAVE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdEnterCave(),
            "moararchievementsredux.enterCave",
            11,
            1,
            Block.bedrock,
            AchievementList.killEnemy
    );

    public static final Achievement ACHIEVEMENT_KILL_SPIDER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillSpider(),
            "moararchievementsredux.killSpider",
            14,
            1,
            Item.silk,
            AchievementStorage.ACHIEVEMENT_ENTER_CAVE
    );

    public static final Achievement ACHIEVEMENT_KILL_SKELETON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillSkeleton(),
            "moararchievementsredux.killSkeleton",
            16,
            1,
            Item.arrow,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    );

    public static final Achievement ACHIEVEMENT_KILL_SLIME = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillSlime(),
            "moararchievementsredux.killSlime",
            16,
            -1,
            Item.slimeBall,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    );

    public static final Achievement ACHIEVEMENT_KILL_ENDERMAN = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillEnderman(),
            "moararchievementsredux.killEnderman",
            11,
            0,
            Item.enderPearl,
            AchievementList.buildSword
    );

    public static final Achievement ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillPassiveMobForMeat(),
            "moararchievementsredux.killPassiveMobForMeat",
            11,
            -2,
            Item.porkRaw,
            AchievementList.buildSword
    );

    public static final Achievement ACHIEVEMENT_MAKE_BOW = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBow(),
            "moararchievementsredux.buildBow",
            14,
            -3,
            Item.bow,
            AchievementStorage.ACHIEVEMENT_KILL_SPIDER
    );

    public static final Achievement ACHIEVEMENT_EAT_BACON = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdEatBacon(),
            "moararchievementsredux.eatBacon",
            12,
            -4,
            Item.porkCooked,
            AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
    );

    public static final Achievement ACHIEVEMENT_COLLECT_EGG = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdCollectEgg(),
            "moararchievementsredux.collectEgg",
            11,
            -4,
            Item.egg,
            AchievementStorage.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT
    );

    public static final Achievement ACHIEVEMENT_MINE_DIRT = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineDirt(),
            "moararchievementsredux.mineDirt",
            -5,
            0,
            Block.dirt,
            AchievementList.openInventory
    );

    public static final Achievement ACHIEVEMENT_MINE_COBBLESTONE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineCobblestone(),
            "moararchievementsredux.mineCobblestone",
            -5,
            -2,
            Block.cobblestone,
            AchievementStorage.ACHIEVEMENT_MINE_DIRT
    );

    public static final Achievement ACHIEVEMENT_MINE_CACTUS = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineCactus(),
            "moararchievementsredux.mineCactus",
            -5,
            2,
            Block.cactus,
            AchievementStorage.ACHIEVEMENT_MINE_DIRT
    );

    public static final Achievement ACHIEVEMENT_MINE_SOUL_SAND = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineSoulSand(),
            "moararchievementsredux.mineSoulSand",
            -3,
            10,
            Block.slowSand,
            AchievementList.portal
    );

    public static final Achievement ACHIEVEMENT_MINE_NETHER_WART = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineNetherWart(),
            "moararchievementsredux.mineNetherWart",
            -3,
            12,
            Item.netherStalkSeeds,
            AchievementStorage.ACHIEVEMENT_MINE_SOUL_SAND
    );

    public static final Achievement ACHIEVEMENT_MINE_NETHERRACK = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineNetherrack(),
            "moararchievementsredux.mineNetherrack",
            -1,
            9,
            Block.netherrack,
            AchievementList.portal
    );

    public static final Achievement ACHIEVEMENT_MAKE_BREWING_STAND = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeBrewingStand(),
            "moararchievementsredux.buildBrewingStand",
            1,
            12,
            Block.brewingStand,
            AchievementList.blazeRod
    );

    public static final Achievement ACHIEVEMENT_MINE_SUGAR_CANE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineSugarCane(),
            "moararchievementsredux.mineSugarCane",
            3,
            -7,
            Item.reed,
            AchievementList.buildHoe
    );

    public static final Achievement ACHIEVEMENT_MAKE_PAPER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakePaper(),
            "moararchievementsredux.buildPaper",
            1,
            -7,
            Item.paper,
            AchievementStorage.ACHIEVEMENT_MINE_SUGAR_CANE
    );

    public static final Achievement ACHIEVEMENT_MAKE_MAP = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeMap(),
            "moararchievementsredux.buildMap",
            -1,
            -7,
            Item.map,
            AchievementStorage.ACHIEVEMENT_MAKE_PAPER
    );

    public static final Achievement ACHIEVEMENT_MINE_DRAGON_EGG = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineDragonEgg(),
            "moararchievementsredux.mineDragonEgg",
            5,
            10,
            Block.dragonEgg,
            AchievementList.theEnd2
    );

    public static final Achievement ACHIEVEMENT_MINE_WHEAT = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMineWheat(),
            "moararchievementsredux.mineWheat",
            1,
            -5,
            Item.wheat,
            AchievementList.buildHoe
    );

    public static final Achievement ACHIEVEMENT_LIVE_FALLING = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLiveFalling(),
            "moararchievementsredux.liveFalling",
            11,
            -1,
            Item.feather,
            null
    );

    public static final Achievement ACHIEVEMENT_KILL_ZOMBIE = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillZombie(),
            "moararchievementsredux.killZombie",
            14,
            -5,
            Item.rottenFlesh,
            AchievementStorage.ACHIEVEMENT_MAKE_BOW
    );

    public static final Achievement ACHIEVEMENT_KILL_CREEPER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdKillCreeper(),
            "moararchievementsredux.killCreeper",
            16,
            -3,
            Item.gunpowder,
            AchievementStorage.ACHIEVEMENT_MAKE_BOW
    );

    public static final Achievement ACHIEVEMENT_MAKE_TNT = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdMakeTnt(),
            "moararchievementsredux.buildTNT",
            17,
            -2,
            Block.tnt,
            AchievementStorage.ACHIEVEMENT_KILL_CREEPER
    );

    public static final Achievement ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdGetSkeletonToKillCreeper(),
            "moararchievementsredux.getSkeletonToKillCreeper",
            18,
            -3,
            Item.record13,
            AchievementStorage.ACHIEVEMENT_KILL_CREEPER
    );

    public static final Achievement ACHIEVEMENT_LEVEL_1 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel1(),
            "moararchievementsredux.level1",
            19,
            3,
            Item.swordWood,
            null
    );

    public static final Achievement ACHIEVEMENT_LEVEL_2 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel2(),
            "moararchievementsredux.level2",
            21,
            3,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_1
    );

    public static final Achievement ACHIEVEMENT_LEVEL_3 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel3(),
            "moararchievementsredux.level3",
            22,
            4,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_2
    );

    public static final Achievement ACHIEVEMENT_LEVEL_4 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel4(),
            "moararchievementsredux.level4",
            20,
            4,
            Item.swordWood,
            AchievementStorage.ACHIEVEMENT_LEVEL_3
    );

    public static final Achievement ACHIEVEMENT_LEVEL_5 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel5(),
            "moararchievementsredux.level5",
            18,
            4,
            Item.swordStone,
            AchievementStorage.ACHIEVEMENT_LEVEL_4
    );

    public static final Achievement ACHIEVEMENT_LEVEL_10 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdLevel10(),
            "moararchievementsredux.level10",
            17,
            5,
            Item.swordStone,
            AchievementStorage.ACHIEVEMENT_LEVEL_5
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_1 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian1(),
            "moararchievementsredux.obsidian1",
            16,
            12,
            Block.obsidian,
            null
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_2 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian2(),
            "moararchievementsredux.obsidian2",
            17,
            12,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_1
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_3 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian3(),
            "moararchievementsredux.obsidian3",
            18,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_2
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_4 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian4(),
            "moararchievementsredux.obsidian4",
            18,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_3
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_5 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian5(),
            "moararchievementsredux.obsidian5",
            18,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_4
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_6 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian6(),
            "moararchievementsredux.portal6",
            17,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_5
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_7 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian7(),
            "moararchievementsredux.obsidian7",
            15,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_6
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_8 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian8(),
            "moararchievementsredux.obsidian8",
            15,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_7
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_9 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian9(),
            "moararchievementsredux.obsidian9",
            16,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_8
    );

    public static final Achievement ACHIEVEMENT_OBSIDIAN_10 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdObsidian10(),
            "moararchievementsredux.obsidian10",
            17,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_OBSIDIAN_9
    );

    public static final Achievement ACHIEVEMENT_PORTAL_1 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal1(),
            "moararchievementsredux.portal1",
            16,
            12,
            Block.obsidian,
            null
    );

    public static final Achievement ACHIEVEMENT_PORTAL_2 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal2(),
            "moararchievementsredux.portal2",
            17,
            12,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_1
    );

    public static final Achievement ACHIEVEMENT_PORTAL_3 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal3(),
            "moararchievementsredux.portal3",
            18,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_2
    );

    public static final Achievement ACHIEVEMENT_PORTAL_4 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal4(),
            "moararchievementsredux.portal4",
            18,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_3
    );

    public static final Achievement ACHIEVEMENT_PORTAL_5 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal5(),
            "moararchievementsredux.portal5",
            18,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_4
    );

    public static final Achievement ACHIEVEMENT_PORTAL_6 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal6(),
            "moararchievementsredux.portal6",
            15,
            11,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_5
    );

    public static final Achievement ACHIEVEMENT_PORTAL_7 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal7(),
            "moararchievementsredux.portal7",
            15,
            10,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_6
    );

    public static final Achievement ACHIEVEMENT_PORTAL_8 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal8(),
            "moararchievementsredux.portal8",
            15,
            9,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_7
    );

    public static final Achievement ACHIEVEMENT_PORTAL_9 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal9(),
            "moararchievementsredux.portal9",
            16,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_8
    );

    public static final Achievement ACHIEVEMENT_PORTAL_10 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal10(),
            "moararchievementsredux.portal10",
            17,
            8,
            Block.obsidian,
            AchievementStorage.ACHIEVEMENT_PORTAL_9
    );

    public static final Achievement ACHIEVEMENT_PORTAL_11 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal11(),
            "moararchievementsredux.portal1",
            16,
            11,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_10
    );

    public static final Achievement ACHIEVEMENT_PORTAL_12 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal12(),
            "moararchievementsredux.portal2",
            16,
            10,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_11
    );

    public static final Achievement ACHIEVEMENT_PORTAL_13 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal13(),
            "moararchievementsredux.portal3",
            16,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_12
    );

    public static final Achievement ACHIEVEMENT_PORTAL_14 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal14(),
            "moararchievementsredux.portal4",
            17,
            11,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_13
    );

    public static final Achievement ACHIEVEMENT_PORTAL_15 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal15(),
            "moararchievementsredux.portal5",
            17,
            10,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_14
    );

    public static final Achievement ACHIEVEMENT_PORTAL_16 = new Achievement(
            MoarAchievements.moarConfiguration.getAchievementIdPortal16(),
            "moararchievementsredux.portal6",
            17,
            9,
            Block.portal,
            AchievementStorage.ACHIEVEMENT_PORTAL_15
    );

}
