package org.slave.minecraft.moarachievements.common;

import net.minecraftforge.common.Configuration;

import java.io.File;

/**
 * Created by Master801 on 12/20/2016 at 3:14 PM.
 *
 * @author Master801
 */
public final class MoarConfiguration {

    private static final String CATEGORY_ACHIEVEMENT_ID = "achievementIds";

    private Configuration configuration;

    private int itemIdAchievementGetter;

    private int achievementIdMakeShovel;
    private int achievementIdMakeAxe;
    private int achievementIdMakeIronPickaxe;
    private int achievementIdMakeGoldPickaxe;
    private int achievementIdMakeDiamondPickaxe;
    private int achievementIdMineRedstone;
    private int achievementIdMakeDispenser;
    private int achievementIdMakeNoteBlock;
    private int achievementIdMakePiston;
    private int achievementIdMakeStickyPiston;
    private int achievementIdMakeRedstoneTorch;
    private int achievementIdMakeRedstoneRepeater;
    private int achievementIdMakeClock;
    private int achievementIdMakeJukebox;
    private int achievementIdMakeCompass;
    private int achievementIdCollectRedApple;
    private int achievementIdMakeGoldenApple;
    private int achievementIdMakeCookie;
    private int achievementIdMakeChest;
    private int achievementIdMineCoal;
    private int achievementIdSmeltCobblestone;
    private int achievementIdMakeFlintAndIron;
    private int achievementIdMakeShears;
    private int achievementIdCollectWool;
    private int achievementIdMakeBed;
    private int achievementIdEnterCave;
    private int achievementIdKillSpider;
    private int achievementIdKillSkeleton;
    private int achievementIdKillSlime;
    private int achievementIdKillEnderman;
    private int achievementIdKillPassiveMobForMeat;
    private int achievementIdMakeBow;
    private int achievementIdEatBacon;
    private int achievementIdCollectEgg;
    private int achievementIdMineDirt;
    private int achievementIdMineCobblestone;
    private int achievementIdMineCactus;
    private int achievementIdMineSoulSand;
    private int achievementIdMineNetherWart;
    private int achievementIdMineNetherrack;
    private int achievementIdMakeBrewingStand;
    private int achievementIdMineSugarCane;
    private int achievementIdMakePaper;
    private int achievementIdMakeMap;
    private int achievementIdMineDragonEgg;
    private int achievementIdMineWheat;
    private int achievementIdLiveFalling;
    private int achievementIdKillZombie;
    private int achievementIdKillCreeper;
    private int achievementIdMakeTnt;
    private int achievementIdGetSkeletonToKillCreeper;
    private int achievementIdLevel1;
    private int achievementIdLevel2;
    private int achievementIdLevel3;
    private int achievementIdLevel4;
    private int achievementIdLevel5;
    private int achievementIdLevel10;
    private int achievementIdObsidian1;
    private int achievementIdObsidian2;
    private int achievementIdObsidian3;
    private int achievementIdObsidian4;
    private int achievementIdObsidian5;
    private int achievementIdObsidian6;
    private int achievementIdObsidian7;
    private int achievementIdObsidian8;
    private int achievementIdObsidian9;
    private int achievementIdObsidian10;
    private int achievementIdPortal1;
    private int achievementIdPortal2;
    private int achievementIdPortal3;
    private int achievementIdPortal4;
    private int achievementIdPortal5;
    private int achievementIdPortal6;
    private int achievementIdPortal7;
    private int achievementIdPortal8;
    private int achievementIdPortal9;
    private int achievementIdPortal10;
    private int achievementIdPortal11;
    private int achievementIdPortal12;
    private int achievementIdPortal13;
    private int achievementIdPortal14;
    private int achievementIdPortal15;
    private int achievementIdPortal16;

    //Tiered
    private int achievementIdMineSand;
    private int achievementIdMakeSandstone;
    private int achievementIdSmeltGlass;
    private int achievementIdMakeGlassPane;
    private int achievementIdMineSnow;
    private int achievementIdMakeSnow;
    private int achievementIdMineGlowstoneDust;
    private int achievementIdMakeGlowstone;
    private int achievementIdMineMushroomRed;
    private int achievementIdMineMushroomBrown;
    private int achievementIdMakeMushroomStew;
    private int achievementIdEatMushroomStew;
    private int achievementIdMineClay;

