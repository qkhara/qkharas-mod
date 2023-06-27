package com.qkhara.qk.registry;

import com.qkhara.qk.qkmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item YOYO = new Item(new FabricItemSettings().group(ItemGroup.TOOLS).rarity(Rarity.EPIC).maxCount(1));

    //Block Items
    public static final BlockItem BARREL_BLOCK = new BlockItem(ModBlocks.BARREL_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BEEHIVE_BLOCK =new BlockItem(ModBlocks.BEEHIVE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem VERTICAL_BEEHIVE_BLOCK = new BlockItem(ModBlocks.VERTICAL_BEEHIVE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem VERTICAL_BARREL_BLOCK = new BlockItem(ModBlocks.VERTICAL_BARREL_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    //modid:itemName
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(qkmod.MOD_ID, "yoyo"), YOYO);
        Registry.register(Registry.ITEM, new Identifier(qkmod.MOD_ID, "barrel_block"), BARREL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(qkmod.MOD_ID,"beehive_block"),BEEHIVE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(qkmod.MOD_ID,"vertical_beehive_block"),VERTICAL_BEEHIVE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(qkmod.MOD_ID,"vertical_beehive_block"),VERTICAL_BARREL_BLOCK);
    }
}
