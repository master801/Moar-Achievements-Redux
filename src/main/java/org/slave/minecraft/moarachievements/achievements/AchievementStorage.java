package org.slave.minecraft.moarachievements.achievements;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import org.slave.minecraft.moarachievements.MoarAchievements;
import org.slave.minecraft.moarachievements.achievements.pages.AchievementPages;

/**
 * Created by Master801 on 12/20/2016 at 3:27 PM.
 *
 * @author Master801
 */
public interface AchievementStorage {

    void registerAchievement();

    AchievementMeta getAchievementMeta();

    Achievement getAchievement();

    Achievement getParentAchievement();

    AchievementPage getAchievementPage();

    enum AchievementStorageMain implements AchievementStorage {

        ACHIEVEMENT_MAKE_SHOVEL(
                new AchievementMeta(
                        "buildShovel",
                        5,
                        -3,
                        Item.shovelWood
                ),
                AchievementList.buildWorkBench
        ),

        ACHIEVEMENT_MAKE_AXE(
                new AchievementMeta(
                        "buildAxe",
                        -1,
                        -1,
                        Item.axeWood
                ),
                AchievementList.buildWorkBench
        ),

        ACHIEVEMENT_MAKE_IRON_PICK_AXE(
                new AchievementMeta(
                        "buildSteelPickaxe",
                        9,
                        2,
                        Item.pickaxeIron
                ),
                AchievementList.buildBetterPickaxe
        ),

