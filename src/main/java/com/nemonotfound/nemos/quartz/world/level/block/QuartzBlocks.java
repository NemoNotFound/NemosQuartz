package com.nemonotfound.nemos.quartz.world.level.block;

import com.nemonotfound.nemos.quartz.world.level.block.pot.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;
import static net.minecraft.world.level.block.Blocks.buttonProperties;
import static net.minecraft.world.level.block.Blocks.flowerPotProperties;

public class QuartzBlocks {

    public static final Block QUARTZ_PRESSURE_PLATE = registerPressurePlate("quartz_pressure_plate", Blocks.QUARTZ_BLOCK);
    public static final Block QUARTZ_BUTTON = registerButton("quartz_button");
    public static final Block CRACKED_QUARTZ_BRICKS = register("cracked_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS));
    public static final Block CRACKED_QUARTZ_BRICK_STAIRS = registerStairs("cracked_quartz_brick_stairs", Blocks.QUARTZ_BRICKS);
    public static final Block CRACKED_QUARTZ_BRICK_SLAB = registerSlab("cracked_quartz_brick_slab", Blocks.QUARTZ_BRICKS);
    public static final Block CRACKED_QUARTZ_BRICK_WALL = registerWall("cracked_quartz_brick_wall", Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_STAIRS = registerStairs("quartz_brick_stairs", Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_SLAB = registerSlab("quartz_brick_slab", Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_WALL = registerWall("quartz_brick_wall", Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_FLOWER_POT = register("quartz_flower_pot", (properties -> new QuartzFlowerPot(Blocks.AIR, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_TORCHFLOWER = register("quartz_potted_torchflower", (properties -> new QuartzFlowerPot(Blocks.TORCHFLOWER, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_OAK_SAPLING = register("quartz_potted_oak_sapling", (properties -> new QuartzFlowerPot(Blocks.OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_SPRUCE_SAPLING = register("quartz_potted_spruce_sapling", (properties -> new QuartzFlowerPot(Blocks.SPRUCE_SAPLING, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_BIRCH_SAPLING = register("quartz_potted_birch_sapling", (properties -> new QuartzFlowerPot(Blocks.BIRCH_SAPLING, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_JUNGLE_SAPLING = register("quartz_potted_jungle_sapling", (properties -> new QuartzFlowerPot(Blocks.JUNGLE_SAPLING, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_ACACIA_SAPLING = register("quartz_potted_acacia_sapling", (properties -> new QuartzFlowerPot(Blocks.ACACIA_SAPLING, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_CHERRY_SAPLING = register("quartz_potted_cherry_sapling", (properties -> new QuartzFlowerPot(Blocks.CHERRY_SAPLING, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_DARK_OAK_SAPLING = register("quartz_potted_dark_oak_sapling", (properties -> new QuartzFlowerPot(Blocks.DARK_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_PALE_OAK_SAPLING = register("quartz_potted_pale_oak_sapling", (properties -> new QuartzFlowerPot(Blocks.PALE_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_MANGROVE_PROPAGULE = register("quartz_potted_mangrove_propagule", (properties -> new QuartzFlowerPot(Blocks.MANGROVE_PROPAGULE, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_FERN = register("quartz_potted_fern", (properties -> new QuartzFlowerPot(Blocks.FERN, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_DANDELION = register("quartz_potted_dandelion", (properties -> new QuartzFlowerPot(Blocks.DANDELION, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_POPPY = register("quartz_potted_poppy", (properties -> new QuartzFlowerPot(Blocks.POPPY, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_BLUE_ORCHID = register("quartz_potted_blue_orchid", (properties -> new QuartzFlowerPot(Blocks.BLUE_ORCHID, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_ALLIUM = register("quartz_potted_allium", (properties -> new QuartzFlowerPot(Blocks.ALLIUM, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_AZURE_BLUET = register("quartz_potted_azure_bluet", (properties -> new QuartzFlowerPot(Blocks.AZURE_BLUET, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_RED_TULIP = register("quartz_potted_red_tulip", (properties -> new QuartzFlowerPot(Blocks.RED_TULIP, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_ORANGE_TULIP = register("quartz_potted_orange_tulip", (properties -> new QuartzFlowerPot(Blocks.ORANGE_TULIP, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_WHITE_TULIP = register("quartz_potted_white_tulip", (properties -> new QuartzFlowerPot(Blocks.WHITE_TULIP, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_PINK_TULIP = register("quartz_potted_pink_tulip", (properties -> new QuartzFlowerPot(Blocks.PINK_TULIP, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_OXEYE_DAISY = register("quartz_potted_oxeye_daisy", (properties -> new QuartzFlowerPot(Blocks.OXEYE_DAISY, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_CORNFLOWER = register("quartz_potted_cornflower", (properties -> new QuartzFlowerPot(Blocks.CORNFLOWER, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_LILY_OF_THE_VALLEY = register("quartz_potted_lily_of_the_valley", (properties -> new QuartzFlowerPot(Blocks.LILY_OF_THE_VALLEY, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_WITHER_ROSE = register("quartz_potted_wither_rose", (properties -> new QuartzFlowerPot(Blocks.WITHER_ROSE, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_RED_MUSHROOM = register("quartz_potted_red_mushroom", (properties -> new QuartzFlowerPot(Blocks.RED_MUSHROOM, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_BROWN_MUSHROOM = register("quartz_potted_brown_mushroom", (properties -> new QuartzFlowerPot(Blocks.BROWN_MUSHROOM, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_DEAD_BUSH = register("quartz_potted_dead_bush", (properties -> new QuartzFlowerPot(Blocks.DEAD_BUSH, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_CACTUS = register("quartz_potted_cactus", (properties -> new QuartzFlowerPot(Blocks.CACTUS, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_BAMBOO = register("quartz_potted_bamboo", (properties -> new QuartzFlowerPot(Blocks.BAMBOO, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_CRIMSON_FUNGUS = register("quartz_potted_crimson_fungus", (properties -> new QuartzFlowerPot(Blocks.CRIMSON_FUNGUS, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_WARPED_FUNGUS = register("quartz_potted_warped_fungus", (properties -> new QuartzFlowerPot(Blocks.WARPED_FUNGUS, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_CRIMSON_ROOTS = register("quartz_potted_crimson_roots", (properties -> new QuartzFlowerPot(Blocks.CRIMSON_ROOTS, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_WARPED_ROOTS = register("quartz_potted_warped_roots", (properties -> new QuartzFlowerPot(Blocks.WARPED_ROOTS, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_AZALEA = register("quartz_potted_azalea_bush", (properties -> new QuartzFlowerPot(Blocks.AZALEA, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_FLOWERING_AZALEA = register("quartz_potted_flowering_azalea_bush", (properties -> new QuartzFlowerPot(Blocks.FLOWERING_AZALEA, properties)), flowerPotProperties());
    public static final Block QUARTZ_POTTED_OPEN_EYEBLOSSOM = register(
            "quartz_potted_open_eyeblossom",
            (properties -> new QuartzFlowerPot(Blocks.OPEN_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );
    public static final Block QUARTZ_POTTED_CLOSED_EYEBLOSSOM = register(
            "quartz_potted_closed_eyeblossom",
            (properties -> new QuartzFlowerPot(Blocks.CLOSED_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );
    public static final Block ROSE_QUARTZ_BLOCK = register(
            "rose_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block ROSE_QUARTZ_STAIRS = registerStairs("rose_quartz_stairs", ROSE_QUARTZ_BLOCK);
    public static final Block ROSE_QUARTZ_SLAB = register(
            "rose_quartz_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block ROSE_QUARTZ_PRESSURE_PLATE = registerPressurePlate(
            "rose_quartz_pressure_plate", 
            QuartzBlocks.ROSE_QUARTZ_BLOCK
    );
    public static final Block ROSE_QUARTZ_BUTTON = registerButton("rose_quartz_button");
    public static final Block CHISELED_ROSE_QUARTZ_BLOCK = register(
            "chiseled_rose_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block ROSE_QUARTZ_BRICKS = register("rose_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(ROSE_QUARTZ_BLOCK));
    public static final Block ROSE_QUARTZ_BRICK_STAIRS = registerStairs("rose_quartz_brick_stairs", ROSE_QUARTZ_BRICKS);
    public static final Block ROSE_QUARTZ_BRICK_SLAB = registerSlab("rose_quartz_brick_slab", ROSE_QUARTZ_BRICKS);
    public static final Block ROSE_QUARTZ_BRICK_WALL = registerWall("rose_quartz_brick_wall", ROSE_QUARTZ_BRICKS);
    public static final Block CRACKED_ROSE_QUARTZ_BRICKS = register("cracked_rose_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(ROSE_QUARTZ_BRICKS));
    public static final Block CRACKED_ROSE_QUARTZ_BRICK_STAIRS = registerStairs("cracked_rose_quartz_brick_stairs", ROSE_QUARTZ_BRICKS);
    public static final Block CRACKED_ROSE_QUARTZ_BRICK_SLAB = registerSlab("cracked_rose_quartz_brick_slab", ROSE_QUARTZ_BRICKS);
    public static final Block CRACKED_ROSE_QUARTZ_BRICK_WALL = registerWall("cracked_rose_quartz_brick_wall", ROSE_QUARTZ_BRICKS);
    public static final Block ROSE_QUARTZ_PILLAR = register(
            "rose_quartz_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block SMOOTH_ROSE_QUARTZ = register(
            "smooth_rose_quartz",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block SMOOTH_ROSE_QUARTZ_STAIRS = registerStairs("smooth_rose_quartz_stairs", SMOOTH_ROSE_QUARTZ);
    public static final Block SMOOTH_ROSE_QUARTZ_SLAB = registerSlab("smooth_rose_quartz_slab", SMOOTH_ROSE_QUARTZ);
    public static final Block NETHER_ROSE_QUARTZ_ORE = register(
            "nether_rose_quartz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 5), properties),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.NETHER_ORE)
    );
    public static final Block ROSE_QUARTZ_FLOWER_POT = register(
            "rose_quartz_flower_pot",
            (properties -> new RoseQuartzFlowerPot(Blocks.AIR, properties)),
            flowerPotProperties()
    );
    public static final Block ROSE_QUARTZ_POTTED_TORCHFLOWER = register(
            "rose_quartz_potted_torchflower",
            (properties -> new RoseQuartzFlowerPot(Blocks.TORCHFLOWER, properties)),
            flowerPotProperties()
    );
    public static final Block ROSE_QUARTZ_POTTED_OAK_SAPLING = register(
            "rose_quartz_potted_oak_sapling", (properties -> new RoseQuartzFlowerPot(Blocks.OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_SPRUCE_SAPLING = register(
            "rose_quartz_potted_spruce_sapling", (properties -> new RoseQuartzFlowerPot(Blocks.SPRUCE_SAPLING, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_BIRCH_SAPLING = register(
            "rose_quartz_potted_birch_sapling", (properties -> new RoseQuartzFlowerPot(Blocks.BIRCH_SAPLING, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_JUNGLE_SAPLING = register(
            "rose_quartz_potted_jungle_sapling", (properties -> new RoseQuartzFlowerPot(Blocks.JUNGLE_SAPLING, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_ACACIA_SAPLING = register(
            "rose_quartz_potted_acacia_sapling", (properties -> new RoseQuartzFlowerPot(Blocks.ACACIA_SAPLING, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_CHERRY_SAPLING = register(
            "rose_quartz_potted_cherry_sapling", (properties -> new RoseQuartzFlowerPot(Blocks.CHERRY_SAPLING, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING = register(
            "rose_quartz_potted_dark_oak_sapling", (properties -> new RoseQuartzFlowerPot(Blocks.DARK_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING = register(
            "rose_quartz_potted_pale_oak_sapling", (properties -> new RoseQuartzFlowerPot(Blocks.PALE_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE = register(
            "rose_quartz_potted_mangrove_propagule", (properties -> new RoseQuartzFlowerPot(Blocks.MANGROVE_PROPAGULE, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_FERN = register(
            "rose_quartz_potted_fern", (properties -> new RoseQuartzFlowerPot(Blocks.FERN, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_DANDELION = register(
            "rose_quartz_potted_dandelion", (properties -> new RoseQuartzFlowerPot(Blocks.DANDELION, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_POPPY = register(
            "rose_quartz_potted_poppy", (properties -> new RoseQuartzFlowerPot(Blocks.POPPY, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_BLUE_ORCHID = register(
            "rose_quartz_potted_blue_orchid", (properties -> new RoseQuartzFlowerPot(Blocks.BLUE_ORCHID, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_ALLIUM = register(
            "rose_quartz_potted_allium", (properties -> new RoseQuartzFlowerPot(Blocks.ALLIUM, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_AZURE_BLUET = register(
            "rose_quartz_potted_azure_bluet", (properties -> new RoseQuartzFlowerPot(Blocks.AZURE_BLUET, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_RED_TULIP = register(
            "rose_quartz_potted_red_tulip", (properties -> new RoseQuartzFlowerPot(Blocks.RED_TULIP, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_ORANGE_TULIP = register(
            "rose_quartz_potted_orange_tulip", (properties -> new RoseQuartzFlowerPot(Blocks.ORANGE_TULIP, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_WHITE_TULIP = register(
            "rose_quartz_potted_white_tulip", (properties -> new RoseQuartzFlowerPot(Blocks.WHITE_TULIP, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_PINK_TULIP = register(
            "rose_quartz_potted_pink_tulip", (properties -> new RoseQuartzFlowerPot(Blocks.PINK_TULIP, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_OXEYE_DAISY = register(
            "rose_quartz_potted_oxeye_daisy", (properties -> new RoseQuartzFlowerPot(Blocks.OXEYE_DAISY, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_CORNFLOWER = register(
            "rose_quartz_potted_cornflower", (properties -> new RoseQuartzFlowerPot(Blocks.CORNFLOWER, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY = register(
            "rose_quartz_potted_lily_of_the_valley", (properties -> new RoseQuartzFlowerPot(Blocks.LILY_OF_THE_VALLEY, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_WITHER_ROSE = register(
            "rose_quartz_potted_wither_rose", (properties -> new RoseQuartzFlowerPot(Blocks.WITHER_ROSE, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_RED_MUSHROOM = register(
            "rose_quartz_potted_red_mushroom", (properties -> new RoseQuartzFlowerPot(Blocks.RED_MUSHROOM, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_BROWN_MUSHROOM = register(
            "rose_quartz_potted_brown_mushroom", (properties -> new RoseQuartzFlowerPot(Blocks.BROWN_MUSHROOM, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_DEAD_BUSH = register(
            "rose_quartz_potted_dead_bush", (properties -> new RoseQuartzFlowerPot(Blocks.DEAD_BUSH, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_CACTUS = register(
            "rose_quartz_potted_cactus", (properties -> new RoseQuartzFlowerPot(Blocks.CACTUS, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_BAMBOO = register(
            "rose_quartz_potted_bamboo", (properties -> new RoseQuartzFlowerPot(Blocks.BAMBOO, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS = register(
            "rose_quartz_potted_crimson_fungus", (properties -> new RoseQuartzFlowerPot(Blocks.CRIMSON_FUNGUS, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_WARPED_FUNGUS = register(
            "rose_quartz_potted_warped_fungus", (properties -> new RoseQuartzFlowerPot(Blocks.WARPED_FUNGUS, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_CRIMSON_ROOTS = register(
            "rose_quartz_potted_crimson_roots", (properties -> new RoseQuartzFlowerPot(Blocks.CRIMSON_ROOTS, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_WARPED_ROOTS = register(
            "rose_quartz_potted_warped_roots", (properties -> new RoseQuartzFlowerPot(Blocks.WARPED_ROOTS, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_AZALEA = register(
            "rose_quartz_potted_azalea_bush", (properties -> new RoseQuartzFlowerPot(Blocks.AZALEA, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_FLOWERING_AZALEA = register(
            "rose_quartz_potted_flowering_azalea_bush", (properties -> new RoseQuartzFlowerPot(Blocks.FLOWERING_AZALEA, properties)), flowerPotProperties());
    public static final Block ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM = register(
            "rose_quartz_potted_open_eyeblossom",
            (properties -> new RoseQuartzFlowerPot(Blocks.OPEN_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );
    public static final Block ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = register(
            "rose_quartz_potted_closed_eyeblossom",
            (properties -> new RoseQuartzFlowerPot(Blocks.CLOSED_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );

    public static final Block LEMON_QUARTZ_BLOCK = register(
            "lemon_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block LEMON_QUARTZ_STAIRS = registerStairs("lemon_quartz_stairs", LEMON_QUARTZ_BLOCK);
    public static final Block LEMON_QUARTZ_SLAB = register(
            "lemon_quartz_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block LEMON_QUARTZ_PRESSURE_PLATE = registerPressurePlate(
            "lemon_quartz_pressure_plate",
            QuartzBlocks.LEMON_QUARTZ_BLOCK
    );
    public static final Block LEMON_QUARTZ_BUTTON = registerButton("lemon_quartz_button");
    public static final Block CHISELED_LEMON_QUARTZ_BLOCK = register(
            "chiseled_lemon_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block LEMON_QUARTZ_BRICKS = register("lemon_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(LEMON_QUARTZ_BLOCK));
    public static final Block LEMON_QUARTZ_BRICK_STAIRS = registerStairs("lemon_quartz_brick_stairs", LEMON_QUARTZ_BRICKS);
    public static final Block LEMON_QUARTZ_BRICK_SLAB = registerSlab("lemon_quartz_brick_slab", LEMON_QUARTZ_BRICKS);
    public static final Block LEMON_QUARTZ_BRICK_WALL = registerWall("lemon_quartz_brick_wall", LEMON_QUARTZ_BRICKS);
    public static final Block CRACKED_LEMON_QUARTZ_BRICKS = register("cracked_lemon_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(LEMON_QUARTZ_BRICKS));
    public static final Block CRACKED_LEMON_QUARTZ_BRICK_STAIRS = registerStairs("cracked_lemon_quartz_brick_stairs", LEMON_QUARTZ_BRICKS);
    public static final Block CRACKED_LEMON_QUARTZ_BRICK_SLAB = registerSlab("cracked_lemon_quartz_brick_slab", LEMON_QUARTZ_BRICKS);
    public static final Block CRACKED_LEMON_QUARTZ_BRICK_WALL = registerWall("cracked_lemon_quartz_brick_wall", LEMON_QUARTZ_BRICKS);
    public static final Block LEMON_QUARTZ_PILLAR = register(
            "lemon_quartz_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block SMOOTH_LEMON_QUARTZ = register(
            "smooth_lemon_quartz",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block SMOOTH_LEMON_QUARTZ_STAIRS = registerStairs("smooth_lemon_quartz_stairs", SMOOTH_LEMON_QUARTZ);
    public static final Block SMOOTH_LEMON_QUARTZ_SLAB = registerSlab("smooth_lemon_quartz_slab", SMOOTH_LEMON_QUARTZ);
    public static final Block NETHER_LEMON_QUARTZ_ORE = register(
            "nether_lemon_quartz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 5), properties),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.NETHER_ORE)
    );
    public static final Block LEMON_QUARTZ_FLOWER_POT = register(
            "lemon_quartz_flower_pot",
            (properties -> new LemonQuartzFlowerPot(Blocks.AIR, properties)),
            flowerPotProperties()
    );
    public static final Block LEMON_QUARTZ_POTTED_TORCHFLOWER = register(
            "lemon_quartz_potted_torchflower",
            (properties -> new LemonQuartzFlowerPot(Blocks.TORCHFLOWER, properties)),
            flowerPotProperties()
    );
    public static final Block LEMON_QUARTZ_POTTED_OAK_SAPLING = register(
            "lemon_quartz_potted_oak_sapling", (properties -> new LemonQuartzFlowerPot(Blocks.OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_SPRUCE_SAPLING = register(
            "lemon_quartz_potted_spruce_sapling", (properties -> new LemonQuartzFlowerPot(Blocks.SPRUCE_SAPLING, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_BIRCH_SAPLING = register(
            "lemon_quartz_potted_birch_sapling", (properties -> new LemonQuartzFlowerPot(Blocks.BIRCH_SAPLING, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_JUNGLE_SAPLING = register(
            "lemon_quartz_potted_jungle_sapling", (properties -> new LemonQuartzFlowerPot(Blocks.JUNGLE_SAPLING, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_ACACIA_SAPLING = register(
            "lemon_quartz_potted_acacia_sapling", (properties -> new LemonQuartzFlowerPot(Blocks.ACACIA_SAPLING, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_CHERRY_SAPLING = register(
            "lemon_quartz_potted_cherry_sapling", (properties -> new LemonQuartzFlowerPot(Blocks.CHERRY_SAPLING, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_DARK_OAK_SAPLING = register(
            "lemon_quartz_potted_dark_oak_sapling", (properties -> new LemonQuartzFlowerPot(Blocks.DARK_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_PALE_OAK_SAPLING = register(
            "lemon_quartz_potted_pale_oak_sapling", (properties -> new LemonQuartzFlowerPot(Blocks.PALE_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_MANGROVE_PROPAGULE = register(
            "lemon_quartz_potted_mangrove_propagule", (properties -> new LemonQuartzFlowerPot(Blocks.MANGROVE_PROPAGULE, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_FERN = register(
            "lemon_quartz_potted_fern", (properties -> new LemonQuartzFlowerPot(Blocks.FERN, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_DANDELION = register(
            "lemon_quartz_potted_dandelion", (properties -> new LemonQuartzFlowerPot(Blocks.DANDELION, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_POPPY = register(
            "lemon_quartz_potted_poppy", (properties -> new LemonQuartzFlowerPot(Blocks.POPPY, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_BLUE_ORCHID = register(
            "lemon_quartz_potted_blue_orchid", (properties -> new LemonQuartzFlowerPot(Blocks.BLUE_ORCHID, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_ALLIUM = register(
            "lemon_quartz_potted_allium", (properties -> new LemonQuartzFlowerPot(Blocks.ALLIUM, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_AZURE_BLUET = register(
            "lemon_quartz_potted_azure_bluet", (properties -> new LemonQuartzFlowerPot(Blocks.AZURE_BLUET, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_RED_TULIP = register(
            "lemon_quartz_potted_red_tulip", (properties -> new LemonQuartzFlowerPot(Blocks.RED_TULIP, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_ORANGE_TULIP = register(
            "lemon_quartz_potted_orange_tulip", (properties -> new LemonQuartzFlowerPot(Blocks.ORANGE_TULIP, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_WHITE_TULIP = register(
            "lemon_quartz_potted_white_tulip", (properties -> new LemonQuartzFlowerPot(Blocks.WHITE_TULIP, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_PINK_TULIP = register(
            "lemon_quartz_potted_pink_tulip", (properties -> new LemonQuartzFlowerPot(Blocks.PINK_TULIP, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_OXEYE_DAISY = register(
            "lemon_quartz_potted_oxeye_daisy", (properties -> new LemonQuartzFlowerPot(Blocks.OXEYE_DAISY, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_CORNFLOWER = register(
            "lemon_quartz_potted_cornflower", (properties -> new LemonQuartzFlowerPot(Blocks.CORNFLOWER, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_LILY_OF_THE_VALLEY = register(
            "lemon_quartz_potted_lily_of_the_valley", (properties -> new LemonQuartzFlowerPot(Blocks.LILY_OF_THE_VALLEY, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_WITHER_ROSE = register(
            "lemon_quartz_potted_wither_rose", (properties -> new LemonQuartzFlowerPot(Blocks.WITHER_ROSE, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_RED_MUSHROOM = register(
            "lemon_quartz_potted_red_mushroom", (properties -> new LemonQuartzFlowerPot(Blocks.RED_MUSHROOM, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_BROWN_MUSHROOM = register(
            "lemon_quartz_potted_brown_mushroom", (properties -> new LemonQuartzFlowerPot(Blocks.BROWN_MUSHROOM, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_DEAD_BUSH = register(
            "lemon_quartz_potted_dead_bush", (properties -> new LemonQuartzFlowerPot(Blocks.DEAD_BUSH, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_CACTUS = register(
            "lemon_quartz_potted_cactus", (properties -> new LemonQuartzFlowerPot(Blocks.CACTUS, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_BAMBOO = register(
            "lemon_quartz_potted_bamboo", (properties -> new LemonQuartzFlowerPot(Blocks.BAMBOO, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_CRIMSON_FUNGUS = register(
            "lemon_quartz_potted_crimson_fungus", (properties -> new LemonQuartzFlowerPot(Blocks.CRIMSON_FUNGUS, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_WARPED_FUNGUS = register(
            "lemon_quartz_potted_warped_fungus", (properties -> new LemonQuartzFlowerPot(Blocks.WARPED_FUNGUS, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_CRIMSON_ROOTS = register(
            "lemon_quartz_potted_crimson_roots", (properties -> new LemonQuartzFlowerPot(Blocks.CRIMSON_ROOTS, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_WARPED_ROOTS = register(
            "lemon_quartz_potted_warped_roots", (properties -> new LemonQuartzFlowerPot(Blocks.WARPED_ROOTS, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_AZALEA = register(
            "lemon_quartz_potted_azalea_bush", (properties -> new LemonQuartzFlowerPot(Blocks.AZALEA, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_FLOWERING_AZALEA = register(
            "lemon_quartz_potted_flowering_azalea_bush", (properties -> new LemonQuartzFlowerPot(Blocks.FLOWERING_AZALEA, properties)), flowerPotProperties());
    public static final Block LEMON_QUARTZ_POTTED_OPEN_EYEBLOSSOM = register(
            "lemon_quartz_potted_open_eyeblossom",
            (properties -> new LemonQuartzFlowerPot(Blocks.OPEN_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );
    public static final Block LEMON_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = register(
            "lemon_quartz_potted_closed_eyeblossom",
            (properties -> new LemonQuartzFlowerPot(Blocks.CLOSED_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );

    public static final Block GREEN_QUARTZ_BLOCK = register(
            "green_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block GREEN_QUARTZ_STAIRS = registerStairs("green_quartz_stairs", GREEN_QUARTZ_BLOCK);
    public static final Block GREEN_QUARTZ_SLAB = register(
            "green_quartz_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block GREEN_QUARTZ_PRESSURE_PLATE = registerPressurePlate(
            "green_quartz_pressure_plate",
            QuartzBlocks.GREEN_QUARTZ_BLOCK
    );
    public static final Block GREEN_QUARTZ_BUTTON = registerButton("green_quartz_button");
    public static final Block CHISELED_GREEN_QUARTZ_BLOCK = register(
            "chiseled_green_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block GREEN_QUARTZ_BRICKS = register("green_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(GREEN_QUARTZ_BLOCK));
    public static final Block GREEN_QUARTZ_BRICK_STAIRS = registerStairs("green_quartz_brick_stairs", GREEN_QUARTZ_BRICKS);
    public static final Block GREEN_QUARTZ_BRICK_SLAB = registerSlab("green_quartz_brick_slab", GREEN_QUARTZ_BRICKS);
    public static final Block GREEN_QUARTZ_BRICK_WALL = registerWall("green_quartz_brick_wall", GREEN_QUARTZ_BRICKS);
    public static final Block CRACKED_GREEN_QUARTZ_BRICKS = register("cracked_green_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(GREEN_QUARTZ_BRICKS));
    public static final Block CRACKED_GREEN_QUARTZ_BRICK_STAIRS = registerStairs("cracked_green_quartz_brick_stairs", GREEN_QUARTZ_BRICKS);
    public static final Block CRACKED_GREEN_QUARTZ_BRICK_SLAB = registerSlab("cracked_green_quartz_brick_slab", GREEN_QUARTZ_BRICKS);
    public static final Block CRACKED_GREEN_QUARTZ_BRICK_WALL = registerWall("cracked_green_quartz_brick_wall", GREEN_QUARTZ_BRICKS);
    public static final Block GREEN_QUARTZ_PILLAR = register(
            "green_quartz_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block SMOOTH_GREEN_QUARTZ = register(
            "smooth_green_quartz",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block SMOOTH_GREEN_QUARTZ_STAIRS = registerStairs("smooth_green_quartz_stairs", SMOOTH_GREEN_QUARTZ);
    public static final Block SMOOTH_GREEN_QUARTZ_SLAB = registerSlab("smooth_green_quartz_slab", SMOOTH_GREEN_QUARTZ);
    public static final Block NETHER_GREEN_QUARTZ_ORE = register(
            "nether_green_quartz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 5), properties),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.NETHER_ORE)
    );
    public static final Block GREEN_QUARTZ_FLOWER_POT = register(
            "green_quartz_flower_pot",
            (properties -> new GreenQuartzFlowerPot(Blocks.AIR, properties)),
            flowerPotProperties()
    );
    public static final Block GREEN_QUARTZ_POTTED_TORCHFLOWER = register(
            "green_quartz_potted_torchflower",
            (properties -> new GreenQuartzFlowerPot(Blocks.TORCHFLOWER, properties)),
            flowerPotProperties()
    );
    public static final Block GREEN_QUARTZ_POTTED_OAK_SAPLING = register(
            "green_quartz_potted_oak_sapling", (properties -> new GreenQuartzFlowerPot(Blocks.OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_SPRUCE_SAPLING = register(
            "green_quartz_potted_spruce_sapling", (properties -> new GreenQuartzFlowerPot(Blocks.SPRUCE_SAPLING, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_BIRCH_SAPLING = register(
            "green_quartz_potted_birch_sapling", (properties -> new GreenQuartzFlowerPot(Blocks.BIRCH_SAPLING, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_JUNGLE_SAPLING = register(
            "green_quartz_potted_jungle_sapling", (properties -> new GreenQuartzFlowerPot(Blocks.JUNGLE_SAPLING, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_ACACIA_SAPLING = register(
            "green_quartz_potted_acacia_sapling", (properties -> new GreenQuartzFlowerPot(Blocks.ACACIA_SAPLING, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_CHERRY_SAPLING = register(
            "green_quartz_potted_cherry_sapling", (properties -> new GreenQuartzFlowerPot(Blocks.CHERRY_SAPLING, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_DARK_OAK_SAPLING = register(
            "green_quartz_potted_dark_oak_sapling", (properties -> new GreenQuartzFlowerPot(Blocks.DARK_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_PALE_OAK_SAPLING = register(
            "green_quartz_potted_pale_oak_sapling", (properties -> new GreenQuartzFlowerPot(Blocks.PALE_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_MANGROVE_PROPAGULE = register(
            "green_quartz_potted_mangrove_propagule", (properties -> new GreenQuartzFlowerPot(Blocks.MANGROVE_PROPAGULE, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_FERN = register(
            "green_quartz_potted_fern", (properties -> new GreenQuartzFlowerPot(Blocks.FERN, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_DANDELION = register(
            "green_quartz_potted_dandelion", (properties -> new GreenQuartzFlowerPot(Blocks.DANDELION, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_POPPY = register(
            "green_quartz_potted_poppy", (properties -> new GreenQuartzFlowerPot(Blocks.POPPY, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_BLUE_ORCHID = register(
            "green_quartz_potted_blue_orchid", (properties -> new GreenQuartzFlowerPot(Blocks.BLUE_ORCHID, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_ALLIUM = register(
            "green_quartz_potted_allium", (properties -> new GreenQuartzFlowerPot(Blocks.ALLIUM, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_AZURE_BLUET = register(
            "green_quartz_potted_azure_bluet", (properties -> new GreenQuartzFlowerPot(Blocks.AZURE_BLUET, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_RED_TULIP = register(
            "green_quartz_potted_red_tulip", (properties -> new GreenQuartzFlowerPot(Blocks.RED_TULIP, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_ORANGE_TULIP = register(
            "green_quartz_potted_orange_tulip", (properties -> new GreenQuartzFlowerPot(Blocks.ORANGE_TULIP, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_WHITE_TULIP = register(
            "green_quartz_potted_white_tulip", (properties -> new GreenQuartzFlowerPot(Blocks.WHITE_TULIP, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_PINK_TULIP = register(
            "green_quartz_potted_pink_tulip", (properties -> new GreenQuartzFlowerPot(Blocks.PINK_TULIP, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_OXEYE_DAISY = register(
            "green_quartz_potted_oxeye_daisy", (properties -> new GreenQuartzFlowerPot(Blocks.OXEYE_DAISY, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_CORNFLOWER = register(
            "green_quartz_potted_cornflower", (properties -> new GreenQuartzFlowerPot(Blocks.CORNFLOWER, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_LILY_OF_THE_VALLEY = register(
            "green_quartz_potted_lily_of_the_valley", (properties -> new GreenQuartzFlowerPot(Blocks.LILY_OF_THE_VALLEY, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_WITHER_ROSE = register(
            "green_quartz_potted_wither_rose", (properties -> new GreenQuartzFlowerPot(Blocks.WITHER_ROSE, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_RED_MUSHROOM = register(
            "green_quartz_potted_red_mushroom", (properties -> new GreenQuartzFlowerPot(Blocks.RED_MUSHROOM, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_BROWN_MUSHROOM = register(
            "green_quartz_potted_brown_mushroom", (properties -> new GreenQuartzFlowerPot(Blocks.BROWN_MUSHROOM, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_DEAD_BUSH = register(
            "green_quartz_potted_dead_bush", (properties -> new GreenQuartzFlowerPot(Blocks.DEAD_BUSH, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_CACTUS = register(
            "green_quartz_potted_cactus", (properties -> new GreenQuartzFlowerPot(Blocks.CACTUS, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_BAMBOO = register(
            "green_quartz_potted_bamboo", (properties -> new GreenQuartzFlowerPot(Blocks.BAMBOO, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_CRIMSON_FUNGUS = register(
            "green_quartz_potted_crimson_fungus", (properties -> new GreenQuartzFlowerPot(Blocks.CRIMSON_FUNGUS, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_WARPED_FUNGUS = register(
            "green_quartz_potted_warped_fungus", (properties -> new GreenQuartzFlowerPot(Blocks.WARPED_FUNGUS, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_CRIMSON_ROOTS = register(
            "green_quartz_potted_crimson_roots", (properties -> new GreenQuartzFlowerPot(Blocks.CRIMSON_ROOTS, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_WARPED_ROOTS = register(
            "green_quartz_potted_warped_roots", (properties -> new GreenQuartzFlowerPot(Blocks.WARPED_ROOTS, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_AZALEA = register(
            "green_quartz_potted_azalea_bush", (properties -> new GreenQuartzFlowerPot(Blocks.AZALEA, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_FLOWERING_AZALEA = register(
            "green_quartz_potted_flowering_azalea_bush", (properties -> new GreenQuartzFlowerPot(Blocks.FLOWERING_AZALEA, properties)), flowerPotProperties());
    public static final Block GREEN_QUARTZ_POTTED_OPEN_EYEBLOSSOM = register(
            "green_quartz_potted_open_eyeblossom",
            (properties -> new GreenQuartzFlowerPot(Blocks.OPEN_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );
    public static final Block GREEN_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = register(
            "green_quartz_potted_closed_eyeblossom",
            (properties -> new GreenQuartzFlowerPot(Blocks.CLOSED_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );

    public static final Block BLUE_QUARTZ_BLOCK = register(
            "blue_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block BLUE_QUARTZ_STAIRS = registerStairs("blue_quartz_stairs", BLUE_QUARTZ_BLOCK);
    public static final Block BLUE_QUARTZ_SLAB = register(
            "blue_quartz_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block BLUE_QUARTZ_PRESSURE_PLATE = registerPressurePlate(
            "blue_quartz_pressure_plate",
            QuartzBlocks.BLUE_QUARTZ_BLOCK
    );
    public static final Block BLUE_QUARTZ_BUTTON = registerButton("blue_quartz_button");
    public static final Block CHISELED_BLUE_QUARTZ_BLOCK = register(
            "chiseled_blue_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block BLUE_QUARTZ_BRICKS = register("blue_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(BLUE_QUARTZ_BLOCK));
    public static final Block BLUE_QUARTZ_BRICK_STAIRS = registerStairs("blue_quartz_brick_stairs", BLUE_QUARTZ_BRICKS);
    public static final Block BLUE_QUARTZ_BRICK_SLAB = registerSlab("blue_quartz_brick_slab", BLUE_QUARTZ_BRICKS);
    public static final Block BLUE_QUARTZ_BRICK_WALL = registerWall("blue_quartz_brick_wall", BLUE_QUARTZ_BRICKS);
    public static final Block CRACKED_BLUE_QUARTZ_BRICKS = register("cracked_blue_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(BLUE_QUARTZ_BRICKS));
    public static final Block CRACKED_BLUE_QUARTZ_BRICK_STAIRS = registerStairs("cracked_blue_quartz_brick_stairs", BLUE_QUARTZ_BRICKS);
    public static final Block CRACKED_BLUE_QUARTZ_BRICK_SLAB = registerSlab("cracked_blue_quartz_brick_slab", BLUE_QUARTZ_BRICKS);
    public static final Block CRACKED_BLUE_QUARTZ_BRICK_WALL = registerWall("cracked_blue_quartz_brick_wall", BLUE_QUARTZ_BRICKS);
    public static final Block BLUE_QUARTZ_PILLAR = register(
            "blue_quartz_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block SMOOTH_BLUE_QUARTZ = register(
            "smooth_blue_quartz",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block SMOOTH_BLUE_QUARTZ_STAIRS = registerStairs("smooth_blue_quartz_stairs", SMOOTH_BLUE_QUARTZ);
    public static final Block SMOOTH_BLUE_QUARTZ_SLAB = registerSlab("smooth_blue_quartz_slab", SMOOTH_BLUE_QUARTZ);
    public static final Block NETHER_BLUE_QUARTZ_ORE = register(
            "nether_blue_quartz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 5), properties),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.NETHER_ORE)
    );
    public static final Block BLUE_QUARTZ_FLOWER_POT = register(
            "blue_quartz_flower_pot",
            (properties -> new BlueQuartzFlowerPot(Blocks.AIR, properties)),
            flowerPotProperties()
    );
    public static final Block BLUE_QUARTZ_POTTED_TORCHFLOWER = register(
            "blue_quartz_potted_torchflower",
            (properties -> new BlueQuartzFlowerPot(Blocks.TORCHFLOWER, properties)),
            flowerPotProperties()
    );
    public static final Block BLUE_QUARTZ_POTTED_OAK_SAPLING = register(
            "blue_quartz_potted_oak_sapling", (properties -> new BlueQuartzFlowerPot(Blocks.OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_SPRUCE_SAPLING = register(
            "blue_quartz_potted_spruce_sapling", (properties -> new BlueQuartzFlowerPot(Blocks.SPRUCE_SAPLING, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_BIRCH_SAPLING = register(
            "blue_quartz_potted_birch_sapling", (properties -> new BlueQuartzFlowerPot(Blocks.BIRCH_SAPLING, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_JUNGLE_SAPLING = register(
            "blue_quartz_potted_jungle_sapling", (properties -> new BlueQuartzFlowerPot(Blocks.JUNGLE_SAPLING, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_ACACIA_SAPLING = register(
            "blue_quartz_potted_acacia_sapling", (properties -> new BlueQuartzFlowerPot(Blocks.ACACIA_SAPLING, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_CHERRY_SAPLING = register(
            "blue_quartz_potted_cherry_sapling", (properties -> new BlueQuartzFlowerPot(Blocks.CHERRY_SAPLING, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_DARK_OAK_SAPLING = register(
            "blue_quartz_potted_dark_oak_sapling", (properties -> new BlueQuartzFlowerPot(Blocks.DARK_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_PALE_OAK_SAPLING = register(
            "blue_quartz_potted_pale_oak_sapling", (properties -> new BlueQuartzFlowerPot(Blocks.PALE_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_MANGROVE_PROPAGULE = register(
            "blue_quartz_potted_mangrove_propagule", (properties -> new BlueQuartzFlowerPot(Blocks.MANGROVE_PROPAGULE, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_FERN = register(
            "blue_quartz_potted_fern", (properties -> new BlueQuartzFlowerPot(Blocks.FERN, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_DANDELION = register(
            "blue_quartz_potted_dandelion", (properties -> new BlueQuartzFlowerPot(Blocks.DANDELION, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_POPPY = register(
            "blue_quartz_potted_poppy", (properties -> new BlueQuartzFlowerPot(Blocks.POPPY, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_BLUE_ORCHID = register(
            "blue_quartz_potted_blue_orchid", (properties -> new BlueQuartzFlowerPot(Blocks.BLUE_ORCHID, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_ALLIUM = register(
            "blue_quartz_potted_allium", (properties -> new BlueQuartzFlowerPot(Blocks.ALLIUM, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_AZURE_BLUET = register(
            "blue_quartz_potted_azure_bluet", (properties -> new BlueQuartzFlowerPot(Blocks.AZURE_BLUET, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_RED_TULIP = register(
            "blue_quartz_potted_red_tulip", (properties -> new BlueQuartzFlowerPot(Blocks.RED_TULIP, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_ORANGE_TULIP = register(
            "blue_quartz_potted_orange_tulip", (properties -> new BlueQuartzFlowerPot(Blocks.ORANGE_TULIP, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_WHITE_TULIP = register(
            "blue_quartz_potted_white_tulip", (properties -> new BlueQuartzFlowerPot(Blocks.WHITE_TULIP, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_PINK_TULIP = register(
            "blue_quartz_potted_pink_tulip", (properties -> new BlueQuartzFlowerPot(Blocks.PINK_TULIP, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_OXEYE_DAISY = register(
            "blue_quartz_potted_oxeye_daisy", (properties -> new BlueQuartzFlowerPot(Blocks.OXEYE_DAISY, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_CORNFLOWER = register(
            "blue_quartz_potted_cornflower", (properties -> new BlueQuartzFlowerPot(Blocks.CORNFLOWER, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_LILY_OF_THE_VALLEY = register(
            "blue_quartz_potted_lily_of_the_valley", (properties -> new BlueQuartzFlowerPot(Blocks.LILY_OF_THE_VALLEY, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_WITHER_ROSE = register(
            "blue_quartz_potted_wither_rose", (properties -> new BlueQuartzFlowerPot(Blocks.WITHER_ROSE, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_RED_MUSHROOM = register(
            "blue_quartz_potted_red_mushroom", (properties -> new BlueQuartzFlowerPot(Blocks.RED_MUSHROOM, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_BROWN_MUSHROOM = register(
            "blue_quartz_potted_brown_mushroom", (properties -> new BlueQuartzFlowerPot(Blocks.BROWN_MUSHROOM, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_DEAD_BUSH = register(
            "blue_quartz_potted_dead_bush", (properties -> new BlueQuartzFlowerPot(Blocks.DEAD_BUSH, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_CACTUS = register(
            "blue_quartz_potted_cactus", (properties -> new BlueQuartzFlowerPot(Blocks.CACTUS, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_BAMBOO = register(
            "blue_quartz_potted_bamboo", (properties -> new BlueQuartzFlowerPot(Blocks.BAMBOO, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_CRIMSON_FUNGUS = register(
            "blue_quartz_potted_crimson_fungus", (properties -> new BlueQuartzFlowerPot(Blocks.CRIMSON_FUNGUS, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_WARPED_FUNGUS = register(
            "blue_quartz_potted_warped_fungus", (properties -> new BlueQuartzFlowerPot(Blocks.WARPED_FUNGUS, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_CRIMSON_ROOTS = register(
            "blue_quartz_potted_crimson_roots", (properties -> new BlueQuartzFlowerPot(Blocks.CRIMSON_ROOTS, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_WARPED_ROOTS = register(
            "blue_quartz_potted_warped_roots", (properties -> new BlueQuartzFlowerPot(Blocks.WARPED_ROOTS, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_AZALEA = register(
            "blue_quartz_potted_azalea_bush", (properties -> new BlueQuartzFlowerPot(Blocks.AZALEA, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_FLOWERING_AZALEA = register(
            "blue_quartz_potted_flowering_azalea_bush", (properties -> new BlueQuartzFlowerPot(Blocks.FLOWERING_AZALEA, properties)), flowerPotProperties());
    public static final Block BLUE_QUARTZ_POTTED_OPEN_EYEBLOSSOM = register(
            "blue_quartz_potted_open_eyeblossom",
            (properties -> new BlueQuartzFlowerPot(Blocks.OPEN_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );
    public static final Block BLUE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = register(
            "blue_quartz_potted_closed_eyeblossom",
            (properties -> new BlueQuartzFlowerPot(Blocks.CLOSED_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );

    public static final Block SMOKY_QUARTZ_BLOCK = register(
            "smoky_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block SMOKY_QUARTZ_STAIRS = registerStairs("smoky_quartz_stairs", SMOKY_QUARTZ_BLOCK);
    public static final Block SMOKY_QUARTZ_SLAB = register(
            "smoky_quartz_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block SMOKY_QUARTZ_PRESSURE_PLATE = registerPressurePlate(
            "smoky_quartz_pressure_plate",
            QuartzBlocks.SMOKY_QUARTZ_BLOCK
    );
    public static final Block SMOKY_QUARTZ_BUTTON = registerButton("smoky_quartz_button");
    public static final Block CHISELED_SMOKY_QUARTZ_BLOCK = register(
            "chiseled_smoky_quartz_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block SMOKY_QUARTZ_BRICKS = register("smoky_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_BRICK_STAIRS = registerStairs("smoky_quartz_brick_stairs", SMOKY_QUARTZ_BRICKS);
    public static final Block SMOKY_QUARTZ_BRICK_SLAB = registerSlab("smoky_quartz_brick_slab", SMOKY_QUARTZ_BRICKS);
    public static final Block SMOKY_QUARTZ_BRICK_WALL = registerWall("smoky_quartz_brick_wall", SMOKY_QUARTZ_BRICKS);
    public static final Block CRACKED_SMOKY_QUARTZ_BRICKS = register("cracked_smoky_quartz_bricks", BlockBehaviour.Properties.ofFullCopy(SMOKY_QUARTZ_BRICKS));
    public static final Block CRACKED_SMOKY_QUARTZ_BRICK_STAIRS = registerStairs("cracked_smoky_quartz_brick_stairs", SMOKY_QUARTZ_BRICKS);
    public static final Block CRACKED_SMOKY_QUARTZ_BRICK_SLAB = registerSlab("cracked_smoky_quartz_brick_slab", SMOKY_QUARTZ_BRICKS);
    public static final Block CRACKED_SMOKY_QUARTZ_BRICK_WALL = registerWall("cracked_smoky_quartz_brick_wall", SMOKY_QUARTZ_BRICKS);
    public static final Block SMOKY_QUARTZ_PILLAR = register(
            "smoky_quartz_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
    );
    public static final Block SMOOTH_SMOKY_QUARTZ = register(
            "smooth_smoky_quartz",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );
    public static final Block SMOOTH_SMOKY_QUARTZ_STAIRS = registerStairs("smooth_smoky_quartz_stairs", SMOOTH_SMOKY_QUARTZ);
    public static final Block SMOOTH_SMOKY_QUARTZ_SLAB = registerSlab("smooth_smoky_quartz_slab", SMOOTH_SMOKY_QUARTZ);
    public static final Block NETHER_SMOKY_QUARTZ_ORE = register(
            "nether_smoky_quartz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 5), properties),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.NETHER_ORE)
    );
    public static final Block SMOKY_QUARTZ_FLOWER_POT = register(
            "smoky_quartz_flower_pot",
            (properties -> new SmokyQuartzFlowerPot(Blocks.AIR, properties)),
            flowerPotProperties()
    );
    public static final Block SMOKY_QUARTZ_POTTED_TORCHFLOWER = register(
            "smoky_quartz_potted_torchflower",
            (properties -> new SmokyQuartzFlowerPot(Blocks.TORCHFLOWER, properties)),
            flowerPotProperties()
    );
    public static final Block SMOKY_QUARTZ_POTTED_OAK_SAPLING = register(
            "smoky_quartz_potted_oak_sapling", (properties -> new SmokyQuartzFlowerPot(Blocks.OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING = register(
            "smoky_quartz_potted_spruce_sapling", (properties -> new SmokyQuartzFlowerPot(Blocks.SPRUCE_SAPLING, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_BIRCH_SAPLING = register(
            "smoky_quartz_potted_birch_sapling", (properties -> new SmokyQuartzFlowerPot(Blocks.BIRCH_SAPLING, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING = register(
            "smoky_quartz_potted_jungle_sapling", (properties -> new SmokyQuartzFlowerPot(Blocks.JUNGLE_SAPLING, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_ACACIA_SAPLING = register(
            "smoky_quartz_potted_acacia_sapling", (properties -> new SmokyQuartzFlowerPot(Blocks.ACACIA_SAPLING, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_CHERRY_SAPLING = register(
            "smoky_quartz_potted_cherry_sapling", (properties -> new SmokyQuartzFlowerPot(Blocks.CHERRY_SAPLING, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING = register(
            "smoky_quartz_potted_dark_oak_sapling", (properties -> new SmokyQuartzFlowerPot(Blocks.DARK_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING = register(
            "smoky_quartz_potted_pale_oak_sapling", (properties -> new SmokyQuartzFlowerPot(Blocks.PALE_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE = register(
            "smoky_quartz_potted_mangrove_propagule", (properties -> new SmokyQuartzFlowerPot(Blocks.MANGROVE_PROPAGULE, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_FERN = register(
            "smoky_quartz_potted_fern", (properties -> new SmokyQuartzFlowerPot(Blocks.FERN, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_DANDELION = register(
            "smoky_quartz_potted_dandelion", (properties -> new SmokyQuartzFlowerPot(Blocks.DANDELION, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_POPPY = register(
            "smoky_quartz_potted_poppy", (properties -> new SmokyQuartzFlowerPot(Blocks.POPPY, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_BLUE_ORCHID = register(
            "smoky_quartz_potted_blue_orchid", (properties -> new SmokyQuartzFlowerPot(Blocks.BLUE_ORCHID, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_ALLIUM = register(
            "smoky_quartz_potted_allium", (properties -> new SmokyQuartzFlowerPot(Blocks.ALLIUM, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_AZURE_BLUET = register(
            "smoky_quartz_potted_azure_bluet", (properties -> new SmokyQuartzFlowerPot(Blocks.AZURE_BLUET, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_RED_TULIP = register(
            "smoky_quartz_potted_red_tulip", (properties -> new SmokyQuartzFlowerPot(Blocks.RED_TULIP, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_ORANGE_TULIP = register(
            "smoky_quartz_potted_orange_tulip", (properties -> new SmokyQuartzFlowerPot(Blocks.ORANGE_TULIP, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_WHITE_TULIP = register(
            "smoky_quartz_potted_white_tulip", (properties -> new SmokyQuartzFlowerPot(Blocks.WHITE_TULIP, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_PINK_TULIP = register(
            "smoky_quartz_potted_pink_tulip", (properties -> new SmokyQuartzFlowerPot(Blocks.PINK_TULIP, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_OXEYE_DAISY = register(
            "smoky_quartz_potted_oxeye_daisy", (properties -> new SmokyQuartzFlowerPot(Blocks.OXEYE_DAISY, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_CORNFLOWER = register(
            "smoky_quartz_potted_cornflower", (properties -> new SmokyQuartzFlowerPot(Blocks.CORNFLOWER, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY = register(
            "smoky_quartz_potted_lily_of_the_valley", (properties -> new SmokyQuartzFlowerPot(Blocks.LILY_OF_THE_VALLEY, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_WITHER_ROSE = register(
            "smoky_quartz_potted_wither_rose", (properties -> new SmokyQuartzFlowerPot(Blocks.WITHER_ROSE, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_RED_MUSHROOM = register(
            "smoky_quartz_potted_red_mushroom", (properties -> new SmokyQuartzFlowerPot(Blocks.RED_MUSHROOM, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM = register(
            "smoky_quartz_potted_brown_mushroom", (properties -> new SmokyQuartzFlowerPot(Blocks.BROWN_MUSHROOM, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_DEAD_BUSH = register(
            "smoky_quartz_potted_dead_bush", (properties -> new SmokyQuartzFlowerPot(Blocks.DEAD_BUSH, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_CACTUS = register(
            "smoky_quartz_potted_cactus", (properties -> new SmokyQuartzFlowerPot(Blocks.CACTUS, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_BAMBOO = register(
            "smoky_quartz_potted_bamboo", (properties -> new SmokyQuartzFlowerPot(Blocks.BAMBOO, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS = register(
            "smoky_quartz_potted_crimson_fungus", (properties -> new SmokyQuartzFlowerPot(Blocks.CRIMSON_FUNGUS, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_WARPED_FUNGUS = register(
            "smoky_quartz_potted_warped_fungus", (properties -> new SmokyQuartzFlowerPot(Blocks.WARPED_FUNGUS, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS = register(
            "smoky_quartz_potted_crimson_roots", (properties -> new SmokyQuartzFlowerPot(Blocks.CRIMSON_ROOTS, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_WARPED_ROOTS = register(
            "smoky_quartz_potted_warped_roots", (properties -> new SmokyQuartzFlowerPot(Blocks.WARPED_ROOTS, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_AZALEA = register(
            "smoky_quartz_potted_azalea_bush", (properties -> new SmokyQuartzFlowerPot(Blocks.AZALEA, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA = register(
            "smoky_quartz_potted_flowering_azalea_bush", (properties -> new SmokyQuartzFlowerPot(Blocks.FLOWERING_AZALEA, properties)), flowerPotProperties());
    public static final Block SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM = register(
            "smoky_quartz_potted_open_eyeblossom",
            (properties -> new SmokyQuartzFlowerPot(Blocks.OPEN_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );
    public static final Block SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = register(
            "smoky_quartz_potted_closed_eyeblossom",
            (properties -> new SmokyQuartzFlowerPot(Blocks.CLOSED_EYEBLOSSOM, properties)),
            flowerPotProperties().randomTicks()
    );

    public static void init() {
    }

    private static Block registerStairs(String id, Block baseBlock) {
        return register(id, (properties) -> new StairBlock(baseBlock.defaultBlockState(), properties), BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Block registerSlab(String id, Block baseBlock) {
        return register(id, SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Block registerWall(String id, Block baseBlock) {
        return register(id, WallBlock::new, BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Block registerPressurePlate(String id, Block baseBlock) {
        return register(id, (properties) -> new PressurePlateBlock(BlockSetType.STONE, properties), BlockBehaviour.Properties.of()
                .mapColor(baseBlock.defaultMapColor())
                .forceSolidOn()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .noCollision()
                .strength(0.5F)
                .pushReaction(PushReaction.DESTROY));
    }

    private static Block registerButton(String id) {
        return register(id, (properties) -> new ButtonBlock(BlockSetType.STONE, 20, properties), buttonProperties());
    }

    private static Block register(final String id, final BlockBehaviour.Properties properties) {
        return register(id, Block::new, properties);
    }

    private static Block register(final String id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        return register(quartzBlockId(id), factory, properties);
    }

    private static ResourceKey<Block> quartzBlockId(final String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }

    public static Block register(final ResourceKey<Block> id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        var block = factory.apply(properties.setId(id));

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }
}
