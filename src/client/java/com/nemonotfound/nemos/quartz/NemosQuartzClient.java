package com.nemonotfound.nemos.quartz;

import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.minecraft.client.color.block.BlockTintSources;

import java.util.List;

public class NemosQuartzClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockColorRegistry.register(List.of(BlockTintSources.grass()), QuartzBlocks.QUARTZ_POTTED_FERN);
	}
}