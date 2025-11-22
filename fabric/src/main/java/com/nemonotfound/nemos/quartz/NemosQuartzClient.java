package com.nemonotfound.nemos.quartz;

import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.world.level.GrassColor;

public class NemosQuartzClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_TORCHFLOWER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_SPRUCE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_BIRCH_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_JUNGLE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_ACACIA_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_CHERRY_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_DARK_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_PALE_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_MANGROVE_PROPAGULE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_FERN.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_DANDELION.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_POPPY.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_BLUE_ORCHID.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_ALLIUM.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_AZURE_BLUET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_RED_TULIP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_ORANGE_TULIP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_WHITE_TULIP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_PINK_TULIP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_OXEYE_DAISY.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_CORNFLOWER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_LILY_OF_THE_VALLEY.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_WITHER_ROSE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_RED_MUSHROOM.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_BROWN_MUSHROOM.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_DEAD_BUSH.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_CACTUS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_BAMBOO.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_CRIMSON_FUNGUS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_WARPED_FUNGUS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_CRIMSON_ROOTS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_WARPED_ROOTS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_AZALEA.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_FLOWERING_AZALEA.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_OPEN_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(QuartzBlocks.QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT);

        ColorProviderRegistry.BLOCK.register((blockState, blockAndTintGetter, blockPos, i) -> blockAndTintGetter != null && blockPos != null ? BiomeColors.getAverageGrassColor(blockAndTintGetter, blockPos) : GrassColor.getDefaultColor(), QuartzBlocks.QUARTZ_POTTED_FERN.get());
    }
}
