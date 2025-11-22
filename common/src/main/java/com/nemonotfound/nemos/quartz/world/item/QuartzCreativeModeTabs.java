package com.nemonotfound.nemos.quartz.world.item;

import com.nemonotfound.nemos.quartz.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.List;
import java.util.function.Supplier;

import static com.nemonotfound.nemos.quartz.Constants.MOD_ID;
import static com.nemonotfound.nemos.quartz.world.item.QuartzItems.*;

public class QuartzCreativeModeTabs {

    public static Supplier<CreativeModeTab> NEMOS_QUARTZ = register(
            "itemGroup." + MOD_ID,
            () -> Items.QUARTZ,
            List.of(
                    QUARTZ_PRESSURE_PLATE,
                    QUARTZ_BUTTON,
                    CRACKED_QUARTZ_BRICKS,
                    CRACKED_QUARTZ_BRICK_STAIRS,
                    CRACKED_QUARTZ_BRICK_SLAB,
                    CRACKED_QUARTZ_BRICK_WALL,
                    QUARTZ_BRICK_STAIRS,
                    QUARTZ_BRICK_SLAB,
                    QUARTZ_BRICK_WALL,
                    QUARTZ_FLOWER_POT
            )
    );

    public static void init() {}

    private static Supplier<CreativeModeTab> register(String title, Supplier<Item> itemSupplier, List<Supplier<Item>> dispalyItemSuppliers) {
        return Services.REGISTRY_HELPER.registerCreativeModeTab(MOD_ID, () -> Services.REGISTRY_HELPER.createCreativeModeTab()
                .title(Component.translatable(title))
                .icon(() -> new ItemStack(itemSupplier.get()))
                .displayItems((parameters, output) -> {
                    for (Supplier<Item> displayItemSupplier : dispalyItemSuppliers)  {
                        output.accept(displayItemSupplier.get());
                    }
                })
                .build());
    }
}
