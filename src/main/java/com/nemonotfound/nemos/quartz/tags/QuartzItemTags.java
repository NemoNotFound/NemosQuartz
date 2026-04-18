package com.nemonotfound.nemos.quartz.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;

public class QuartzItemTags {

    public static final TagKey<Item> QUARTZ = bind("quartz");

    public static void init() {}

    private static TagKey<Item> bind(final String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }
}
