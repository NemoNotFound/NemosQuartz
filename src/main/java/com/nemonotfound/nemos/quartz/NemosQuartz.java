package com.nemonotfound.nemos.quartz;

import com.nemonotfound.nemos.quartz.world.item.QuartzCreativeModeTabs;
import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosQuartz implements ModInitializer {

	public static final String MOD_ID = "nemos_quartz";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The world would be better with more quartz blocks.. wait.. Nemo's Quartz adds more quartz blocks! HELL YEAH!");

		QuartzBlocks.init();
		QuartzItems.init();
		QuartzCreativeModeTabs.init();
	}
}