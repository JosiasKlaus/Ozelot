package com.example.examplemod.item;


import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.base.Item1;
import com.example.examplemod.item.base.Item2;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
    
    public static final RegistryObject<Item> MY_1_ITEM = ITEMS.register("my_1_item", Item1::new);
    public static final RegistryObject<Item> MY_2_ITEM = ITEMS.register("my_2_item", Item2::new);

    


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}