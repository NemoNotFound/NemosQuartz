package com.nemonotfound.nemos.quartz.world.level.block.pot;

import com.google.common.collect.Maps;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class BlueQuartzFlowerPot extends FlowerPotBase {

    private static final Map<Block, Block> POTTED_BY_CONTENT = Maps.newHashMap();

    public BlueQuartzFlowerPot(Block potted, Properties properties) {
        super(potted, properties);
        POTTED_BY_CONTENT.put(potted, this);
    }

    @Override
    protected Map<Block, Block> getPottedByContent() {
        return POTTED_BY_CONTENT;
    }

    @Override
    public Block getFlowerPot() {
        return QuartzBlocks.BLUE_QUARTZ_FLOWER_POT;
    }
}
