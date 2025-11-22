package com.nemonotfound.nemos.quartz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks.*;
import static net.minecraft.tags.BlockTags.*;

public class QuartzBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public QuartzBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(MINEABLE_WITH_PICKAXE)
                .add(QUARTZ_PRESSURE_PLATE.get())
                .add(QUARTZ_BUTTON.get())
                .add(CRACKED_QUARTZ_BRICKS.get())
                .add(CRACKED_QUARTZ_BRICK_STAIRS.get())
                .add(CRACKED_QUARTZ_BRICK_SLAB.get())
                .add(CRACKED_QUARTZ_BRICK_WALL.get())
                .add(QUARTZ_BRICK_STAIRS.get())
                .add(QUARTZ_BRICK_SLAB.get())
                .add(QUARTZ_BRICK_WALL.get());

        valueLookupBuilder(STAIRS)
                .add(CRACKED_QUARTZ_BRICK_STAIRS.get())
                .add(QUARTZ_BRICK_STAIRS.get());

        valueLookupBuilder(SLABS)
                .add(CRACKED_QUARTZ_BRICK_SLAB.get())
                .add(QUARTZ_BRICK_SLAB.get());

        valueLookupBuilder(WALLS)
                .add(CRACKED_QUARTZ_BRICK_WALL.get())
                .add(QUARTZ_BRICK_WALL.get());

        valueLookupBuilder(FLOWER_POTS)
                .add(QUARTZ_FLOWER_POT.get())
                .add(QUARTZ_POTTED_TORCHFLOWER.get())
                .add(QUARTZ_POTTED_OAK_SAPLING.get())
                .add(QUARTZ_POTTED_SPRUCE_SAPLING.get())
                .add(QUARTZ_POTTED_BIRCH_SAPLING.get())
                .add(QUARTZ_POTTED_JUNGLE_SAPLING.get())
                .add(QUARTZ_POTTED_ACACIA_SAPLING.get())
                .add(QUARTZ_POTTED_CHERRY_SAPLING.get())
                .add(QUARTZ_POTTED_DARK_OAK_SAPLING.get())
                .add(QUARTZ_POTTED_PALE_OAK_SAPLING.get())
                .add(QUARTZ_POTTED_MANGROVE_PROPAGULE.get())
                .add(QUARTZ_POTTED_FERN.get())
                .add(QUARTZ_POTTED_DANDELION.get())
                .add(QUARTZ_POTTED_POPPY.get())
                .add(QUARTZ_POTTED_BLUE_ORCHID.get())
                .add(QUARTZ_POTTED_ALLIUM.get())
                .add(QUARTZ_POTTED_AZURE_BLUET.get())
                .add(QUARTZ_POTTED_RED_TULIP.get())
                .add(QUARTZ_POTTED_ORANGE_TULIP.get())
                .add(QUARTZ_POTTED_WHITE_TULIP.get())
                .add(QUARTZ_POTTED_PINK_TULIP.get())
                .add(QUARTZ_POTTED_OXEYE_DAISY.get())
                .add(QUARTZ_POTTED_CORNFLOWER.get())
                .add(QUARTZ_POTTED_LILY_OF_THE_VALLEY.get())
                .add(QUARTZ_POTTED_WITHER_ROSE.get())
                .add(QUARTZ_POTTED_RED_MUSHROOM.get())
                .add(QUARTZ_POTTED_BROWN_MUSHROOM.get())
                .add(QUARTZ_POTTED_DEAD_BUSH.get())
                .add(QUARTZ_POTTED_CACTUS.get())
                .add(QUARTZ_POTTED_BAMBOO.get())
                .add(QUARTZ_POTTED_CRIMSON_FUNGUS.get())
                .add(QUARTZ_POTTED_WARPED_FUNGUS.get())
                .add(QUARTZ_POTTED_CRIMSON_ROOTS.get())
                .add(QUARTZ_POTTED_WARPED_ROOTS.get())
                .add(QUARTZ_POTTED_AZALEA.get())
                .add(QUARTZ_POTTED_FLOWERING_AZALEA.get())
                .add(QUARTZ_POTTED_OPEN_EYEBLOSSOM.get())
                .add(QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get());

        valueLookupBuilder(STONE_PRESSURE_PLATES)
                .add(QUARTZ_PRESSURE_PLATE.get());

        valueLookupBuilder(STONE_BUTTONS)
                .add(QUARTZ_BUTTON.get());
    }
}
