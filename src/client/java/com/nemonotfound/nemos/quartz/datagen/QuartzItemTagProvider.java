package com.nemonotfound.nemos.quartz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

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
                .add(QUARTZ_BRICK_STAIRS);

        valueLookupBuilder(SLABS)
                .add(CRACKED_QUARTZ_BRICK_SLAB)
                .add(QUARTZ_BRICK_SLAB);

        valueLookupBuilder(WALLS)
                .add(CRACKED_QUARTZ_BRICK_WALL)
                .add(QUARTZ_BRICK_WALL);

        valueLookupBuilder(BUTTONS)
                .add(QUARTZ_BUTTON);
    }
}
