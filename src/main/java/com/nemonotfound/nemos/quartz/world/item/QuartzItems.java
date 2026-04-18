package com.nemonotfound.nemos.quartz.world.item;

import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.BiFunction;
import java.util.function.Function;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;

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
    public static final Item ROSE_QUARTZ = registerItem(
            "rose_quartz",
            new Item.Properties()
    );
    public static final Item ROSE_QUARTZ_BLOCK = registerBlock(QuartzBlocks.ROSE_QUARTZ_BLOCK);
    public static final Item ROSE_QUARTZ_STAIRS = registerBlock(QuartzBlocks.ROSE_QUARTZ_STAIRS);
    public static final Item ROSE_QUARTZ_SLAB = registerBlock(QuartzBlocks.ROSE_QUARTZ_SLAB);
    public static final Item ROSE_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlocks.ROSE_QUARTZ_PRESSURE_PLATE);
    public static final Item ROSE_QUARTZ_BUTTON = registerBlock(QuartzBlocks.ROSE_QUARTZ_BUTTON);
    public static final Item CHISELED_ROSE_QUARTZ_BLOCK = registerBlock(QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK);
    public static final Item ROSE_QUARTZ_BRICKS = registerBlock(QuartzBlocks.ROSE_QUARTZ_BRICKS);
    public static final Item ROSE_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.ROSE_QUARTZ_BRICK_STAIRS);
    public static final Item ROSE_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.ROSE_QUARTZ_BRICK_SLAB);
    public static final Item ROSE_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.ROSE_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_ROSE_QUARTZ_BRICKS = registerBlock(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICKS);
    public static final Item CRACKED_ROSE_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_ROSE_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_ROSE_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_WALL);
    public static final Item ROSE_QUARTZ_PILLAR = registerBlock(QuartzBlocks.ROSE_QUARTZ_PILLAR);
    public static final Item SMOOTH_ROSE_QUARTZ = registerBlock(QuartzBlocks.SMOOTH_ROSE_QUARTZ);
    public static final Item SMOOTH_ROSE_QUARTZ_STAIRS = registerBlock(QuartzBlocks.SMOOTH_ROSE_QUARTZ_STAIRS);
    public static final Item SMOOTH_ROSE_QUARTZ_SLAB = registerBlock(QuartzBlocks.SMOOTH_ROSE_QUARTZ_SLAB);
    public static final Item NETHER_ROSE_QUARTZ_ORE = registerBlock(QuartzBlocks.NETHER_ROSE_QUARTZ_ORE);
    public static final Item ROSE_QUARTZ_FLOWER_POT = registerBlock(QuartzBlocks.ROSE_QUARTZ_FLOWER_POT);
    public static final Item LEMON_QUARTZ = registerItem(
            "lemon_quartz",
            new Item.Properties()
    );
    public static final Item LEMON_QUARTZ_BLOCK = registerBlock(QuartzBlocks.LEMON_QUARTZ_BLOCK);
    public static final Item LEMON_QUARTZ_STAIRS = registerBlock(QuartzBlocks.LEMON_QUARTZ_STAIRS);
    public static final Item LEMON_QUARTZ_SLAB = registerBlock(QuartzBlocks.LEMON_QUARTZ_SLAB);
    public static final Item LEMON_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlocks.LEMON_QUARTZ_PRESSURE_PLATE);
    public static final Item LEMON_QUARTZ_BUTTON = registerBlock(QuartzBlocks.LEMON_QUARTZ_BUTTON);
    public static final Item CHISELED_LEMON_QUARTZ_BLOCK = registerBlock(QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK);
    public static final Item LEMON_QUARTZ_BRICKS = registerBlock(QuartzBlocks.LEMON_QUARTZ_BRICKS);
    public static final Item LEMON_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.LEMON_QUARTZ_BRICK_STAIRS);
    public static final Item LEMON_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.LEMON_QUARTZ_BRICK_SLAB);
    public static final Item LEMON_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.LEMON_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_LEMON_QUARTZ_BRICKS = registerBlock(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICKS);
    public static final Item CRACKED_LEMON_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_LEMON_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_LEMON_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_WALL);
    public static final Item LEMON_QUARTZ_PILLAR = registerBlock(QuartzBlocks.LEMON_QUARTZ_PILLAR);
    public static final Item SMOOTH_LEMON_QUARTZ = registerBlock(QuartzBlocks.SMOOTH_LEMON_QUARTZ);
    public static final Item SMOOTH_LEMON_QUARTZ_STAIRS = registerBlock(QuartzBlocks.SMOOTH_LEMON_QUARTZ_STAIRS);
    public static final Item SMOOTH_LEMON_QUARTZ_SLAB = registerBlock(QuartzBlocks.SMOOTH_LEMON_QUARTZ_SLAB);
    public static final Item NETHER_LEMON_QUARTZ_ORE = registerBlock(QuartzBlocks.NETHER_LEMON_QUARTZ_ORE);
    public static final Item LEMON_QUARTZ_FLOWER_POT = registerBlock(QuartzBlocks.LEMON_QUARTZ_FLOWER_POT);
    public static final Item GREEN_QUARTZ = registerItem(
            "green_quartz",
            new Item.Properties()
    );
    public static final Item GREEN_QUARTZ_BLOCK = registerBlock(QuartzBlocks.GREEN_QUARTZ_BLOCK);
    public static final Item GREEN_QUARTZ_STAIRS = registerBlock(QuartzBlocks.GREEN_QUARTZ_STAIRS);
    public static final Item GREEN_QUARTZ_SLAB = registerBlock(QuartzBlocks.GREEN_QUARTZ_SLAB);
    public static final Item GREEN_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlocks.GREEN_QUARTZ_PRESSURE_PLATE);
    public static final Item GREEN_QUARTZ_BUTTON = registerBlock(QuartzBlocks.GREEN_QUARTZ_BUTTON);
    public static final Item CHISELED_GREEN_QUARTZ_BLOCK = registerBlock(QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK);
    public static final Item GREEN_QUARTZ_BRICKS = registerBlock(QuartzBlocks.GREEN_QUARTZ_BRICKS);
    public static final Item GREEN_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.GREEN_QUARTZ_BRICK_STAIRS);
    public static final Item GREEN_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.GREEN_QUARTZ_BRICK_SLAB);
    public static final Item GREEN_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.GREEN_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_GREEN_QUARTZ_BRICKS = registerBlock(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICKS);
    public static final Item CRACKED_GREEN_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_GREEN_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_GREEN_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_WALL);
    public static final Item GREEN_QUARTZ_PILLAR = registerBlock(QuartzBlocks.GREEN_QUARTZ_PILLAR);
    public static final Item SMOOTH_GREEN_QUARTZ = registerBlock(QuartzBlocks.SMOOTH_GREEN_QUARTZ);
    public static final Item SMOOTH_GREEN_QUARTZ_STAIRS = registerBlock(QuartzBlocks.SMOOTH_GREEN_QUARTZ_STAIRS);
    public static final Item SMOOTH_GREEN_QUARTZ_SLAB = registerBlock(QuartzBlocks.SMOOTH_GREEN_QUARTZ_SLAB);
    public static final Item NETHER_GREEN_QUARTZ_ORE = registerBlock(QuartzBlocks.NETHER_GREEN_QUARTZ_ORE);
    public static final Item GREEN_QUARTZ_FLOWER_POT = registerBlock(QuartzBlocks.GREEN_QUARTZ_FLOWER_POT);
    public static final Item BLUE_QUARTZ = registerItem(
            "blue_quartz",
            new Item.Properties()
    );
    public static final Item BLUE_QUARTZ_BLOCK = registerBlock(QuartzBlocks.BLUE_QUARTZ_BLOCK);
    public static final Item BLUE_QUARTZ_STAIRS = registerBlock(QuartzBlocks.BLUE_QUARTZ_STAIRS);
    public static final Item BLUE_QUARTZ_SLAB = registerBlock(QuartzBlocks.BLUE_QUARTZ_SLAB);
    public static final Item BLUE_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlocks.BLUE_QUARTZ_PRESSURE_PLATE);
    public static final Item BLUE_QUARTZ_BUTTON = registerBlock(QuartzBlocks.BLUE_QUARTZ_BUTTON);
    public static final Item CHISELED_BLUE_QUARTZ_BLOCK = registerBlock(QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK);
    public static final Item BLUE_QUARTZ_BRICKS = registerBlock(QuartzBlocks.BLUE_QUARTZ_BRICKS);
    public static final Item BLUE_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.BLUE_QUARTZ_BRICK_STAIRS);
    public static final Item BLUE_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.BLUE_QUARTZ_BRICK_SLAB);
    public static final Item BLUE_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.BLUE_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_BLUE_QUARTZ_BRICKS = registerBlock(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICKS);
    public static final Item CRACKED_BLUE_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_BLUE_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_BLUE_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_WALL);
    public static final Item BLUE_QUARTZ_PILLAR = registerBlock(QuartzBlocks.BLUE_QUARTZ_PILLAR);
    public static final Item SMOOTH_BLUE_QUARTZ = registerBlock(QuartzBlocks.SMOOTH_BLUE_QUARTZ);
    public static final Item SMOOTH_BLUE_QUARTZ_STAIRS = registerBlock(QuartzBlocks.SMOOTH_BLUE_QUARTZ_STAIRS);
    public static final Item SMOOTH_BLUE_QUARTZ_SLAB = registerBlock(QuartzBlocks.SMOOTH_BLUE_QUARTZ_SLAB);
    public static final Item NETHER_BLUE_QUARTZ_ORE = registerBlock(QuartzBlocks.NETHER_BLUE_QUARTZ_ORE);
    public static final Item BLUE_QUARTZ_FLOWER_POT = registerBlock(QuartzBlocks.BLUE_QUARTZ_FLOWER_POT);
    public static final Item SMOKY_QUARTZ = registerItem(
            "smoky_quartz",
            new Item.Properties()
    );
    public static final Item SMOKY_QUARTZ_BLOCK = registerBlock(QuartzBlocks.SMOKY_QUARTZ_BLOCK);
    public static final Item SMOKY_QUARTZ_STAIRS = registerBlock(QuartzBlocks.SMOKY_QUARTZ_STAIRS);
    public static final Item SMOKY_QUARTZ_SLAB = registerBlock(QuartzBlocks.SMOKY_QUARTZ_SLAB);
    public static final Item SMOKY_QUARTZ_PRESSURE_PLATE = registerBlock(QuartzBlocks.SMOKY_QUARTZ_PRESSURE_PLATE);
    public static final Item SMOKY_QUARTZ_BUTTON = registerBlock(QuartzBlocks.SMOKY_QUARTZ_BUTTON);
    public static final Item CHISELED_SMOKY_QUARTZ_BLOCK = registerBlock(QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK);
    public static final Item SMOKY_QUARTZ_BRICKS = registerBlock(QuartzBlocks.SMOKY_QUARTZ_BRICKS);
    public static final Item SMOKY_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.SMOKY_QUARTZ_BRICK_STAIRS);
    public static final Item SMOKY_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.SMOKY_QUARTZ_BRICK_SLAB);
    public static final Item SMOKY_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.SMOKY_QUARTZ_BRICK_WALL);
    public static final Item CRACKED_SMOKY_QUARTZ_BRICKS = registerBlock(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICKS);
    public static final Item CRACKED_SMOKY_QUARTZ_BRICK_STAIRS = registerBlock(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS);
    public static final Item CRACKED_SMOKY_QUARTZ_BRICK_SLAB = registerBlock(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_SLAB);
    public static final Item CRACKED_SMOKY_QUARTZ_BRICK_WALL = registerBlock(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_WALL);
    public static final Item SMOKY_QUARTZ_PILLAR = registerBlock(QuartzBlocks.SMOKY_QUARTZ_PILLAR);
    public static final Item SMOOTH_SMOKY_QUARTZ = registerBlock(QuartzBlocks.SMOOTH_SMOKY_QUARTZ);
    public static final Item SMOOTH_SMOKY_QUARTZ_STAIRS = registerBlock(QuartzBlocks.SMOOTH_SMOKY_QUARTZ_STAIRS);
    public static final Item SMOOTH_SMOKY_QUARTZ_SLAB = registerBlock(QuartzBlocks.SMOOTH_SMOKY_QUARTZ_SLAB);
    public static final Item NETHER_SMOKY_QUARTZ_ORE = registerBlock(QuartzBlocks.NETHER_SMOKY_QUARTZ_ORE);
    public static final Item SMOKY_QUARTZ_FLOWER_POT = registerBlock(QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT);

    public static void init() {
    }

    private static Item registerItem(final String name, final Item.Properties properties) {
        return registerItem(quartzItemId(name), Item::new, properties);
    }

    private static ResourceKey<Item> quartzItemId(final String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }

    private static Item registerBlock(final Block block) {
        return registerBlock(block, BlockItem::new);
    }

    private static Item registerBlock(final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory) {
        return registerBlock(block, itemFactory, new Item.Properties());
    }

    private static Item registerBlock(final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties) {
        return registerItem(
                blockIdToItemId(block.properties().blockIdOrThrow()),
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
