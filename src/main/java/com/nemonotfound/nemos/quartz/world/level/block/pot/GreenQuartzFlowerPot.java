package com.nemonotfound.nemos.quartz.world.level.block.pot;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class GreenQuartzFlowerPot extends FlowerPotBase {

    public static final MapCodec<GreenQuartzFlowerPot> CODEC = RecordCodecBuilder.mapCodec(
            (instance) -> instance.group(BuiltInRegistries.BLOCK.byNameCodec()
                            .fieldOf("potted")
                            .forGetter(FlowerPotBase::getPotted), propertiesCodec()
                    )
                    .apply(instance, GreenQuartzFlowerPot::new)
    );
    private static final Map<Block, Block> POTTED_BY_CONTENT = Maps.newHashMap();

    public GreenQuartzFlowerPot(Block potted, Properties properties) {
        super(potted, properties);
        POTTED_BY_CONTENT.put(potted, this);
    }

    @Override
    protected Map<Block, Block> getPottedByContent() {
        return POTTED_BY_CONTENT;
    }

    @Override
    public Block getFlowerPot() {
        return QuartzBlocks.GREEN_QUARTZ_FLOWER_POT;
    }
}
