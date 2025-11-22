package com.nemonotfound.nemos.quartz.world.item;

import com.nemonotfound.nemos.quartz.platform.Services;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;
import java.util.function.Supplier;

public class QuartzItems {

    public static final Supplier<Item> QUARTZ_PRESSURE_PLATE = registerBlockItem("quartz_pressure_plate", QuartzBlocks.QUARTZ_PRESSURE_PLATE);
    public static final Supplier<Item> QUARTZ_BUTTON = registerBlockItem("quartz_button", QuartzBlocks.QUARTZ_BUTTON);
    public static final Supplier<Item> CRACKED_QUARTZ_BRICKS = registerBlockItem("cracked_quartz_bricks", QuartzBlocks.CRACKED_QUARTZ_BRICKS);
    public static final Supplier<Item> CRACKED_QUARTZ_BRICK_STAIRS = registerBlockItem("cracked_quartz_brick_stairs", QuartzBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
    public static final Supplier<Item> CRACKED_QUARTZ_BRICK_SLAB = registerBlockItem("cracked_quartz_brick_slab", QuartzBlocks.CRACKED_QUARTZ_BRICK_SLAB);
    public static final Supplier<Item> CRACKED_QUARTZ_BRICK_WALL = registerBlockItem("cracked_quartz_brick_wall", QuartzBlocks.CRACKED_QUARTZ_BRICK_WALL);
    public static final Supplier<Item> QUARTZ_BRICK_STAIRS = registerBlockItem("quartz_brick_stairs", QuartzBlocks.QUARTZ_BRICK_STAIRS);
    public static final Supplier<Item> QUARTZ_BRICK_SLAB = registerBlockItem("quartz_brick_slab", QuartzBlocks.QUARTZ_BRICK_SLAB);
    public static final Supplier<Item> QUARTZ_BRICK_WALL = registerBlockItem("quartz_brick_wall", QuartzBlocks.QUARTZ_BRICK_WALL);
    public static final Supplier<Item> QUARTZ_FLOWER_POT = registerBlockItem("quartz_flower_pot", QuartzBlocks.QUARTZ_FLOWER_POT);

    public static void init() {}

    private static Supplier<Item> registerBlockItem(String id, Supplier<Block> blockSupplier) {
        return register(id, properties -> new BlockItem(blockSupplier.get(), properties), new Item.Properties().useBlockDescriptionPrefix());
    }

    private static Supplier<Item> register(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return Services.REGISTRY_HELPER.registerItem(id, function, properties);
    }
}
