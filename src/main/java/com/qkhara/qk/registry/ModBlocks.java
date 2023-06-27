package com.qkhara.qk.registry;

import com.qkhara.qk.qkmod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //Blocks

    public static final Block BARREL_BLOCK = new Block(FabricBlockSettings
            .of(Material.WOOD, MapColor.SPRUCE_BROWN)
            .strength(2.0f, 15.0f)
            .sounds(BlockSoundGroup.WOOD)
            .requiresTool()
    );

    public static final Block BEEHIVE_BLOCK = new Block(FabricBlockSettings
            .of(Material.WOOD, MapColor.OAK_TAN)
            .strength(2.0f ,15.0f)
            .sounds(BlockSoundGroup.WOOD)
            .requiresTool()
    );

    public static final Block VERTICAL_BEEHIVE_BLOCK = new Block(FabricBlockSettings
            .of(Material.WOOD, MapColor.OAK_TAN)
            .strength(2.0f ,15.0f)
            .sounds(BlockSoundGroup.WOOD)
            .requiresTool()
    );
    public static final Block VERTICAL_BARREL_BLOCK = new Block(FabricBlockSettings
            .of(Material.WOOD, MapColor.SPRUCE_BROWN)
            .strength(2.0f ,15.0f)
            .sounds(BlockSoundGroup.WOOD)
            .requiresTool()
    );

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(qkmod.MOD_ID, "barrel_block"), BARREL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(qkmod.MOD_ID, "beehive_block"), BEEHIVE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(qkmod.MOD_ID, "vertical_beehive_block"), VERTICAL_BEEHIVE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(qkmod.MOD_ID, "vertical_barrel_block"), VERTICAL_BARREL_BLOCK);
    }
}
