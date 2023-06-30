package stringmodcreator.generator.content

import stringmodcreator.data.Mod
import stringmodcreator.generator.FileGenerator
import stringmodcreator.generator.FolderGenerator

class MainGenerator {
	def static void run(Mod mod){
		println("\n\nContentSetup:")
		
		println('Coping "' + mod.iconPath + '" to "' + FolderGenerator.getBaseFolder(mod) + '/src/resources"')
		FileGenerator.generateJavaClass(mod.name.replace(" ",""), "", "", 
			'''
			import org.slf4j.Logger;
			import com.mojang.logging.LogUtils;
			import net.minecraftforge.common.MinecraftForge;
			import net.minecraftforge.eventbus.api.IEventBus;
			import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
			«IF mod.items.size > 0»
			import «FolderGenerator.getBasePackage(mod) + ".item.ItemInitGen"»
			«ENDIF»
			''',
			'''
			public static final String MOD_ID = "examplemod";
			public static final Logger LOGGER = LogUtils.getLogger();
			
			public ExampleModGen() {
				IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
				«IF mod.items.size > 0»
				ItemInitGen.register(eventBus);
				«ENDIF»
				// BlockInit.register(eventBus);
				// EffectInit.register(eventBus);
				
				MinecraftForge.EVENT_BUS.register(this);
			}
			''',
			mod,
			true,
			false
		)
		FileGenerator.generateFile(
			'mods.toml', 
			FolderGenerator.getBaseFolder(mod) + '/src/resources/META-INF',
			'''
			modLoader="javafml"
			loaderVersion="[40,)"
			license="All Rights Reserved"
			
			[[mods]]
			modId="«mod.modId»"
			version="«mod.version»"
			displayName="«mod.name»"
			credits="This mod was created with the Ozelot project."
			authors="«mod.author»"
			logoFile="«mod.iconPath.split("/").last»"
			description=«"'''"»
			«mod.description»
			«"'''"»
			
			
			[[dependencies.«mod.modId»]]
			   modId="forge"
			   mandatory=true
			   versionRange="[40.1.84,)"
			   ordering="NONE"
			   side="BOTH"
			
			# [[dependencies.«mod.modId»]]
			#    modId="curios"
			#    mandatory=true
			#    versionRange="[1.18.2-5,)"
			#    ordering="NONE"
			#    side="BOTH"
			
			# [[dependencies.«mod.modId»]]
			#     modId="caelus"
			#     mandatory=true
			#     versionRange="[1.18.1-3,)"
			#     ordering="NONE"
			#     side="BOTH"
			
			[[dependencies.«mod.modId»]]
			   modId="minecraft"
			   mandatory=true
			   versionRange="[1.18.2]"
			   ordering="NONE"
			   side="BOTH"
			''',
			true
		)
		
		
		ItemGenerator.run(mod)
		
		
	}
}