package com.example.examplemod.item.base;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public class Item1Gen extends Item {
    public Item1Gen() {
        super(new Item.Properties()
        		.tab(CreativeModeTab.TAB_MISC)
        		.fireResistant()
        		.stacksTo(64)
        		.rarity(Rarity.COMMON));
    }
    
    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemStack){
        return true;
    }
}
