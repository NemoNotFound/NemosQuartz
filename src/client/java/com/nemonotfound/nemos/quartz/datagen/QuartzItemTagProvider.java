package com.nemonotfound.nemos.quartz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.quartz.reference.QuartzBlockItemIds.*;
import static com.nemonotfound.nemos.quartz.reference.QuartzItemIds.*;
import static com.nemonotfound.nemos.quartz.tags.QuartzItemTags.QUARTZ;
import static net.minecraft.tags.BlockItemTags.*;

public class QuartzItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public QuartzItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        this.tag(STAIRS.item())
                .add(CRACKED_QUARTZ_BRICK_STAIRS.item())
                .add(QUARTZ_BRICK_STAIRS.item())
                .add(ROSE_QUARTZ_STAIRS.item())
                .add(CRACKED_ROSE_QUARTZ_BRICK_STAIRS.item())
                .add(ROSE_QUARTZ_BRICK_STAIRS.item())
                .add(LEMON_QUARTZ_STAIRS.item())
                .add(CRACKED_LEMON_QUARTZ_BRICK_STAIRS.item())
                .add(LEMON_QUARTZ_BRICK_STAIRS.item())
                .add(GREEN_QUARTZ_STAIRS.item())
                .add(CRACKED_GREEN_QUARTZ_BRICK_STAIRS.item())
                .add(GREEN_QUARTZ_BRICK_STAIRS.item())
                .add(BLUE_QUARTZ_STAIRS.item())
                .add(CRACKED_BLUE_QUARTZ_BRICK_STAIRS.item())
                .add(BLUE_QUARTZ_BRICK_STAIRS.item())
                .add(SMOKY_QUARTZ_STAIRS.item())
                .add(CRACKED_SMOKY_QUARTZ_BRICK_STAIRS.item())
                .add(SMOKY_QUARTZ_BRICK_STAIRS.item());

        this.tag(SLABS.item())
                .add(CRACKED_QUARTZ_BRICK_SLAB.item())
                .add(QUARTZ_BRICK_SLAB.item())
                .add(ROSE_QUARTZ_SLAB.item())
                .add(CRACKED_ROSE_QUARTZ_BRICK_SLAB.item())
                .add(ROSE_QUARTZ_BRICK_SLAB.item())
                .add(LEMON_QUARTZ_SLAB.item())
                .add(CRACKED_LEMON_QUARTZ_BRICK_SLAB.item())
                .add(LEMON_QUARTZ_BRICK_SLAB.item())
                .add(GREEN_QUARTZ_SLAB.item())
                .add(CRACKED_GREEN_QUARTZ_BRICK_SLAB.item())
                .add(GREEN_QUARTZ_BRICK_SLAB.item())
                .add(BLUE_QUARTZ_SLAB.item())
                .add(CRACKED_BLUE_QUARTZ_BRICK_SLAB.item())
                .add(BLUE_QUARTZ_BRICK_SLAB.item())
                .add(SMOKY_QUARTZ_SLAB.item())
                .add(CRACKED_SMOKY_QUARTZ_BRICK_SLAB.item())
                .add(SMOKY_QUARTZ_BRICK_SLAB.item());

        this.tag(WALLS.item())
                .add(CRACKED_QUARTZ_BRICK_WALL.item())
                .add(QUARTZ_BRICK_WALL.item())
                .add(CRACKED_ROSE_QUARTZ_BRICK_WALL.item())
                .add(ROSE_QUARTZ_BRICK_WALL.item())
                .add(CRACKED_LEMON_QUARTZ_BRICK_WALL.item())
                .add(LEMON_QUARTZ_BRICK_WALL.item())
                .add(CRACKED_GREEN_QUARTZ_BRICK_WALL.item())
                .add(GREEN_QUARTZ_BRICK_WALL.item())
                .add(CRACKED_BLUE_QUARTZ_BRICK_WALL.item())
                .add(BLUE_QUARTZ_BRICK_WALL.item())
                .add(CRACKED_SMOKY_QUARTZ_BRICK_WALL.item())
                .add(SMOKY_QUARTZ_BRICK_WALL.item());

        this.tag(BUTTONS.item())
                .add(QUARTZ_BUTTON.item())
                .add(ROSE_QUARTZ_BUTTON.item())
                .add(LEMON_QUARTZ_BUTTON.item())
                .add(GREEN_QUARTZ_BUTTON.item())
                .add(BLUE_QUARTZ_BUTTON.item())
                .add(SMOKY_QUARTZ_BUTTON.item());

        this.tag(QUARTZ)
                .add(ItemIds.QUARTZ)
                .add(ROSE_QUARTZ)
                .add(LEMON_QUARTZ)
                .add(GREEN_QUARTZ)
                .add(BLUE_QUARTZ)
                .add(SMOKY_QUARTZ);
    }
}
