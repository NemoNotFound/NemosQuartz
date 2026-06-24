package com.nemonotfound.nemos.quartz.world.item;

import com.nemonotfound.nemos.quartz.reference.QuartzBlockItemIds;
import com.nemonotfound.nemos.quartz.reference.QuartzItemIds;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.BiFunction;
import java.util.function.Function;

public class QuartzItems {

    public static final Item QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlockItemIds.QUARTZ_PRESSURE_PLATE, QuartzBlocks.QUARTZ_PRESSURE_PLATE);
    public static final Item QUARTZ_BUTTON = registerBlock(QuartzBlockItemIds.QUARTZ_BUTTON, QuartzBlocks.QUARTZ_BUTTON);
    public static final Item CRACKED_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.CRACKED_QUARTZ_BRICKS, QuartzBlocks.CRACKED_QUARTZ_BRICKS);
    public static final Item CRACKED_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.CRACKED_QUARTZ_BRICK_STAIRS, QuartzBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.CRACKED_QUARTZ_BRICK_SLAB, QuartzBlocks.CRACKED_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.CRACKED_QUARTZ_BRICK_WALL, QuartzBlocks.CRACKED_QUARTZ_BRICK_WALL);
    public static final Item QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.QUARTZ_BRICK_STAIRS, QuartzBlocks.QUARTZ_BRICK_STAIRS);
    public static final Item QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.QUARTZ_BRICK_SLAB, QuartzBlocks.QUARTZ_BRICK_SLAB);
    public static final Item QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.QUARTZ_BRICK_WALL, QuartzBlocks.QUARTZ_BRICK_WALL);
    public static final Item QUARTZ_FLOWER_POT = registerBlock(QuartzBlockItemIds.QUARTZ_FLOWER_POT, QuartzBlocks.QUARTZ_FLOWER_POT);

    public static final Item ROSE_QUARTZ = registerItem(QuartzItemIds.ROSE_QUARTZ, new Item.Properties());
    public static final Item ROSE_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_BLOCK, QuartzBlocks.ROSE_QUARTZ_BLOCK);
    public static final Item ROSE_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_STAIRS, QuartzBlocks.ROSE_QUARTZ_STAIRS);
    public static final Item ROSE_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_SLAB, QuartzBlocks.ROSE_QUARTZ_SLAB);
    public static final Item ROSE_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_PRESSURE_PLATE, QuartzBlocks.ROSE_QUARTZ_PRESSURE_PLATE);
    public static final Item ROSE_QUARTZ_BUTTON = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_BUTTON, QuartzBlocks.ROSE_QUARTZ_BUTTON);
    public static final Item CHISELED_ROSE_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.CHISELED_ROSE_QUARTZ_BLOCK, QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK);
    public static final Item ROSE_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_BRICKS, QuartzBlocks.ROSE_QUARTZ_BRICKS);
    public static final Item ROSE_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_BRICK_STAIRS, QuartzBlocks.ROSE_QUARTZ_BRICK_STAIRS);
    public static final Item ROSE_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_BRICK_SLAB, QuartzBlocks.ROSE_QUARTZ_BRICK_SLAB);
    public static final Item ROSE_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_BRICK_WALL, QuartzBlocks.ROSE_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_ROSE_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.CRACKED_ROSE_QUARTZ_BRICKS, QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICKS);
    public static final Item CRACKED_ROSE_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.CRACKED_ROSE_QUARTZ_BRICK_STAIRS, QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_ROSE_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.CRACKED_ROSE_QUARTZ_BRICK_SLAB, QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_ROSE_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.CRACKED_ROSE_QUARTZ_BRICK_WALL, QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_WALL);
    public static final Item ROSE_QUARTZ_PILLAR = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_PILLAR, QuartzBlocks.ROSE_QUARTZ_PILLAR);
    public static final Item SMOOTH_ROSE_QUARTZ = registerBlock(QuartzBlockItemIds.SMOOTH_ROSE_QUARTZ, QuartzBlocks.SMOOTH_ROSE_QUARTZ);
    public static final Item SMOOTH_ROSE_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.SMOOTH_ROSE_QUARTZ_STAIRS, QuartzBlocks.SMOOTH_ROSE_QUARTZ_STAIRS);
    public static final Item SMOOTH_ROSE_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.SMOOTH_ROSE_QUARTZ_SLAB, QuartzBlocks.SMOOTH_ROSE_QUARTZ_SLAB);
    public static final Item NETHER_ROSE_QUARTZ_ORE = registerBlock(QuartzBlockItemIds.NETHER_ROSE_QUARTZ_ORE, QuartzBlocks.NETHER_ROSE_QUARTZ_ORE);
    public static final Item ROSE_QUARTZ_FLOWER_POT = registerBlock(QuartzBlockItemIds.ROSE_QUARTZ_FLOWER_POT, QuartzBlocks.ROSE_QUARTZ_FLOWER_POT);

    public static final Item LEMON_QUARTZ = registerItem(QuartzItemIds.LEMON_QUARTZ, new Item.Properties());
    public static final Item LEMON_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_BLOCK, QuartzBlocks.LEMON_QUARTZ_BLOCK);
    public static final Item LEMON_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_STAIRS, QuartzBlocks.LEMON_QUARTZ_STAIRS);
    public static final Item LEMON_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_SLAB, QuartzBlocks.LEMON_QUARTZ_SLAB);
    public static final Item LEMON_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_PRESSURE_PLATE, QuartzBlocks.LEMON_QUARTZ_PRESSURE_PLATE);
    public static final Item LEMON_QUARTZ_BUTTON = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_BUTTON, QuartzBlocks.LEMON_QUARTZ_BUTTON);
    public static final Item CHISELED_LEMON_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.CHISELED_LEMON_QUARTZ_BLOCK, QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK);
    public static final Item LEMON_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_BRICKS, QuartzBlocks.LEMON_QUARTZ_BRICKS);
    public static final Item LEMON_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_BRICK_STAIRS, QuartzBlocks.LEMON_QUARTZ_BRICK_STAIRS);
    public static final Item LEMON_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_BRICK_SLAB, QuartzBlocks.LEMON_QUARTZ_BRICK_SLAB);
    public static final Item LEMON_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_BRICK_WALL, QuartzBlocks.LEMON_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_LEMON_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.CRACKED_LEMON_QUARTZ_BRICKS, QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICKS);
    public static final Item CRACKED_LEMON_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.CRACKED_LEMON_QUARTZ_BRICK_STAIRS, QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_LEMON_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.CRACKED_LEMON_QUARTZ_BRICK_SLAB, QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_LEMON_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.CRACKED_LEMON_QUARTZ_BRICK_WALL, QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_WALL);
    public static final Item LEMON_QUARTZ_PILLAR = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_PILLAR, QuartzBlocks.LEMON_QUARTZ_PILLAR);
    public static final Item SMOOTH_LEMON_QUARTZ = registerBlock(QuartzBlockItemIds.SMOOTH_LEMON_QUARTZ, QuartzBlocks.SMOOTH_LEMON_QUARTZ);
    public static final Item SMOOTH_LEMON_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.SMOOTH_LEMON_QUARTZ_STAIRS, QuartzBlocks.SMOOTH_LEMON_QUARTZ_STAIRS);
    public static final Item SMOOTH_LEMON_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.SMOOTH_LEMON_QUARTZ_SLAB, QuartzBlocks.SMOOTH_LEMON_QUARTZ_SLAB);
    public static final Item NETHER_LEMON_QUARTZ_ORE = registerBlock(QuartzBlockItemIds.NETHER_LEMON_QUARTZ_ORE, QuartzBlocks.NETHER_LEMON_QUARTZ_ORE);
    public static final Item LEMON_QUARTZ_FLOWER_POT = registerBlock(QuartzBlockItemIds.LEMON_QUARTZ_FLOWER_POT, QuartzBlocks.LEMON_QUARTZ_FLOWER_POT);

    public static final Item GREEN_QUARTZ = registerItem(QuartzItemIds.GREEN_QUARTZ, new Item.Properties());
    public static final Item GREEN_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_BLOCK, QuartzBlocks.GREEN_QUARTZ_BLOCK);
    public static final Item GREEN_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_STAIRS, QuartzBlocks.GREEN_QUARTZ_STAIRS);
    public static final Item GREEN_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_SLAB, QuartzBlocks.GREEN_QUARTZ_SLAB);
    public static final Item GREEN_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_PRESSURE_PLATE, QuartzBlocks.GREEN_QUARTZ_PRESSURE_PLATE);
    public static final Item GREEN_QUARTZ_BUTTON = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_BUTTON, QuartzBlocks.GREEN_QUARTZ_BUTTON);
    public static final Item CHISELED_GREEN_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.CHISELED_GREEN_QUARTZ_BLOCK, QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK);
    public static final Item GREEN_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_BRICKS, QuartzBlocks.GREEN_QUARTZ_BRICKS);
    public static final Item GREEN_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_BRICK_STAIRS, QuartzBlocks.GREEN_QUARTZ_BRICK_STAIRS);
    public static final Item GREEN_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_BRICK_SLAB, QuartzBlocks.GREEN_QUARTZ_BRICK_SLAB);
    public static final Item GREEN_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_BRICK_WALL, QuartzBlocks.GREEN_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_GREEN_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.CRACKED_GREEN_QUARTZ_BRICKS, QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICKS);
    public static final Item CRACKED_GREEN_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.CRACKED_GREEN_QUARTZ_BRICK_STAIRS, QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_GREEN_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.CRACKED_GREEN_QUARTZ_BRICK_SLAB, QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_GREEN_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.CRACKED_GREEN_QUARTZ_BRICK_WALL, QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_WALL);
    public static final Item GREEN_QUARTZ_PILLAR = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_PILLAR, QuartzBlocks.GREEN_QUARTZ_PILLAR);
    public static final Item SMOOTH_GREEN_QUARTZ = registerBlock(QuartzBlockItemIds.SMOOTH_GREEN_QUARTZ, QuartzBlocks.SMOOTH_GREEN_QUARTZ);
    public static final Item SMOOTH_GREEN_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.SMOOTH_GREEN_QUARTZ_STAIRS, QuartzBlocks.SMOOTH_GREEN_QUARTZ_STAIRS);
    public static final Item SMOOTH_GREEN_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.SMOOTH_GREEN_QUARTZ_SLAB, QuartzBlocks.SMOOTH_GREEN_QUARTZ_SLAB);
    public static final Item NETHER_GREEN_QUARTZ_ORE = registerBlock(QuartzBlockItemIds.NETHER_GREEN_QUARTZ_ORE, QuartzBlocks.NETHER_GREEN_QUARTZ_ORE);
    public static final Item GREEN_QUARTZ_FLOWER_POT = registerBlock(QuartzBlockItemIds.GREEN_QUARTZ_FLOWER_POT, QuartzBlocks.GREEN_QUARTZ_FLOWER_POT);

    public static final Item BLUE_QUARTZ = registerItem(QuartzItemIds.BLUE_QUARTZ, new Item.Properties());
    public static final Item BLUE_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_BLOCK, QuartzBlocks.BLUE_QUARTZ_BLOCK);
    public static final Item BLUE_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_STAIRS, QuartzBlocks.BLUE_QUARTZ_STAIRS);
    public static final Item BLUE_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_SLAB, QuartzBlocks.BLUE_QUARTZ_SLAB);
    public static final Item BLUE_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_PRESSURE_PLATE, QuartzBlocks.BLUE_QUARTZ_PRESSURE_PLATE);
    public static final Item BLUE_QUARTZ_BUTTON = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_BUTTON, QuartzBlocks.BLUE_QUARTZ_BUTTON);
    public static final Item CHISELED_BLUE_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.CHISELED_BLUE_QUARTZ_BLOCK, QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK);
    public static final Item BLUE_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_BRICKS, QuartzBlocks.BLUE_QUARTZ_BRICKS);
    public static final Item BLUE_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_BRICK_STAIRS, QuartzBlocks.BLUE_QUARTZ_BRICK_STAIRS);
    public static final Item BLUE_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_BRICK_SLAB, QuartzBlocks.BLUE_QUARTZ_BRICK_SLAB);
    public static final Item BLUE_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_BRICK_WALL, QuartzBlocks.BLUE_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_BLUE_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.CRACKED_BLUE_QUARTZ_BRICKS, QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICKS);
    public static final Item CRACKED_BLUE_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.CRACKED_BLUE_QUARTZ_BRICK_STAIRS, QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_BLUE_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.CRACKED_BLUE_QUARTZ_BRICK_SLAB, QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_BLUE_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.CRACKED_BLUE_QUARTZ_BRICK_WALL, QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_WALL);
    public static final Item BLUE_QUARTZ_PILLAR = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_PILLAR, QuartzBlocks.BLUE_QUARTZ_PILLAR);
    public static final Item SMOOTH_BLUE_QUARTZ = registerBlock(QuartzBlockItemIds.SMOOTH_BLUE_QUARTZ, QuartzBlocks.SMOOTH_BLUE_QUARTZ);
    public static final Item SMOOTH_BLUE_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.SMOOTH_BLUE_QUARTZ_STAIRS, QuartzBlocks.SMOOTH_BLUE_QUARTZ_STAIRS);
    public static final Item SMOOTH_BLUE_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.SMOOTH_BLUE_QUARTZ_SLAB, QuartzBlocks.SMOOTH_BLUE_QUARTZ_SLAB);
    public static final Item NETHER_BLUE_QUARTZ_ORE = registerBlock(QuartzBlockItemIds.NETHER_BLUE_QUARTZ_ORE, QuartzBlocks.NETHER_BLUE_QUARTZ_ORE);
    public static final Item BLUE_QUARTZ_FLOWER_POT = registerBlock(QuartzBlockItemIds.BLUE_QUARTZ_FLOWER_POT, QuartzBlocks.BLUE_QUARTZ_FLOWER_POT);

    public static final Item SMOKY_QUARTZ = registerItem(QuartzItemIds.SMOKY_QUARTZ, new Item.Properties());
    public static final Item SMOKY_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_BLOCK, QuartzBlocks.SMOKY_QUARTZ_BLOCK);
    public static final Item SMOKY_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_STAIRS, QuartzBlocks.SMOKY_QUARTZ_STAIRS);
    public static final Item SMOKY_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_SLAB, QuartzBlocks.SMOKY_QUARTZ_SLAB);
    public static final Item SMOKY_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_PRESSURE_PLATE, QuartzBlocks.SMOKY_QUARTZ_PRESSURE_PLATE);
    public static final Item SMOKY_QUARTZ_BUTTON = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_BUTTON, QuartzBlocks.SMOKY_QUARTZ_BUTTON);
    public static final Item CHISELED_SMOKY_QUARTZ_BLOCK = registerBlock(QuartzBlockItemIds.CHISELED_SMOKY_QUARTZ_BLOCK, QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK);
    public static final Item SMOKY_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_BRICKS, QuartzBlocks.SMOKY_QUARTZ_BRICKS);
    public static final Item SMOKY_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_BRICK_STAIRS, QuartzBlocks.SMOKY_QUARTZ_BRICK_STAIRS);
    public static final Item SMOKY_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_BRICK_SLAB, QuartzBlocks.SMOKY_QUARTZ_BRICK_SLAB);
    public static final Item SMOKY_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_BRICK_WALL, QuartzBlocks.SMOKY_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_SMOKY_QUARTZ_BRICKS = registerBlock(QuartzBlockItemIds.CRACKED_SMOKY_QUARTZ_BRICKS, QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICKS);
    public static final Item CRACKED_SMOKY_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlockItemIds.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS, QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_SMOKY_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlockItemIds.CRACKED_SMOKY_QUARTZ_BRICK_SLAB, QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_SMOKY_QUARTZ_BRICK_WALL = registerBlock(QuartzBlockItemIds.CRACKED_SMOKY_QUARTZ_BRICK_WALL, QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_WALL);
    public static final Item SMOKY_QUARTZ_PILLAR = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_PILLAR, QuartzBlocks.SMOKY_QUARTZ_PILLAR);
    public static final Item SMOOTH_SMOKY_QUARTZ = registerBlock(QuartzBlockItemIds.SMOOTH_SMOKY_QUARTZ, QuartzBlocks.SMOOTH_SMOKY_QUARTZ);
    public static final Item SMOOTH_SMOKY_QUARTZ_STAIRS = registerBlock(QuartzBlockItemIds.SMOOTH_SMOKY_QUARTZ_STAIRS, QuartzBlocks.SMOOTH_SMOKY_QUARTZ_STAIRS);
    public static final Item SMOOTH_SMOKY_QUARTZ_SLAB = registerBlock(QuartzBlockItemIds.SMOOTH_SMOKY_QUARTZ_SLAB, QuartzBlocks.SMOOTH_SMOKY_QUARTZ_SLAB);
    public static final Item NETHER_SMOKY_QUARTZ_ORE = registerBlock(QuartzBlockItemIds.NETHER_SMOKY_QUARTZ_ORE, QuartzBlocks.NETHER_SMOKY_QUARTZ_ORE);
    public static final Item SMOKY_QUARTZ_FLOWER_POT = registerBlock(QuartzBlockItemIds.SMOKY_QUARTZ_FLOWER_POT, QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT);

    public static void init() {
    }

    private static Item registerItem(final ResourceKey<Item> key, final Item.Properties properties) {
        return registerItem(key, Item::new, properties);
    }

    private static Item registerBlock(final BlockItemId blockItemId, final Block block) {
        return registerBlock(blockItemId, block, BlockItem::new);
    }

    private static Item registerBlock(final BlockItemId blockItemId, final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory) {
        return registerBlock(blockItemId, block, itemFactory, new Item.Properties());
    }

    private static Item registerBlock(final BlockItemId blockItemId, final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties) {
        return registerItem(
                blockItemId.item(),
                (p) -> itemFactory.apply(block, p),
                properties.useBlockDescriptionPrefix()
                        .requiredFeatures(block.requiredFeatures())
        );
    }

    private static Item registerItem(final ResourceKey<Item> key, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        Item item = itemFactory.apply(properties.setId(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }

        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }
}
