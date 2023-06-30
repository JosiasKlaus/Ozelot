package stringmodcreator.generator.content

import stringmodcreator.data.Mod
import stringmodcreator.generator.FileGenerator

class MainContent {
	def static void run(Mod mod){
		println("\n\nContentSetup:")
		FileGenerator.generateJavaClass(mod.name.replace(" ",""), "", "", 
			'''
			import org.slf4j.Logger;
			import com.mojang.logging.LogUtils;
			import net.minecraftforge.common.MinecraftForge;
			import net.minecraftforge.eventbus.api.IEventBus;
			import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
			''',
			'''
			public static final String MOD_ID = "examplemod";
			public static final Logger LOGGER = LogUtils.getLogger();
			
			public ExampleModGen() {
				IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
				// ItemInit.register(eventBus);
				// BlockInit.register(eventBus);
				// EffectInit.register(eventBus);
				
				MinecraftForge.EVENT_BUS.register(this);
			}
			''',
			mod,
			true
		)
	}
}