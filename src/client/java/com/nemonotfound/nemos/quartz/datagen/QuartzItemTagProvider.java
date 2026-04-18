package com.nemonotfound.nemos.quartz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.quartz.tags.QuartzItemTags.QUARTZ;
import static com.nemonotfound.nemos.quartz.world.item.QuartzItems.*;
import static net.minecraft.tags.ItemTags.*;

public class QuartzItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public QuartzItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        valueLookupBuilder(STAIRS)
                .add(CRACKED_QUARTZ_BRICK_STAIRS)
                .add(QUARTZ_BRICK_STAIRS)
                .add(ROSE_QUARTZ_STAIRS)
                .add(CRACKED_ROSE_QUARTZ_BRICK_STAIRS)
                .add(ROSE_QUARTZ_BRICK_STAIRS)
                .add(LEMON_QUARTZ_STAIRS)
                .add(CRACKED_LEMON_QUARTZ_BRICK_STAIRS)
                .add(LEMON_QUARTZ_BRICK_STAIRS)
                .add(GREEN_QUARTZ_STAIRS)
                .add(CRACKED_GREEN_QUARTZ_BRICK_STAIRS)
                .add(GREEN_QUARTZ_BRICK_STAIRS)
                .add(BLUE_QUARTZ_STAIRS)
                .add(CRACKED_BLUE_QUARTZ_BRICK_STAIRS)
                .add(BLUE_QUARTZ_BRICK_STAIRS)
                .add(SMOKY_QUARTZ_STAIRS)
                .add(CRACKED_SMOKY_QUARTZ_BRICK_STAIRS)
                .add(SMOKY_QUARTZ_BRICK_STAIRS);

        valueLookupBuilder(SLABS)
                .add(CRACKED_QUARTZ_BRICK_SLAB)
                .add(QUARTZ_BRICK_SLAB)
                .add(ROSE_QUARTZ_SLAB)
                .add(CRACKED_ROSE_QUARTZ_BRICK_SLAB)
                .add(ROSE_QUARTZ_BRICK_SLAB)
                .add(LEMON_QUARTZ_SLAB)
                .add(CRACKED_LEMON_QUARTZ_BRICK_SLAB)
                .add(LEMON_QUARTZ_BRICK_SLAB)
                .add(GREEN_QUARTZ_SLAB)
                .add(CRACKED_GREEN_QUARTZ_BRICK_SLAB)
                .add(GREEN_QUARTZ_BRICK_SLAB)
                .add(BLUE_QUARTZ_SLAB)
                .add(CRACKED_BLUE_QUARTZ_BRICK_SLAB)
                .add(BLUE_QUARTZ_BRICK_SLAB)
                .add(SMOKY_QUARTZ_SLAB)
                .add(CRACKED_SMOKY_QUARTZ_BRICK_SLAB)
                .add(SMOKY_QUARTZ_BRICK_SLAB);

        valueLookupBuilder(WALLS)
                .add(CRACKED_QUARTZ_BRICK_WALL)
                .add(QUARTZ_BRICK_WALL)
                .add(CRACKED_ROSE_QUARTZ_BRICK_WALL)
                .add(ROSE_QUARTZ_BRICK_WALL)
                .add(CRACKED_LEMON_QUARTZ_BRICK_WALL)
                .add(LEMON_QUARTZ_BRICK_WALL)
                .add(CRACKED_GREEN_QUARTZ_BRICK_WALL)
                .add(GREEN_QUARTZ_BRICK_WALL)
                .add(CRACKED_BLUE_QUARTZ_BRICK_WALL)
                .add(BLUE_QUARTZ_BRICK_WALL)
                .add(CRACKED_SMOKY_QUARTZ_BRICK_WALL)
                .add(SMOKY_QUARTZ_BRICK_WALL);

        valueLookupBuilder(BUTTONS)
                .add(QUARTZ_BUTTON)
                .add(ROSE_QUARTZ_BUTTON)
                .add(LEMON_QUARTZ_BUTTON)
                .add(GREEN_QUARTZ_BUTTON)
                .add(BLUE_QUARTZ_BUTTON)
                .add(SMOKY_QUARTZ_BUTTON);

        valueLookupBuilder(QUARTZ)
                .add(Items.QUARTZ)
                .add(ROSE_QUARTZ)
                .add(LEMON_QUARTZ)
                .add(GREEN_QUARTZ)
                .add(BLUE_QUARTZ)
                .add(SMOKY_QUARTZ);
    }
}
