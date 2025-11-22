package com.nemonotfound.nemos.quartz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.quartz.world.item.QuartzItems.*;
import static net.minecraft.tags.ItemTags.*;

public class QuartzItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public QuartzItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(STAIRS)
                .add(CRACKED_QUARTZ_BRICK_STAIRS.get())
                .add(QUARTZ_BRICK_STAIRS.get());

        valueLookupBuilder(SLABS)
                .add(CRACKED_QUARTZ_BRICK_SLAB.get())
                .add(QUARTZ_BRICK_SLAB.get());

        valueLookupBuilder(WALLS)
                .add(CRACKED_QUARTZ_BRICK_WALL.get())
                .add(QUARTZ_BRICK_WALL.get());

        valueLookupBuilder(BUTTONS)
                .add(QUARTZ_BUTTON.get());
    }
}
