package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.quartz.Constants.MOD_ID;

public class QuartzLangProvider extends FabricLanguageProvider {

    public QuartzLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(QuartzItems.QUARTZ_PRESSURE_PLATE.get(), "Quartz Pressure Plate");
        translationBuilder.add(QuartzItems.QUARTZ_BUTTON.get(), "Quartz Button");
        translationBuilder.add(QuartzItems.CRACKED_QUARTZ_BRICKS.get(), "Cracked Quartz Bricks");
        translationBuilder.add(QuartzItems.CRACKED_QUARTZ_BRICK_STAIRS.get(), "Cracked Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.CRACKED_QUARTZ_BRICK_SLAB.get(), "Cracked Quartz Brick Slab");
        translationBuilder.add(QuartzItems.CRACKED_QUARTZ_BRICK_WALL.get(), "Cracked Quartz Brick Wall");
        translationBuilder.add(QuartzItems.QUARTZ_BRICK_STAIRS.get(), "Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.QUARTZ_BRICK_SLAB.get(), "Quartz Brick Slab");
        translationBuilder.add(QuartzItems.QUARTZ_BRICK_WALL.get(), "Quartz Brick Wall");
        translationBuilder.add(QuartzItems.QUARTZ_FLOWER_POT.get(), "Quartz Flower Pot");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Quartz");
    }
}
