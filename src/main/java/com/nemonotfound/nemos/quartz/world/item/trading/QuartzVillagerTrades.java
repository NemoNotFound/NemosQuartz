package com.nemonotfound.nemos.quartz.world.item.trading;

import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.List;
import java.util.Optional;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;
import static net.minecraft.world.item.trading.VillagerTrades.register;

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
        
        register(
                context,
                MASON_4_ROSE_QUARTZ_EMERALD,
                new VillagerTrade(
                        new TradeCost(QuartzItems.ROSE_QUARTZ, 12), 
                        new ItemStackTemplate(Items.EMERALD), 
                        12, 
                        30, 
                        0.05F, 
                        Optional.empty(), 
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_ROSE_QUARTZ_PILLAR,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.ROSE_QUARTZ_PILLAR),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_ROSE_QUARTZ_BLOCK,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.ROSE_QUARTZ_BLOCK),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_4_LEMON_QUARTZ_EMERALD,
                new VillagerTrade(
                        new TradeCost(QuartzItems.LEMON_QUARTZ, 12),
                        new ItemStackTemplate(Items.EMERALD),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_LEMON_QUARTZ_PILLAR,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.LEMON_QUARTZ_PILLAR),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_LEMON_QUARTZ_BLOCK,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.LEMON_QUARTZ_BLOCK),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_4_GREEN_QUARTZ_EMERALD,
                new VillagerTrade(
                        new TradeCost(QuartzItems.GREEN_QUARTZ, 12),
                        new ItemStackTemplate(Items.EMERALD),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_GREEN_QUARTZ_PILLAR,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.GREEN_QUARTZ_PILLAR),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_GREEN_QUARTZ_BLOCK,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.GREEN_QUARTZ_BLOCK),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_4_BLUE_QUARTZ_EMERALD,
                new VillagerTrade(
                        new TradeCost(QuartzItems.BLUE_QUARTZ, 12),
                        new ItemStackTemplate(Items.EMERALD),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_BLUE_QUARTZ_PILLAR,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.BLUE_QUARTZ_PILLAR),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_BLUE_QUARTZ_BLOCK,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.BLUE_QUARTZ_BLOCK),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_4_SMOKY_QUARTZ_EMERALD,
                new VillagerTrade(
                        new TradeCost(QuartzItems.SMOKY_QUARTZ, 12),
                        new ItemStackTemplate(Items.EMERALD),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of())
        );
        register(
                context,
                MASON_5_EMERALD_SMOKY_QUARTZ_PILLAR,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.SMOKY_QUARTZ_PILLAR),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
        register(
                context,
                MASON_5_EMERALD_SMOKY_QUARTZ_BLOCK,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(QuartzItems.SMOKY_QUARTZ_BLOCK),
                        12,
                        30,
                        0.05F,
                        Optional.empty(),
                        List.of()
                )
        );
    }

    public static ResourceKey<VillagerTrade> resourceKey(final String path) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(MOD_ID, path));
    }
}