    //Level
    private int achievementIdAchieve1;
    private int achievementIdAchieve2;

    //Death

    private int achievementIdKilledByAny;
    private int achievementIdKilledByCreeper;
    private int achievementIdKilledByEnderman;
    private int achievementIdKilledByAnvil;
    private int achievementIdKilledByWall;
    private int achievementIdKilledByFlame;
    private int achievementIdKilledByFire;
    private int achievementIdKilledByBlaze;
    private int achievementIdKilledByGhast;
    private int achievementIdKilledByFall;
    private int achievementIdKilledByFireDispenser;
    private int achievementIdKilledByArrowDispenser;
    private int achievementIdKilledByWater;
    private int achievementIdKilledByIron;
    private int achievementIdKilledBySpace;
    private int achievementIdKilledByZombie;
    private int achievementIdKilledByZombieVillager;
    private int achievementIdKilledByZombieVillagerChild;
    private int achievementIdKilledByZombieSword;
    private int achievementIdKilledByZombieDiamond;
    private int achievementIdKilledBySkeleton;
    private int achievementIdKilledBySpider;
    private int achievementIdKilledByDragon;
    private int achievementIdKilledByWither;
    private int achievementIdKilledByThrownPotion;
    private int achievementIdKilledByPotion;
    private int achievementIdKilledBySmallSlime;
    private int achievementIdKilledByMediumSlime;
    private int achievementIdKilledByLargeSlime;
    private int achievementIdKilledByHugeSlime;
    private int achievementIdKilledBySelf;

    public MoarConfiguration() {
        configuration = new Configuration(
                new File(
                        new File(
                                "config"
                        ),
                        "MoarAchievementsRedux.cfg"
                )
        );
    }

