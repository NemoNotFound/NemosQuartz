package com.nemonotfound.nemos.quartz.world.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;
import static com.nemonotfound.nemos.quartz.world.item.QuartzItems.*;

public class QuartzCreativeModeTabs {

    public static void init() {
        var creativeModeTab = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                .title(Component.translatable("itemGroup." + MOD_ID))
                .icon(() -> new ItemStack(QuartzItems.ROSE_QUARTZ))
                .displayItems((_, output) -> {
                    output.accept(QUARTZ_PRESSURE_PLATE);
                    output.accept(QUARTZ_BUTTON);
                    output.accept(CRACKED_QUARTZ_BRICKS);
                    output.accept(CRACKED_QUARTZ_BRICK_STAIRS);
                    output.accept(CRACKED_QUARTZ_BRICK_SLAB);
                    output.accept(CRACKED_QUARTZ_BRICK_WALL);
                    output.accept(QUARTZ_BRICK_STAIRS);
                    output.accept(QUARTZ_BRICK_SLAB);
                    output.accept(QUARTZ_BRICK_WALL);
                    output.accept(QUARTZ_FLOWER_POT);
                    output.accept(NETHER_ROSE_QUARTZ_ORE);
                    output.accept(ROSE_QUARTZ);
                    output.accept(ROSE_QUARTZ_BLOCK);
                    output.accept(ROSE_QUARTZ_STAIRS);
                    output.accept(ROSE_QUARTZ_SLAB);
                    output.accept(ROSE_QUARTZ_PRESSURE_PLATE);
                    output.accept(ROSE_QUARTZ_BUTTON);
                    output.accept(CHISELED_ROSE_QUARTZ_BLOCK);
                    output.accept(ROSE_QUARTZ_BRICKS);
                    output.accept(ROSE_QUARTZ_BRICK_STAIRS);
                    output.accept(ROSE_QUARTZ_BRICK_SLAB);
                    output.accept(ROSE_QUARTZ_BRICK_WALL);
                    output.accept(CRACKED_ROSE_QUARTZ_BRICKS);
                    output.accept(CRACKED_ROSE_QUARTZ_BRICK_STAIRS);
                    output.accept(CRACKED_ROSE_QUARTZ_BRICK_SLAB);
                    output.accept(CRACKED_ROSE_QUARTZ_BRICK_WALL);
                    output.accept(ROSE_QUARTZ_PILLAR);
                    output.accept(SMOOTH_ROSE_QUARTZ);
                    output.accept(SMOOTH_ROSE_QUARTZ_STAIRS);
                    output.accept(SMOOTH_ROSE_QUARTZ_SLAB);
                    output.accept(ROSE_QUARTZ_FLOWER_POT);
                    output.accept(NETHER_LEMON_QUARTZ_ORE);
                    output.accept(LEMON_QUARTZ);
                    output.accept(LEMON_QUARTZ_BLOCK);
                    output.accept(LEMON_QUARTZ_STAIRS);
                    output.accept(LEMON_QUARTZ_SLAB);
                    output.accept(LEMON_QUARTZ_PRESSURE_PLATE);
                    output.accept(LEMON_QUARTZ_BUTTON);
                    output.accept(CHISELED_LEMON_QUARTZ_BLOCK);
                    output.accept(LEMON_QUARTZ_BRICKS);
                    output.accept(LEMON_QUARTZ_BRICK_STAIRS);
                    output.accept(LEMON_QUARTZ_BRICK_SLAB);
                    output.accept(LEMON_QUARTZ_BRICK_WALL);
                    output.accept(CRACKED_LEMON_QUARTZ_BRICKS);
                    output.accept(CRACKED_LEMON_QUARTZ_BRICK_STAIRS);
                    output.accept(CRACKED_LEMON_QUARTZ_BRICK_SLAB);
                    output.accept(CRACKED_LEMON_QUARTZ_BRICK_WALL);
                    output.accept(LEMON_QUARTZ_PILLAR);
                    output.accept(SMOOTH_LEMON_QUARTZ);
                    output.accept(SMOOTH_LEMON_QUARTZ_STAIRS);
                    output.accept(SMOOTH_LEMON_QUARTZ_SLAB);
                    output.accept(LEMON_QUARTZ_FLOWER_POT);
                    output.accept(NETHER_GREEN_QUARTZ_ORE);
                    output.accept(GREEN_QUARTZ);
                    output.accept(GREEN_QUARTZ_BLOCK);
                    output.accept(GREEN_QUARTZ_STAIRS);
                    output.accept(GREEN_QUARTZ_SLAB);
                    output.accept(GREEN_QUARTZ_PRESSURE_PLATE);
                    output.accept(GREEN_QUARTZ_BUTTON);
                    output.accept(CHISELED_GREEN_QUARTZ_BLOCK);
                    output.accept(GREEN_QUARTZ_BRICKS);
                    output.accept(GREEN_QUARTZ_BRICK_STAIRS);
                    output.accept(GREEN_QUARTZ_BRICK_SLAB);
                    output.accept(GREEN_QUARTZ_BRICK_WALL);
                    output.accept(CRACKED_GREEN_QUARTZ_BRICKS);
                    output.accept(CRACKED_GREEN_QUARTZ_BRICK_STAIRS);
                    output.accept(CRACKED_GREEN_QUARTZ_BRICK_SLAB);
                    output.accept(CRACKED_GREEN_QUARTZ_BRICK_WALL);
                    output.accept(GREEN_QUARTZ_PILLAR);
                    output.accept(SMOOTH_GREEN_QUARTZ);
                    output.accept(SMOOTH_GREEN_QUARTZ_STAIRS);
                    output.accept(SMOOTH_GREEN_QUARTZ_SLAB);
                    output.accept(GREEN_QUARTZ_FLOWER_POT);
                    output.accept(NETHER_BLUE_QUARTZ_ORE);
                    output.accept(BLUE_QUARTZ);
                    output.accept(BLUE_QUARTZ_BLOCK);
                    output.accept(BLUE_QUARTZ_STAIRS);
                    output.accept(BLUE_QUARTZ_SLAB);
                    output.accept(BLUE_QUARTZ_PRESSURE_PLATE);
                    output.accept(BLUE_QUARTZ_BUTTON);
                    output.accept(CHISELED_BLUE_QUARTZ_BLOCK);
                    output.accept(BLUE_QUARTZ_BRICKS);
                    output.accept(BLUE_QUARTZ_BRICK_STAIRS);
                    output.accept(BLUE_QUARTZ_BRICK_SLAB);
                    output.accept(BLUE_QUARTZ_BRICK_WALL);
                    output.accept(CRACKED_BLUE_QUARTZ_BRICKS);
                    output.accept(CRACKED_BLUE_QUARTZ_BRICK_STAIRS);
                    output.accept(CRACKED_BLUE_QUARTZ_BRICK_SLAB);
                    output.accept(CRACKED_BLUE_QUARTZ_BRICK_WALL);
                    output.accept(BLUE_QUARTZ_PILLAR);
                    output.accept(SMOOTH_BLUE_QUARTZ);
                    output.accept(SMOOTH_BLUE_QUARTZ_STAIRS);
                    output.accept(SMOOTH_BLUE_QUARTZ_SLAB);
                    output.accept(BLUE_QUARTZ_FLOWER_POT);
                    output.accept(NETHER_SMOKY_QUARTZ_ORE);
                    output.accept(SMOKY_QUARTZ);
                    output.accept(SMOKY_QUARTZ_BLOCK);
                    output.accept(SMOKY_QUARTZ_STAIRS);
                    output.accept(SMOKY_QUARTZ_SLAB);
                    output.accept(SMOKY_QUARTZ_PRESSURE_PLATE);
                    output.accept(SMOKY_QUARTZ_BUTTON);
                    output.accept(CHISELED_SMOKY_QUARTZ_BLOCK);
                    output.accept(SMOKY_QUARTZ_BRICKS);
                    output.accept(SMOKY_QUARTZ_BRICK_STAIRS);
                    output.accept(SMOKY_QUARTZ_BRICK_SLAB);
                    output.accept(SMOKY_QUARTZ_BRICK_WALL);
                    output.accept(CRACKED_SMOKY_QUARTZ_BRICKS);
                    output.accept(CRACKED_SMOKY_QUARTZ_BRICK_STAIRS);
                    output.accept(CRACKED_SMOKY_QUARTZ_BRICK_SLAB);
                    output.accept(CRACKED_SMOKY_QUARTZ_BRICK_WALL);
                    output.accept(SMOKY_QUARTZ_PILLAR);
                    output.accept(SMOOTH_SMOKY_QUARTZ);
                    output.accept(SMOOTH_SMOKY_QUARTZ_STAIRS);
                    output.accept(SMOOTH_SMOKY_QUARTZ_SLAB);
                    output.accept(SMOKY_QUARTZ_FLOWER_POT);
                })
                .build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, MOD_ID), creativeModeTab);
    }
}
