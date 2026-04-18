package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.client.data.models.model.QuartzModelTemplates;
import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import com.nemonotfound.nemos.quartz.world.level.block.pot.FlowerPotBase;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.Map;

import static net.minecraft.client.data.models.BlockModelGenerators.createSimpleBlock;
import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;
import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;

public class QuartzModelProvider extends FabricModelProvider {

    private final Map<Block, ModelTemplate> POTTED_AZALEA = Map.of(
            QuartzBlocks.QUARTZ_FLOWER_POT, QuartzModelTemplates.QUARTZ_POTTED_AZALEA,
            QuartzBlocks.ROSE_QUARTZ_FLOWER_POT, QuartzModelTemplates.ROSE_QUARTZ_POTTED_AZALEA,
            QuartzBlocks.LEMON_QUARTZ_FLOWER_POT, QuartzModelTemplates.LEMON_QUARTZ_POTTED_AZALEA,
            QuartzBlocks.GREEN_QUARTZ_FLOWER_POT, QuartzModelTemplates.GREEN_QUARTZ_POTTED_AZALEA,
            QuartzBlocks.BLUE_QUARTZ_FLOWER_POT, QuartzModelTemplates.BLUE_QUARTZ_POTTED_AZALEA,
            QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT, QuartzModelTemplates.SMOKY_QUARTZ_POTTED_AZALEA
    );

    private final Map<Block, ModelTemplate> POTTED_FLOWERING_AZALEA = Map.of(
            QuartzBlocks.QUARTZ_FLOWER_POT, QuartzModelTemplates.QUARTZ_POTTED_FLOWERING_AZALEA,
            QuartzBlocks.ROSE_QUARTZ_FLOWER_POT, QuartzModelTemplates.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA,
            QuartzBlocks.LEMON_QUARTZ_FLOWER_POT, QuartzModelTemplates.LEMON_QUARTZ_POTTED_FLOWERING_AZALEA,
            QuartzBlocks.GREEN_QUARTZ_FLOWER_POT, QuartzModelTemplates.GREEN_QUARTZ_POTTED_FLOWERING_AZALEA,
            QuartzBlocks.BLUE_QUARTZ_FLOWER_POT, QuartzModelTemplates.BLUE_QUARTZ_POTTED_FLOWERING_AZALEA,
            QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT, QuartzModelTemplates.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA
    );

