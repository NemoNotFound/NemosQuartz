package com.nemonotfound.nemos.quartz;

import com.nemonotfound.nemos.quartz.datagen.*;
import com.nemonotfound.nemos.quartz.world.item.trading.QuartzVillagerTrades;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class NemosQuartzDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(QuartzModelProvider::new);
		pack.addProvider(QuartzBlockTagProvider::new);
		pack.addProvider(QuartzLangProvider::new);
		pack.addProvider(QuartzLootTableProvider::new);
		pack.addProvider(QuartzItemTagProvider::new);
		pack.addProvider(QuartzRecipeProvider::new);
		pack.addProvider(QuartzDynamicRegistryProvider::new);
		pack.addProvider(QuartzVillagerTradesTagsProvider::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.VILLAGER_TRADE, QuartzVillagerTrades::bootstrap);

		DataGeneratorEntrypoint.super.buildRegistry(registryBuilder);
	}
}
