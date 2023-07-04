package ozelot.generator.content

import ozelot.Mod
import ozelot.Item
import ozelot.FoodItem
import ozelot.generator.FolderGenerator
import ozelot.generator.FileGenerator
import ozelot.Rarity
import ozelot.CreativeModeTab
import org.eclipse.core.resources.IProject

class ItemGenerator {
	def static void run(IProject project, Mod mod){
			project.generateLang(mod)
			project.generateItemInit(mod)
			project.generateItemClass(mod)
			project.generateModels(mod)
	}
	
	def static String getClassName(Item item){
		return item.itemId.replace("-", " ").replace("_", " ").split(" ").reduce[s1, s2|s1 + s2.toFirstUpper].toFirstUpper
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
	
	def private static void generateLang(IProject project, Mod mod){
		mod.items.flatMap[i|i.translations].toList.map[t|t.lang].toSet.forEach[lang|
			//I don't know if the query would be run multiple times if you put it in the constructor of the for
			var filteredItems = mod.items.filter[i|i.translations.map[t|t.lang].filter[s|s == lang].size > 0]
			FileGenerator.generateFile(
				project,
				lang + '.json',
				FolderGenerator.getBaseFolder(mod) + '/src/main/resources/assets/' + mod.modId + '/lang',
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
	
	def private static void generateItemInit(IProject project, Mod mod){
		FileGenerator.generateJavaClass(
			project, 
			"ItemInit",
			"item",
			"",
			'''
			import «FolderGenerator.getBasePackage(mod) + "." + mod.name.replace(" ","")»; 
			«FOR item : mod.items»
			import «FolderGenerator.getBasePackage(mod) + "." + item.packageExtension + "." + item.className»; 
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
	
	def private static void generateItemClass(IProject project, Mod mod){
		mod.items.forEach[item|
			FileGenerator.generateJavaClass(
				project, 
				item.className,
				item.packageExtension,
				'extends Item',
				'''
				import net.minecraft.world.item.CreativeModeTab;
				import net.minecraft.world.item.Item;
				import net.minecraft.world.item.Rarity;
				import net.minecraft.world.item.TooltipFlag;
				import net.minecraftforge.api.distmarker.OnlyIn;
				import net.minecraftforge.api.distmarker.Dist;
				import java.util.List;
				import net.minecraft.network.chat.Component;
				import net.minecraft.network.chat.TranslatableComponent;
				import net.minecraft.world.level.Level;
				import net.minecraft.world.item.ItemStack;
				«IF item instanceof FoodItem»
				import net.minecraft.world.food.FoodProperties;
				«ENDIF»
				«IF item.onUse.size > 0» 
				import net.minecraft.world.InteractionResultHolder;
				import net.minecraft.world.InteractionHand;
				import net.minecraft.world.entity.player.Player;
				«ENDIF»
				«IF item.onTick.size > 0 || item.onAttack.size > 0 || item instanceof FoodItem && (item as FoodItem).afterEating.size > 0» 
				import net.minecraft.world.entity.LivingEntity;
				«ENDIF»
				«IF item.onTick.size > 0» 
				import net.minecraft.world.entity.Entity;
				«ENDIF»
				«IF item.onTick.size > 0 || item.onAttack.size > 0 || (item.onUse.size > 0) || item instanceof FoodItem && (item as FoodItem).afterEating.size > 0»
				import net.minecraft.world.effect.MobEffectInstance;
				import net.minecraft.world.effect.MobEffects;
				«ENDIF»
				''',
				'''
				public «item.className»Gen() {
					super(new Item.Properties()
						.tab(CreativeModeTab.«item.creativeModeTab.tabString»)
						«IF item.isIsImmuneToFire»
						.fireResistant()
						«ENDIF»
						«IF item instanceof FoodItem»
						.food((new FoodProperties.Builder())
							.nutrition(«(item as FoodItem).nutrition»)
							.saturationMod(«(item as FoodItem).saturation»f)
							«IF (item as FoodItem).isAlwaysEdible»
							.alwaysEat()
							«ENDIF»
							«IF (item as FoodItem).isMeat»
							.meat()
							«ENDIF»
							.build())
						«ENDIF»
						.stacksTo(«item.maxStackSize»)
						.rarity(Rarity.«item.rarity.rarityString»));
				}
				
				«IF item.onUse.size > 0» 
				@Override
				public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
					«FOR onUse : item.onUse SEPARATOR '\n'»
					«EffectHelper.getEffectInstaceString(onUse, 'player')»
					«ENDFOR»
					return super.use(world, player, hand);
				}
				«ENDIF»
				
				«IF item.onTick.size > 0» 
				@Override
				public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
					super.inventoryTick(itemstack, world, entity, slot, selected);
					if(entity instanceof LivingEntity livingEntity) {
						«IF item.onTick.filter[e|e.needsSelected].size > 0»
						if (selected) {
							«FOR onTick : item.onTick.filter[e|e.needsSelected] SEPARATOR '\n'»
							«EffectHelper.getEffectInstaceString(onTick, 'livingEntity')»
							«ENDFOR»
						}
						«ENDIF»
						«FOR onTick : item.onTick.filter[e|!e.needsSelected] SEPARATOR '\n'»
						«EffectHelper.getEffectInstaceString(onTick, 'livingEntity')»
						«ENDFOR»
					}
				}
				«ENDIF»
				
				«IF item.onAttack.size > 0» 
				@Override
				public boolean hurtEnemy(ItemStack itemstack, LivingEntity target, LivingEntity source) {
					«FOR onAttack : item.onAttack SEPARATOR '\n'»
					«EffectHelper.getEffectInstaceString(onAttack, onAttack.isSelf ? 'source' : 'target')»
					«ENDFOR»
					return super.hurtEnemy(itemstack, target, source);
				}
				«ENDIF»
				
				«IF item instanceof FoodItem && (item as FoodItem).afterEating.size > 0» 
				@Override
				public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity livingEntity) {
					«FOR afterEating : (item as FoodItem).afterEating SEPARATOR '\n'»
					«EffectHelper.getEffectInstaceString(afterEating, 'livingEntity')»
					«ENDFOR»
					return super.finishUsingItem(itemstack, world, livingEntity);
				}
				«ENDIF»
				
				@OnlyIn(Dist.CLIENT)
				@Override
				public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag) {
					tooltip.add(new TranslatableComponent("tooltip.«mod.modId».item.«item.itemId»"));
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
	
	def private static void generateModels(IProject project, Mod mod){
		mod.items.forEach[item |
			println('Coping "' + item.iconPath + '" to "' + FolderGenerator.getBaseFolder(mod) + '/src/main/resources/assets/' + mod.modId + '/textures/item"')
			FileGenerator.generateFile(
				project,
				item.itemId + ".json",
				FolderGenerator.getBaseFolder(mod) + '/src/main/resources/assets/' + mod.modId + '/models/item',
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
	
	def private static String getRarityString(Rarity rarity){
		switch rarity{
			case COMMON: 'COMMON'
		   	case UNCOMMON: 'UNCOMMON'
		   	case RARE: 'RARE'
		   	case EPIC: 'EPIC'
		}
	}
	
	def private static String getTabString(CreativeModeTab creativeModeTab){
		switch creativeModeTab{
			case BUILDING_BLOCKS: 'TAB_BUILDING_BLOCKS'
		   	case DECORATIONS: 'TAB_DECORATIONS'
		   	case REDSTONE: 'TAB_REDSTONE'
		   	case TRANSPORTATION: 'TAB_TRANSPORTATION'
		   	case MISC: 'TAB_MISC'
		   	case FOOD: 'TAB_FOOD'
		   	case TOOLS: 'TAB_TOOLS'
		   	case COMBAT: 'TAB_COMBAT'
		   	case BREWING: 'TAB_BREWING'
		}
	}
}