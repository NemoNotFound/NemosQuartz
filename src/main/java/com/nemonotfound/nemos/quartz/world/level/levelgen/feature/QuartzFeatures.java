package com.nemonotfound.nemos.quartz.world.level.levelgen.feature;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.SimpleRandomSelectorFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;
import static com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks.*;

public final class QuartzFeatures {

    public static final ResourceKey<Feature> ORE_QUARTZ_SELECTOR = resourceKey("ore_quartz_selector");
    private static final ResourceKey<Feature> ORE_QUARTZ = resourceKey("ore_quartz");
    private static final ResourceKey<Feature> ORE_ROSE_QUARTZ = resourceKey("ore_rose_quartz");
    private static final ResourceKey<Feature> ORE_LEMON_QUARTZ = resourceKey("ore_lemon_quartz");
    private static final ResourceKey<Feature> ORE_GREEN_QUARTZ = resourceKey("ore_green_quartz");
    private static final ResourceKey<Feature> ORE_BLUE_QUARTZ = resourceKey("ore_blue_quartz");
    private static final ResourceKey<Feature> ORE_SMOKY_QUARTZ = resourceKey("ore_smoky_quartz");

    private QuartzFeatures() {
    }

    public static void bootstrap(BootstrapContext<Feature> context) {
        var quartz = context.register(ORE_QUARTZ, ore(Blocks.NETHER_QUARTZ_ORE));
        var roseQuartz = context.register(ORE_ROSE_QUARTZ, ore(NETHER_ROSE_QUARTZ_ORE));
        var lemonQuartz = context.register(ORE_LEMON_QUARTZ, ore(NETHER_LEMON_QUARTZ_ORE));
        var greenQuartz = context.register(ORE_GREEN_QUARTZ, ore(NETHER_GREEN_QUARTZ_ORE));
        var blueQuartz = context.register(ORE_BLUE_QUARTZ, ore(NETHER_BLUE_QUARTZ_ORE));
        var smokyQuartz = context.register(ORE_SMOKY_QUARTZ, ore(NETHER_SMOKY_QUARTZ_ORE));

        context.register(
                ORE_QUARTZ_SELECTOR, new SimpleRandomSelectorFeature(
                        HolderSet.direct(
                                placed(quartz),
                                placed(roseQuartz),
                                placed(lemonQuartz),
                                placed(greenQuartz),
                                placed(blueQuartz),
                                placed(smokyQuartz)
                        )
                )
        );
    }

    private static OreFeature ore(Block block) {
        return new OreFeature(new BlockMatchTest(Blocks.NETHERRACK), block.defaultBlockState(), 14);
    }

    private static Holder<PlacedFeature> placed(Holder<Feature> feature) {
        return Holder.direct(new PlacedFeature(feature, List.of()));
    }

    private static ResourceKey<Feature> resourceKey(String path) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, path));
    }
}
