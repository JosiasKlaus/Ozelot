package ozelot.generator.content

import ozelot.Mod
import ozelot.generator.FileGenerator
import ozelot.generator.FolderGenerator
import org.eclipse.core.resources.IProject
import java.util.ArrayList

class ContentGenerator {
	def static void run(IProject project, Mod mod){
		FileGenerator.copy(mod.iconPath, FolderGenerator.getBaseFolder(mod) + '/src/main/resources')
			
		project.generateMainClass(mod)
		project.generateModsToml(mod)
		project.generatePackMeta(mod)
		project.generateLang(mod)
		
		ItemGenerator.run(project, mod)
		BlockGenerator.run(project, mod)	
	}
	
	def private static void generateMainClass(IProject project, Mod mod){
		FileGenerator.generateJavaClass(project, mod.name.replace(" ",""), "", "", 
			'''
			import org.slf4j.Logger;
			import com.mojang.logging.LogUtils;
			import net.minecraftforge.common.MinecraftForge;
			import net.minecraftforge.eventbus.api.IEventBus;
			import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
			«IF mod.items.size > 0 || mod.blocks.size > 0»
			import «FolderGenerator.getBasePackage(mod) + ".item.ItemInitGen"»;
			«ENDIF»
			«IF mod.blocks.size > 0»
			import «FolderGenerator.getBasePackage(mod) + ".block.BlockInitGen"»;
			«ENDIF»
			''',
			'''
			public static final String MOD_ID = "«mod.modId»";
			public static final Logger LOGGER = LogUtils.getLogger();
			
			public «mod.name.replace(" ","")»Gen() {
				IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
				«IF mod.items.size > 0 || mod.blocks.size > 0»
				ItemInitGen.register(eventBus);
				«ENDIF»
				«IF mod.blocks.size > 0»
				BlockInitGen.register(eventBus);
				«ENDIF»
				// EffectInit.register(eventBus);
				
				MinecraftForge.EVENT_BUS.register(this);
			}
			''',
			mod,
			true,
			false
		)
	}
	
	def private static void generateModsToml(IProject project, Mod mod){
		FileGenerator.generateFile(
			project, 
			'mods.toml', 
			FolderGenerator.getBaseFolder(mod) + '/src/main/resources/META-INF',
			'''
			modLoader="javafml"
			loaderVersion="[40,)"
			license="All Rights Reserved"
			
			[[mods]]
			modId="«mod.modId»"
			version="«mod.version»"
			displayName="«mod.name»"
			credits="This mod was created with the Ozelot project."
			authors="«mod.authors»"
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
	}
	
	def private static void generatePackMeta(IProject project, Mod mod){
		FileGenerator.generateFile(
			project, 
			'pack.mcmeta', 
			FolderGenerator.getBaseFolder(mod) + '/src/main/resources',
			'''
			{
			    "pack": {
			        "description": "«mod.modId» resources",
			        "pack_format": 9,
			        "forge:resource_pack_format": 8,
			        "forge:data_pack_format": 9
			    }
			}
			''',
			true
		)
	}
	
	def private static void generateLang(IProject project, Mod mod){
		(mod.items.flatMap[i|i.translations] + mod.blocks.flatMap[i|i.translations]).toList.map[t|t.lang].toSet.forEach[lang|
			FileGenerator.generateFile(
				project,
				lang + '.json',
				FolderGenerator.getBaseFolder(mod) + '/src/main/resources/assets/' + mod.modId + '/lang',
				'''
				{
					«FOR string : mod.getLangEntry(lang) SEPARATOR ','»
					«string»
					«ENDFOR»
				}
				''',
				true
			)
		]
	}
	
	def public static Iterable<String> getLangEntry(Mod mod, String lang){
		var ret = new ArrayList<String>
		for(item : mod.items.filter[i|i.translations.map[t|t.lang].filter[s|s == lang].size > 0]){
			ret.add('''"item.«mod.modId».«item.itemId»": "«item.translations.filter[t|t.lang == lang].get(0).name»"''')
			if(item.translations.filter[t|t.lang == lang].get(0).description != ''){
				ret.add('''"tooltip.«mod.modId».item.«item.itemId»": "«item.translations.filter[t|t.lang == lang].get(0).description»"''')
			}
		}
		
		for(block : mod.blocks.filter[i|i.translations.map[t|t.lang].filter[s|s == lang].size > 0]){
			ret.add('''"block.«mod.modId».«block.blockId»": "«block.translations.filter[t|t.lang == lang].get(0).name»"''')
			if(block.translations.filter[t|t.lang == lang].get(0).description != ''){
				ret.add('''"tooltip.«mod.modId».block.«block.blockId»": "«block.translations.filter[t|t.lang == lang].get(0).description»"''')
			}
		}
		return ret;
			 
	}
}