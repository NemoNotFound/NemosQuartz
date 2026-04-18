package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.item.trading.QuartzVillagerTrades;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.VillagerTradeTags;
import net.minecraft.world.item.trading.VillagerTrade;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class QuartzVillagerTradesTagsProvider extends FabricTagsProvider<VillagerTrade> {

    public QuartzVillagerTradesTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.VILLAGER_TRADE, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {
        getOrCreateRawBuilder(VillagerTradeTags.MASON_LEVEL_4)
                .addElement(QuartzVillagerTrades.MASON_4_ROSE_QUARTZ_EMERALD.identifier())
                .addElement(QuartzVillagerTrades.MASON_4_LEMON_QUARTZ_EMERALD.identifier())
                .addElement(QuartzVillagerTrades.MASON_4_GREEN_QUARTZ_EMERALD.identifier())
                .addElement(QuartzVillagerTrades.MASON_4_BLUE_QUARTZ_EMERALD.identifier())
                .addElement(QuartzVillagerTrades.MASON_4_SMOKY_QUARTZ_EMERALD.identifier());

        getOrCreateRawBuilder(VillagerTradeTags.MASON_LEVEL_5)
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_ROSE_QUARTZ_BLOCK.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_ROSE_QUARTZ_PILLAR.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_LEMON_QUARTZ_BLOCK.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_LEMON_QUARTZ_PILLAR.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_GREEN_QUARTZ_BLOCK.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_GREEN_QUARTZ_PILLAR.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_BLUE_QUARTZ_BLOCK.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_BLUE_QUARTZ_PILLAR.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_SMOKY_QUARTZ_BLOCK.identifier())
                .addElement(QuartzVillagerTrades.MASON_5_EMERALD_SMOKY_QUARTZ_PILLAR.identifier());
    }
}
