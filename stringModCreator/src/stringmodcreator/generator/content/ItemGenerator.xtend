package stringmodcreator.generator.content

import stringmodcreator.data.Mod
import stringmodcreator.generator.FileGenerator
import stringmodcreator.generator.FolderGenerator
import stringmodcreator.data.FoodItem
import stringmodcreator.data.Item

class ItemGenerator {
	def static void run(Mod mod){
			mod.generateLang
			mod.generateItemInit
			mod.generateItemClass
			
			mod.generateModels
	}
	
	def static String getClassName(Item item){
		return item.itemId.replace("-", " ").replace("_", " ").split(" ").reduce[s1, s2|s1.toFirstUpper + s2.toFirstUpper]
	}
	
	def static String getPackageExtension(Item item){
		if(item.toolProperty !== null ){
			return "item.tool"
		}
		else if(item instanceof FoodItem){
			return "item.food"
		}
		else {
			return "item.base"
		}
	}
	
	def private static void generateLang(Mod mod){
		mod.items.flatMap[i|i.translations].toList.map[t|t.lang].toSet.forEach[lang|
			//I don't know if the query would be run multiple times if you put it in the constructor of the for
			var filteredItems = mod.items.filter[i|i.translations.map[t|t.lang].filter[s|s == lang].size > 0]
			FileGenerator.generateFile(
				lang + '.json',
				FolderGenerator.getBaseFolder(mod) + '/src/resources/assets/' + mod.modId + '/lang',
				'''
				{
					«FOR item : filteredItems SEPARATOR '\n'»
					"item.«mod.modId».«item.itemId»": "«item.translations.filter[t|t.lang == lang].get(0).name»"
					"tooltip.«mod.modId».item.«item.itemId»": "«item.translations.filter[t|t.lang == lang].get(0).description»",
					«ENDFOR»
				}
				''',
				true
			)
		]
	}
	
	def private static void generateItemInit(Mod mod){
		FileGenerator.generateJavaClass(
			"ItemInit",
			"item",
			"",
			'''
			import «FolderGenerator.getBasePackage(mod) + "." + mod.name.replace(" ","")» 
			«FOR item : mod.items»
			import «FolderGenerator.getBasePackage(mod) + "." + item.packageExtension + "." + item.className» 
			«ENDFOR»
			import net.minecraft.world.item.Item;
			import net.minecraftforge.eventbus.api.IEventBus;
			import net.minecraftforge.registries.DeferredRegister;
			import net.minecraftforge.registries.ForgeRegistries;
			import net.minecraftforge.registries.RegistryObject;
			''',
			'''
			public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, «mod.name.replace(" ","")».MOD_ID);
			
			«FOR item : mod.items»
			public static final RegistryObject<Item> «item.itemId.toUpperCase» = ITEMS.register("«item.itemId»", «item.className»::new);
			«ENDFOR»
			
			public static void register(IEventBus eventBus){
				ITEMS.register(eventBus);
			}
			''',
			mod,
			false,
			true
		)
	}
	
	def private static void generateItemClass(Mod mod){
		mod.items.forEach[item|
			FileGenerator.generateJavaClass(
				item.className,
				item.packageExtension,
				'extends Item',
				'''
				import net.minecraft.world.item.CreativeModeTab;
				import net.minecraft.world.item.Item;
				import net.minecraft.world.item.Rarity;
				«IF item.glows» 
				import net.minecraftforge.api.distmarker.OnlyIn;
				import net.minecraftforge.api.distmarker.Dist;
				«ENDIF»
				''',
				'''
				public Item1Gen() {
					super(new Item.Properties()
						.tab(CreativeModeTab.TAB_MISC)	«««TODO: Make CreativeModeTab adjustable
						«IF item.immuneToFire»
						.fireResistant()
						«ENDIF»
						.stacksTo(«item.maxStackSize»)
						.rarity(Rarity.COMMON));	«««TODO: Make Rarity adjustable
				}
				«IF item.glows»    
				@Override
				@OnlyIn(Dist.CLIENT)
				public boolean isFoil(ItemStack itemStack){
					return true;
				}
				«ENDIF»
				''',
				mod
			)
		]
	}
	
	def private static void generateModels(Mod mod){
		mod.items.forEach[item |
			println('Coping "' + item.iconPath + '" to "' + FolderGenerator.getBaseFolder(mod) + '/src/resources/assets/' + mod.modId + '/textures/item"')
			FileGenerator.generateFile(
				item.itemId + ".json",
				FolderGenerator.getBaseFolder(mod) + '/src/resources/assets/' + mod.modId + '/models/item',
				'''
				{
					"parent": "item/generated",
					"textures": {
						"layer0": "«mod.modId»:item/«item.iconPath.split('/').last.replace('.png', '')»"
					}
				}
				''',
				true
			)
		]
	}
}