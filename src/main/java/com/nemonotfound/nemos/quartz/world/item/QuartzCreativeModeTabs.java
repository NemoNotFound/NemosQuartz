package com.nemonotfound.nemos.quartz.world.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;
import static com.nemonotfound.nemos.quartz.world.item.QuartzItems.*;

public class QuartzCreativeModeTabs {

    public static void init() {
        var creativeModeTab = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                .title(Component.translatable("itemGroup." + MOD_ID))
                .icon(() -> new ItemStack(Items.QUARTZ))
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
                })
                .build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, MOD_ID), creativeModeTab);
    }
}