    public void loadConfig(final boolean shouldLoad) {
        if (shouldLoad) configuration.load();
        itemIdAchievementGetter = configuration.getItem(
                "achievementGetter",
                4000
        ).getInt();


        achievementIdMakeShovel = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeShovel",
                8000
        ).getInt();
        achievementIdMakeAxe = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeAxe",
                8001
        ).getInt();
        achievementIdMakeIronPickaxe = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeIronPickaxe",
                8002
        ).getInt();
        achievementIdMakeGoldPickaxe = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeGoldPickaxe",
                8003
        ).getInt();
        achievementIdMakeDiamondPickaxe = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeDiamondPickaxe",
                8004
        ).getInt();
        achievementIdMineRedstone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineRedstone",
                8005
        ).getInt();
        achievementIdMakeDispenser = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeDispenser",
                8006
        ).getInt();
        achievementIdMakeNoteBlock = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeNoteBlock",
                8007
        ).getInt();
        achievementIdMakePiston = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakePiston",
                8008
        ).getInt();
        achievementIdMakeStickyPiston = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeStickyPiston",
                8009
        ).getInt();
        achievementIdMakeRedstoneTorch = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeRedstoneTorch",
                8010
        ).getInt();
        achievementIdMakeRedstoneRepeater = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeRedstoneRepeater",
                8011
        ).getInt();
        achievementIdMakeClock = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeClock",
                8012
        ).getInt();
        achievementIdMakeJukebox = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeJukebox",
                8013
        ).getInt();
        achievementIdMakeCompass = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeCompass",
                8014
        ).getInt();
        achievementIdCollectRedApple = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdCollectRedApple",
                8015
        ).getInt();
        achievementIdMakeGoldenApple = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeGoldenApple",
                8016
        ).getInt();
        achievementIdMakeCookie = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeCookie",
                8017
        ).getInt();
        achievementIdMakeChest = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIDMakeChest",
                8018
        ).getInt();
        achievementIdMineCoal = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineCoal",
                8019
        ).getInt();
        achievementIdSmeltCobblestone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdSmeltCobblestone",
                8020
        ).getInt();
        achievementIdMakeFlintAndIron = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeFlintAndIron",
                8021
        ).getInt();
        achievementIdMakeShears = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeShears",
                8022
        ).getInt();
        achievementIdCollectWool = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdCollectWool",
                8023
        ).getInt();
        achievementIdMakeBed = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeBed",
                8024
        ).getInt();
        achievementIdEnterCave = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdEnterCave",
                8025
        ).getInt();
        achievementIdKillSpider = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKillSpider",
                8026
        ).getInt();
        achievementIdKillSkeleton = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKillSkeleton",
                8027
        ).getInt();
        achievementIdKillSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKillSlime",
                8028
        ).getInt();
        achievementIdKillEnderman = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKillEnderman",
                8029
        ).getInt();
        achievementIdKillPassiveMobForMeat = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKillPassiveMobForMeat",
                8030
        ).getInt();
        achievementIdMakeBow = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeBow",
                8031
        ).getInt();
        achievementIdEatBacon = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdEatBacon",
                8032
        ).getInt();
        achievementIdCollectEgg = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdCollectEgg",
                8033
        ).getInt();
        achievementIdMineDirt = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineDirt",
                8034
        ).getInt();
        achievementIdMineCobblestone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineCobblestone",
                8035
        ).getInt();
        achievementIdMineCactus = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineCactus",
                8036
        ).getInt();
        achievementIdMineSoulSand = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineSoulSand",
                8037
        ).getInt();
        achievementIdMineNetherWart = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineNetherWart",
                8038
        ).getInt();
        achievementIdMineNetherrack = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineNetherrack",
                8039
        ).getInt();
        achievementIdMakeBrewingStand = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeBrewingStand",
                8040
        ).getInt();
        achievementIdMineSugarCane = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineSugarCane",
                8041
        ).getInt();
        achievementIdMakePaper = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakePaper",
                8042
        ).getInt();
        achievementIdMakeMap = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeMap",
                8043
        ).getInt();
        achievementIdMineDragonEgg = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineDragonEgg",
                8044
        ).getInt();
        achievementIdMineWheat = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineWheat",
                8045
        ).getInt();
        achievementIdLiveFalling = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdLiveFalling",
                8046
        ).getInt();
        achievementIdKillZombie = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKillZombie",
                8047
        ).getInt();
        achievementIdKillCreeper = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKillCreeper",
                8048
        ).getInt();
        achievementIdMakeTnt = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeTnt",
                8049
        ).getInt();
        achievementIdGetSkeletonToKillCreeper = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdGetSkeletonToKillCreeper",
                8050
        ).getInt();
        achievementIdLevel1 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdLevel1",
                8051
        ).getInt();
        achievementIdLevel2 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdLevel2",
                8052
        ).getInt();
        achievementIdLevel3 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdLevel3",
                8053
        ).getInt();
        achievementIdLevel4 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdLevel4",
                8054
        ).getInt();
        achievementIdLevel5 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdLevel5",
                8055
        ).getInt();
        achievementIdLevel10 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdLevel10",
                8056
        ).getInt();
        achievementIdObsidian1 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian1",
                8057
        ).getInt();
        achievementIdObsidian2 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian2",
                8058
        ).getInt();
        achievementIdObsidian3 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian3",
                8059
        ).getInt();
        achievementIdObsidian4 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian4",
                8060
        ).getInt();
        achievementIdObsidian5 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian5",
                8061
        ).getInt();
        achievementIdObsidian6 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian6",
                8062
        ).getInt();
        achievementIdObsidian7 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian7",
                8063
        ).getInt();
        achievementIdObsidian8 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian8",
                8064
        ).getInt();
        achievementIdObsidian9 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian9",
                8065
        ).getInt();
        achievementIdObsidian10 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdObsidian10",
                8066
        ).getInt();
        achievementIdPortal1 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal1",
                8067
        ).getInt();
        achievementIdPortal2 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal2",
                8068
        ).getInt();
        achievementIdPortal3 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal3",
                8069
        ).getInt();
        achievementIdPortal4 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal4",
                8070
        ).getInt();
        achievementIdPortal5 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal5",
                6071
        ).getInt();
        achievementIdPortal6 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal6",
                8072
        ).getInt();
        achievementIdPortal7 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal7",
                8073
        ).getInt();
        achievementIdPortal8 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal8",
                8074
        ).getInt();
        achievementIdPortal9 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal9",
                8075
        ).getInt();
        achievementIdPortal10 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal10",
                8076
        ).getInt();
        achievementIdPortal11 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal11",
                8077
        ).getInt();
        achievementIdPortal12 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal12",
                8078
        ).getInt();
        achievementIdPortal13 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal13",
                8079
        ).getInt();
        achievementIdPortal14 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal14",
                8080
        ).getInt();
        achievementIdPortal15 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal15",
                8081
        ).getInt();
        achievementIdPortal16 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdPortal16",
                8082
        ).getInt();
        achievementIdMineSand = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineSand",
                8083
        ).getInt();
        achievementIdMakeSandstone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeSandstone",
                8084
        ).getInt();
        achievementIdSmeltGlass = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdSmeltGlass",
                8085
        ).getInt();
        achievementIdMakeGlassPane = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeGlassPane",
                8086
        ).getInt();
        achievementIdMineSnow = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineSnow",
                8087
        ).getInt();
        achievementIdMakeSnow = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeSnow",
                8088
        ).getInt();
        achievementIdMineGlowstoneDust = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineGlowstoneDust",
                8089
        ).getInt();
        achievementIdMakeGlowstone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeGlowstone",
                8090
        ).getInt();
        achievementIdMineMushroomRed = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineMushroomRed",
                8091
        ).getInt();
        achievementIdMineMushroomBrown = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineMushroomBrown",
                8092
        ).getInt();
        achievementIdMakeMushroomStew = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeMushroomStew",
                8093
        ).getInt();
        achievementIdEatMushroomStew = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdEatMushroomStew",
                8094
        ).getInt();
        achievementIdMineClay = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineClay",
                8095
        ).getInt();
        achievementIdAchieve1 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdAchieve1",
                8096
        ).getInt();
        achievementIdAchieve2 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdAchieve2",
                8097
        ).getInt();
        achievementIdKilledByAny = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByAny",
                8098
        ).getInt();
        achievementIdKilledByCreeper = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByCreeper",
                8099
        ).getInt();
        achievementIdKilledByEnderman = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByEnderman",
                8100
        ).getInt();
        achievementIdKilledByAnvil = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByAnvil",
                8101
        ).getInt();
        achievementIdKilledByWall = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByWall",
                8102
        ).getInt();
        achievementIdKilledByFlame = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByFlame",
                8103
        ).getInt();
        achievementIdKilledByFire = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByFire",
                8104
        ).getInt();
        achievementIdKilledByBlaze = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByBlaze",
                8105
        ).getInt();
        achievementIdKilledByGhast = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByGhast",
                8106
        ).getInt();
        achievementIdKilledByFall = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByFall",
                8107
        ).getInt();
        achievementIdKilledByFireDispenser = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByFireDispenser",
                8108
        ).getInt();
        achievementIdKilledByArrowDispenser = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByArrowDispenser",
                8109
        ).getInt();
        achievementIdKilledByWater = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByWater",
                8110
        ).getInt();
        achievementIdKilledByIron = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByIron",
                8111
        ).getInt();
        achievementIdKilledBySpace = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledBySpace",
                8112
        ).getInt();
        achievementIdKilledByZombie = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByZombie",
                8113
        ).getInt();
        achievementIdKilledByZombieVillager = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByZombieVillager",
                8114
        ).getInt();
        achievementIdKilledByZombieVillagerChild = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByZombieVillagerChild",
                8115
        ).getInt();
        achievementIdKilledByZombieSword = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByZombieSword",
                8116
        ).getInt();
        achievementIdKilledByZombieDiamond = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByZombieDiamond",
                8117
        ).getInt();
        achievementIdKilledBySkeleton = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledBySkeleton",
                8118
        ).getInt();
        achievementIdKilledBySpider = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledBySpider",
                8119
        ).getInt();
        achievementIdKilledByDragon = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByDragon",
                8120
        ).getInt();
        achievementIdKilledByWither = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByWither",
                8121
        ).getInt();
        achievementIdKilledByThrownPotion = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByThrownPotion",
                8122
        ).getInt();
        achievementIdKilledByPotion = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByPotion",
                8123
        ).getInt();
        achievementIdKilledBySmallSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledBySmallSlime",
                8124
        ).getInt();
        achievementIdKilledByMediumSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByMediumSlime",
                8125
        ).getInt();
        achievementIdKilledByLargeSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByLargeSlime",
                8126
        ).getInt();
        achievementIdKilledByHugeSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledByHugeSlime",
                8127
        ).getInt();
        achievementIdKilledBySelf = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdKilledBySelf",
                8128
        ).getInt();

        configuration.save();
    }

    public int getItemIdAchievementGetter() {
        return itemIdAchievementGetter;
    }

    public int getAchievementIdMakeShovel() {
        return achievementIdMakeShovel;
    }

    public int getAchievementIdMakeAxe() {
        return achievementIdMakeAxe;
    }

    public int getAchievementIdMakeIronPickaxe() {
        return achievementIdMakeIronPickaxe;
    }

    public int getAchievementIdMakeGoldPickaxe() {
        return achievementIdMakeGoldPickaxe;
    }

    public int getAchievementIdMakeDiamondPickaxe() {
        return achievementIdMakeDiamondPickaxe;
    }

    public int getAchievementIdMineRedstone() {
        return achievementIdMineRedstone;
    }

    public int getAchievementIdMakeDispenser() {
        return achievementIdMakeDispenser;
    }

    public int getAchievementIdMakeNoteBlock() {
        return achievementIdMakeNoteBlock;
    }

    public int getAchievementIdMakePiston() {
        return achievementIdMakePiston;
    }

    public int getAchievementIdMakeStickyPiston() {
        return achievementIdMakeStickyPiston;
    }

    public int getAchievementIdMakeRedstoneTorch() {
        return achievementIdMakeRedstoneTorch;
    }

    public int getAchievementIdMakeRedstoneRepeater() {
        return achievementIdMakeRedstoneRepeater;
    }

    public int getAchievementIdMakeClock() {
        return achievementIdMakeClock;
    }

    public int getAchievementIdMakeJukebox() {
        return achievementIdMakeJukebox;
    }

    public int getAchievementIdMakeCompass() {
        return achievementIdMakeCompass;
    }

    public int getAchievementIdCollectRedApple() {
        return achievementIdCollectRedApple;
    }

    public int getAchievementIdMakeGoldenApple() {
        return achievementIdMakeGoldenApple;
    }

    public int getAchievementIdMakeCookie() {
        return achievementIdMakeCookie;
    }

    public int getAchievementIdMakeChest() {
        return achievementIdMakeChest;
    }

    public int getAchievementIdMineCoal() {
        return achievementIdMineCoal;
    }

    public int getAchievementSmeltCobblestone() {
        return achievementIdSmeltCobblestone;
    }

    public int getAchievementIdMakeFlintAndIron() {
        return achievementIdMakeFlintAndIron;
    }

    public int getAchievementIdMakeShears() {
        return achievementIdMakeShears;
    }

    public int getAchievementIdCollectWool() {
        return achievementIdCollectWool;
    }

    public int getAchievementIdMakeBed() {
        return achievementIdMakeBed;
    }

    public int getAchievementIdEnterCave() {
        return achievementIdEnterCave;
    }

    public int getAchievementIdKillSpider() {
        return achievementIdKillSpider;
    }

    public int getAchievementIdKillSkeleton() {
        return achievementIdKillSkeleton;
    }

    public int getAchievementIdKillSlime() {
        return achievementIdKillSlime;
    }

    public int getAchievementIdKillEnderman() {
        return achievementIdKillEnderman;
    }

    public int getAchievementIdKillPassiveMobForMeat() {
        return achievementIdKillPassiveMobForMeat;
    }

    public int getAchievementIdMakeBow() {
        return achievementIdMakeBow;
    }

    public int getAchievementIdEatBacon() {
        return achievementIdEatBacon;
    }

    public int getAchievementIdCollectEgg() {
        return achievementIdCollectEgg;
    }

    public int getAchievementIdMineDirt() {
        return achievementIdMineDirt;
    }

    public int getAchievementIdMineCobblestone() {
        return achievementIdMineCobblestone;
    }

    public int getAchievementIdMineCactus() {
        return achievementIdMineCactus;
    }

    public int getAchievementIdMineSoulSand() {
        return achievementIdMineSoulSand;
    }

    public int getAchievementIdMineNetherWart() {
        return achievementIdMineNetherWart;
    }

    public int getAchievementIdMineNetherrack() {
        return achievementIdMineNetherrack;
    }

    public int getAchievementIdMakeBrewingStand() {
        return achievementIdMakeBrewingStand;
    }

    public int getAchievementIdMineSugarCane() {
        return achievementIdMineSugarCane;
    }

    public int getAchievementIdMakePaper() {
        return achievementIdMakePaper;
    }

    public int getAchievementIdMakeMap() {
        return achievementIdMakeMap;
    }

    public int getAchievementIdMineDragonEgg() {
        return achievementIdMineDragonEgg;
    }

    public int getAchievementIdMineWheat() {
        return achievementIdMineWheat;
    }

    public int getAchievementIdLiveFalling() {
        return achievementIdLiveFalling;
    }

    public int getAchievementIdKillZombie() {
        return achievementIdKillZombie;
    }

    public int getAchievementIdKillCreeper() {
        return achievementIdKillCreeper;
    }

    public int getAchievementIdMakeTnt() {
        return achievementIdMakeTnt;
    }

    public int getAchievementIdGetSkeletonToKillCreeper() {
        return achievementIdGetSkeletonToKillCreeper;
    }

    public int getAchievementIdLevel1() {
        return achievementIdLevel1;
    }

    public int getAchievementIdLevel2() {
        return achievementIdLevel2;
    }

    public int getAchievementIdLevel3() {
        return achievementIdLevel3;
    }

    public int getAchievementIdLevel4() {
        return achievementIdLevel4;
    }

    public int getAchievementIdLevel5() {
        return achievementIdLevel5;
    }

    public int getAchievementIdLevel10() {
        return achievementIdLevel10;
    }

    public int getAchievementIdObsidian1() {
        return achievementIdObsidian1;
    }

    public int getAchievementIdObsidian2() {
        return achievementIdObsidian2;
    }

    public int getAchievementIdObsidian3() {
        return achievementIdObsidian3;
    }

    public int getAchievementIdObsidian4() {
        return achievementIdObsidian4;
    }

    public int getAchievementIdObsidian5() {
        return achievementIdObsidian5;
    }

    public int getAchievementIdObsidian6() {
        return achievementIdObsidian6;
    }

    public int getAchievementIdObsidian7() {
        return achievementIdObsidian7;
    }

    public int getAchievementIdObsidian8() {
        return achievementIdObsidian8;
    }

    public int getAchievementIdObsidian9() {
        return achievementIdObsidian9;
    }

    public int getAchievementIdObsidian10() {
        return achievementIdObsidian10;
    }

    public int getAchievementIdPortal1() {
        return achievementIdPortal1;
    }

    public int getAchievementIdPortal2() {
        return achievementIdPortal2;
    }

    public int getAchievementIdPortal3() {
        return achievementIdPortal3;
    }

    public int getAchievementIdPortal4() {
        return achievementIdPortal4;
    }

    public int getAchievementIdPortal5() {
        return achievementIdPortal5;
    }

    public int getAchievementIdPortal6() {
        return achievementIdPortal6;
    }

    public int getAchievementIdPortal7() {
        return achievementIdPortal7;
    }

    public int getAchievementIdPortal8() {
        return achievementIdPortal8;
    }

    public int getAchievementIdPortal9() {
        return achievementIdPortal9;
    }

    public int getAchievementIdPortal10() {
        return achievementIdPortal10;
    }

    public int getAchievementIdPortal11() {
        return achievementIdPortal11;
    }

    public int getAchievementIdPortal12() {
        return achievementIdPortal12;
    }

    public int getAchievementIdPortal13() {
        return achievementIdPortal13;
    }

    public int getAchievementIdPortal14() {
        return achievementIdPortal14;
    }

    public int getAchievementIdPortal15() {
        return achievementIdPortal15;
    }

    public int getAchievementIdPortal16() {
        return achievementIdPortal16;
    }

    //Tiered

    public int getAchievementIdMineSand() {
        return achievementIdMineSand;
    }

    public int getAchievementIdMakeSandstone() {
        return achievementIdMakeSandstone;
    }

    public int getAchievementIdSmeltGlass() {
        return achievementIdSmeltGlass;
    }

    public int getAchievementIdMakeGlassPane() {
        return achievementIdMakeGlassPane;
    }

    public int getAchievementIdMineSnow() {
        return achievementIdMineSnow;
    }

    public int getAchievementIdMakeSnow() {
        return achievementIdMakeSnow;
    }

    public int getAchievementIdMineGlowstoneDust() {
        return achievementIdMineGlowstoneDust;
    }

    public int getAchievementIdMakeGlowstone() {
        return achievementIdMakeGlowstone;
    }

    public int getAchievementIdMineMushroomRed() {
        return achievementIdMineMushroomRed;
    }

    public int getAchievementIdMineMushroomBrown() {
        return achievementIdMineMushroomBrown;
    }

    public int getAchievementIdMakeMushroomStew() {
        return achievementIdMakeMushroomStew;
    }

    public int getAchievementIdEatMushroomStew() {
        return achievementIdEatMushroomStew;
    }

    public int getAchievementIdMineClay() {
        return achievementIdMineClay;
    }

    //Level

    public int getAchievementIdAchieve1() {
        return achievementIdAchieve1;
    }

    public int getAchievementIdAchieve2() {
        return achievementIdAchieve2;
    }

    //Death

    public int getAchievementIdKilledByAny() {
        return achievementIdKilledByAny;
    }

    public int getAchievementIdKilledByCreeper() {
        return achievementIdKilledByCreeper;
    }

    public int getAchievementIdKilledByEnderman() {
        return achievementIdKilledByEnderman;
    }

    public int getAchievementIdKilledByAnvil() {
        return achievementIdKilledByAnvil;
    }

    public int getAchievementIdKilledByWall() {
        return achievementIdKilledByWall;
    }

    public int getAchievementIdKilledByFlame() {
        return achievementIdKilledByFlame;
    }

    public int getAchievementIdKilledByFire() {
        return achievementIdKilledByFire;
    }

    public int getAchievementIdKilledByBlaze() {
        return achievementIdKilledByBlaze;
    }

    public int getAchievementIdKilledByGhast() {
        return achievementIdKilledByGhast;
    }

    public int getAchievementIdKilledByFall() {
        return achievementIdKilledByFall;
    }

    public int getAchievementIdKilledByFireDispenser() {
        return achievementIdKilledByFireDispenser;
    }

    public int getAchievementIdKilledByArrowDispenser() {
        return achievementIdKilledByArrowDispenser;
    }

    public int getAchievementIdKilledByWater() {
        return achievementIdKilledByWater;
    }

    public int getAchievementIdKilledByIron() {
        return achievementIdKilledByIron;
    }

    public int getAchievementIdKilledBySpace() {
        return achievementIdKilledBySpace;
    }

    public int getAchievementIdKilledByZombie() {
        return achievementIdKilledByZombie;
    }

    public int getAchievementIdKilledByZombieVillager() {
        return achievementIdKilledByZombieVillager;
    }

    public int getAchievementIdKilledByZombieVillagerChild() {
        return achievementIdKilledByZombieVillagerChild;
    }

    public int getAchievementIdKilledByZombieSword() {
        return achievementIdKilledByZombieSword;
    }

    public int getAchievementIdKilledByZombieDiamond() {
        return achievementIdKilledByZombieDiamond;
    }

    public int getAchievementIdKilledBySkeleton() {
        return achievementIdKilledBySkeleton;
    }

    public int getAchievementIdKilledBySpider() {
        return achievementIdKilledBySpider;
    }

    public int getAchievementIdKilledByDragon() {
        return achievementIdKilledByDragon;
    }

    public int getAchievementIdKilledByWither() {
        return achievementIdKilledByWither;
    }

    public int getAchievementIdKilledByThrownPotion() {
        return achievementIdKilledByThrownPotion;
    }

    public int getAchievementIdKilledByPotion() {
        return achievementIdKilledByPotion;
    }

    public int getAchievementIdKilledBySmallSlime() {
        return achievementIdKilledBySmallSlime;
    }

    public int getAchievementIdKilledByMediumSlime() {
        return achievementIdKilledByMediumSlime;
    }

    public int getAchievementIdKilledByLargeSlime() {
        return achievementIdKilledByLargeSlime;
    }

    public int getAchievementIdKilledByHugeSlime() {
        return achievementIdKilledByHugeSlime;
    }

    public int getAchievementIdKilledBySelf() {
        return achievementIdKilledBySelf;
    }

}
