package com.example.examplemod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExampleMod() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // ItemInit.register(eventBus);
        // BlockInit.register(eventBus);
        // EffectInit.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
