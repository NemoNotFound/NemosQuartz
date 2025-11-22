package com.nemonotfound.nemos.quartz;

import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.nemonotfound.nemos.quartz.Constants.MOD_ID;

@Mod(MOD_ID)
public class ForgeNemosQuartz {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredRegister<Attribute> ATTRIBUTE = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, MOD_ID);
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPE = DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, MOD_ID);

    public ForgeNemosQuartz(FMLJavaModLoadingContext context) {
        final var modBusGroup = context.getModBusGroup();
        Common.init();

        BLOCKS.register(modBusGroup);
        ENTITIES.register(modBusGroup);
        ITEMS.register(modBusGroup);
        CREATIVE_TABS.register(modBusGroup);
        ATTRIBUTE.register(modBusGroup);
        DATA_COMPONENT_TYPE.register(modBusGroup);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.BOTH, value = Dist.CLIENT)
    public static class ClientEventHandler {

        @SubscribeEvent
        public static void onRegisterColorHandlersEvent(RegisterColorHandlersEvent.Block event) {
            event.register((blockState, blockAndTintGetter, blockPos, i) -> blockAndTintGetter != null && blockPos != null ? BiomeColors.getAverageGrassColor(blockAndTintGetter, blockPos) : GrassColor.getDefaultColor(), QuartzBlocks.QUARTZ_POTTED_FERN.get());
        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_TORCHFLOWER.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_SPRUCE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_BIRCH_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_JUNGLE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_ACACIA_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_CHERRY_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_DARK_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_PALE_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_MANGROVE_PROPAGULE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_FERN.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_DANDELION.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_POPPY.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_BLUE_ORCHID.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_ALLIUM.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_AZURE_BLUET.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_RED_TULIP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_ORANGE_TULIP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_WHITE_TULIP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_PINK_TULIP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_OXEYE_DAISY.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_CORNFLOWER.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_LILY_OF_THE_VALLEY.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_WITHER_ROSE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_RED_MUSHROOM.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_BROWN_MUSHROOM.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_DEAD_BUSH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_CACTUS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_BAMBOO.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_CRIMSON_FUNGUS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_WARPED_FUNGUS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_CRIMSON_ROOTS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_WARPED_ROOTS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_AZALEA.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_FLOWERING_AZALEA.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_OPEN_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(QuartzBlocks.QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT);
        }
    }
}