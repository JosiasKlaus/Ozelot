package com.example.examplemod.item.base;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Item2Gen extends Item {
    public Item2Gen() {
        super(new Item.Properties()
        		.tab(CreativeModeTab.TAB_MISC)
        		.stacksTo(16)
        		.rarity(Rarity.EPIC));
    }
}
