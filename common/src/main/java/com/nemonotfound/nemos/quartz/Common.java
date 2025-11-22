package com.nemonotfound.nemos.quartz;

import com.nemonotfound.nemos.quartz.world.item.QuartzCreativeModeTabs;
import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;

public class Common {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Quartz");

        QuartzBlocks.init();
        QuartzItems.init();
        QuartzCreativeModeTabs.init();
    }
}