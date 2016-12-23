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

    private static int fallBackAchievementId = 1000;

    private Configuration configuration;

    private int achievementGetterItemId;

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
    private int achievementIDMakeChest;
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
        achievementGetterItemId = configuration.getItem(
                "achievementGetter",
                4000
        ).getInt(
                8000
        );


        achievementIdMakeShovel = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeShovel",
                6000
        ).getInt();
        achievementIdMakeAxe = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeAxe",
                6000
        ).getInt();
        achievementIdMakeIronPickaxe = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeIronPickaxe",
                6000
        ).getInt();
        achievementIdMakeGoldPickaxe = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeGoldPickaxe",
                6000
        ).getInt();
        achievementIdMakeDiamondPickaxe = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMakeDiamondPickaxe",
                6000
        ).getInt();
        achievementIdMineRedstone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "achievementIdMineRedstone",
                6000
        ).getInt();
        achievementIdMakeDispenser = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeNoteBlock = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakePiston = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeStickyPiston = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeRedstoneTorch = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeRedstoneRepeater = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeClock = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeJukebox = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeCompass = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdCollectRedApple = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeGoldenApple = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeCookie = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIDMakeChest = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineCoal = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdSmeltCobblestone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeFlintAndIron = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeShears = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdCollectWool = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeBed = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdEnterCave = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKillSpider = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKillSkeleton = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKillSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKillEnderman = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKillPassiveMobForMeat = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeBow = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdEatBacon = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdCollectEgg = configuration.get(
                "",
                "",
                6000
        ).getInt();
        achievementIdMineDirt = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineCobblestone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineCactus = configuration.get(
                "",
                "",
                6000
        ).getInt();
        achievementIdMineSoulSand = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineNetherWart = configuration.get(
                "",
                "",
                6000
        ).getInt();
        achievementIdMineNetherrack = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeBrewingStand = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineSugarCane = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakePaper = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeMap = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineDragonEgg = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineWheat = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdLiveFalling = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKillZombie = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKillCreeper = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeTnt = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdGetSkeletonToKillCreeper = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdLevel1 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdLevel2 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdLevel3 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdLevel4 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdLevel5 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdLevel10 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian1 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian2 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian3 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian4 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian5 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian6 = configuration.get(
                "",
                "",
                6000
        ).getInt();
        achievementIdObsidian7 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian8 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian9 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdObsidian10 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal1 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal2 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal3 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal4 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal5 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal6 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal7 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal8 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal9 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal10 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal11 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal12 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal13 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal14 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal15 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdPortal16 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineSand = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeSandstone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdSmeltGlass = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeGlassPane = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineSnow = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeSnow = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineGlowstoneDust = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeGlowstone = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineMushroomRed = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineMushroomBrown = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMakeMushroomStew = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdEatMushroomStew = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdMineClay = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdAchieve1 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdAchieve2 = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByAny = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByCreeper = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByEnderman = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByAnvil = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByWall = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByFlame = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByFire = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByBlaze = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByGhast = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByFall = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByFireDispenser = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByArrowDispenser = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByWater = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByIron = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledBySpace = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByZombie = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByZombieVillager = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByZombieVillagerChild = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByZombieSword = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByZombieDiamond = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledBySkeleton = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledBySpider = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByDragon = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByWither = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByThrownPotion = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByPotion = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledBySmallSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByMediumSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByLargeSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledByHugeSlime = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();
        achievementIdKilledBySelf = configuration.get(
                MoarConfiguration.CATEGORY_ACHIEVEMENT_ID,
                "",
                6000
        ).getInt();


        configuration.save();
    }

    public int getAchievementGetterItemId() {
        return achievementGetterItemId;
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

    public int getAchievementIdMakeNoteBlock(){
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
        return achievementIDMakeChest;
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
