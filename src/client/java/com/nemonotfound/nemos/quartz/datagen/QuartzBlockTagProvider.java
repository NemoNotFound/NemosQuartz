package com.nemonotfound.nemos.quartz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks.*;
import static net.minecraft.tags.BlockTags.*;

public class QuartzBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {

    public QuartzBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        valueLookupBuilder(MINEABLE_WITH_PICKAXE)
                .add(QUARTZ_PRESSURE_PLATE)
                .add(QUARTZ_BUTTON)
                .add(CRACKED_QUARTZ_BRICKS)
                .add(CRACKED_QUARTZ_BRICK_STAIRS)
                .add(CRACKED_QUARTZ_BRICK_SLAB)
                .add(CRACKED_QUARTZ_BRICK_WALL)
                .add(QUARTZ_BRICK_STAIRS)
                .add(QUARTZ_BRICK_SLAB)
                .add(QUARTZ_BRICK_WALL);

        valueLookupBuilder(STAIRS)
                .add(CRACKED_QUARTZ_BRICK_STAIRS)
                .add(QUARTZ_BRICK_STAIRS);

        valueLookupBuilder(SLABS)
                .add(CRACKED_QUARTZ_BRICK_SLAB)
                .add(QUARTZ_BRICK_SLAB);

        valueLookupBuilder(WALLS)
                .add(CRACKED_QUARTZ_BRICK_WALL)
                .add(QUARTZ_BRICK_WALL);

        valueLookupBuilder(FLOWER_POTS)
                .add(QUARTZ_FLOWER_POT)
                .add(QUARTZ_POTTED_TORCHFLOWER)
                .add(QUARTZ_POTTED_OAK_SAPLING)
                .add(QUARTZ_POTTED_SPRUCE_SAPLING)
                .add(QUARTZ_POTTED_BIRCH_SAPLING)
                .add(QUARTZ_POTTED_JUNGLE_SAPLING)
                .add(QUARTZ_POTTED_ACACIA_SAPLING)
                .add(QUARTZ_POTTED_CHERRY_SAPLING)
                .add(QUARTZ_POTTED_DARK_OAK_SAPLING)
                .add(QUARTZ_POTTED_PALE_OAK_SAPLING)
                .add(QUARTZ_POTTED_MANGROVE_PROPAGULE)
                .add(QUARTZ_POTTED_FERN)
                .add(QUARTZ_POTTED_DANDELION)
                .add(QUARTZ_POTTED_POPPY)
                .add(QUARTZ_POTTED_BLUE_ORCHID)
                .add(QUARTZ_POTTED_ALLIUM)
                .add(QUARTZ_POTTED_AZURE_BLUET)
                .add(QUARTZ_POTTED_RED_TULIP)
                .add(QUARTZ_POTTED_ORANGE_TULIP)
                .add(QUARTZ_POTTED_WHITE_TULIP)
                .add(QUARTZ_POTTED_PINK_TULIP)
                .add(QUARTZ_POTTED_OXEYE_DAISY)
                .add(QUARTZ_POTTED_CORNFLOWER)
                .add(QUARTZ_POTTED_LILY_OF_THE_VALLEY)
                .add(QUARTZ_POTTED_WITHER_ROSE)
                .add(QUARTZ_POTTED_RED_MUSHROOM)
                .add(QUARTZ_POTTED_BROWN_MUSHROOM)
                .add(QUARTZ_POTTED_DEAD_BUSH)
                .add(QUARTZ_POTTED_CACTUS)
                .add(QUARTZ_POTTED_BAMBOO)
                .add(QUARTZ_POTTED_CRIMSON_FUNGUS)
                .add(QUARTZ_POTTED_WARPED_FUNGUS)
                .add(QUARTZ_POTTED_CRIMSON_ROOTS)
                .add(QUARTZ_POTTED_WARPED_ROOTS)
                .add(QUARTZ_POTTED_AZALEA)
                .add(QUARTZ_POTTED_FLOWERING_AZALEA)
                .add(QUARTZ_POTTED_OPEN_EYEBLOSSOM)
                .add(QUARTZ_POTTED_CLOSED_EYEBLOSSOM);

        valueLookupBuilder(STONE_PRESSURE_PLATES)
                .add(QUARTZ_PRESSURE_PLATE);

        valueLookupBuilder(STONE_BUTTONS)
                .add(QUARTZ_BUTTON);
    }
}
