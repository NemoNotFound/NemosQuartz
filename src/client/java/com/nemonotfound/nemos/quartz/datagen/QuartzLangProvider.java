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
        translationBuilder.add(QuartzItems.NETHER_ROSE_QUARTZ_ORE, "Nether Rose Quartz Ore");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ, "Rose Quartz");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_BLOCK, "Rose Quartz Block");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_STAIRS, "Rose Quartz Stairs");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_SLAB, "Rose Quartz Slab");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_PRESSURE_PLATE, "Rose Quartz Pressure Plate");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_BUTTON, "Rose Quartz Button");
        translationBuilder.add(QuartzItems.CHISELED_ROSE_QUARTZ_BLOCK, "Chiseled Rose Quartz Block");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_BRICKS, "Rose Quartz Bricks");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_BRICK_STAIRS, "Rose Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_BRICK_SLAB, "Rose Quartz Brick Slab");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_BRICK_WALL, "Rose Quartz Brick Wall");
        translationBuilder.add(QuartzItems.CRACKED_ROSE_QUARTZ_BRICKS, "Cracked Rose Quartz Bricks");
        translationBuilder.add(QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_STAIRS, "Cracked Rose Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_SLAB, "Cracked Rose Quartz Brick Slab");
        translationBuilder.add(QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_WALL, "Cracked Rose Quartz Brick Wall");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_PILLAR, "Rose Quartz Pillar");
        translationBuilder.add(QuartzItems.SMOOTH_ROSE_QUARTZ, "Smooth Rose Quartz");
        translationBuilder.add(QuartzItems.SMOOTH_ROSE_QUARTZ_STAIRS, "Smooth Rose Quartz Stairs");
        translationBuilder.add(QuartzItems.SMOOTH_ROSE_QUARTZ_SLAB, "Smooth Rose Quartz Slab");
        translationBuilder.add(QuartzItems.ROSE_QUARTZ_FLOWER_POT, "Rose Quartz Flower Pot");
        translationBuilder.add(QuartzItems.NETHER_LEMON_QUARTZ_ORE, "Nether Lemon Quartz Ore");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ, "Lemon Quartz");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_BLOCK, "Lemon Quartz Block");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_STAIRS, "Lemon Quartz Stairs");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_SLAB, "Lemon Quartz Slab");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_PRESSURE_PLATE, "Lemon Quartz Pressure Plate");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_BUTTON, "Lemon Quartz Button");
        translationBuilder.add(QuartzItems.CHISELED_LEMON_QUARTZ_BLOCK, "Chiseled Lemon Quartz Block");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_BRICKS, "Lemon Quartz Bricks");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_BRICK_STAIRS, "Lemon Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_BRICK_SLAB, "Lemon Quartz Brick Slab");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_BRICK_WALL, "Lemon Quartz Brick Wall");
        translationBuilder.add(QuartzItems.CRACKED_LEMON_QUARTZ_BRICKS, "Cracked Lemon Quartz Bricks");
        translationBuilder.add(QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_STAIRS, "Cracked Lemon Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_SLAB, "Cracked Lemon Quartz Brick Slab");
        translationBuilder.add(QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_WALL, "Cracked Lemon Quartz Brick Wall");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_PILLAR, "Lemon Quartz Pillar");
        translationBuilder.add(QuartzItems.SMOOTH_LEMON_QUARTZ, "Smooth Lemon Quartz");
        translationBuilder.add(QuartzItems.SMOOTH_LEMON_QUARTZ_STAIRS, "Smooth Lemon Quartz Stairs");
        translationBuilder.add(QuartzItems.SMOOTH_LEMON_QUARTZ_SLAB, "Smooth Lemon Quartz Slab");
        translationBuilder.add(QuartzItems.LEMON_QUARTZ_FLOWER_POT, "Lemon Quartz Flower Pot");
        translationBuilder.add(QuartzItems.NETHER_GREEN_QUARTZ_ORE, "Nether Green Quartz Ore");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ, "Green Quartz");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_BLOCK, "Green Quartz Block");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_STAIRS, "Green Quartz Stairs");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_SLAB, "Green Quartz Slab");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_PRESSURE_PLATE, "Green Quartz Pressure Plate");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_BUTTON, "Green Quartz Button");
        translationBuilder.add(QuartzItems.CHISELED_GREEN_QUARTZ_BLOCK, "Chiseled Green Quartz Block");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_BRICKS, "Green Quartz Bricks");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_BRICK_STAIRS, "Green Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_BRICK_SLAB, "Green Quartz Brick Slab");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_BRICK_WALL, "Green Quartz Brick Wall");
        translationBuilder.add(QuartzItems.CRACKED_GREEN_QUARTZ_BRICKS, "Cracked Green Quartz Bricks");
        translationBuilder.add(QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_STAIRS, "Cracked Green Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_SLAB, "Cracked Green Quartz Brick Slab");
        translationBuilder.add(QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_WALL, "Cracked Green Quartz Brick Wall");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_PILLAR, "Green Quartz Pillar");
        translationBuilder.add(QuartzItems.SMOOTH_GREEN_QUARTZ, "Smooth Green Quartz");
        translationBuilder.add(QuartzItems.SMOOTH_GREEN_QUARTZ_STAIRS, "Smooth Green Quartz Stairs");
        translationBuilder.add(QuartzItems.SMOOTH_GREEN_QUARTZ_SLAB, "Smooth Green Quartz Slab");
        translationBuilder.add(QuartzItems.GREEN_QUARTZ_FLOWER_POT, "Green Quartz Flower Pot");
        translationBuilder.add(QuartzItems.NETHER_BLUE_QUARTZ_ORE, "Nether Blue Quartz Ore");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ, "Blue Quartz");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_BLOCK, "Blue Quartz Block");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_STAIRS, "Blue Quartz Stairs");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_SLAB, "Blue Quartz Slab");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_PRESSURE_PLATE, "Blue Quartz Pressure Plate");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_BUTTON, "Blue Quartz Button");
        translationBuilder.add(QuartzItems.CHISELED_BLUE_QUARTZ_BLOCK, "Chiseled Blue Quartz Block");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_BRICKS, "Blue Quartz Bricks");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_BRICK_STAIRS, "Blue Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_BRICK_SLAB, "Blue Quartz Brick Slab");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_BRICK_WALL, "Blue Quartz Brick Wall");
        translationBuilder.add(QuartzItems.CRACKED_BLUE_QUARTZ_BRICKS, "Cracked Blue Quartz Bricks");
        translationBuilder.add(QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_STAIRS, "Cracked Blue Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_SLAB, "Cracked Blue Quartz Brick Slab");
        translationBuilder.add(QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_WALL, "Cracked Blue Quartz Brick Wall");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_PILLAR, "Blue Quartz Pillar");
        translationBuilder.add(QuartzItems.SMOOTH_BLUE_QUARTZ, "Smooth Blue Quartz");
        translationBuilder.add(QuartzItems.SMOOTH_BLUE_QUARTZ_STAIRS, "Smooth Blue Quartz Stairs");
        translationBuilder.add(QuartzItems.SMOOTH_BLUE_QUARTZ_SLAB, "Smooth Blue Quartz Slab");
        translationBuilder.add(QuartzItems.BLUE_QUARTZ_FLOWER_POT, "Blue Quartz Flower Pot");
        translationBuilder.add(QuartzItems.NETHER_SMOKY_QUARTZ_ORE, "Nether Smoky Quartz Ore");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ, "Smoky Quartz");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_BLOCK, "Smoky Quartz Block");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_STAIRS, "Smoky Quartz Stairs");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_SLAB, "Smoky Quartz Slab");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_PRESSURE_PLATE, "Smoky Quartz Pressure Plate");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_BUTTON, "Smoky Quartz Button");
        translationBuilder.add(QuartzItems.CHISELED_SMOKY_QUARTZ_BLOCK, "Chiseled Smoky Quartz Block");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_BRICKS, "Smoky Quartz Bricks");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_BRICK_STAIRS, "Smoky Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_BRICK_SLAB, "Smoky Quartz Brick Slab");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_BRICK_WALL, "Smoky Quartz Brick Wall");
        translationBuilder.add(QuartzItems.CRACKED_SMOKY_QUARTZ_BRICKS, "Cracked Smoky Quartz Bricks");
        translationBuilder.add(QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS, "Cracked Smoky Quartz Brick Stairs");
        translationBuilder.add(QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_SLAB, "Cracked Smoky Quartz Brick Slab");
        translationBuilder.add(QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_WALL, "Cracked Smoky Quartz Brick Wall");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_PILLAR, "Smoky Quartz Pillar");
        translationBuilder.add(QuartzItems.SMOOTH_SMOKY_QUARTZ, "Smooth Smoky Quartz");
        translationBuilder.add(QuartzItems.SMOOTH_SMOKY_QUARTZ_STAIRS, "Smooth Smoky Quartz Stairs");
        translationBuilder.add(QuartzItems.SMOOTH_SMOKY_QUARTZ_SLAB, "Smooth Smoky Quartz Slab");
        translationBuilder.add(QuartzItems.SMOKY_QUARTZ_FLOWER_POT, "Smoky Quartz Flower Pot");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Quartz");
    }
}
