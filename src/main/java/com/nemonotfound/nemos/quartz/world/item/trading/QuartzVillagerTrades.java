package com.nemonotfound.nemos.quartz.world.item.trading;

import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.item.trading.VillagerTrades;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;

public class QuartzVillagerTrades {

    public static final ResourceKey<VillagerTrade> MASON_4_ROSE_QUARTZ_EMERALD = resourceKey("mason/4/rose_quartz_emerald");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_ROSE_QUARTZ_PILLAR = resourceKey("mason/5/emerald_rose_quartz_pillar");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_ROSE_QUARTZ_BLOCK = resourceKey("mason/5/emerald_rose_quartz_block");
    public static final ResourceKey<VillagerTrade> MASON_4_LEMON_QUARTZ_EMERALD = resourceKey("mason/4/lemon_quartz_emerald");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_LEMON_QUARTZ_PILLAR = resourceKey("mason/5/emerald_lemon_quartz_pillar");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_LEMON_QUARTZ_BLOCK = resourceKey("mason/5/emerald_lemon_quartz_block");
    public static final ResourceKey<VillagerTrade> MASON_4_GREEN_QUARTZ_EMERALD = resourceKey("mason/4/green_quartz_emerald");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_GREEN_QUARTZ_PILLAR = resourceKey("mason/5/emerald_green_quartz_pillar");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_GREEN_QUARTZ_BLOCK = resourceKey("mason/5/emerald_green_quartz_block");
    public static final ResourceKey<VillagerTrade> MASON_4_BLUE_QUARTZ_EMERALD = resourceKey("mason/4/blue_quartz_emerald");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_BLUE_QUARTZ_PILLAR = resourceKey("mason/5/emerald_blue_quartz_pillar");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_BLUE_QUARTZ_BLOCK = resourceKey("mason/5/emerald_blue_quartz_block");
    public static final ResourceKey<VillagerTrade> MASON_4_SMOKY_QUARTZ_EMERALD = resourceKey("mason/4/smoky_quartz_emerald");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_SMOKY_QUARTZ_PILLAR = resourceKey("mason/5/emerald_smoky_quartz_pillar");
    public static final ResourceKey<VillagerTrade> MASON_5_EMERALD_SMOKY_QUARTZ_BLOCK = resourceKey("mason/5/emerald_smoky_quartz_block");

    public static void bootstrap(BootstrapContext<VillagerTrade> context) {
        register(context, MASON_4_ROSE_QUARTZ_EMERALD, QuartzItems.ROSE_QUARTZ, 12, Items.EMERALD);
        register(context, MASON_5_EMERALD_ROSE_QUARTZ_PILLAR, Items.EMERALD, 1, QuartzItems.ROSE_QUARTZ_PILLAR);
        register(context, MASON_5_EMERALD_ROSE_QUARTZ_BLOCK, Items.EMERALD, 1, QuartzItems.ROSE_QUARTZ_BLOCK);
        register(context, MASON_4_LEMON_QUARTZ_EMERALD, QuartzItems.LEMON_QUARTZ, 12, Items.EMERALD);
        register(context, MASON_5_EMERALD_LEMON_QUARTZ_PILLAR, Items.EMERALD, 1, QuartzItems.LEMON_QUARTZ_PILLAR);
        register(context, MASON_5_EMERALD_LEMON_QUARTZ_BLOCK, Items.EMERALD, 1, QuartzItems.LEMON_QUARTZ_BLOCK);
        register(context, MASON_4_GREEN_QUARTZ_EMERALD, QuartzItems.GREEN_QUARTZ, 12, Items.EMERALD);
        register(context, MASON_5_EMERALD_GREEN_QUARTZ_PILLAR, Items.EMERALD, 1, QuartzItems.GREEN_QUARTZ_PILLAR);
        register(context, MASON_5_EMERALD_GREEN_QUARTZ_BLOCK, Items.EMERALD, 1, QuartzItems.GREEN_QUARTZ_BLOCK);
        register(context, MASON_4_BLUE_QUARTZ_EMERALD, QuartzItems.BLUE_QUARTZ, 12, Items.EMERALD);
        register(context, MASON_5_EMERALD_BLUE_QUARTZ_PILLAR, Items.EMERALD, 1, QuartzItems.BLUE_QUARTZ_PILLAR);
        register(context, MASON_5_EMERALD_BLUE_QUARTZ_BLOCK, Items.EMERALD, 1, QuartzItems.BLUE_QUARTZ_BLOCK);
        register(context, MASON_4_SMOKY_QUARTZ_EMERALD, QuartzItems.SMOKY_QUARTZ, 12, Items.EMERALD);
        register(context, MASON_5_EMERALD_SMOKY_QUARTZ_PILLAR, Items.EMERALD, 1, QuartzItems.SMOKY_QUARTZ_PILLAR);
        register(context, MASON_5_EMERALD_SMOKY_QUARTZ_BLOCK, Items.EMERALD, 1, QuartzItems.SMOKY_QUARTZ_BLOCK);
    }

    private static void register(BootstrapContext<VillagerTrade> context, ResourceKey<VillagerTrade> key,
                                 Item wantedItem, int wantedCount, Item offeredItem) {
        VillagerTrades.register(context, key, VillagerTrade.builder(
                new TradeCost(wantedItem, wantedCount),
                new ItemStackTemplate(offeredItem),
                12,
                30,
                0.05F
        ).build());
    }

    public static ResourceKey<VillagerTrade> resourceKey(final String path) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(MOD_ID, path));
    }
}
