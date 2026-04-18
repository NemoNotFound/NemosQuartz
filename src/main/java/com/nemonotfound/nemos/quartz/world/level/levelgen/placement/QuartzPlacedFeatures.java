package com.nemonotfound.nemos.quartz.world.level.levelgen.placement;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;

public class QuartzPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ORE_ROSE_QUARTZ_NETHER = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_rose_quartz_nether"));
    public static final ResourceKey<PlacedFeature> ORE_ROSE_QUARTZ_DELTAS = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_rose_quartz_deltas"));
    public static final ResourceKey<PlacedFeature> ORE_LEMON_QUARTZ_NETHER = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_lemon_quartz_nether"));
    public static final ResourceKey<PlacedFeature> ORE_LEMON_QUARTZ_DELTAS = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_lemon_quartz_deltas"));
    public static final ResourceKey<PlacedFeature> ORE_GREEN_QUARTZ_NETHER = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_green_quartz_nether"));
    public static final ResourceKey<PlacedFeature> ORE_GREEN_QUARTZ_DELTAS = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_green_quartz_deltas"));
    public static final ResourceKey<PlacedFeature> ORE_BLUE_QUARTZ_NETHER = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_blue_quartz_nether"));
    public static final ResourceKey<PlacedFeature> ORE_BLUE_QUARTZ_DELTAS = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_blue_quartz_deltas"));
    public static final ResourceKey<PlacedFeature> ORE_SMOKY_QUARTZ_NETHER = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_smoky_quartz_nether"));
    public static final ResourceKey<PlacedFeature> ORE_SMOKY_QUARTZ_DELTAS = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID,"ore_smoky_quartz_deltas"));

    public static void init() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_ROSE_QUARTZ_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_ROSE_QUARTZ_DELTAS);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_LEMON_QUARTZ_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_LEMON_QUARTZ_DELTAS);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_GREEN_QUARTZ_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_GREEN_QUARTZ_DELTAS);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_BLUE_QUARTZ_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_BLUE_QUARTZ_DELTAS);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_SMOKY_QUARTZ_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, ORE_SMOKY_QUARTZ_DELTAS);
    }
}
