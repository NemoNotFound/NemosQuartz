package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;

public class QuartzLangProvider extends FabricLanguageProvider {

    public QuartzLangProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(QuartzItems.QUARTZ_PRESSURE_PLATE, "Quartz Pressure Plate");
        translationBuilder.add(QuartzItems.QUARTZ_BUTTON, "Quartz Button");
        translationBuilder.add(QuartzItems.CRACKED_QUARTZ_BRICKS, "Cracked Quartz Bricks");
        translationBuilder.add(QuartzItems.CRACKED_QUARTZ_BRICK_STAIRS, "Cracked Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.CRACKED_QUARTZ_BRICK_SLAB, "Cracked Quartz Brick Slab");
        translationBuilder.add(QuartzItems.CRACKED_QUARTZ_BRICK_WALL, "Cracked Quartz Brick Wall");
        translationBuilder.add(QuartzItems.QUARTZ_BRICK_STAIRS, "Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.QUARTZ_BRICK_SLAB, "Quartz Brick Slab");
        translationBuilder.add(QuartzItems.QUARTZ_BRICK_WALL, "Quartz Brick Wall");
        translationBuilder.add(QuartzItems.QUARTZ_FLOWER_POT, "Quartz Flower Pot");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Quartz");
    }
}
