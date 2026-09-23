package com.nemonotfound.nemos.quartz.world.level.levelgen.placement;

import com.nemonotfound.nemos.quartz.world.level.levelgen.feature.QuartzFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;

public final class QuartzPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ORE_QUARTZ_NETHER = resourceKey("ore_quartz_nether");
    public static final ResourceKey<PlacedFeature> ORE_QUARTZ_DELTAS = resourceKey("ore_quartz_deltas");

    private QuartzPlacedFeatures() {
    }

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var selector = context.lookup(Registries.FEATURE).getOrThrow(QuartzFeatures.ORE_QUARTZ_SELECTOR);

        context.register(ORE_QUARTZ_NETHER, placed(selector, 16));
        context.register(ORE_QUARTZ_DELTAS, placed(selector, 32));
    }

    public static void init() {
        var netherBiomes = BiomeSelectors.foundInTheNether();
        var basaltDeltas = BiomeSelectors.includeByKey(Biomes.BASALT_DELTAS);

        BiomeModifications.create(Identifier.fromNamespaceAndPath(MOD_ID, "replace_quartz_ore"))
                .add(ModificationPhase.REMOVALS, netherBiomes, context -> {
                    var generation = context.getGenerationSettings();
                    generation.removeFeature(OrePlacements.ORE_QUARTZ_NETHER);
                    generation.removeFeature(OrePlacements.ORE_QUARTZ_DELTAS);
                })
                .add(ModificationPhase.ADDITIONS, netherBiomes.and(basaltDeltas.negate()), context ->
                        context.getGenerationSettings().addFeature(
                                GenerationStep.Decoration.UNDERGROUND_ORES,
                                ORE_QUARTZ_NETHER
                        ))
                .add(ModificationPhase.ADDITIONS, basaltDeltas, context ->
                        context.getGenerationSettings().addFeature(
                                GenerationStep.Decoration.UNDERGROUND_ORES,
                                ORE_QUARTZ_DELTAS
                        ));
    }

    private static PlacedFeature placed(Holder<Feature> feature, int count) {
        return new PlacedFeature(
                feature,
                List.of(
                        CountPlacement.of(count),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10)),
                        BiomeFilter.biome()
                )
        );
    }

    private static ResourceKey<PlacedFeature> resourceKey(String path) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, path));
    }
}