        ACHIEVEMENT_MAKE_GOLD_PICK_AXE(
                new AchievementMeta(
                        "buildGoldPickaxe",
                        10,
                        4,
                        Item.pickaxeGold
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_IRON_PICK_AXE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_DIAMOND_PICK_AXE(
                new AchievementMeta(
                        "buildDiamondPickaxe",
                        11,
                        2,
                        Item.pickaxeDiamond
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_IRON_PICK_AXE.getAchievement()
        ),

        ACHIEVEMENT_MINE_REDSTONE(
                new AchievementMeta(
                        "mineRedstone",
                        9,
                        6,
                        Item.redstone
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_IRON_PICK_AXE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_DISPENSER(
                new AchievementMeta(
                        "buildDispenser",
                        7,
                        12,
                        Block.dispenser
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_REDSTONE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_NOTEBLOCK(
                new AchievementMeta(
                        "buildNoteBlock",
                        7,
                        10,
                        Block.music
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_REDSTONE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_PISTON(
                new AchievementMeta(
                        "buildPiston",
                        11,
                        12,
                        Block.pistonBase
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_REDSTONE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_STICKY_PISTON(
                new AchievementMeta(
                        "buildStickyPiston",
                        13,
                        12,
                        Block.pistonStickyBase
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_PISTON.getAchievement()
        ),

        ACHIEVEMENT_MAKE_REDSTONE_TORCH(
                new AchievementMeta(
                        "buildRedstoneTorch",
                        11,
                        10,
                        Block.torchRedstoneActive
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_REDSTONE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_REDSTONE_REPEATER(
                new AchievementMeta(
                        "buildRedstoneRepeater",
                        13,
                        10,
                        Item.redstoneRepeater
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_REDSTONE_TORCH.getAchievement()
        ),

        ACHIEVEMENT_MAKE_CLOCK(
                new AchievementMeta(
                        "buildClock",
                        11,
                        8,
                        Item.pocketSundial
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_REDSTONE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_JUKEBOX(
                new AchievementMeta(
                        "buildJukebox",
                        9,
                        14,
                        Block.jukebox
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_REDSTONE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_COMPASS(
                new AchievementMeta(
                        "buildCompass",
                        11,
                        6,
                        Item.compass
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_REDSTONE.getAchievement()
        ),

        ACHIEVEMENT_COLLECT_RED_APPLE(
                new AchievementMeta(
                        "collectRedApple",
                        -5,
                        -4,
                        Item.appleRed
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_AXE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_GOLDEN_APPLE(
                new AchievementMeta(
                        "buildGoldenApple",
                        -6,
                        -6,
                        Item.goldNugget
                ),
                AchievementStorageMain.ACHIEVEMENT_COLLECT_RED_APPLE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_COOKIE(
                new AchievementMeta(
                        "buildCookie",
                        -4,
                        -6,
                        Item.cookie
                ),
                AchievementStorageMain.ACHIEVEMENT_COLLECT_RED_APPLE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_CHEST(
                new AchievementMeta(
                        "buildChest",
                        -1,
                        -5,
                        Block.chest
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_AXE.getAchievement()
        ),

        ACHIEVEMENT_MINE_COAL(
                new AchievementMeta(
                        "mineCoal",
                        6,
                        4,
                        Item.coal
                ),
                AchievementList.buildPickaxe
        ),

        ACHIEVEMENT_SMELT_COBBLESTONE(
                new AchievementMeta(
                        "smeltCobbleStone",
                        5,
                        6,
                        Block.stone
                ),
                AchievementList.buildFurnace
        ),

        ACHIEVEMENT_MAKE_FLINT_AND_IRON(
                new AchievementMeta(
                        "buildFlintAndSteel",
                        3,
                        7,
                        Item.flintAndSteel
                ),
                AchievementList.acquireIron
        ),

        ACHIEVEMENT_MAKE_SHEARS(
                new AchievementMeta(
                        "buildShears",
                        1,
                        2,
                        Item.shears
                ),
                AchievementList.acquireIron
        ),

        ACHIEVEMENT_COLLECT_WOOL(
                new AchievementMeta(
                        "collectWool",
                        -1,
                        3,
                        Block.cloth
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_SHEARS.getAchievement()
        ),

        ACHIEVEMENT_MAKE_BED(
                new AchievementMeta(
                        "buildBed",
                        -1,
                        1,
                        Item.bed
                ),
                AchievementStorageMain.ACHIEVEMENT_COLLECT_WOOL.getAchievement()
        ),

        ACHIEVEMENT_ENTER_CAVE(
                new AchievementMeta(
                        "enterCave",
                        11,
                        1,
                        Block.bedrock
                ),
                AchievementList.killEnemy
        ),

        ACHIEVEMENT_KILL_SPIDER(
                new AchievementMeta(
                        "killSpider",
                        14,
                        1,
                        Item.silk
                ),
                AchievementStorageMain.ACHIEVEMENT_ENTER_CAVE.getAchievement()
        ),

        ACHIEVEMENT_KILL_SKELETON(
                new AchievementMeta(
                        "killSkeleton",
                        16,
                        1,
                        Item.arrow
                ),
                AchievementStorageMain.ACHIEVEMENT_KILL_SPIDER.getAchievement()
        ),

        ACHIEVEMENT_KILL_SLIME(
                new AchievementMeta(
                        "killSlime",
                        16,
                        -1,
                        Item.slimeBall
                ),
                AchievementStorageMain.ACHIEVEMENT_KILL_SPIDER.getAchievement()
        ),

        ACHIEVEMENT_KILL_ENDERMAN(
                new AchievementMeta(
                        "killEnderman",
                        11,
                        0,
                        Item.enderPearl
                ),
                AchievementList.buildSword
        ),

        ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT(
                new AchievementMeta(
                        "killPassiveMobForMeat",
                        11,
                        -2,
                        Item.porkRaw
                ),
                AchievementList.buildSword
        ),

        ACHIEVEMENT_MAKE_BOW(
                new AchievementMeta(
                        "buildBow",
                        14,
                        -3,
                        Item.bow
                ),
                AchievementStorageMain.ACHIEVEMENT_KILL_SPIDER.getAchievement()
        ),

        ACHIEVEMENT_EAT_BACON(
                new AchievementMeta(
                        "eatBacon",
                        12,
                        -4,
                        Item.porkCooked
                ),
                AchievementStorageMain.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT.getAchievement()
        ),

        ACHIEVEMENT_COLLECT_EGG(
                new AchievementMeta(
                        "collectEgg",
                        11,
                        -4,
                        Item.egg
                ),
                AchievementStorageMain.ACHIEVEMENT_KILL_PASSIVE_MOB_FOR_MEAT.getAchievement()
        ),

        ACHIEVEMENT_MINE_DIRT(
                new AchievementMeta(
                        "mineDirt",
                        -5,
                        0,
                        Block.dirt
                ),
                AchievementList.openInventory
        ),

        ACHIEVEMENT_MINE_COBBLESTONE(
                new AchievementMeta(
                        "mineCobblestone",
                        -5,
                        -2,
                        Block.cobblestone
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_DIRT.getAchievement()
        ),

        ACHIEVEMENT_MINE_CACTUS(
                new AchievementMeta(
                        "mineCactus",
                        -5,
                        2,
                        Block.cactus
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_DIRT.getAchievement()
        ),

        ACHIEVEMENT_MINE_SOUL_SAND(
                new AchievementMeta(
                        "mineSoulSand",
                        -3,
                        10,
                        Block.slowSand
                ),
                AchievementList.portal
        ),

        ACHIEVEMENT_MINE_NETHER_WART(
                new AchievementMeta(
                        "mineNetherWart",
                        -3,
                        12,
                        Item.netherStalkSeeds
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_SOUL_SAND.getAchievement()
        ),

        ACHIEVEMENT_MINE_NETHERRACK(
                new AchievementMeta(
                        "mineNetherrack",
                        -1,
                        9,
                        Block.netherrack
                ),
                AchievementList.portal
        ),

        ACHIEVEMENT_MAKE_BREWING_STAND(
                new AchievementMeta(
                        "buildBrewingStand",
                        1,
                        12,
                        Block.brewingStand
                ),
                AchievementList.blazeRod
        ),

        ACHIEVEMENT_MINE_SUGAR_CANE(
                new AchievementMeta(
                        "mineSugarCane",
                        3,
                        -7,
                        Item.reed
                ),
                AchievementList.buildHoe
        ),

        ACHIEVEMENT_MAKE_PAPER(
                new AchievementMeta(
                        "buildPaper",
                        1,
                        -7,
                        Item.paper
                ),
                AchievementStorageMain.ACHIEVEMENT_MINE_SUGAR_CANE.getAchievement()
        ),

        ACHIEVEMENT_MAKE_MAP(
                new AchievementMeta(
                        "buildMap",
                        -1,
                        -7,
                        Item.map
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_PAPER.getAchievement()
        ),

        ACHIEVEMENT_MINE_DRAGON_EGG(
                new AchievementMeta(
                        "mineDragonEgg",
                        5,
                        10,
                        Block.dragonEgg
                ),
                AchievementList.theEnd2
        ),

        ACHIEVEMENT_MINE_WHEAT(
                new AchievementMeta(
                        "mineWheat",
                        1,
                        -5,
                        Item.wheat
                ),
                AchievementList.buildHoe
        ),

        ACHIEVEMENT_LIVE_FALLING(
                new AchievementMeta(
                        "liveFalling",
                        11,
                        -1,
                        Item.feather
                )
        ),

        ACHIEVEMENT_KILL_ZOMBIE(
                new AchievementMeta(
                        "killZombie",
                        14,
                        -5,
                        Item.rottenFlesh
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_BOW.getAchievement()
        ),

        ACHIEVEMENT_KILL_CREEPER(
                new AchievementMeta(
                        "killCreeper",
                        16,
                        -3,
                        Item.gunpowder
                ),
                AchievementStorageMain.ACHIEVEMENT_MAKE_BOW.getAchievement()
        ),

        ACHIEVEMENT_MAKE_TNT(
                new AchievementMeta(
                        "buildTNT",
                        17,
                        -2,
                        Block.tnt
                ),
                AchievementStorageMain.ACHIEVEMENT_KILL_CREEPER.getAchievement()
        ),

        ACHIEVEMENT_GET_SKELETON_TO_KILL_CREEPER(
                new AchievementMeta(
                        "getSkeletonToKillCreeper",
                        18,
                        -3,
                        Item.record13
                ),
                AchievementStorageMain.ACHIEVEMENT_KILL_CREEPER.getAchievement()
        ),

        ACHIEVEMENT_LEVEL_1(
                new AchievementMeta(
                        "level1",
                        19,
                        3,
                        Item.swordWood
                )
        ),

        ACHIEVEMENT_LEVEL_2(
                new AchievementMeta(
                        "level2",
                        21,
                        3,
                        Item.swordWood
                ),
                AchievementStorageMain.ACHIEVEMENT_LEVEL_1.getAchievement()
        ),

        ACHIEVEMENT_LEVEL_3(
                new AchievementMeta(
                        "level3",
                        22,
                        4,
                        Item.swordWood
                ),
                AchievementStorageMain.ACHIEVEMENT_LEVEL_2.getAchievement()
        ),

        ACHIEVEMENT_LEVEL_4(
                new AchievementMeta(
                        "level4",
                        20,
                        4,
                        Item.swordWood
                ),
                AchievementStorageMain.ACHIEVEMENT_LEVEL_3.getAchievement()
        ),

        ACHIEVEMENT_LEVEL_5(
                new AchievementMeta(
                        "level5",
                        18,
                        4,
                        Item.swordStone
                ),
                AchievementStorageMain.ACHIEVEMENT_LEVEL_4.getAchievement()
        ),

        ACHIEVEMENT_LEVEL_10(
                new AchievementMeta(
                        "level10",
                        17,
                        5,
                        Item.swordStone
                ),
                AchievementStorageMain.ACHIEVEMENT_LEVEL_5.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_1(
                new AchievementMeta(
                        "obsidian1",
                        16,
                        12,
                        Block.obsidian
                )
        ),

        ACHIEVEMENT_OBSIDIAN_2(
                new AchievementMeta(
                        "obsidian2",
                        17,
                        12,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_1.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_3(
                new AchievementMeta(
                        "obsidian3",
                        18,
                        11,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_2.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_4(
                new AchievementMeta(
                        "obsidian4",
                        18,
                        10,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_3.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_5(
                new AchievementMeta(
                        "obsidian5",
                        18,
                        9,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_4.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_6(
                new AchievementMeta(
                        "portal6",
                        17,
                        9,
                        Block.portal
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_5.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_7(
                new AchievementMeta(
                        "obsidian7",
                        15,
                        10,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_6.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_8(
                new AchievementMeta(
                        "obsidian8",
                        15,
                        9,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_7.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_9(
                new AchievementMeta(
                        "obsidian9",
                        16,
                        8,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_8.getAchievement()
        ),

        ACHIEVEMENT_OBSIDIAN_10(
                new AchievementMeta(
                        "obsidian10",
                        17,
                        8,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_OBSIDIAN_9.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_1(
                new AchievementMeta(
                        "portal1",
                        16,
                        12,
                        Block.obsidian
                )
        ),

        ACHIEVEMENT_PORTAL_2(
                new AchievementMeta(
                        "portal2",
                        17,
                        12,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_1.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_3(
                new AchievementMeta(
                        "portal3",
                        18,
                        11,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_2.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_4(
                new AchievementMeta(
                        "portal4",
                        18,
                        10,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_3.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_5(
                new AchievementMeta(
                        "portal5",
                        18,
                        9,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_4.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_6(
                new AchievementMeta(
                        "portal6",
                        15,
                        11,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_5.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_7(
                new AchievementMeta(
                        "portal7",
                        15,
                        10,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_6.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_8(
                new AchievementMeta(
                        "portal8",
                        15,
                        9,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_7.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_9(
                new AchievementMeta(
                        "portal9",
                        16,
                        8,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_8.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_10(
                new AchievementMeta(
                        "portal10",
                        17,
                        8,
                        Block.obsidian
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_9.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_11(
                new AchievementMeta(
                        "portal1",
                        16,
                        11,
                        Block.portal
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_10.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_12(
                new AchievementMeta(
                        "portal2",
                        16,
                        10,
                        Block.portal
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_11.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_13(
                new AchievementMeta(
                        "portal3",
                        16,
                        9,
                        Block.portal
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_12.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_14(
                new AchievementMeta(
                        "portal4",
                        17,
                        11,
                        Block.portal
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_13.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_15(
                new AchievementMeta(
                        "portal5",
                        17,
                        10,
                        Block.portal
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_14.getAchievement()
        ),

        ACHIEVEMENT_PORTAL_16(
                new AchievementMeta(
                        "portal6",
                        17,
                        9,
                        Block.portal
                ),
                AchievementStorageMain.ACHIEVEMENT_PORTAL_15.getAchievement()
        );

        Achievement achievement;
        private final AchievementMeta achievementMeta;
        private final Achievement dependencyAchievement;

        AchievementStorageMain(final AchievementMeta achievementMeta) {
            this(
                    achievementMeta,
                    null
            );
        }

        AchievementStorageMain(final AchievementMeta achievementMeta, final Achievement dependencyAchievement) {
            this.achievementMeta = achievementMeta;
            this.dependencyAchievement = dependencyAchievement;
        }

        @Override
        public void registerAchievement() {
            if (achievement == null) {
                achievement = new Achievement(
                        MoarAchievements.moarConfiguration.getAchievementID(getAchievementMeta()),
                        getAchievementMeta().getAchievementDescription(),
                        getAchievementMeta().getDisplayColumn(),
                        getAchievementMeta().getDisplayRow(),
                        getAchievementMeta().getItemStack(),
                        dependencyAchievement
                );
                achievement.registerAchievement();
            }
        }

        @Override
        public Achievement getAchievement() {
            return achievement;
        }

        @Override
        public AchievementMeta getAchievementMeta() {
            return achievementMeta;
        }

        @Override
        public Achievement getParentAchievement() {
            return dependencyAchievement;
        }

        @Override
        public AchievementPage getAchievementPage() {
            return null;//TODO//FIXME
        }

    }

    enum AchievementStorageDeath implements AchievementStorage {

        ACHIEVEMENT_KILLED_BY_ANY(
                new AchievementMeta(
                        "killedByAny",
                        0,
                        0,
                        Item.bone
                )
        ),

        ACHIEVEMENT_KILLED_BY_CREEPER(
                new AchievementMeta(
                        "killedByCreeper",
                        -2,
                        0,
                        Block.tnt
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_ENDERMAN(
                new AchievementMeta(
                        "killedByEnderman",
                        2,
                        0,
                        Block.whiteStone
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_ANVIL(
                new AchievementMeta(
                        "killedByAnvil",
                        0,
                        -1,
                        Block.anvil
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_WALL(
                new AchievementMeta(
                        "killedByWall",
                        1,
                        -1,
                        Block.gravel
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_FLAME(
                new AchievementMeta(
                        "killedByFlame",
                        -1,
                        -1,
                        Item.fireballCharge
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_FIRE(
                new AchievementMeta(
                        "killedByFire",
                        2,
                        -1,
                        Block.fire
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_BLAZE(
                new AchievementMeta(
                        "killedByBlaze",
                        -2,
                        -1,
                        Item.blazeRod
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_GHAST(
                new AchievementMeta(
                        "killedByGhast",
                        0,
                        -2,
                        Item.ghastTear
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_FALL(
                new AchievementMeta(
                        "killedByFall",
                        1,
                        -2,
                        Item.brick
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_FIRE_DISPENSER(
                new AchievementMeta(
                        "killedByFireDispenser",
                        -1,
                        -2,
                        Block.dispenser
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_ARROW_DISPENSER(
                new AchievementMeta(
                        "killedByArrowDispenser",
                        2,
                        -2,
                        Block.dispenser
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_WATER(
                new AchievementMeta(
                        "killedByWater",
                        -2,
                        -2,
                        Block.waterStill
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_IRON(
                new AchievementMeta(
                        "killedByIron",
                        3,
                        -2,
                        Block.blockIron
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_SPACE(
                new AchievementMeta(
                        "killedBySpace",
                        -3,
                        -2,
                        Block.bedrock
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_ZOMBIE(
                new AchievementMeta(
                        "killedByZombie",
                        0,
                        -3,
                        Item.rottenFlesh
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER(
                new AchievementMeta(
                        "killedByZombieVillager",
                        3,
                        -3,
                        Item.emerald
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_ZOMBIE_VILLAGER_CHILD(
                new AchievementMeta(
                        "killedByZombieVillagerChild",
                        -3,
                        -3,
                        Block.plantRed
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_ZOMBIE_SWORD(
                new AchievementMeta(
                        "killedByZombieSword",
                        0,
                        -4,
                        Item.swordIron
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_ZOMBIE_DIAMOND(
                new AchievementMeta(
                        "killedByZombieDiamond",
                        1,
                        -4,
                        Item.diamond
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_SKELETON(
                new AchievementMeta(
                        "killedBySkeleton",
                        -1,
                        -4,
                        Item.arrow
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_SPIDER(
                new AchievementMeta(
                        "killedBySpider",
                        2,
                        -4,
                        Item.spiderEye
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_DRAGON(
                new AchievementMeta(
                        "killedByDragon",
                        -2,
                        -4,
                        Block.endPortalFrame
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_WITHER(
                new AchievementMeta(
                        "killedByWither",
                        3,
                        -4,
                        Block.skull
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_THROWN_POTION(
                new AchievementMeta(
                        "killedByThrownPotion",
                        -3,
                        -4,
                        Item.potion
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_POTION(
                new AchievementMeta(
                        "killedByPotion",
                        0,
                        -5,
                        Item.potion
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_SMALL_SLIME(
                new AchievementMeta(
                        "killedBySmallSlime",
                        1,
                        -5,
                        Item.slimeBall
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_MEDIUM_SLIME(
                new AchievementMeta(
                        "killedByMediumSlime",
                        -1,
                        -5,
                        Item.slimeBall
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_LARGE_SLIME(
                new AchievementMeta(
                        "killedByLargeSlime",
                        2,
                        -5,
                        Item.slimeBall
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_HUGE_SLIME(
                new AchievementMeta(
                        "killedByHugeSlime",
                        -2,
                        -5,
                        Item.slimeBall
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        ),

        ACHIEVEMENT_KILLED_BY_SELF(
                new AchievementMeta(
                        "killedBySelf",
                        0,
                        1,
                        Item.arrow
                ),
                AchievementStorageDeath.ACHIEVEMENT_KILLED_BY_ANY.getAchievement()
        );

        private Achievement achievement;
        private Achievement parentAchievement;
        private final AchievementMeta achievementMeta;

        AchievementStorageDeath(final AchievementMeta achievementMeta) {
            this(
                    achievementMeta,
                    null
            );
        }

        AchievementStorageDeath(final AchievementMeta achievementMeta, final Achievement dependencyAchievement) {
            this.achievementMeta = achievementMeta;
            this.parentAchievement = dependencyAchievement;
        }

        @Override
        public void registerAchievement() {
            if (achievement == null) {
                achievement = new Achievement(
                        MoarAchievements.moarConfiguration.getAchievementID(getAchievementMeta()),
                        getAchievementMeta().getAchievementDescription(),
                        getAchievementMeta().getDisplayColumn(),
                        getAchievementMeta().getDisplayRow(),
                        getAchievementMeta().getItemStack(),
                        parentAchievement
                );
                achievement.registerAchievement();
            }
        }

        @Override
        public Achievement getAchievement() {
            return achievement;
        }

        public AchievementMeta getAchievementMeta() {
            return achievementMeta;
        }

        @Override
        public Achievement getParentAchievement() {
            return parentAchievement;
        }

        @Override
        public AchievementPage getAchievementPage() {
            return AchievementPages.PAGE_DEATH.getAchievementPage();
        }

    }

    enum AchievementStorageLevel implements AchievementStorage {

        ARGUMENT_ACHIEVE1(
                new AchievementMeta(
                        "achieve1",
                        0,
                        0,
                        Item.egg
                )
        ),

        ARGUMENT_ACHIEVE2(
                new AchievementMeta(
                        "achieve2",
                        1,
                        0,
                        Item.bow
                ),
                AchievementStorageLevel.ARGUMENT_ACHIEVE1.getAchievement()
        );

        private final AchievementMeta achievementMeta;
        private Achievement achievement;
        private final Achievement parentAchievement;

        AchievementStorageLevel(final AchievementMeta achievementMeta) {
            this(
                    achievementMeta,
                    null
            );
        }

        AchievementStorageLevel(final AchievementMeta achievementMeta, final Achievement dependencyAchievement) {
            this.achievementMeta = achievementMeta;
            this.parentAchievement = dependencyAchievement;
        }

        @Override
        public void registerAchievement() {
            if (achievement == null) {
                achievement = new Achievement(
                        MoarAchievements.moarConfiguration.getAchievementID(getAchievementMeta()),
                        getAchievementMeta().getAchievementDescription(),
                        getAchievementMeta().getDisplayColumn(),
                        getAchievementMeta().getDisplayRow(),
                        getAchievementMeta().getItemStack(),
                        parentAchievement
                );
                achievement.registerAchievement();
            }
        }

        @Override
        public AchievementMeta getAchievementMeta() {
            return achievementMeta;
        }

        @Override
        public Achievement getAchievement() {
            return achievement;
        }

        @Override
        public Achievement getParentAchievement() {
            return parentAchievement;
        }

        @Override
        public AchievementPage getAchievementPage() {
            return AchievementPages.PAGE_LEVEL.getAchievementPage();
        }

    }

    enum AchievementStorageNether implements AchievementStorage {

        ;

        private final AchievementMeta achievementMeta;
        private Achievement achievement;
        private final Achievement parentAchievement;

        /*
        AchievementStorageNether(final AchievementMeta achievementMeta) {
            this(
                    achievementMeta,
                    null
            );
        }
        */

        AchievementStorageNether(final AchievementMeta achievementMeta, final Achievement dependencyAchievement) {
            this.achievementMeta = achievementMeta;
            this.parentAchievement = dependencyAchievement;
        }

        @Override
        public void registerAchievement() {
            if (achievement == null) {
                achievement = new Achievement(
                        MoarAchievements.moarConfiguration.getAchievementID(getAchievementMeta()),
                        getAchievementMeta().getAchievementDescription(),
                        getAchievementMeta().getDisplayColumn(),
                        getAchievementMeta().getDisplayRow(),
                        getAchievementMeta().getItemStack(),
                        parentAchievement
                );
                achievement.registerAchievement();
            }
        }

        public AchievementMeta getAchievementMeta() {
            return achievementMeta;
        }

        @Override
        public Achievement getAchievement() {
            return achievement;
        }

        @Override
        public Achievement getParentAchievement() {
            return parentAchievement;
        }

        @Override
        public AchievementPage getAchievementPage() {
            return AchievementPages.PAGE_NETHER.getAchievementPage();
        }

    }

    enum AchievementStorageTiered implements AchievementStorage {

        ACHIEVEMENT_MINE_SAND(
                new AchievementMeta(
                        "mineSand",
                        -7,
                        -7,
                        Block.sand
                )
        ),

        ACHIEVEMENT_MAKE_SANDSTONE(
                new AchievementMeta(
                        "buildSandstone",
                        -8,
                        -5,
                        Block.sandStone
                ),
                AchievementStorageTiered.ACHIEVEMENT_MINE_SAND.getAchievement()
        ),

        ACHIEVEMENT_SMELT_GLASS(
                new AchievementMeta(
                        "smeltGlass",
                        -6,
                        -5,
                        Block.glass
                ),
                AchievementStorageTiered.ACHIEVEMENT_MINE_SAND.getAchievement()
        ),

        ACHIEVEMENT_MAKE_GLASS_PANE(
                new AchievementMeta(
                        "buildGlassPane",
                        -6,
                        -3,
                        Block.thinGlass
                ),
                AchievementStorageTiered.ACHIEVEMENT_SMELT_GLASS.getAchievement()
        ),

        ACHIEVEMENT_MINE_SNOW(
                new AchievementMeta(
                        "mineSnow",
                        -5,
                        -7,
                        Item.snowball
                )
        ),

        ACHIEVEMENT_MAKE_SNOW(
                new AchievementMeta(
                        "buildSnow",
                        -5,
                        -5,
                        Block.blockSnow
                ),
                AchievementStorageTiered.ACHIEVEMENT_MINE_SNOW.getAchievement()
        ),

        ACHIEVEMENT_MINE_GLOWSTONE_DUST(
                new AchievementMeta(
                        "mineGlowStoneDust",
                        -3,
                        -7,
                        Item.glowstone
                )
        ),

        ACHIEVEMENT_MAKE_GLOWSTONE(
                new AchievementMeta(
                        "buildGlowStone",
                        -3,
                        -5,
                        Block.glowStone
                ),
                AchievementStorageTiered.ACHIEVEMENT_MINE_GLOWSTONE_DUST.getAchievement()
        ),

        ACHIEVEMENT_MINE_MUSHROOM_RED(
                new AchievementMeta(
                        "mineMushroomRed",
                        0,
                        -7,
                        Block.mushroomRed
                )
        ),

        ACHIEVEMENT_MINE_MUSHROOM_BROWN(
                new AchievementMeta(
                        "mineMushroomBrown",
                        -2,
                        -7,
                        Block.mushroomBrown
                )
        ),

        ACHIEVEMENT_MAKE_MUSHROOM_STEW(
                new AchievementMeta(
                        "makeMushroomStew",
                        -1,
                        -5,
                        Item.bowlSoup
                )
        ),

        ACHIEVEMENT_EAT_MUSHROOM_STEW(
                new AchievementMeta(
                        "eatMushroomStew",
                        -1,
                        -3,
                        Item.bowlEmpty
                ),
                AchievementStorageTiered.ACHIEVEMENT_MAKE_MUSHROOM_STEW.getAchievement()
        ),

        ACHIEVEMENT_MINE_CLAY(
                new AchievementMeta(
                        "mineClay",
                        1,
                        -7,
                        Item.clay
                )
        );

        private final AchievementMeta achievementMeta;
        private Achievement achievement;
        private final Achievement parentAchievement;

        AchievementStorageTiered(final AchievementMeta achievementMeta) {
            this(
                    achievementMeta,
                    null
            );
        }

        AchievementStorageTiered(final AchievementMeta achievementMeta, final Achievement dependencyAchievement) {
            this.achievementMeta = achievementMeta;
            this.parentAchievement = dependencyAchievement;
        }

        @Override
        public void registerAchievement() {
            if (achievement == null) {
                achievement = new Achievement(
                        MoarAchievements.moarConfiguration.getAchievementID(getAchievementMeta()),
                        getAchievementMeta().getAchievementDescription(),
                        getAchievementMeta().getDisplayColumn(),
                        getAchievementMeta().getDisplayRow(),
                        getAchievementMeta().getItemStack(),
                        parentAchievement
                );
                achievement.registerAchievement();
            }
        }

        public AchievementMeta getAchievementMeta() {
            return achievementMeta;
        }

        @Override
        public Achievement getAchievement() {
            return achievement;
        }

        @Override
        public Achievement getParentAchievement() {
            return parentAchievement;
        }

        @Override
        public AchievementPage getAchievementPage() {
            return AchievementPages.PAGE_TIERED.getAchievementPage();
        }

    }

}
