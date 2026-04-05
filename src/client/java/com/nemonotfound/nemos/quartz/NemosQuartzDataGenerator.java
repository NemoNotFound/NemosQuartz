package com.nemonotfound.nemos.quartz;

import com.nemonotfound.nemos.quartz.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

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
	}
}
