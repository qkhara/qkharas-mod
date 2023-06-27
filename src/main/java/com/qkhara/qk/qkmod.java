package com.qkhara.qk;


import com.qkhara.qk.registry.ModBlocks;
import com.qkhara.qk.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class qkmod implements ModInitializer {
    public static final String MOD_ID = "qkmod" ;

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
