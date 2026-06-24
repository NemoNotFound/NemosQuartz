package com.nemonotfound.nemos.quartz.reference;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;

public class QuartzItemIds {

    public static final ResourceKey<Item> ROSE_QUARTZ = create("rose_quartz");
    public static final ResourceKey<Item> LEMON_QUARTZ = create("lemon_quartz");
    public static final ResourceKey<Item> GREEN_QUARTZ = create("green_quartz");
    public static final ResourceKey<Item> BLUE_QUARTZ = create("blue_quartz");
    public static final ResourceKey<Item> SMOKY_QUARTZ = create("smoky_quartz");

    private static ResourceKey<Item> create(final String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }
}
