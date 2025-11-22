package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.client.data.models.model.QuartzModelTemplates;
import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import static net.minecraft.client.data.models.BlockModelGenerators.createSimpleBlock;
import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;
import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;

public class QuartzModelProvider extends FabricModelProvider {

    public QuartzModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        var quartzBlockTextureMapping = new TextureMapping().put(TextureSlot.TEXTURE, getBlockTexture(Blocks.QUARTZ_BLOCK, "_top"));
        createPressurePlate(blockModelGenerators, QuartzBlocks.QUARTZ_PRESSURE_PLATE.get(), quartzBlockTextureMapping);
        createButton(blockModelGenerators, QuartzBlocks.QUARTZ_BUTTON.get(), quartzBlockTextureMapping);

        //TODO: Refactor to not generate bricks
        var quartzBricksTexturePool = blockModelGenerators.family(Blocks.QUARTZ_BRICKS);
        quartzBricksTexturePool.stairs(QuartzBlocks.QUARTZ_BRICK_STAIRS.get());
        quartzBricksTexturePool.slab(QuartzBlocks.QUARTZ_BRICK_SLAB.get());
        quartzBricksTexturePool.wall(QuartzBlocks.QUARTZ_BRICK_WALL.get());

        var crackedQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.CRACKED_QUARTZ_BRICKS.get());
        crackedQuartzBricksTexturePool.stairs(QuartzBlocks.CRACKED_QUARTZ_BRICK_STAIRS.get());
        crackedQuartzBricksTexturePool.slab(QuartzBlocks.CRACKED_QUARTZ_BRICK_SLAB.get());
        crackedQuartzBricksTexturePool.wall(QuartzBlocks.CRACKED_QUARTZ_BRICK_WALL.get());

        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.QUARTZ_FLOWER_POT.get());
        blockModelGenerators.registerSimpleFlatItemModel(QuartzItems.QUARTZ_FLOWER_POT.get());
        createPottedPlant(blockModelGenerators, Blocks.TORCHFLOWER, QuartzBlocks.QUARTZ_POTTED_TORCHFLOWER.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.OAK_SAPLING, QuartzBlocks.QUARTZ_POTTED_OAK_SAPLING.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.SPRUCE_SAPLING, QuartzBlocks.QUARTZ_POTTED_SPRUCE_SAPLING.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.BIRCH_SAPLING, QuartzBlocks.QUARTZ_POTTED_BIRCH_SAPLING.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.JUNGLE_SAPLING, QuartzBlocks.QUARTZ_POTTED_JUNGLE_SAPLING.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.ACACIA_SAPLING, QuartzBlocks.QUARTZ_POTTED_ACACIA_SAPLING.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.CHERRY_SAPLING, QuartzBlocks.QUARTZ_POTTED_CHERRY_SAPLING.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.DARK_OAK_SAPLING, QuartzBlocks.QUARTZ_POTTED_DARK_OAK_SAPLING.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.PALE_OAK_SAPLING, QuartzBlocks.QUARTZ_POTTED_PALE_OAK_SAPLING.get(), PlantType.NOT_TINTED);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.QUARTZ_POTTED_MANGROVE_PROPAGULE.get());
        createPottedPlant(blockModelGenerators, Blocks.CRIMSON_FUNGUS, QuartzBlocks.QUARTZ_POTTED_CRIMSON_FUNGUS.get(), PlantType.NOT_TINTED);
        blockModelGenerators.createNetherRoots(Blocks.CRIMSON_ROOTS, QuartzBlocks.QUARTZ_POTTED_CRIMSON_ROOTS.get());
        createPottedPlant(blockModelGenerators, Blocks.WARPED_FUNGUS, QuartzBlocks.QUARTZ_POTTED_WARPED_FUNGUS.get(), PlantType.NOT_TINTED);
        blockModelGenerators.createNetherRoots(Blocks.WARPED_ROOTS, QuartzBlocks.QUARTZ_POTTED_WARPED_ROOTS.get());
        createPottedPlant(blockModelGenerators, Blocks.FERN, QuartzBlocks.QUARTZ_POTTED_FERN.get(), PlantType.TINTED);
        createPottedPlant(blockModelGenerators, Blocks.DANDELION, QuartzBlocks.QUARTZ_POTTED_DANDELION.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.POPPY, QuartzBlocks.QUARTZ_POTTED_POPPY.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.OPEN_EYEBLOSSOM, QuartzBlocks.QUARTZ_POTTED_OPEN_EYEBLOSSOM.get(), PlantType.EMISSIVE_NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.CLOSED_EYEBLOSSOM, QuartzBlocks.QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.BLUE_ORCHID, QuartzBlocks.QUARTZ_POTTED_BLUE_ORCHID.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.ALLIUM, QuartzBlocks.QUARTZ_POTTED_ALLIUM.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.AZURE_BLUET, QuartzBlocks.QUARTZ_POTTED_AZURE_BLUET.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.RED_TULIP, QuartzBlocks.QUARTZ_POTTED_RED_TULIP.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.ORANGE_TULIP, QuartzBlocks.QUARTZ_POTTED_ORANGE_TULIP.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.WHITE_TULIP, QuartzBlocks.QUARTZ_POTTED_WHITE_TULIP.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.PINK_TULIP, QuartzBlocks.QUARTZ_POTTED_PINK_TULIP.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.OXEYE_DAISY, QuartzBlocks.QUARTZ_POTTED_OXEYE_DAISY.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.CORNFLOWER, QuartzBlocks.QUARTZ_POTTED_CORNFLOWER.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.LILY_OF_THE_VALLEY, QuartzBlocks.QUARTZ_POTTED_LILY_OF_THE_VALLEY.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.WITHER_ROSE, QuartzBlocks.QUARTZ_POTTED_WITHER_ROSE.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.RED_MUSHROOM, QuartzBlocks.QUARTZ_POTTED_RED_MUSHROOM.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.BROWN_MUSHROOM, QuartzBlocks.QUARTZ_POTTED_BROWN_MUSHROOM.get(), PlantType.NOT_TINTED);
        createPottedPlant(blockModelGenerators, Blocks.DEAD_BUSH, QuartzBlocks.QUARTZ_POTTED_DEAD_BUSH.get(), PlantType.NOT_TINTED);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.QUARTZ_POTTED_BAMBOO.get());
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.QUARTZ_POTTED_CACTUS.get());
        createPottedAzalea(blockModelGenerators, QuartzBlocks.QUARTZ_POTTED_AZALEA.get(), Blocks.POTTED_AZALEA);
        createPottedAzalea(blockModelGenerators, QuartzBlocks.QUARTZ_POTTED_FLOWERING_AZALEA.get(), Blocks.POTTED_FLOWERING_AZALEA);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
    }

    private void createPressurePlate(BlockModelGenerators blockModelGenerators, Block pressurePlateBlock, TextureMapping textureMapping) {
        var upVariant = BlockModelGenerators.plainVariant(ModelTemplates.PRESSURE_PLATE_UP.create(pressurePlateBlock, textureMapping, blockModelGenerators.modelOutput));
        var downVariant = BlockModelGenerators.plainVariant(ModelTemplates.PRESSURE_PLATE_DOWN.create(pressurePlateBlock, textureMapping, blockModelGenerators.modelOutput));

        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createPressurePlate(pressurePlateBlock, upVariant, downVariant));
    }
    
    private void createButton(BlockModelGenerators blockModelGenerators, Block buttonBlock, TextureMapping textureMapping) {
        var buttonVariant = BlockModelGenerators.plainVariant(
                ModelTemplates.BUTTON.create(buttonBlock, textureMapping, blockModelGenerators.modelOutput)
        );
        var pressedButtonVariant = BlockModelGenerators.plainVariant(
                ModelTemplates.BUTTON_PRESSED.create(buttonBlock, textureMapping, blockModelGenerators.modelOutput)
        );

        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createButton(buttonBlock, buttonVariant, pressedButtonVariant));

        var resourcelocation = ModelTemplates.BUTTON_INVENTORY.create(buttonBlock, textureMapping, blockModelGenerators.modelOutput);

        blockModelGenerators.registerSimpleItemModel(buttonBlock, resourcelocation);
    }

    private void createPottedPlant(BlockModelGenerators blockModelGenerators, Block plantBlock, Block pottedBlock, PlantType plantType) {
        var textureMapping = plantType.getPlantTextureMapping(plantBlock);
        var multiVariant = plainVariant(plantType.getCrossPot().create(pottedBlock, textureMapping, blockModelGenerators.modelOutput));

        blockModelGenerators.blockStateOutput.accept(createSimpleBlock(pottedBlock, multiVariant));
    }

    public final void createPottedAzalea(BlockModelGenerators blockModelGenerators, Block quartzPottedAzaleaBlock, Block pottedAzaleaBlock) {
        MultiVariant multiVariant;
        if (quartzPottedAzaleaBlock == QuartzBlocks.QUARTZ_POTTED_FLOWERING_AZALEA) {
            multiVariant = plainVariant(QuartzModelTemplates.QUARTZ_POTTED_FLOWERING_AZALEA.create(quartzPottedAzaleaBlock, TextureMapping.pottedAzalea(pottedAzaleaBlock), blockModelGenerators.modelOutput));
        } else {
            multiVariant = plainVariant(QuartzModelTemplates.QUARTZ_POTTED_AZALEA.create(quartzPottedAzaleaBlock, TextureMapping.pottedAzalea(pottedAzaleaBlock), blockModelGenerators.modelOutput));
        }

        blockModelGenerators.blockStateOutput.accept(createSimpleBlock(quartzPottedAzaleaBlock, multiVariant));
    }

    @Environment(EnvType.CLIENT)
    public enum PlantType {

        TINTED(ModelTemplates.TINTED_CROSS, QuartzModelTemplates.TINTED_QUARTZ_FLOWER_POT_CROSS, false),
        NOT_TINTED(ModelTemplates.CROSS, QuartzModelTemplates.QUARTZ_FLOWER_POT_CROSS, false),
        EMISSIVE_NOT_TINTED(ModelTemplates.CROSS_EMISSIVE, QuartzModelTemplates.QUARTZ_FLOWER_POT_CROSS_EMISSIVE, true);

        private final ModelTemplate blockTemplate;
        private final ModelTemplate flowerPotTemplate;
        private final boolean isEmissive;

        PlantType(final ModelTemplate blockTemplate, final ModelTemplate flowerPotTemplate, final boolean isEmissive) {
            this.blockTemplate = blockTemplate;
            this.flowerPotTemplate = flowerPotTemplate;
            this.isEmissive = isEmissive;
        }

        public ModelTemplate getCross() {
            return this.blockTemplate;
        }

        public ModelTemplate getCrossPot() {
            return this.flowerPotTemplate;
        }

        public ResourceLocation createItemModel(BlockModelGenerators generator, Block block) {
            var item = block.asItem();

            return this.isEmissive ? generator.createFlatItemModelWithBlockTextureAndOverlay(item, block, "_emissive") : generator.createFlatItemModelWithBlockTexture(item, block);
        }

        public TextureMapping getTextureMapping(Block block) {
            return this.isEmissive ? TextureMapping.crossEmissive(block) : TextureMapping.cross(block);
        }

        public TextureMapping getPlantTextureMapping(Block block) {
            return this.isEmissive ? TextureMapping.plantEmissive(block) : TextureMapping.plant(block);
        }
    }
}
