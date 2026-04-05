package com.nemonotfound.nemos.quartz.world.item;

import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.BiFunction;
import java.util.function.Function;

public class QuartzItems {

    public static final Item QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlocks.QUARTZ_PRESSURE_PLATE);
    public static final Item QUARTZ_BUTTON = registerBlock(QuartzBlocks.QUARTZ_BUTTON);
    public static final Item CRACKED_QUARTZ_BRICKS = registerBlock(QuartzBlocks.CRACKED_QUARTZ_BRICKS);
    public static final Item CRACKED_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.CRACKED_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.CRACKED_QUARTZ_BRICK_WALL);
    public static final Item QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.QUARTZ_BRICK_STAIRS);
    public static final Item QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.QUARTZ_BRICK_SLAB);
    public static final Item QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.QUARTZ_BRICK_WALL);
    public static final Item QUARTZ_FLOWER_POT = registerBlock(QuartzBlocks.QUARTZ_FLOWER_POT);

    public static void init() {
    }

    private static Item registerBlock(final Block block) {
        return registerBlock(block, BlockItem::new);
    }

    private static Item registerBlock(final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory) {
        return registerBlock(block, itemFactory, new Item.Properties());
    }

    private static Item registerBlock(final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties) {
        return registerItem(
                blockIdToItemId(block.builtInRegistryHolder().key()),
                (p) -> itemFactory.apply(block, p),
                properties.useBlockDescriptionPrefix()
                        .requiredFeatures(block.requiredFeatures())
        );
    }

    private static ResourceKey<Item> blockIdToItemId(final ResourceKey<Block> blockName) {
        return ResourceKey.create(Registries.ITEM, blockName.identifier());
    }

    private static Item registerItem(final ResourceKey<Item> key, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        Item item = itemFactory.apply(properties.setId(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }

        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }
}
