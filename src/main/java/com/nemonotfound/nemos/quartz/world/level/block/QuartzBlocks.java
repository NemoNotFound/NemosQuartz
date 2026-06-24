package com.nemonotfound.nemos.quartz.world.level.block;

import com.nemonotfound.nemos.quartz.reference.QuartzBlockIds;
import com.nemonotfound.nemos.quartz.reference.QuartzBlockItemIds;
import com.nemonotfound.nemos.quartz.world.level.block.pot.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.BiFunction;
import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.buttonProperties;
import static net.minecraft.world.level.block.Blocks.flowerPotProperties;

public class QuartzBlocks {

    public static final Block QUARTZ_PRESSURE_PLATE = registerPressurePlate(QuartzBlockItemIds.QUARTZ_PRESSURE_PLATE.block(), Blocks.QUARTZ_BLOCK);
    public static final Block QUARTZ_BUTTON = registerButton(QuartzBlockItemIds.QUARTZ_BUTTON.block());
    public static final Block CRACKED_QUARTZ_BRICKS = register(QuartzBlockItemIds.CRACKED_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS));
    public static final Block CRACKED_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.CRACKED_QUARTZ_BRICK_STAIRS.block(), Blocks.QUARTZ_BRICKS);
    public static final Block CRACKED_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.CRACKED_QUARTZ_BRICK_SLAB.block(), Blocks.QUARTZ_BRICKS);
    public static final Block CRACKED_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.CRACKED_QUARTZ_BRICK_WALL.block(), Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.QUARTZ_BRICK_STAIRS.block(), Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.QUARTZ_BRICK_SLAB.block(), Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.QUARTZ_BRICK_WALL.block(), Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_FLOWER_POT = registerPotted(QuartzBlockItemIds.QUARTZ_FLOWER_POT.block(), Blocks.AIR, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_TORCHFLOWER = registerPotted(QuartzBlockIds.QUARTZ_POTTED_TORCHFLOWER, Blocks.TORCHFLOWER, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_OAK_SAPLING = registerPotted(QuartzBlockIds.QUARTZ_POTTED_OAK_SAPLING, Blocks.OAK_SAPLING, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_SPRUCE_SAPLING = registerPotted(QuartzBlockIds.QUARTZ_POTTED_SPRUCE_SAPLING, Blocks.SPRUCE_SAPLING, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_BIRCH_SAPLING = registerPotted(QuartzBlockIds.QUARTZ_POTTED_BIRCH_SAPLING, Blocks.BIRCH_SAPLING, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_JUNGLE_SAPLING = registerPotted(QuartzBlockIds.QUARTZ_POTTED_JUNGLE_SAPLING, Blocks.JUNGLE_SAPLING, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_ACACIA_SAPLING = registerPotted(QuartzBlockIds.QUARTZ_POTTED_ACACIA_SAPLING, Blocks.ACACIA_SAPLING, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_CHERRY_SAPLING = registerPotted(QuartzBlockIds.QUARTZ_POTTED_CHERRY_SAPLING, Blocks.CHERRY_SAPLING, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_DARK_OAK_SAPLING = registerPotted(QuartzBlockIds.QUARTZ_POTTED_DARK_OAK_SAPLING, Blocks.DARK_OAK_SAPLING, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_PALE_OAK_SAPLING = registerPotted(QuartzBlockIds.QUARTZ_POTTED_PALE_OAK_SAPLING, Blocks.PALE_OAK_SAPLING, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_MANGROVE_PROPAGULE = registerPotted(QuartzBlockIds.QUARTZ_POTTED_MANGROVE_PROPAGULE, Blocks.MANGROVE_PROPAGULE, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_FERN = registerPotted(QuartzBlockIds.QUARTZ_POTTED_FERN, Blocks.FERN, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_DANDELION = registerPotted(QuartzBlockIds.QUARTZ_POTTED_DANDELION, Blocks.DANDELION, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_POPPY = registerPotted(QuartzBlockIds.QUARTZ_POTTED_POPPY, Blocks.POPPY, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_BLUE_ORCHID = registerPotted(QuartzBlockIds.QUARTZ_POTTED_BLUE_ORCHID, Blocks.BLUE_ORCHID, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_ALLIUM = registerPotted(QuartzBlockIds.QUARTZ_POTTED_ALLIUM, Blocks.ALLIUM, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_AZURE_BLUET = registerPotted(QuartzBlockIds.QUARTZ_POTTED_AZURE_BLUET, Blocks.AZURE_BLUET, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_RED_TULIP = registerPotted(QuartzBlockIds.QUARTZ_POTTED_RED_TULIP, Blocks.RED_TULIP, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_ORANGE_TULIP = registerPotted(QuartzBlockIds.QUARTZ_POTTED_ORANGE_TULIP, Blocks.ORANGE_TULIP, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_WHITE_TULIP = registerPotted(QuartzBlockIds.QUARTZ_POTTED_WHITE_TULIP, Blocks.WHITE_TULIP, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_PINK_TULIP = registerPotted(QuartzBlockIds.QUARTZ_POTTED_PINK_TULIP, Blocks.PINK_TULIP, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_OXEYE_DAISY = registerPotted(QuartzBlockIds.QUARTZ_POTTED_OXEYE_DAISY, Blocks.OXEYE_DAISY, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_CORNFLOWER = registerPotted(QuartzBlockIds.QUARTZ_POTTED_CORNFLOWER, Blocks.CORNFLOWER, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_LILY_OF_THE_VALLEY = registerPotted(QuartzBlockIds.QUARTZ_POTTED_LILY_OF_THE_VALLEY, Blocks.LILY_OF_THE_VALLEY, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_WITHER_ROSE = registerPotted(QuartzBlockIds.QUARTZ_POTTED_WITHER_ROSE, Blocks.WITHER_ROSE, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_RED_MUSHROOM = registerPotted(QuartzBlockIds.QUARTZ_POTTED_RED_MUSHROOM, Blocks.RED_MUSHROOM, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_BROWN_MUSHROOM = registerPotted(QuartzBlockIds.QUARTZ_POTTED_BROWN_MUSHROOM, Blocks.BROWN_MUSHROOM, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_DEAD_BUSH = registerPotted(QuartzBlockIds.QUARTZ_POTTED_DEAD_BUSH, Blocks.DEAD_BUSH, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_CACTUS = registerPotted(QuartzBlockIds.QUARTZ_POTTED_CACTUS, Blocks.CACTUS, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_BAMBOO = registerPotted(QuartzBlockIds.QUARTZ_POTTED_BAMBOO, Blocks.BAMBOO, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_CRIMSON_FUNGUS = registerPotted(QuartzBlockIds.QUARTZ_POTTED_CRIMSON_FUNGUS, Blocks.CRIMSON_FUNGUS, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_WARPED_FUNGUS = registerPotted(QuartzBlockIds.QUARTZ_POTTED_WARPED_FUNGUS, Blocks.WARPED_FUNGUS, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_CRIMSON_ROOTS = registerPotted(QuartzBlockIds.QUARTZ_POTTED_CRIMSON_ROOTS, Blocks.CRIMSON_ROOTS, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_WARPED_ROOTS = registerPotted(QuartzBlockIds.QUARTZ_POTTED_WARPED_ROOTS, Blocks.WARPED_ROOTS, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_AZALEA = registerPotted(QuartzBlockIds.QUARTZ_POTTED_AZALEA, Blocks.AZALEA, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_FLOWERING_AZALEA = registerPotted(QuartzBlockIds.QUARTZ_POTTED_FLOWERING_AZALEA, Blocks.FLOWERING_AZALEA, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_OPEN_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.QUARTZ_POTTED_OPEN_EYEBLOSSOM, Blocks.OPEN_EYEBLOSSOM, QuartzFlowerPot::new);
    public static final Block QUARTZ_POTTED_CLOSED_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.QUARTZ_POTTED_CLOSED_EYEBLOSSOM, Blocks.CLOSED_EYEBLOSSOM, QuartzFlowerPot::new);

    public static final Block ROSE_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.ROSE_QUARTZ_BLOCK.block(), MapColor.TERRACOTTA_WHITE);
    public static final Block ROSE_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.ROSE_QUARTZ_STAIRS.block(), ROSE_QUARTZ_BLOCK);
    public static final Block ROSE_QUARTZ_SLAB = registerQuartzSlab(QuartzBlockItemIds.ROSE_QUARTZ_SLAB.block(), MapColor.TERRACOTTA_WHITE);
    public static final Block ROSE_QUARTZ_PRESSURE_PLATE = registerPressurePlate(QuartzBlockItemIds.ROSE_QUARTZ_PRESSURE_PLATE.block(), ROSE_QUARTZ_BLOCK);
    public static final Block ROSE_QUARTZ_BUTTON = registerButton(QuartzBlockItemIds.ROSE_QUARTZ_BUTTON.block());
    public static final Block CHISELED_ROSE_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.CHISELED_ROSE_QUARTZ_BLOCK.block(), MapColor.TERRACOTTA_WHITE);
    public static final Block ROSE_QUARTZ_BRICKS = register(QuartzBlockItemIds.ROSE_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(ROSE_QUARTZ_BLOCK));
    public static final Block ROSE_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.ROSE_QUARTZ_BRICK_STAIRS.block(), ROSE_QUARTZ_BRICKS);
    public static final Block ROSE_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.ROSE_QUARTZ_BRICK_SLAB.block(), ROSE_QUARTZ_BRICKS);
    public static final Block ROSE_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.ROSE_QUARTZ_BRICK_WALL.block(), ROSE_QUARTZ_BRICKS);
    public static final Block CRACKED_ROSE_QUARTZ_BRICKS = register(QuartzBlockItemIds.CRACKED_ROSE_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(ROSE_QUARTZ_BRICKS));
    public static final Block CRACKED_ROSE_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.CRACKED_ROSE_QUARTZ_BRICK_STAIRS.block(), ROSE_QUARTZ_BRICKS);
    public static final Block CRACKED_ROSE_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.CRACKED_ROSE_QUARTZ_BRICK_SLAB.block(), ROSE_QUARTZ_BRICKS);
    public static final Block CRACKED_ROSE_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.CRACKED_ROSE_QUARTZ_BRICK_WALL.block(), ROSE_QUARTZ_BRICKS);
    public static final Block ROSE_QUARTZ_PILLAR = registerQuartzPillar(QuartzBlockItemIds.ROSE_QUARTZ_PILLAR.block(), MapColor.TERRACOTTA_WHITE);
    public static final Block SMOOTH_ROSE_QUARTZ = registerSmoothQuartz(QuartzBlockItemIds.SMOOTH_ROSE_QUARTZ.block(), MapColor.TERRACOTTA_WHITE);
    public static final Block SMOOTH_ROSE_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.SMOOTH_ROSE_QUARTZ_STAIRS.block(), SMOOTH_ROSE_QUARTZ);
    public static final Block SMOOTH_ROSE_QUARTZ_SLAB = registerSlab(QuartzBlockItemIds.SMOOTH_ROSE_QUARTZ_SLAB.block(), SMOOTH_ROSE_QUARTZ);
    public static final Block NETHER_ROSE_QUARTZ_ORE = registerNetherQuartzOre(QuartzBlockItemIds.NETHER_ROSE_QUARTZ_ORE.block());
    public static final Block ROSE_QUARTZ_FLOWER_POT = registerPotted(QuartzBlockItemIds.ROSE_QUARTZ_FLOWER_POT.block(), Blocks.AIR, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_TORCHFLOWER = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_TORCHFLOWER, Blocks.TORCHFLOWER, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_OAK_SAPLING = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_OAK_SAPLING, Blocks.OAK_SAPLING, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_SPRUCE_SAPLING = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_SPRUCE_SAPLING, Blocks.SPRUCE_SAPLING, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_BIRCH_SAPLING = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_BIRCH_SAPLING, Blocks.BIRCH_SAPLING, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_JUNGLE_SAPLING = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_JUNGLE_SAPLING, Blocks.JUNGLE_SAPLING, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_ACACIA_SAPLING = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_ACACIA_SAPLING, Blocks.ACACIA_SAPLING, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_CHERRY_SAPLING = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_CHERRY_SAPLING, Blocks.CHERRY_SAPLING, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING, Blocks.DARK_OAK_SAPLING, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING, Blocks.PALE_OAK_SAPLING, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE, Blocks.MANGROVE_PROPAGULE, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_FERN = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_FERN, Blocks.FERN, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_DANDELION = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_DANDELION, Blocks.DANDELION, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_POPPY = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_POPPY, Blocks.POPPY, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_BLUE_ORCHID = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_BLUE_ORCHID, Blocks.BLUE_ORCHID, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_ALLIUM = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_ALLIUM, Blocks.ALLIUM, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_AZURE_BLUET = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_AZURE_BLUET, Blocks.AZURE_BLUET, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_RED_TULIP = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_RED_TULIP, Blocks.RED_TULIP, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_ORANGE_TULIP = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_ORANGE_TULIP, Blocks.ORANGE_TULIP, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_WHITE_TULIP = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_WHITE_TULIP, Blocks.WHITE_TULIP, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_PINK_TULIP = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_PINK_TULIP, Blocks.PINK_TULIP, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_OXEYE_DAISY = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_OXEYE_DAISY, Blocks.OXEYE_DAISY, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_CORNFLOWER = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_CORNFLOWER, Blocks.CORNFLOWER, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY, Blocks.LILY_OF_THE_VALLEY, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_WITHER_ROSE = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_WITHER_ROSE, Blocks.WITHER_ROSE, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_RED_MUSHROOM = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_RED_MUSHROOM, Blocks.RED_MUSHROOM, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_BROWN_MUSHROOM = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_BROWN_MUSHROOM, Blocks.BROWN_MUSHROOM, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_DEAD_BUSH = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_DEAD_BUSH, Blocks.DEAD_BUSH, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_CACTUS = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_CACTUS, Blocks.CACTUS, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_BAMBOO = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_BAMBOO, Blocks.BAMBOO, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS, Blocks.CRIMSON_FUNGUS, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_WARPED_FUNGUS = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_WARPED_FUNGUS, Blocks.WARPED_FUNGUS, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_CRIMSON_ROOTS = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_CRIMSON_ROOTS, Blocks.CRIMSON_ROOTS, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_WARPED_ROOTS = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_WARPED_ROOTS, Blocks.WARPED_ROOTS, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_AZALEA = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_AZALEA, Blocks.AZALEA, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_FLOWERING_AZALEA = registerPotted(QuartzBlockIds.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA, Blocks.FLOWERING_AZALEA, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM, Blocks.OPEN_EYEBLOSSOM, RoseQuartzFlowerPot::new);
    public static final Block ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM, Blocks.CLOSED_EYEBLOSSOM, RoseQuartzFlowerPot::new);

    public static final Block LEMON_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.LEMON_QUARTZ_BLOCK.block(), MapColor.COLOR_YELLOW);
    public static final Block LEMON_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.LEMON_QUARTZ_STAIRS.block(), LEMON_QUARTZ_BLOCK);
    public static final Block LEMON_QUARTZ_SLAB = registerQuartzSlab(QuartzBlockItemIds.LEMON_QUARTZ_SLAB.block(), MapColor.COLOR_YELLOW);
    public static final Block LEMON_QUARTZ_PRESSURE_PLATE = registerPressurePlate(QuartzBlockItemIds.LEMON_QUARTZ_PRESSURE_PLATE.block(), LEMON_QUARTZ_BLOCK);
    public static final Block LEMON_QUARTZ_BUTTON = registerButton(QuartzBlockItemIds.LEMON_QUARTZ_BUTTON.block());
    public static final Block CHISELED_LEMON_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.CHISELED_LEMON_QUARTZ_BLOCK.block(), MapColor.COLOR_YELLOW);
    public static final Block LEMON_QUARTZ_BRICKS = register(QuartzBlockItemIds.LEMON_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(LEMON_QUARTZ_BLOCK));
    public static final Block LEMON_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.LEMON_QUARTZ_BRICK_STAIRS.block(), LEMON_QUARTZ_BRICKS);
    public static final Block LEMON_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.LEMON_QUARTZ_BRICK_SLAB.block(), LEMON_QUARTZ_BRICKS);
    public static final Block LEMON_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.LEMON_QUARTZ_BRICK_WALL.block(), LEMON_QUARTZ_BRICKS);
    public static final Block CRACKED_LEMON_QUARTZ_BRICKS = register(QuartzBlockItemIds.CRACKED_LEMON_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(LEMON_QUARTZ_BRICKS));
    public static final Block CRACKED_LEMON_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.CRACKED_LEMON_QUARTZ_BRICK_STAIRS.block(), LEMON_QUARTZ_BRICKS);
    public static final Block CRACKED_LEMON_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.CRACKED_LEMON_QUARTZ_BRICK_SLAB.block(), LEMON_QUARTZ_BRICKS);
    public static final Block CRACKED_LEMON_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.CRACKED_LEMON_QUARTZ_BRICK_WALL.block(), LEMON_QUARTZ_BRICKS);
    public static final Block LEMON_QUARTZ_PILLAR = registerQuartzPillar(QuartzBlockItemIds.LEMON_QUARTZ_PILLAR.block(), MapColor.COLOR_YELLOW);
    public static final Block SMOOTH_LEMON_QUARTZ = registerSmoothQuartz(QuartzBlockItemIds.SMOOTH_LEMON_QUARTZ.block(), MapColor.COLOR_YELLOW);
    public static final Block SMOOTH_LEMON_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.SMOOTH_LEMON_QUARTZ_STAIRS.block(), SMOOTH_LEMON_QUARTZ);
    public static final Block SMOOTH_LEMON_QUARTZ_SLAB = registerSlab(QuartzBlockItemIds.SMOOTH_LEMON_QUARTZ_SLAB.block(), SMOOTH_LEMON_QUARTZ);
    public static final Block NETHER_LEMON_QUARTZ_ORE = registerNetherQuartzOre(QuartzBlockItemIds.NETHER_LEMON_QUARTZ_ORE.block());
    public static final Block LEMON_QUARTZ_FLOWER_POT = registerPotted(QuartzBlockItemIds.LEMON_QUARTZ_FLOWER_POT.block(), Blocks.AIR, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_TORCHFLOWER = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_TORCHFLOWER, Blocks.TORCHFLOWER, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_OAK_SAPLING = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_OAK_SAPLING, Blocks.OAK_SAPLING, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_SPRUCE_SAPLING = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_SPRUCE_SAPLING, Blocks.SPRUCE_SAPLING, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_BIRCH_SAPLING = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_BIRCH_SAPLING, Blocks.BIRCH_SAPLING, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_JUNGLE_SAPLING = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_JUNGLE_SAPLING, Blocks.JUNGLE_SAPLING, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_ACACIA_SAPLING = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_ACACIA_SAPLING, Blocks.ACACIA_SAPLING, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_CHERRY_SAPLING = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_CHERRY_SAPLING, Blocks.CHERRY_SAPLING, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_DARK_OAK_SAPLING = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_DARK_OAK_SAPLING, Blocks.DARK_OAK_SAPLING, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_PALE_OAK_SAPLING = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_PALE_OAK_SAPLING, Blocks.PALE_OAK_SAPLING, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_MANGROVE_PROPAGULE = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_MANGROVE_PROPAGULE, Blocks.MANGROVE_PROPAGULE, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_FERN = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_FERN, Blocks.FERN, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_DANDELION = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_DANDELION, Blocks.DANDELION, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_POPPY = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_POPPY, Blocks.POPPY, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_BLUE_ORCHID = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_BLUE_ORCHID, Blocks.BLUE_ORCHID, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_ALLIUM = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_ALLIUM, Blocks.ALLIUM, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_AZURE_BLUET = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_AZURE_BLUET, Blocks.AZURE_BLUET, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_RED_TULIP = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_RED_TULIP, Blocks.RED_TULIP, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_ORANGE_TULIP = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_ORANGE_TULIP, Blocks.ORANGE_TULIP, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_WHITE_TULIP = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_WHITE_TULIP, Blocks.WHITE_TULIP, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_PINK_TULIP = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_PINK_TULIP, Blocks.PINK_TULIP, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_OXEYE_DAISY = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_OXEYE_DAISY, Blocks.OXEYE_DAISY, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_CORNFLOWER = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_CORNFLOWER, Blocks.CORNFLOWER, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_LILY_OF_THE_VALLEY = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_LILY_OF_THE_VALLEY, Blocks.LILY_OF_THE_VALLEY, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_WITHER_ROSE = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_WITHER_ROSE, Blocks.WITHER_ROSE, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_RED_MUSHROOM = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_RED_MUSHROOM, Blocks.RED_MUSHROOM, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_BROWN_MUSHROOM = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_BROWN_MUSHROOM, Blocks.BROWN_MUSHROOM, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_DEAD_BUSH = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_DEAD_BUSH, Blocks.DEAD_BUSH, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_CACTUS = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_CACTUS, Blocks.CACTUS, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_BAMBOO = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_BAMBOO, Blocks.BAMBOO, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_CRIMSON_FUNGUS = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_CRIMSON_FUNGUS, Blocks.CRIMSON_FUNGUS, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_WARPED_FUNGUS = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_WARPED_FUNGUS, Blocks.WARPED_FUNGUS, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_CRIMSON_ROOTS = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_CRIMSON_ROOTS, Blocks.CRIMSON_ROOTS, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_WARPED_ROOTS = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_WARPED_ROOTS, Blocks.WARPED_ROOTS, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_AZALEA = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_AZALEA, Blocks.AZALEA, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_FLOWERING_AZALEA = registerPotted(QuartzBlockIds.LEMON_QUARTZ_POTTED_FLOWERING_AZALEA, Blocks.FLOWERING_AZALEA, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_OPEN_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.LEMON_QUARTZ_POTTED_OPEN_EYEBLOSSOM, Blocks.OPEN_EYEBLOSSOM, LemonQuartzFlowerPot::new);
    public static final Block LEMON_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.LEMON_QUARTZ_POTTED_CLOSED_EYEBLOSSOM, Blocks.CLOSED_EYEBLOSSOM, LemonQuartzFlowerPot::new);

    public static final Block GREEN_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.GREEN_QUARTZ_BLOCK.block(), MapColor.COLOR_GREEN);
    public static final Block GREEN_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.GREEN_QUARTZ_STAIRS.block(), GREEN_QUARTZ_BLOCK);
    public static final Block GREEN_QUARTZ_SLAB = registerQuartzSlab(QuartzBlockItemIds.GREEN_QUARTZ_SLAB.block(), MapColor.COLOR_GREEN);
    public static final Block GREEN_QUARTZ_PRESSURE_PLATE = registerPressurePlate(QuartzBlockItemIds.GREEN_QUARTZ_PRESSURE_PLATE.block(), GREEN_QUARTZ_BLOCK);
    public static final Block GREEN_QUARTZ_BUTTON = registerButton(QuartzBlockItemIds.GREEN_QUARTZ_BUTTON.block());
    public static final Block CHISELED_GREEN_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.CHISELED_GREEN_QUARTZ_BLOCK.block(), MapColor.COLOR_GREEN);
    public static final Block GREEN_QUARTZ_BRICKS = register(QuartzBlockItemIds.GREEN_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(GREEN_QUARTZ_BLOCK));
    public static final Block GREEN_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.GREEN_QUARTZ_BRICK_STAIRS.block(), GREEN_QUARTZ_BRICKS);
    public static final Block GREEN_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.GREEN_QUARTZ_BRICK_SLAB.block(), GREEN_QUARTZ_BRICKS);
    public static final Block GREEN_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.GREEN_QUARTZ_BRICK_WALL.block(), GREEN_QUARTZ_BRICKS);
    public static final Block CRACKED_GREEN_QUARTZ_BRICKS = register(QuartzBlockItemIds.CRACKED_GREEN_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(GREEN_QUARTZ_BRICKS));
    public static final Block CRACKED_GREEN_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.CRACKED_GREEN_QUARTZ_BRICK_STAIRS.block(), GREEN_QUARTZ_BRICKS);
    public static final Block CRACKED_GREEN_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.CRACKED_GREEN_QUARTZ_BRICK_SLAB.block(), GREEN_QUARTZ_BRICKS);
    public static final Block CRACKED_GREEN_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.CRACKED_GREEN_QUARTZ_BRICK_WALL.block(), GREEN_QUARTZ_BRICKS);
    public static final Block GREEN_QUARTZ_PILLAR = registerQuartzPillar(QuartzBlockItemIds.GREEN_QUARTZ_PILLAR.block(), MapColor.COLOR_GREEN);
    public static final Block SMOOTH_GREEN_QUARTZ = registerSmoothQuartz(QuartzBlockItemIds.SMOOTH_GREEN_QUARTZ.block(), MapColor.COLOR_GREEN);
    public static final Block SMOOTH_GREEN_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.SMOOTH_GREEN_QUARTZ_STAIRS.block(), SMOOTH_GREEN_QUARTZ);
    public static final Block SMOOTH_GREEN_QUARTZ_SLAB = registerSlab(QuartzBlockItemIds.SMOOTH_GREEN_QUARTZ_SLAB.block(), SMOOTH_GREEN_QUARTZ);
    public static final Block NETHER_GREEN_QUARTZ_ORE = registerNetherQuartzOre(QuartzBlockItemIds.NETHER_GREEN_QUARTZ_ORE.block());
    public static final Block GREEN_QUARTZ_FLOWER_POT = registerPotted(QuartzBlockItemIds.GREEN_QUARTZ_FLOWER_POT.block(), Blocks.AIR, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_TORCHFLOWER = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_TORCHFLOWER, Blocks.TORCHFLOWER, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_OAK_SAPLING = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_OAK_SAPLING, Blocks.OAK_SAPLING, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_SPRUCE_SAPLING = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_SPRUCE_SAPLING, Blocks.SPRUCE_SAPLING, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_BIRCH_SAPLING = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_BIRCH_SAPLING, Blocks.BIRCH_SAPLING, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_JUNGLE_SAPLING = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_JUNGLE_SAPLING, Blocks.JUNGLE_SAPLING, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_ACACIA_SAPLING = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_ACACIA_SAPLING, Blocks.ACACIA_SAPLING, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_CHERRY_SAPLING = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_CHERRY_SAPLING, Blocks.CHERRY_SAPLING, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_DARK_OAK_SAPLING = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_DARK_OAK_SAPLING, Blocks.DARK_OAK_SAPLING, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_PALE_OAK_SAPLING = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_PALE_OAK_SAPLING, Blocks.PALE_OAK_SAPLING, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_MANGROVE_PROPAGULE = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_MANGROVE_PROPAGULE, Blocks.MANGROVE_PROPAGULE, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_FERN = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_FERN, Blocks.FERN, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_DANDELION = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_DANDELION, Blocks.DANDELION, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_POPPY = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_POPPY, Blocks.POPPY, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_BLUE_ORCHID = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_BLUE_ORCHID, Blocks.BLUE_ORCHID, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_ALLIUM = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_ALLIUM, Blocks.ALLIUM, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_AZURE_BLUET = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_AZURE_BLUET, Blocks.AZURE_BLUET, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_RED_TULIP = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_RED_TULIP, Blocks.RED_TULIP, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_ORANGE_TULIP = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_ORANGE_TULIP, Blocks.ORANGE_TULIP, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_WHITE_TULIP = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_WHITE_TULIP, Blocks.WHITE_TULIP, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_PINK_TULIP = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_PINK_TULIP, Blocks.PINK_TULIP, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_OXEYE_DAISY = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_OXEYE_DAISY, Blocks.OXEYE_DAISY, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_CORNFLOWER = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_CORNFLOWER, Blocks.CORNFLOWER, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_LILY_OF_THE_VALLEY = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_LILY_OF_THE_VALLEY, Blocks.LILY_OF_THE_VALLEY, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_WITHER_ROSE = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_WITHER_ROSE, Blocks.WITHER_ROSE, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_RED_MUSHROOM = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_RED_MUSHROOM, Blocks.RED_MUSHROOM, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_BROWN_MUSHROOM = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_BROWN_MUSHROOM, Blocks.BROWN_MUSHROOM, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_DEAD_BUSH = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_DEAD_BUSH, Blocks.DEAD_BUSH, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_CACTUS = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_CACTUS, Blocks.CACTUS, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_BAMBOO = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_BAMBOO, Blocks.BAMBOO, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_CRIMSON_FUNGUS = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_CRIMSON_FUNGUS, Blocks.CRIMSON_FUNGUS, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_WARPED_FUNGUS = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_WARPED_FUNGUS, Blocks.WARPED_FUNGUS, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_CRIMSON_ROOTS = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_CRIMSON_ROOTS, Blocks.CRIMSON_ROOTS, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_WARPED_ROOTS = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_WARPED_ROOTS, Blocks.WARPED_ROOTS, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_AZALEA = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_AZALEA, Blocks.AZALEA, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_FLOWERING_AZALEA = registerPotted(QuartzBlockIds.GREEN_QUARTZ_POTTED_FLOWERING_AZALEA, Blocks.FLOWERING_AZALEA, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_OPEN_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.GREEN_QUARTZ_POTTED_OPEN_EYEBLOSSOM, Blocks.OPEN_EYEBLOSSOM, GreenQuartzFlowerPot::new);
    public static final Block GREEN_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.GREEN_QUARTZ_POTTED_CLOSED_EYEBLOSSOM, Blocks.CLOSED_EYEBLOSSOM, GreenQuartzFlowerPot::new);

    public static final Block BLUE_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.BLUE_QUARTZ_BLOCK.block(), MapColor.COLOR_BLUE);
    public static final Block BLUE_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.BLUE_QUARTZ_STAIRS.block(), BLUE_QUARTZ_BLOCK);
    public static final Block BLUE_QUARTZ_SLAB = registerQuartzSlab(QuartzBlockItemIds.BLUE_QUARTZ_SLAB.block(), MapColor.COLOR_BLUE);
    public static final Block BLUE_QUARTZ_PRESSURE_PLATE = registerPressurePlate(QuartzBlockItemIds.BLUE_QUARTZ_PRESSURE_PLATE.block(), BLUE_QUARTZ_BLOCK);
    public static final Block BLUE_QUARTZ_BUTTON = registerButton(QuartzBlockItemIds.BLUE_QUARTZ_BUTTON.block());
    public static final Block CHISELED_BLUE_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.CHISELED_BLUE_QUARTZ_BLOCK.block(), MapColor.COLOR_BLUE);
    public static final Block BLUE_QUARTZ_BRICKS = register(QuartzBlockItemIds.BLUE_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(BLUE_QUARTZ_BLOCK));
    public static final Block BLUE_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.BLUE_QUARTZ_BRICK_STAIRS.block(), BLUE_QUARTZ_BRICKS);
    public static final Block BLUE_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.BLUE_QUARTZ_BRICK_SLAB.block(), BLUE_QUARTZ_BRICKS);
    public static final Block BLUE_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.BLUE_QUARTZ_BRICK_WALL.block(), BLUE_QUARTZ_BRICKS);
    public static final Block CRACKED_BLUE_QUARTZ_BRICKS = register(QuartzBlockItemIds.CRACKED_BLUE_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(BLUE_QUARTZ_BRICKS));
    public static final Block CRACKED_BLUE_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.CRACKED_BLUE_QUARTZ_BRICK_STAIRS.block(), BLUE_QUARTZ_BRICKS);
    public static final Block CRACKED_BLUE_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.CRACKED_BLUE_QUARTZ_BRICK_SLAB.block(), BLUE_QUARTZ_BRICKS);
    public static final Block CRACKED_BLUE_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.CRACKED_BLUE_QUARTZ_BRICK_WALL.block(), BLUE_QUARTZ_BRICKS);
    public static final Block BLUE_QUARTZ_PILLAR = registerQuartzPillar(QuartzBlockItemIds.BLUE_QUARTZ_PILLAR.block(), MapColor.COLOR_BLUE);
    public static final Block SMOOTH_BLUE_QUARTZ = registerSmoothQuartz(QuartzBlockItemIds.SMOOTH_BLUE_QUARTZ.block(), MapColor.COLOR_BLUE);
    public static final Block SMOOTH_BLUE_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.SMOOTH_BLUE_QUARTZ_STAIRS.block(), SMOOTH_BLUE_QUARTZ);
    public static final Block SMOOTH_BLUE_QUARTZ_SLAB = registerSlab(QuartzBlockItemIds.SMOOTH_BLUE_QUARTZ_SLAB.block(), SMOOTH_BLUE_QUARTZ);
    public static final Block NETHER_BLUE_QUARTZ_ORE = registerNetherQuartzOre(QuartzBlockItemIds.NETHER_BLUE_QUARTZ_ORE.block());
    public static final Block BLUE_QUARTZ_FLOWER_POT = registerPotted(QuartzBlockItemIds.BLUE_QUARTZ_FLOWER_POT.block(), Blocks.AIR, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_TORCHFLOWER = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_TORCHFLOWER, Blocks.TORCHFLOWER, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_OAK_SAPLING = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_OAK_SAPLING, Blocks.OAK_SAPLING, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_SPRUCE_SAPLING = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_SPRUCE_SAPLING, Blocks.SPRUCE_SAPLING, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_BIRCH_SAPLING = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_BIRCH_SAPLING, Blocks.BIRCH_SAPLING, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_JUNGLE_SAPLING = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_JUNGLE_SAPLING, Blocks.JUNGLE_SAPLING, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_ACACIA_SAPLING = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_ACACIA_SAPLING, Blocks.ACACIA_SAPLING, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_CHERRY_SAPLING = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_CHERRY_SAPLING, Blocks.CHERRY_SAPLING, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_DARK_OAK_SAPLING = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_DARK_OAK_SAPLING, Blocks.DARK_OAK_SAPLING, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_PALE_OAK_SAPLING = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_PALE_OAK_SAPLING, Blocks.PALE_OAK_SAPLING, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_MANGROVE_PROPAGULE = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_MANGROVE_PROPAGULE, Blocks.MANGROVE_PROPAGULE, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_FERN = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_FERN, Blocks.FERN, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_DANDELION = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_DANDELION, Blocks.DANDELION, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_POPPY = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_POPPY, Blocks.POPPY, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_BLUE_ORCHID = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_BLUE_ORCHID, Blocks.BLUE_ORCHID, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_ALLIUM = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_ALLIUM, Blocks.ALLIUM, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_AZURE_BLUET = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_AZURE_BLUET, Blocks.AZURE_BLUET, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_RED_TULIP = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_RED_TULIP, Blocks.RED_TULIP, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_ORANGE_TULIP = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_ORANGE_TULIP, Blocks.ORANGE_TULIP, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_WHITE_TULIP = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_WHITE_TULIP, Blocks.WHITE_TULIP, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_PINK_TULIP = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_PINK_TULIP, Blocks.PINK_TULIP, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_OXEYE_DAISY = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_OXEYE_DAISY, Blocks.OXEYE_DAISY, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_CORNFLOWER = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_CORNFLOWER, Blocks.CORNFLOWER, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_LILY_OF_THE_VALLEY = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_LILY_OF_THE_VALLEY, Blocks.LILY_OF_THE_VALLEY, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_WITHER_ROSE = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_WITHER_ROSE, Blocks.WITHER_ROSE, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_RED_MUSHROOM = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_RED_MUSHROOM, Blocks.RED_MUSHROOM, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_BROWN_MUSHROOM = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_BROWN_MUSHROOM, Blocks.BROWN_MUSHROOM, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_DEAD_BUSH = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_DEAD_BUSH, Blocks.DEAD_BUSH, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_CACTUS = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_CACTUS, Blocks.CACTUS, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_BAMBOO = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_BAMBOO, Blocks.BAMBOO, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_CRIMSON_FUNGUS = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_CRIMSON_FUNGUS, Blocks.CRIMSON_FUNGUS, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_WARPED_FUNGUS = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_WARPED_FUNGUS, Blocks.WARPED_FUNGUS, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_CRIMSON_ROOTS = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_CRIMSON_ROOTS, Blocks.CRIMSON_ROOTS, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_WARPED_ROOTS = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_WARPED_ROOTS, Blocks.WARPED_ROOTS, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_AZALEA = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_AZALEA, Blocks.AZALEA, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_FLOWERING_AZALEA = registerPotted(QuartzBlockIds.BLUE_QUARTZ_POTTED_FLOWERING_AZALEA, Blocks.FLOWERING_AZALEA, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_OPEN_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.BLUE_QUARTZ_POTTED_OPEN_EYEBLOSSOM, Blocks.OPEN_EYEBLOSSOM, BlueQuartzFlowerPot::new);
    public static final Block BLUE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.BLUE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM, Blocks.CLOSED_EYEBLOSSOM, BlueQuartzFlowerPot::new);

    public static final Block SMOKY_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.SMOKY_QUARTZ_BLOCK.block(), MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block SMOKY_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.SMOKY_QUARTZ_STAIRS.block(), SMOKY_QUARTZ_BLOCK);
    public static final Block SMOKY_QUARTZ_SLAB = registerQuartzSlab(QuartzBlockItemIds.SMOKY_QUARTZ_SLAB.block(), MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block SMOKY_QUARTZ_PRESSURE_PLATE = registerPressurePlate(QuartzBlockItemIds.SMOKY_QUARTZ_PRESSURE_PLATE.block(), SMOKY_QUARTZ_BLOCK);
    public static final Block SMOKY_QUARTZ_BUTTON = registerButton(QuartzBlockItemIds.SMOKY_QUARTZ_BUTTON.block());
    public static final Block CHISELED_SMOKY_QUARTZ_BLOCK = registerQuartzBlock(QuartzBlockItemIds.CHISELED_SMOKY_QUARTZ_BLOCK.block(), MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block SMOKY_QUARTZ_BRICKS = register(QuartzBlockItemIds.SMOKY_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.SMOKY_QUARTZ_BRICK_STAIRS.block(), SMOKY_QUARTZ_BRICKS);
    public static final Block SMOKY_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.SMOKY_QUARTZ_BRICK_SLAB.block(), SMOKY_QUARTZ_BRICKS);
    public static final Block SMOKY_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.SMOKY_QUARTZ_BRICK_WALL.block(), SMOKY_QUARTZ_BRICKS);
    public static final Block CRACKED_SMOKY_QUARTZ_BRICKS = register(QuartzBlockItemIds.CRACKED_SMOKY_QUARTZ_BRICKS.block(), BlockBehaviour.Properties.ofFullCopy(SMOKY_QUARTZ_BRICKS));
    public static final Block CRACKED_SMOKY_QUARTZ_BRICK_STAIRS = registerStairs(QuartzBlockItemIds.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS.block(), SMOKY_QUARTZ_BRICKS);
    public static final Block CRACKED_SMOKY_QUARTZ_BRICK_SLAB = registerSlab(QuartzBlockItemIds.CRACKED_SMOKY_QUARTZ_BRICK_SLAB.block(), SMOKY_QUARTZ_BRICKS);
    public static final Block CRACKED_SMOKY_QUARTZ_BRICK_WALL = registerWall(QuartzBlockItemIds.CRACKED_SMOKY_QUARTZ_BRICK_WALL.block(), SMOKY_QUARTZ_BRICKS);
    public static final Block SMOKY_QUARTZ_PILLAR = registerQuartzPillar(QuartzBlockItemIds.SMOKY_QUARTZ_PILLAR.block(), MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block SMOOTH_SMOKY_QUARTZ = registerSmoothQuartz(QuartzBlockItemIds.SMOOTH_SMOKY_QUARTZ.block(), MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block SMOOTH_SMOKY_QUARTZ_STAIRS = registerStairs(QuartzBlockItemIds.SMOOTH_SMOKY_QUARTZ_STAIRS.block(), SMOOTH_SMOKY_QUARTZ);
    public static final Block SMOOTH_SMOKY_QUARTZ_SLAB = registerSlab(QuartzBlockItemIds.SMOOTH_SMOKY_QUARTZ_SLAB.block(), SMOOTH_SMOKY_QUARTZ);
    public static final Block NETHER_SMOKY_QUARTZ_ORE = registerNetherQuartzOre(QuartzBlockItemIds.NETHER_SMOKY_QUARTZ_ORE.block());
    public static final Block SMOKY_QUARTZ_FLOWER_POT = registerPotted(QuartzBlockItemIds.SMOKY_QUARTZ_FLOWER_POT.block(), Blocks.AIR, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_TORCHFLOWER = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_TORCHFLOWER, Blocks.TORCHFLOWER, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_OAK_SAPLING = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_OAK_SAPLING, Blocks.OAK_SAPLING, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING, Blocks.SPRUCE_SAPLING, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_BIRCH_SAPLING = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_BIRCH_SAPLING, Blocks.BIRCH_SAPLING, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING, Blocks.JUNGLE_SAPLING, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_ACACIA_SAPLING = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_ACACIA_SAPLING, Blocks.ACACIA_SAPLING, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_CHERRY_SAPLING = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_CHERRY_SAPLING, Blocks.CHERRY_SAPLING, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING, Blocks.DARK_OAK_SAPLING, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING, Blocks.PALE_OAK_SAPLING, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE, Blocks.MANGROVE_PROPAGULE, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_FERN = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_FERN, Blocks.FERN, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_DANDELION = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_DANDELION, Blocks.DANDELION, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_POPPY = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_POPPY, Blocks.POPPY, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_BLUE_ORCHID = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_BLUE_ORCHID, Blocks.BLUE_ORCHID, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_ALLIUM = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_ALLIUM, Blocks.ALLIUM, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_AZURE_BLUET = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_AZURE_BLUET, Blocks.AZURE_BLUET, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_RED_TULIP = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_RED_TULIP, Blocks.RED_TULIP, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_ORANGE_TULIP = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_ORANGE_TULIP, Blocks.ORANGE_TULIP, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_WHITE_TULIP = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_WHITE_TULIP, Blocks.WHITE_TULIP, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_PINK_TULIP = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_PINK_TULIP, Blocks.PINK_TULIP, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_OXEYE_DAISY = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_OXEYE_DAISY, Blocks.OXEYE_DAISY, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_CORNFLOWER = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_CORNFLOWER, Blocks.CORNFLOWER, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY, Blocks.LILY_OF_THE_VALLEY, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_WITHER_ROSE = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_WITHER_ROSE, Blocks.WITHER_ROSE, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_RED_MUSHROOM = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_RED_MUSHROOM, Blocks.RED_MUSHROOM, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM, Blocks.BROWN_MUSHROOM, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_DEAD_BUSH = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_DEAD_BUSH, Blocks.DEAD_BUSH, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_CACTUS = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_CACTUS, Blocks.CACTUS, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_BAMBOO = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_BAMBOO, Blocks.BAMBOO, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS, Blocks.CRIMSON_FUNGUS, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_WARPED_FUNGUS = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_WARPED_FUNGUS, Blocks.WARPED_FUNGUS, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS, Blocks.CRIMSON_ROOTS, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_WARPED_ROOTS = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_WARPED_ROOTS, Blocks.WARPED_ROOTS, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_AZALEA = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_AZALEA, Blocks.AZALEA, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA = registerPotted(QuartzBlockIds.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA, Blocks.FLOWERING_AZALEA, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM, Blocks.OPEN_EYEBLOSSOM, SmokyQuartzFlowerPot::new);
    public static final Block SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = registerPottedRandomTick(QuartzBlockIds.SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM, Blocks.CLOSED_EYEBLOSSOM, SmokyQuartzFlowerPot::new);

    public static void init() {
    }

    private static Block registerQuartzBlock(final ResourceKey<Block> id, final MapColor mapColor) {
        return register(id, quartzProperties(mapColor));
    }

    private static Block registerQuartzSlab(final ResourceKey<Block> id, final MapColor mapColor) {
        return register(id, SlabBlock::new, quartzProperties(mapColor, 2.0F, 6.0F));
    }

    private static Block registerQuartzPillar(final ResourceKey<Block> id, final MapColor mapColor) {
        return register(id, RotatedPillarBlock::new, quartzProperties(mapColor));
    }

    private static Block registerSmoothQuartz(final ResourceKey<Block> id, final MapColor mapColor) {
        return register(id, quartzProperties(mapColor, 2.0F, 6.0F));
    }

    private static Block registerNetherQuartzOre(final ResourceKey<Block> id) {
        return register(
                id,
                properties -> new DropExperienceBlock(UniformInt.of(2, 5), properties),
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.NETHER)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresCorrectToolForDrops()
                        .strength(3.0F, 3.0F)
                        .sound(SoundType.NETHER_ORE)
        );
    }

    private static Block registerPotted(
            final ResourceKey<Block> id,
            final Block content,
            final BiFunction<Block, BlockBehaviour.Properties, Block> factory
    ) {
        return register(id, properties -> factory.apply(content, properties), flowerPotProperties());
    }

    private static Block registerPottedRandomTick(
            final ResourceKey<Block> id,
            final Block content,
            final BiFunction<Block, BlockBehaviour.Properties, Block> factory
    ) {
        return register(id, properties -> factory.apply(content, properties), flowerPotProperties().randomTicks());
    }

    private static BlockBehaviour.Properties quartzProperties(final MapColor mapColor) {
        return quartzProperties(mapColor, (float) 0.8, (float) 0.8);
    }

    private static BlockBehaviour.Properties quartzProperties(final MapColor mapColor, final float destroyTime, final float explosionResistance) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(destroyTime, explosionResistance);
    }

    private static Block registerStairs(final ResourceKey<Block> id, final Block baseBlock) {
        return register(id, properties -> new StairBlock(baseBlock.defaultBlockState(), properties), BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Block registerSlab(final ResourceKey<Block> id, final Block baseBlock) {
        return register(id, SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Block registerWall(final ResourceKey<Block> id, final Block baseBlock) {
        return register(id, WallBlock::new, BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Block registerPressurePlate(final ResourceKey<Block> id, final Block baseBlock) {
        return register(id, properties -> new PressurePlateBlock(BlockSetType.STONE, properties), BlockBehaviour.Properties.of()
                .mapColor(baseBlock.defaultMapColor())
                .forceSolidOn()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .noCollision()
                .strength(0.5F)
                .pushReaction(PushReaction.DESTROY));
    }

    private static Block registerButton(final ResourceKey<Block> id) {
        return register(id, properties -> new ButtonBlock(BlockSetType.STONE, 20, properties), buttonProperties());
    }

    private static Block register(final ResourceKey<Block> id, final BlockBehaviour.Properties properties) {
        return register(id, Block::new, properties);
    }

    public static Block register(final ResourceKey<Block> id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        var block = factory.apply(properties.setId(id));

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }
}