    public QuartzModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {
        var quartzBlockTextureMapping = new TextureMapping().put(TextureSlot.TEXTURE, getBlockTexture(Blocks.QUARTZ_BLOCK, "_top"));
        createPressurePlate(blockModelGenerators, QuartzBlocks.QUARTZ_PRESSURE_PLATE, quartzBlockTextureMapping);
        createButton(blockModelGenerators, QuartzBlocks.QUARTZ_BUTTON, quartzBlockTextureMapping);

        //TODO: Refactor to not generate bricks
        var quartzBricksTexturePool = blockModelGenerators.family(Blocks.QUARTZ_BRICKS);
        quartzBricksTexturePool.stairs(QuartzBlocks.QUARTZ_BRICK_STAIRS);
        quartzBricksTexturePool.slab(QuartzBlocks.QUARTZ_BRICK_SLAB);
        quartzBricksTexturePool.wall(QuartzBlocks.QUARTZ_BRICK_WALL);

        var crackedQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.CRACKED_QUARTZ_BRICKS);
        crackedQuartzBricksTexturePool.stairs(QuartzBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
        crackedQuartzBricksTexturePool.slab(QuartzBlocks.CRACKED_QUARTZ_BRICK_SLAB);
        crackedQuartzBricksTexturePool.wall(QuartzBlocks.CRACKED_QUARTZ_BRICK_WALL);

        createPottedPlant(
                blockModelGenerators,
                Blocks.TORCHFLOWER,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_TORCHFLOWER,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_TORCHFLOWER,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_TORCHFLOWER,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_TORCHFLOWER,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_TORCHFLOWER,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_TORCHFLOWER
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.OAK_SAPLING,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_OAK_SAPLING,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_OAK_SAPLING,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_OAK_SAPLING,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_OAK_SAPLING,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_OAK_SAPLING,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_OAK_SAPLING
                )
                , PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.SPRUCE_SAPLING,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_SPRUCE_SAPLING,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_SPRUCE_SAPLING,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_SPRUCE_SAPLING,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_SPRUCE_SAPLING,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_SPRUCE_SAPLING,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.BIRCH_SAPLING,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_BIRCH_SAPLING,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_BIRCH_SAPLING,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_BIRCH_SAPLING,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_BIRCH_SAPLING,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_BIRCH_SAPLING,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_BIRCH_SAPLING
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.JUNGLE_SAPLING,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_JUNGLE_SAPLING,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_JUNGLE_SAPLING,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_JUNGLE_SAPLING,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_JUNGLE_SAPLING,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_JUNGLE_SAPLING,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.ACACIA_SAPLING,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_ACACIA_SAPLING,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_ACACIA_SAPLING,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_ACACIA_SAPLING,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_ACACIA_SAPLING,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_ACACIA_SAPLING,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_ACACIA_SAPLING
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.CHERRY_SAPLING,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_CHERRY_SAPLING,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_CHERRY_SAPLING,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_CHERRY_SAPLING,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_CHERRY_SAPLING,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_CHERRY_SAPLING,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_CHERRY_SAPLING
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.DARK_OAK_SAPLING,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_DARK_OAK_SAPLING,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_DARK_OAK_SAPLING,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_DARK_OAK_SAPLING,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_DARK_OAK_SAPLING,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.PALE_OAK_SAPLING,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_PALE_OAK_SAPLING,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_PALE_OAK_SAPLING,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_PALE_OAK_SAPLING,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_PALE_OAK_SAPLING,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.CRIMSON_FUNGUS,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_CRIMSON_FUNGUS,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_CRIMSON_FUNGUS,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_CRIMSON_FUNGUS,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_CRIMSON_FUNGUS,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS
                ),
                PlantType.NOT_TINTED
        );
        createNetherRoots(
                blockModelGenerators,
                Blocks.CRIMSON_ROOTS,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_CRIMSON_ROOTS,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_CRIMSON_ROOTS,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_CRIMSON_ROOTS,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_CRIMSON_ROOTS,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_CRIMSON_ROOTS,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS
                )
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.WARPED_FUNGUS,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_WARPED_FUNGUS,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_WARPED_FUNGUS,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_WARPED_FUNGUS,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_WARPED_FUNGUS,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_WARPED_FUNGUS,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_WARPED_FUNGUS
                ),
                PlantType.NOT_TINTED
        );
        createNetherRoots(
                blockModelGenerators,
                Blocks.WARPED_ROOTS,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_WARPED_ROOTS,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_WARPED_ROOTS,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_WARPED_ROOTS,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_WARPED_ROOTS,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_WARPED_ROOTS,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_WARPED_ROOTS
                )
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.FERN,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_FERN,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_FERN,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_FERN,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_FERN,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_FERN,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_FERN
                ),
                PlantType.TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.DANDELION,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_DANDELION,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_DANDELION,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_DANDELION,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_DANDELION,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_DANDELION,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_DANDELION
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.POPPY,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_POPPY,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_POPPY,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_POPPY,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_POPPY,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_POPPY,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_POPPY
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.OPEN_EYEBLOSSOM,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_OPEN_EYEBLOSSOM,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_OPEN_EYEBLOSSOM,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_OPEN_EYEBLOSSOM,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_OPEN_EYEBLOSSOM,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM
                ),
                PlantType.EMISSIVE_NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.CLOSED_EYEBLOSSOM,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_CLOSED_EYEBLOSSOM,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_CLOSED_EYEBLOSSOM,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_CLOSED_EYEBLOSSOM,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.BLUE_ORCHID,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_BLUE_ORCHID,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_BLUE_ORCHID,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_BLUE_ORCHID,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_BLUE_ORCHID,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_BLUE_ORCHID,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_BLUE_ORCHID
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.ALLIUM,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_ALLIUM,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_ALLIUM,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_ALLIUM,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_ALLIUM,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_ALLIUM,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_ALLIUM
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.AZURE_BLUET,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_AZURE_BLUET,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_AZURE_BLUET,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_AZURE_BLUET,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_AZURE_BLUET,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_AZURE_BLUET,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_AZURE_BLUET
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.RED_TULIP,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_RED_TULIP,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_RED_TULIP,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_RED_TULIP,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_RED_TULIP,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_RED_TULIP,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_RED_TULIP
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.ORANGE_TULIP,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_ORANGE_TULIP,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_ORANGE_TULIP,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_ORANGE_TULIP,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_ORANGE_TULIP,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_ORANGE_TULIP,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_ORANGE_TULIP
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.WHITE_TULIP,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_WHITE_TULIP,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_WHITE_TULIP,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_WHITE_TULIP,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_WHITE_TULIP,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_WHITE_TULIP,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_WHITE_TULIP
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.PINK_TULIP,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_PINK_TULIP,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_PINK_TULIP,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_PINK_TULIP,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_PINK_TULIP,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_PINK_TULIP,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_PINK_TULIP
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.OXEYE_DAISY,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_OXEYE_DAISY,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_OXEYE_DAISY,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_OXEYE_DAISY,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_OXEYE_DAISY,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_OXEYE_DAISY,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_OXEYE_DAISY
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.CORNFLOWER,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_CORNFLOWER,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_CORNFLOWER,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_CORNFLOWER,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_CORNFLOWER,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_CORNFLOWER,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_CORNFLOWER
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.LILY_OF_THE_VALLEY,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_LILY_OF_THE_VALLEY,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_LILY_OF_THE_VALLEY,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_LILY_OF_THE_VALLEY,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_LILY_OF_THE_VALLEY,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.WITHER_ROSE,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_WITHER_ROSE,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_WITHER_ROSE,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_WITHER_ROSE,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_WITHER_ROSE,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_WITHER_ROSE,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_WITHER_ROSE
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.RED_MUSHROOM,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_RED_MUSHROOM,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_RED_MUSHROOM,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_RED_MUSHROOM,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_RED_MUSHROOM,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_RED_MUSHROOM,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_RED_MUSHROOM
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.BROWN_MUSHROOM,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_BROWN_MUSHROOM,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_BROWN_MUSHROOM,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_BROWN_MUSHROOM,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_BROWN_MUSHROOM,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_BROWN_MUSHROOM,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM
                ),
                PlantType.NOT_TINTED
        );
        createPottedPlant(
                blockModelGenerators,
                Blocks.DEAD_BUSH,
                List.of(QuartzBlocks.QUARTZ_POTTED_DEAD_BUSH,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_DEAD_BUSH,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_DEAD_BUSH,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_DEAD_BUSH,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_DEAD_BUSH,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_DEAD_BUSH
                ),
                PlantType.NOT_TINTED
        );
        createPottedAzalea(
                blockModelGenerators,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_AZALEA,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_AZALEA,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_AZALEA,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_AZALEA,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_AZALEA,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_AZALEA
                ),
                Blocks.POTTED_AZALEA
        );
        createPottedFloweringAzalea(
                blockModelGenerators,
                List.of(
                        QuartzBlocks.QUARTZ_POTTED_FLOWERING_AZALEA,
                        QuartzBlocks.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA,
                        QuartzBlocks.LEMON_QUARTZ_POTTED_FLOWERING_AZALEA,
                        QuartzBlocks.GREEN_QUARTZ_POTTED_FLOWERING_AZALEA,
                        QuartzBlocks.BLUE_QUARTZ_POTTED_FLOWERING_AZALEA,
                        QuartzBlocks.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA
                ),
                Blocks.POTTED_FLOWERING_AZALEA
        );

        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.QUARTZ_FLOWER_POT);
        blockModelGenerators.registerSimpleFlatItemModel(QuartzItems.QUARTZ_FLOWER_POT);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.QUARTZ_POTTED_BAMBOO);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.QUARTZ_POTTED_CACTUS);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.QUARTZ_POTTED_MANGROVE_PROPAGULE);

        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.ROSE_QUARTZ_FLOWER_POT);
        blockModelGenerators.registerSimpleFlatItemModel(QuartzItems.ROSE_QUARTZ_FLOWER_POT);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.ROSE_QUARTZ_POTTED_BAMBOO);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.ROSE_QUARTZ_POTTED_CACTUS);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE);

        blockModelGenerators.createTrivialCube(QuartzBlocks.NETHER_ROSE_QUARTZ_ORE);

        var roseQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, getBlockTexture(QuartzBlocks.ROSE_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.END, getBlockTexture(QuartzBlocks.ROSE_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.TOP, getBlockTexture(QuartzBlocks.ROSE_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.BOTTOM, getBlockTexture(QuartzBlocks.ROSE_QUARTZ_BLOCK, "_bottom"))
                .put(TextureSlot.SIDE, getBlockTexture(QuartzBlocks.ROSE_QUARTZ_BLOCK, "_side"));
        BlockModelGenerators.BlockFamilyProvider roseQuartzFamily = blockModelGenerators.new BlockFamilyProvider(roseQuartzBlockTextureMapping);
        roseQuartzFamily.fullBlock(QuartzBlocks.ROSE_QUARTZ_BLOCK, ModelTemplates.CUBE_COLUMN);
        roseQuartzFamily.stairs(QuartzBlocks.ROSE_QUARTZ_STAIRS);
        roseQuartzFamily.slab(QuartzBlocks.ROSE_QUARTZ_SLAB);
        roseQuartzFamily.pressurePlate(QuartzBlocks.ROSE_QUARTZ_PRESSURE_PLATE);
        roseQuartzFamily.button(QuartzBlocks.ROSE_QUARTZ_BUTTON);

        var roseQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.ROSE_QUARTZ_BRICKS);
        roseQuartzBricksTexturePool.stairs(QuartzBlocks.ROSE_QUARTZ_BRICK_STAIRS);
        roseQuartzBricksTexturePool.slab(QuartzBlocks.ROSE_QUARTZ_BRICK_SLAB);
        roseQuartzBricksTexturePool.wall(QuartzBlocks.ROSE_QUARTZ_BRICK_WALL);

        var crackedRoseQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICKS);
        crackedRoseQuartzBricksTexturePool.stairs(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_STAIRS);
        crackedRoseQuartzBricksTexturePool.slab(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_SLAB);
        crackedRoseQuartzBricksTexturePool.wall(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_WALL);

        chiseled(blockModelGenerators, QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(QuartzBlocks.ROSE_QUARTZ_PILLAR, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);

        var smoothRoseQuartzBottomTexture = getBlockTexture(QuartzBlocks.ROSE_QUARTZ_BLOCK, "_bottom");
        var smoothRoseQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, smoothRoseQuartzBottomTexture)
                .put(TextureSlot.END, smoothRoseQuartzBottomTexture)
                .put(TextureSlot.TOP, smoothRoseQuartzBottomTexture)
                .put(TextureSlot.BOTTOM, smoothRoseQuartzBottomTexture)
                .put(TextureSlot.ALL, smoothRoseQuartzBottomTexture)
                .put(TextureSlot.SIDE, smoothRoseQuartzBottomTexture);
        BlockModelGenerators.BlockFamilyProvider smoothRoseQuartzFamily = blockModelGenerators.new BlockFamilyProvider(smoothRoseQuartzBlockTextureMapping);
        smoothRoseQuartzFamily.fullBlock(QuartzBlocks.SMOOTH_ROSE_QUARTZ, ModelTemplates.CUBE_ALL);
        smoothRoseQuartzFamily.stairs(QuartzBlocks.SMOOTH_ROSE_QUARTZ_STAIRS);
        smoothRoseQuartzFamily.slab(QuartzBlocks.SMOOTH_ROSE_QUARTZ_SLAB);

        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.LEMON_QUARTZ_FLOWER_POT);
        blockModelGenerators.registerSimpleFlatItemModel(QuartzItems.LEMON_QUARTZ_FLOWER_POT);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.LEMON_QUARTZ_POTTED_BAMBOO);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.LEMON_QUARTZ_POTTED_CACTUS);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.LEMON_QUARTZ_POTTED_MANGROVE_PROPAGULE);

        blockModelGenerators.createTrivialCube(QuartzBlocks.NETHER_LEMON_QUARTZ_ORE);

        var lemonQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, getBlockTexture(QuartzBlocks.LEMON_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.END, getBlockTexture(QuartzBlocks.LEMON_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.TOP, getBlockTexture(QuartzBlocks.LEMON_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.BOTTOM, getBlockTexture(QuartzBlocks.LEMON_QUARTZ_BLOCK, "_bottom"))
                .put(TextureSlot.SIDE, getBlockTexture(QuartzBlocks.LEMON_QUARTZ_BLOCK, "_side"));
        BlockModelGenerators.BlockFamilyProvider lemonQuartzFamily = blockModelGenerators.new BlockFamilyProvider(lemonQuartzBlockTextureMapping);
        lemonQuartzFamily.fullBlock(QuartzBlocks.LEMON_QUARTZ_BLOCK, ModelTemplates.CUBE_COLUMN);
        lemonQuartzFamily.stairs(QuartzBlocks.LEMON_QUARTZ_STAIRS);
        lemonQuartzFamily.slab(QuartzBlocks.LEMON_QUARTZ_SLAB);
        lemonQuartzFamily.pressurePlate(QuartzBlocks.LEMON_QUARTZ_PRESSURE_PLATE);
        lemonQuartzFamily.button(QuartzBlocks.LEMON_QUARTZ_BUTTON);

        var lemonQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.LEMON_QUARTZ_BRICKS);
        lemonQuartzBricksTexturePool.stairs(QuartzBlocks.LEMON_QUARTZ_BRICK_STAIRS);
        lemonQuartzBricksTexturePool.slab(QuartzBlocks.LEMON_QUARTZ_BRICK_SLAB);
        lemonQuartzBricksTexturePool.wall(QuartzBlocks.LEMON_QUARTZ_BRICK_WALL);

        var crackedLemonQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICKS);
        crackedLemonQuartzBricksTexturePool.stairs(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_STAIRS);
        crackedLemonQuartzBricksTexturePool.slab(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_SLAB);
        crackedLemonQuartzBricksTexturePool.wall(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_WALL);

        chiseled(blockModelGenerators, QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(QuartzBlocks.LEMON_QUARTZ_PILLAR, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);

        var smoothLemonQuartzBottomTexture = getBlockTexture(QuartzBlocks.LEMON_QUARTZ_BLOCK, "_bottom");
        var smoothLemonQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, smoothLemonQuartzBottomTexture)
                .put(TextureSlot.END, smoothLemonQuartzBottomTexture)
                .put(TextureSlot.TOP, smoothLemonQuartzBottomTexture)
                .put(TextureSlot.BOTTOM, smoothLemonQuartzBottomTexture)
                .put(TextureSlot.ALL, smoothLemonQuartzBottomTexture)
                .put(TextureSlot.SIDE, smoothLemonQuartzBottomTexture);
        BlockModelGenerators.BlockFamilyProvider smoothLemonQuartzFamily = blockModelGenerators.new BlockFamilyProvider(smoothLemonQuartzBlockTextureMapping);
        smoothLemonQuartzFamily.fullBlock(QuartzBlocks.SMOOTH_LEMON_QUARTZ, ModelTemplates.CUBE_ALL);
        smoothLemonQuartzFamily.stairs(QuartzBlocks.SMOOTH_LEMON_QUARTZ_STAIRS);
        smoothLemonQuartzFamily.slab(QuartzBlocks.SMOOTH_LEMON_QUARTZ_SLAB);

        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.GREEN_QUARTZ_FLOWER_POT);
        blockModelGenerators.registerSimpleFlatItemModel(QuartzItems.GREEN_QUARTZ_FLOWER_POT);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.GREEN_QUARTZ_POTTED_BAMBOO);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.GREEN_QUARTZ_POTTED_CACTUS);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.GREEN_QUARTZ_POTTED_MANGROVE_PROPAGULE);

        blockModelGenerators.createTrivialCube(QuartzBlocks.NETHER_GREEN_QUARTZ_ORE);

        var greenQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, getBlockTexture(QuartzBlocks.GREEN_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.END, getBlockTexture(QuartzBlocks.GREEN_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.TOP, getBlockTexture(QuartzBlocks.GREEN_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.BOTTOM, getBlockTexture(QuartzBlocks.GREEN_QUARTZ_BLOCK, "_bottom"))
                .put(TextureSlot.SIDE, getBlockTexture(QuartzBlocks.GREEN_QUARTZ_BLOCK, "_side"));
        BlockModelGenerators.BlockFamilyProvider greenQuartzFamily = blockModelGenerators.new BlockFamilyProvider(greenQuartzBlockTextureMapping);
        greenQuartzFamily.fullBlock(QuartzBlocks.GREEN_QUARTZ_BLOCK, ModelTemplates.CUBE_COLUMN);
        greenQuartzFamily.stairs(QuartzBlocks.GREEN_QUARTZ_STAIRS);
        greenQuartzFamily.slab(QuartzBlocks.GREEN_QUARTZ_SLAB);
        greenQuartzFamily.pressurePlate(QuartzBlocks.GREEN_QUARTZ_PRESSURE_PLATE);
        greenQuartzFamily.button(QuartzBlocks.GREEN_QUARTZ_BUTTON);

        var greenQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.GREEN_QUARTZ_BRICKS);
        greenQuartzBricksTexturePool.stairs(QuartzBlocks.GREEN_QUARTZ_BRICK_STAIRS);
        greenQuartzBricksTexturePool.slab(QuartzBlocks.GREEN_QUARTZ_BRICK_SLAB);
        greenQuartzBricksTexturePool.wall(QuartzBlocks.GREEN_QUARTZ_BRICK_WALL);

        var crackedGreenQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICKS);
        crackedGreenQuartzBricksTexturePool.stairs(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_STAIRS);
        crackedGreenQuartzBricksTexturePool.slab(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_SLAB);
        crackedGreenQuartzBricksTexturePool.wall(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_WALL);

        chiseled(blockModelGenerators, QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(QuartzBlocks.GREEN_QUARTZ_PILLAR, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);

        var smoothGreenQuartzBottomTexture = getBlockTexture(QuartzBlocks.GREEN_QUARTZ_BLOCK, "_bottom");
        var smoothGreenQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, smoothGreenQuartzBottomTexture)
                .put(TextureSlot.END, smoothGreenQuartzBottomTexture)
                .put(TextureSlot.TOP, smoothGreenQuartzBottomTexture)
                .put(TextureSlot.BOTTOM, smoothGreenQuartzBottomTexture)
                .put(TextureSlot.ALL, smoothGreenQuartzBottomTexture)
                .put(TextureSlot.SIDE, smoothGreenQuartzBottomTexture);
        BlockModelGenerators.BlockFamilyProvider smoothGreenQuartzFamily = blockModelGenerators.new BlockFamilyProvider(smoothGreenQuartzBlockTextureMapping);
        smoothGreenQuartzFamily.fullBlock(QuartzBlocks.SMOOTH_GREEN_QUARTZ, ModelTemplates.CUBE_ALL);
        smoothGreenQuartzFamily.stairs(QuartzBlocks.SMOOTH_GREEN_QUARTZ_STAIRS);
        smoothGreenQuartzFamily.slab(QuartzBlocks.SMOOTH_GREEN_QUARTZ_SLAB);

        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.BLUE_QUARTZ_FLOWER_POT);
        blockModelGenerators.registerSimpleFlatItemModel(QuartzItems.BLUE_QUARTZ_FLOWER_POT);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.BLUE_QUARTZ_POTTED_BAMBOO);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.BLUE_QUARTZ_POTTED_CACTUS);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.BLUE_QUARTZ_POTTED_MANGROVE_PROPAGULE);

        blockModelGenerators.createTrivialCube(QuartzBlocks.NETHER_BLUE_QUARTZ_ORE);

        var blueQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, getBlockTexture(QuartzBlocks.BLUE_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.END, getBlockTexture(QuartzBlocks.BLUE_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.TOP, getBlockTexture(QuartzBlocks.BLUE_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.BOTTOM, getBlockTexture(QuartzBlocks.BLUE_QUARTZ_BLOCK, "_bottom"))
                .put(TextureSlot.SIDE, getBlockTexture(QuartzBlocks.BLUE_QUARTZ_BLOCK, "_side"));
        BlockModelGenerators.BlockFamilyProvider blueQuartzFamily = blockModelGenerators.new BlockFamilyProvider(blueQuartzBlockTextureMapping);
        blueQuartzFamily.fullBlock(QuartzBlocks.BLUE_QUARTZ_BLOCK, ModelTemplates.CUBE_COLUMN);
        blueQuartzFamily.stairs(QuartzBlocks.BLUE_QUARTZ_STAIRS);
        blueQuartzFamily.slab(QuartzBlocks.BLUE_QUARTZ_SLAB);
        blueQuartzFamily.pressurePlate(QuartzBlocks.BLUE_QUARTZ_PRESSURE_PLATE);
        blueQuartzFamily.button(QuartzBlocks.BLUE_QUARTZ_BUTTON);

        var blueQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.BLUE_QUARTZ_BRICKS);
        blueQuartzBricksTexturePool.stairs(QuartzBlocks.BLUE_QUARTZ_BRICK_STAIRS);
        blueQuartzBricksTexturePool.slab(QuartzBlocks.BLUE_QUARTZ_BRICK_SLAB);
        blueQuartzBricksTexturePool.wall(QuartzBlocks.BLUE_QUARTZ_BRICK_WALL);

        var crackedBlueQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICKS);
        crackedBlueQuartzBricksTexturePool.stairs(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_STAIRS);
        crackedBlueQuartzBricksTexturePool.slab(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_SLAB);
        crackedBlueQuartzBricksTexturePool.wall(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_WALL);

        chiseled(blockModelGenerators, QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(QuartzBlocks.BLUE_QUARTZ_PILLAR, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);

        var smoothBlueQuartzBottomTexture = getBlockTexture(QuartzBlocks.BLUE_QUARTZ_BLOCK, "_bottom");
        var smoothBlueQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, smoothBlueQuartzBottomTexture)
                .put(TextureSlot.END, smoothBlueQuartzBottomTexture)
                .put(TextureSlot.TOP, smoothBlueQuartzBottomTexture)
                .put(TextureSlot.BOTTOM, smoothBlueQuartzBottomTexture)
                .put(TextureSlot.ALL, smoothBlueQuartzBottomTexture)
                .put(TextureSlot.SIDE, smoothBlueQuartzBottomTexture);
        BlockModelGenerators.BlockFamilyProvider smoothBlueQuartzFamily = blockModelGenerators.new BlockFamilyProvider(smoothBlueQuartzBlockTextureMapping);
        smoothBlueQuartzFamily.fullBlock(QuartzBlocks.SMOOTH_BLUE_QUARTZ, ModelTemplates.CUBE_ALL);
        smoothBlueQuartzFamily.stairs(QuartzBlocks.SMOOTH_BLUE_QUARTZ_STAIRS);
        smoothBlueQuartzFamily.slab(QuartzBlocks.SMOOTH_BLUE_QUARTZ_SLAB);

        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT);
        blockModelGenerators.registerSimpleFlatItemModel(QuartzItems.SMOKY_QUARTZ_FLOWER_POT);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.SMOKY_QUARTZ_POTTED_BAMBOO);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.SMOKY_QUARTZ_POTTED_CACTUS);
        blockModelGenerators.createNonTemplateModelBlock(QuartzBlocks.SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE);

        blockModelGenerators.createTrivialCube(QuartzBlocks.NETHER_SMOKY_QUARTZ_ORE);

        var smokyQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, getBlockTexture(QuartzBlocks.SMOKY_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.END, getBlockTexture(QuartzBlocks.SMOKY_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.TOP, getBlockTexture(QuartzBlocks.SMOKY_QUARTZ_BLOCK, "_top"))
                .put(TextureSlot.BOTTOM, getBlockTexture(QuartzBlocks.SMOKY_QUARTZ_BLOCK, "_bottom"))
                .put(TextureSlot.SIDE, getBlockTexture(QuartzBlocks.SMOKY_QUARTZ_BLOCK, "_side"));
        BlockModelGenerators.BlockFamilyProvider smokyQuartzFamily = blockModelGenerators.new BlockFamilyProvider(smokyQuartzBlockTextureMapping);
        smokyQuartzFamily.fullBlock(QuartzBlocks.SMOKY_QUARTZ_BLOCK, ModelTemplates.CUBE_COLUMN);
        smokyQuartzFamily.stairs(QuartzBlocks.SMOKY_QUARTZ_STAIRS);
        smokyQuartzFamily.slab(QuartzBlocks.SMOKY_QUARTZ_SLAB);
        smokyQuartzFamily.pressurePlate(QuartzBlocks.SMOKY_QUARTZ_PRESSURE_PLATE);
        smokyQuartzFamily.button(QuartzBlocks.SMOKY_QUARTZ_BUTTON);

        var smokyQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.SMOKY_QUARTZ_BRICKS);
        smokyQuartzBricksTexturePool.stairs(QuartzBlocks.SMOKY_QUARTZ_BRICK_STAIRS);
        smokyQuartzBricksTexturePool.slab(QuartzBlocks.SMOKY_QUARTZ_BRICK_SLAB);
        smokyQuartzBricksTexturePool.wall(QuartzBlocks.SMOKY_QUARTZ_BRICK_WALL);

        var crackedSmokyQuartzBricksTexturePool = blockModelGenerators.family(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICKS);
        crackedSmokyQuartzBricksTexturePool.stairs(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS);
        crackedSmokyQuartzBricksTexturePool.slab(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_SLAB);
        crackedSmokyQuartzBricksTexturePool.wall(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_WALL);

        chiseled(blockModelGenerators, QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(QuartzBlocks.SMOKY_QUARTZ_PILLAR, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);

        var smoothSmokyQuartzBottomTexture = getBlockTexture(QuartzBlocks.SMOKY_QUARTZ_BLOCK, "_bottom");
        var smoothSmokyQuartzBlockTextureMapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, smoothSmokyQuartzBottomTexture)
                .put(TextureSlot.END, smoothSmokyQuartzBottomTexture)
                .put(TextureSlot.TOP, smoothSmokyQuartzBottomTexture)
                .put(TextureSlot.BOTTOM, smoothSmokyQuartzBottomTexture)
                .put(TextureSlot.ALL, smoothSmokyQuartzBottomTexture)
                .put(TextureSlot.SIDE, smoothSmokyQuartzBottomTexture);
        BlockModelGenerators.BlockFamilyProvider smoothSmokyQuartzFamily = blockModelGenerators.new BlockFamilyProvider(smoothSmokyQuartzBlockTextureMapping);
        smoothSmokyQuartzFamily.fullBlock(QuartzBlocks.SMOOTH_SMOKY_QUARTZ, ModelTemplates.CUBE_ALL);
        smoothSmokyQuartzFamily.stairs(QuartzBlocks.SMOOTH_SMOKY_QUARTZ_STAIRS);
        smoothSmokyQuartzFamily.slab(QuartzBlocks.SMOOTH_SMOKY_QUARTZ_SLAB);
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(QuartzItems.ROSE_QUARTZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuartzItems.LEMON_QUARTZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuartzItems.GREEN_QUARTZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuartzItems.BLUE_QUARTZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuartzItems.SMOKY_QUARTZ, ModelTemplates.FLAT_ITEM);
    }

    private void chiseled(BlockModelGenerators blockModelGenerators, final Block variant) {
        TexturedModel model = TexturedModel.COLUMN
                .get(variant)
                .updateTextures(mapping -> mapping.put(TextureSlot.SIDE, TextureMapping.getBlockTexture(variant)));
        MultiVariant variantModel = BlockModelGenerators.plainVariant(model.create(variant, blockModelGenerators.modelOutput));
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(variant, variantModel));
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

    private void createPottedPlant(BlockModelGenerators blockModelGenerators, Block plantBlock, List<Block> pottedBlocks, PlantType plantType) {
        for (Block pottedBlock : pottedBlocks) {
            var textureMapping = plantType.getPlantTextureMapping(plantBlock);
            var multiVariant = plainVariant(plantType.getCrossPot(((FlowerPotBase) pottedBlock).getFlowerPot())
                    .create(pottedBlock, textureMapping, blockModelGenerators.modelOutput));

            blockModelGenerators.blockStateOutput.accept(createSimpleBlock(pottedBlock, multiVariant));
        }
    }

    public final void createPottedAzalea(BlockModelGenerators blockModelGenerators, List<Block> quartzPottedAzaleaBlocks, Block pottedAzaleaBlock) {
        for (Block quartzPottedAzaleaBlock : quartzPottedAzaleaBlocks) {
            var pottedAzalea = POTTED_FLOWERING_AZALEA.get(((FlowerPotBase) quartzPottedAzaleaBlock).getFlowerPot());
            var multiVariant = plainVariant(pottedAzalea.create(quartzPottedAzaleaBlock, TextureMapping.pottedAzalea(pottedAzaleaBlock), blockModelGenerators.modelOutput));

            blockModelGenerators.blockStateOutput.accept(createSimpleBlock(quartzPottedAzaleaBlock, multiVariant));
        }
    }

    public final void createPottedFloweringAzalea(BlockModelGenerators blockModelGenerators, List<Block> quartzPottedAzaleaBlocks, Block pottedAzaleaBlock) {
        for (Block quartzPottedAzaleaBlock : quartzPottedAzaleaBlocks) {
            var pottedAzalea = POTTED_AZALEA.get(((FlowerPotBase) quartzPottedAzaleaBlock).getFlowerPot());
            var multiVariant = plainVariant(pottedAzalea.create(quartzPottedAzaleaBlock, TextureMapping.pottedAzalea(pottedAzaleaBlock), blockModelGenerators.modelOutput));

            blockModelGenerators.blockStateOutput.accept(createSimpleBlock(quartzPottedAzaleaBlock, multiVariant));
        }
    }

    public final void createNetherRoots(BlockModelGenerators blockModelGenerators, Block plantBlock, List<Block> pottedBlocks) {
        for (Block pottedBlock : pottedBlocks) {
            var textureMapping = TextureMapping.plant(TextureMapping.getBlockTexture(plantBlock, "_pot"));
            var multiVariant = plainVariant(PlantType.NOT_TINTED.getCrossPot(((FlowerPotBase) pottedBlock).getFlowerPot())
                    .create(pottedBlock, textureMapping, blockModelGenerators.modelOutput));

            blockModelGenerators.blockStateOutput.accept(createSimpleBlock(pottedBlock, multiVariant));
        }
    }

    @Environment(EnvType.CLIENT)
    public enum PlantType {

        TINTED(
                Map.of(
                        QuartzBlocks.QUARTZ_FLOWER_POT, QuartzModelTemplates.TINTED_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.ROSE_QUARTZ_FLOWER_POT, QuartzModelTemplates.TINTED_ROSE_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.LEMON_QUARTZ_FLOWER_POT, QuartzModelTemplates.TINTED_LEMON_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.GREEN_QUARTZ_FLOWER_POT, QuartzModelTemplates.TINTED_GREEN_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.BLUE_QUARTZ_FLOWER_POT, QuartzModelTemplates.TINTED_BLUE_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT, QuartzModelTemplates.TINTED_SMOKY_QUARTZ_FLOWER_POT_CROSS
                ),
                false
        ),
        NOT_TINTED(
                Map.of(
                        QuartzBlocks.QUARTZ_FLOWER_POT, QuartzModelTemplates.QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.ROSE_QUARTZ_FLOWER_POT, QuartzModelTemplates.ROSE_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.LEMON_QUARTZ_FLOWER_POT, QuartzModelTemplates.LEMON_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.GREEN_QUARTZ_FLOWER_POT, QuartzModelTemplates.GREEN_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.BLUE_QUARTZ_FLOWER_POT, QuartzModelTemplates.BLUE_QUARTZ_FLOWER_POT_CROSS,
                        QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT, QuartzModelTemplates.SMOKY_QUARTZ_FLOWER_POT_CROSS
                ),
                false
        ),
        EMISSIVE_NOT_TINTED(
                Map.of(
                        QuartzBlocks.QUARTZ_FLOWER_POT, QuartzModelTemplates.QUARTZ_FLOWER_POT_CROSS_EMISSIVE,
                        QuartzBlocks.ROSE_QUARTZ_FLOWER_POT, QuartzModelTemplates.ROSE_QUARTZ_FLOWER_POT_CROSS_EMISSIVE,
                        QuartzBlocks.LEMON_QUARTZ_FLOWER_POT, QuartzModelTemplates.LEMON_QUARTZ_FLOWER_POT_CROSS_EMISSIVE,
                        QuartzBlocks.GREEN_QUARTZ_FLOWER_POT, QuartzModelTemplates.GREEN_QUARTZ_FLOWER_POT_CROSS_EMISSIVE,
                        QuartzBlocks.BLUE_QUARTZ_FLOWER_POT, QuartzModelTemplates.BLUE_QUARTZ_FLOWER_POT_CROSS_EMISSIVE,
                        QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT, QuartzModelTemplates.SMOKY_QUARTZ_FLOWER_POT_CROSS_EMISSIVE
                ),
                true
        );

        private final Map<Block, ModelTemplate> flowerPotTemplateMap;
        private final boolean isEmissive;

        PlantType(Map<Block, ModelTemplate> flowerPotTemplateMap, final boolean isEmissive) {
            this.flowerPotTemplateMap = flowerPotTemplateMap;
            this.isEmissive = isEmissive;
        }

        public ModelTemplate getCrossPot(Block block) {
            return this.flowerPotTemplateMap.get(block);
        }

        public TextureMapping getPlantTextureMapping(Block block) {
            return this.isEmissive ? TextureMapping.plantEmissive(block) : TextureMapping.plant(block);
        }
    }
}
