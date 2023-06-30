package com.example.examplemod;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ExampleModGen {
	public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExampleModGen() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // ItemInit.register(eventBus);
        // BlockInit.register(eventBus);
        // EffectInit.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
