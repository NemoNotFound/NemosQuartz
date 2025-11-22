package com.nemonotfound.nemos.quartz.world.level.block;

import com.nemonotfound.nemos.quartz.platform.Services;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;
import java.util.function.Supplier;

public class QuartzBlocks {

    public static final Supplier<Block> QUARTZ_PRESSURE_PLATE = registerPressurePlate("quartz_pressure_plate", Blocks.QUARTZ_BLOCK, BlockSetType.STONE, NoteBlockInstrument.BASEDRUM);
    public static final Supplier<Block> QUARTZ_BUTTON = registerButton("quartz_button", BlockSetType.STONE);
    public static final Supplier<Block> CRACKED_QUARTZ_BRICKS = register("cracked_quartz_bricks", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS));
    public static final Supplier<Block> CRACKED_QUARTZ_BRICK_STAIRS = registerStairs("cracked_quartz_brick_stairs", Blocks.QUARTZ_BRICKS);
    public static final Supplier<Block> CRACKED_QUARTZ_BRICK_SLAB = registerSlab("cracked_quartz_brick_slab", Blocks.QUARTZ_BRICKS);
    public static final Supplier<Block> CRACKED_QUARTZ_BRICK_WALL = registerWall("cracked_quartz_brick_wall", Blocks.QUARTZ_BRICKS);
    public static final Supplier<Block> QUARTZ_BRICK_STAIRS = registerStairs("quartz_brick_stairs", Blocks.QUARTZ_BRICKS);
    public static final Supplier<Block> QUARTZ_BRICK_SLAB = registerSlab("quartz_brick_slab", Blocks.QUARTZ_BRICKS);
    public static final Supplier<Block> QUARTZ_BRICK_WALL = registerWall("quartz_brick_wall", Blocks.QUARTZ_BRICKS);
    public static final Supplier<Block> QUARTZ_FLOWER_POT = register("quartz_flower_pot", (properties -> new QuartzFlowerPot(Blocks.AIR, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_TORCHFLOWER = register("quartz_potted_torchflower", (properties -> new QuartzFlowerPot(Blocks.TORCHFLOWER, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_OAK_SAPLING = register("quartz_potted_oak_sapling", (properties -> new QuartzFlowerPot(Blocks.OAK_SAPLING, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_SPRUCE_SAPLING = register("quartz_potted_spruce_sapling", (properties -> new QuartzFlowerPot(Blocks.SPRUCE_SAPLING, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_BIRCH_SAPLING = register("quartz_potted_birch_sapling", (properties -> new QuartzFlowerPot(Blocks.BIRCH_SAPLING, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_JUNGLE_SAPLING = register("quartz_potted_jungle_sapling", (properties -> new QuartzFlowerPot(Blocks.JUNGLE_SAPLING, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_ACACIA_SAPLING = register("quartz_potted_acacia_sapling", (properties -> new QuartzFlowerPot(Blocks.ACACIA_SAPLING, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_CHERRY_SAPLING = register("quartz_potted_cherry_sapling", (properties -> new QuartzFlowerPot(Blocks.CHERRY_SAPLING, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_DARK_OAK_SAPLING = register("quartz_potted_dark_oak_sapling", (properties -> new QuartzFlowerPot(Blocks.DARK_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_PALE_OAK_SAPLING = register("quartz_potted_pale_oak_sapling", (properties -> new QuartzFlowerPot(Blocks.PALE_OAK_SAPLING, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_MANGROVE_PROPAGULE = register("quartz_potted_mangrove_propagule", (properties -> new QuartzFlowerPot(Blocks.MANGROVE_PROPAGULE, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_FERN = register("quartz_potted_fern", (properties -> new QuartzFlowerPot(Blocks.FERN, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_DANDELION = register("quartz_potted_dandelion", (properties -> new QuartzFlowerPot(Blocks.DANDELION, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_POPPY = register("quartz_potted_poppy", (properties -> new QuartzFlowerPot(Blocks.POPPY, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_BLUE_ORCHID = register("quartz_potted_blue_orchid", (properties -> new QuartzFlowerPot(Blocks.BLUE_ORCHID, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_ALLIUM = register("quartz_potted_allium", (properties -> new QuartzFlowerPot(Blocks.ALLIUM, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_AZURE_BLUET = register("quartz_potted_azure_bluet", (properties -> new QuartzFlowerPot(Blocks.AZURE_BLUET, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_RED_TULIP = register("quartz_potted_red_tulip", (properties -> new QuartzFlowerPot(Blocks.RED_TULIP, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_ORANGE_TULIP = register("quartz_potted_orange_tulip", (properties -> new QuartzFlowerPot(Blocks.ORANGE_TULIP, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_WHITE_TULIP = register("quartz_potted_white_tulip", (properties -> new QuartzFlowerPot(Blocks.WHITE_TULIP, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_PINK_TULIP = register("quartz_potted_pink_tulip", (properties -> new QuartzFlowerPot(Blocks.PINK_TULIP, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_OXEYE_DAISY = register("quartz_potted_oxeye_daisy", (properties -> new QuartzFlowerPot(Blocks.OXEYE_DAISY, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_CORNFLOWER = register("quartz_potted_cornflower", (properties -> new QuartzFlowerPot(Blocks.CORNFLOWER, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_LILY_OF_THE_VALLEY = register("quartz_potted_lily_of_the_valley", (properties -> new QuartzFlowerPot(Blocks.LILY_OF_THE_VALLEY, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_WITHER_ROSE = register("quartz_potted_wither_rose", (properties -> new QuartzFlowerPot(Blocks.WITHER_ROSE, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_RED_MUSHROOM = register("quartz_potted_red_mushroom", (properties -> new QuartzFlowerPot(Blocks.RED_MUSHROOM, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_BROWN_MUSHROOM = register("quartz_potted_brown_mushroom", (properties -> new QuartzFlowerPot(Blocks.BROWN_MUSHROOM, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_DEAD_BUSH = register("quartz_potted_dead_bush", (properties -> new QuartzFlowerPot(Blocks.DEAD_BUSH, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_CACTUS = register("quartz_potted_cactus", (properties -> new QuartzFlowerPot(Blocks.CACTUS, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_BAMBOO = register("quartz_potted_bamboo", (properties -> new QuartzFlowerPot(Blocks.BAMBOO, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_CRIMSON_FUNGUS = register("quartz_potted_crimson_fungus", (properties -> new QuartzFlowerPot(Blocks.CRIMSON_FUNGUS, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_WARPED_FUNGUS = register("quartz_potted_warped_fungus", (properties -> new QuartzFlowerPot(Blocks.WARPED_FUNGUS, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_CRIMSON_ROOTS = register("quartz_potted_crimson_roots", (properties -> new QuartzFlowerPot(Blocks.CRIMSON_ROOTS, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_WARPED_ROOTS = register("quartz_potted_warped_roots", (properties -> new QuartzFlowerPot(Blocks.WARPED_ROOTS, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_AZALEA = register("quartz_potted_azalea_bush", (properties -> new QuartzFlowerPot(Blocks.AZALEA, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_FLOWERING_AZALEA = register("quartz_potted_flowering_azalea_bush", (properties -> new QuartzFlowerPot(Blocks.FLOWERING_AZALEA, properties)), flowerPotProperties());
    public static final Supplier<Block> QUARTZ_POTTED_OPEN_EYEBLOSSOM = register("quartz_potted_open_eyeblossom", (properties -> new QuartzFlowerPot(Blocks.OPEN_EYEBLOSSOM, properties)), flowerPotProperties().randomTicks());
    public static final Supplier<Block> QUARTZ_POTTED_CLOSED_EYEBLOSSOM = register("quartz_potted_closed_eyeblossom", (properties -> new QuartzFlowerPot(Blocks.CLOSED_EYEBLOSSOM, properties)), flowerPotProperties().randomTicks());

    public static void init() {
    }

    private static Supplier<Block> registerStairs(String id, Block baseBlock) {
        return register(id, (properties) -> new StairBlock(baseBlock.defaultBlockState(), properties), BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Supplier<Block> registerSlab(String id, Block baseBlock) {
        return register(id, SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Supplier<Block> registerWall(String id, Block baseBlock) {
        return register(id, WallBlock::new, BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    private static Supplier<Block> registerPressurePlate(String id, Block baseBlock, BlockSetType blockSetType, NoteBlockInstrument noteBlockInstrument) {
        return register(id, (properties) -> new PressurePlateBlock(blockSetType, properties), BlockBehaviour.Properties.of()
                .mapColor(baseBlock.defaultMapColor())
                .forceSolidOn()
                .instrument(noteBlockInstrument)
                .noCollision()
                .strength(0.5F)
                .pushReaction(PushReaction.DESTROY));
    }

    private static Supplier<Block> registerButton(String id, BlockSetType blockSetType) {
        return register(id, (properties) -> new ButtonBlock(blockSetType, 20, properties), buttonProperties());
    }

    private static Supplier<Block> register(String id, Function<BlockBehaviour.Properties, Block> blockFunction, BlockBehaviour.Properties properties) {
        return Services.REGISTRY_HELPER.registerBlock(id, blockFunction, properties);
    }

    private static BlockBehaviour.Properties flowerPotProperties() {
        return BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
    }

    private static BlockBehaviour.Properties buttonProperties() {
        return BlockBehaviour.Properties.of().noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY);
    }
}
