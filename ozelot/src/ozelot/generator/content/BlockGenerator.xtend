package ozelot.generator.content

import org.eclipse.core.resources.IProject
import ozelot.Block
import ozelot.BlockMiningLevel
import ozelot.CreativeModeTab
import ozelot.MiningToolType
import ozelot.Mod
import ozelot.SoundType
import ozelot.generator.FileGenerator
import ozelot.generator.FolderGenerator

class BlockGenerator {
	def static void run(IProject project, Mod mod){
			project.generateBlockInit(mod)
			project.generateBlockClass(mod)
			project.generateBlockJson(mod)
			project.generateMinable(mod)
	}
	
	def static String getClassName(Block block){
		return block.blockId.replace("-", " ").replace("_", " ").split(" ").reduce[s1, s2|s1 + s2.toFirstUpper].toFirstUpper
	}
	
	def private static void generateBlockInit(IProject project, Mod mod){
		if(mod.items.size > 0 || mod.blocks.size > 0){
			FileGenerator.generateJavaClass(
				project, 
				"BlockInit",
				"block",
				"",
				'''
				import net.minecraft.world.item.BlockItem;
				import net.minecraft.world.item.CreativeModeTab;
				import net.minecraft.world.item.Item;
				import net.minecraft.world.level.block.Block;
				import net.minecraftforge.eventbus.api.IEventBus;
				import net.minecraftforge.registries.DeferredRegister;
				import net.minecraftforge.registries.ForgeRegistries;
				import net.minecraftforge.registries.RegistryObject;
				import java.util.function.Supplier;
				«FOR block : mod.blocks»
				import «FolderGenerator.getBasePackage(mod) + ".block.base." + block.className»; 
				«ENDFOR»
				import «FolderGenerator.getBasePackage(mod) + "." + mod.name.replace(" ","")»;
				import «FolderGenerator.getBasePackage(mod)».item.ItemInitGen;
				''',
				'''
				public static final DeferredRegister<Block> BLOCKS =
				            DeferredRegister.create(ForgeRegistries.BLOCKS, «mod.name.replace(" ","")».MOD_ID);
					
				«FOR block : mod.blocks»
				public static final RegistryObject<Block> «block.blockId.toUpperCase» = registerBlock("«block.blockId»",«block.className»::new, CreativeModeTab.«block.creativeModeTab.tabString»);
				«ENDFOR»
				
				private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
					RegistryObject<T> toReturn = BLOCKS.register(name, block);
					registerBlockItem(name, toReturn, tab);
					return toReturn;
				}
				
				private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
					return ItemInitGen.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
					}
					
				public static void register(IEventBus eventBus) {
					BLOCKS.register(eventBus);
				}
				''',
				mod,
				false,
				true
			)
		}
	}
	
	def private static void generateBlockClass(IProject project, Mod mod){
		mod.blocks.forEach[block|
			FileGenerator.generateJavaClass(
				project, 
				block.className,
				'block.base',
				'''extends «block.hasGravity ? 'FallingBlock' : 'Block'»''',
				'''
				import net.minecraft.world.level.block.state.BlockBehaviour;
				import net.minecraft.world.level.material.Material;
				import net.minecraft.world.level.block.SoundType;
				«IF block.translations.filter[t|t.description != ''].size > 0»
				import java.util.List;
				import net.minecraft.network.chat.Component;
				import net.minecraft.network.chat.TranslatableComponent;
				import net.minecraft.world.item.ItemStack;
				import net.minecraft.world.item.TooltipFlag;
				«ENDIF»
				«IF block.luminance > 0 || block.redstoneSignal > 0 || block.translations.filter[t|t.description != ''].size > 0»
				import net.minecraft.world.level.BlockGetter;
				«ENDIF»
				«IF block.luminance > 0 || block.redstoneSignal > 0»
				import net.minecraft.core.BlockPos;
				«ENDIF»
				«IF block.luminance > 0 || block.redstoneSignal > 0»
				import net.minecraft.world.level.block.state.BlockState;
				«ENDIF»
				«IF block.redstoneSignal > 0»
				import net.minecraft.core.Direction;
				«ENDIF»
				import net.minecraft.world.level.block.«block.hasGravity ? 'FallingBlock' : 'Block'»;
				''',
				'''
				public «block.className»Gen() {
					super(BlockBehaviour.Properties.of(Material.STONE)
							.sound(SoundType.«block.soundType.soundString»)
							.strength(«block.harddness»f, «block.explosionResistance»f)
							«IF block.luminance > 0»
							.lightLevel(s -> «Math.max(block.luminance, 15)»)
							«ENDIF»
							«IF block.requiresCorrectToolForDrops»
							.requiresCorrectToolForDrops()
							«ENDIF»
							«IF block.canWalkThrough»
							.noCollission()
							«ENDIF»
							.friction(«block.slipperiness»f)
							.speedFactor(«block.speedFactor»f)
							.jumpFactor(«block.jumpFactor»f)
							.hasPostProcess((bs, br, bp) -> true)
							«IF block.luminance > 0»
							.emissiveRendering((bs, br, bp) -> true)
							«ENDIF»
							);
				}
				«IF block.translations.filter[t|t.description != ''].size > 0»
				
				@Override
				public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> tooltip, TooltipFlag flag) {
					super.appendHoverText(itemstack, world, tooltip, flag);
					tooltip.add(new TranslatableComponent("tooltip.«mod.modId».block.«block.blockId»"));
				}
				«ENDIF»
				«IF block.luminance > 0»	
					
				@Override
				public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
					return «Math.max(block.luminance, 15)»;
				}
				«ENDIF»
				«IF block.redstoneSignal > 0»
				
				@Override
				public boolean isSignalSource(BlockState state) {
					return true;
				}
				
				@Override
				public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
					return «Math.max(block.redstoneSignal, 15)»;
				}
				
				@Override
				public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
					return true;
				}
				«ENDIF»
				''',
				mod
			)
		]
	}
	
	def private static void generateBlockJson(IProject project, Mod mod){
		mod.blocks.forEach[block |
			FileGenerator.copy(block.texturePath, FolderGenerator.getBaseFolder(mod) + '/src/main/resources/assets/' + mod.modId + '/textures/block')
			FileGenerator.generateFile(
				project,
				block.blockId + ".json",
				FolderGenerator.getBaseFolder(mod) + '/src/main/resources/assets/' + mod.modId + '/blockstates',
				'''
				{
				  "variants": {
				    "": { "model": "«mod.modId»:block/«block.blockId»" }
				  }
				}
				''',
				true
			)
			FileGenerator.generateFile(
				project,
				block.blockId + ".json",
				FolderGenerator.getBaseFolder(mod) + '/src/main/resources/assets/' + mod.modId + '/models/block',
				'''
				{
				  "parent": "block/cube_all",
				  "textures": {
				    "all": "«mod.modId»:block/«block.texturePath.split('/').last.replace('.png', '')»"
				  }
				}
				''',
				true
			)
			FileGenerator.generateFile(
				project,
				block.blockId + ".json",
				FolderGenerator.getBaseFolder(mod) + '/src/main/resources/data/' + mod.modId +'/loot_tables/blocks',
				'''
				{
				  "type": "minecraft:block",
				  "pools": [
				    {
				      "rolls": 1.0,
				      "bonus_rolls": 0.0,
				      "entries": [
				        {
				          "type": "minecraft:item",
				          "name": "«mod.modId»:«block.blockId»"
				        }
				      ],
				      "conditions": [
				        {
				          "condition": "minecraft:survives_explosion"
				        }
				      ]
				    }
				  ]
				}
				''',
				true
			)
			FileGenerator.generateFile(
				project,
				block.blockId + ".json",
				FolderGenerator.getBaseFolder(mod) + '/src/main/resources/assets/' + mod.modId + '/models/item',
				'''
				{
				  "parent": "«mod.modId»:block/«block.blockId»"
				}
				''',
				true
			)
		]
	}
	
	def private static void generateMinable(IProject project, Mod mod){
		for(miningLevel : BlockMiningLevel.values){
			if(miningLevel != BlockMiningLevel.NONE){
				var filteredBlocks = mod.blocks.filter[b|b.miningLevel == miningLevel]
				if(filteredBlocks.size > 0){
					FileGenerator.generateFile(
						project,
						miningLevel.getMiningTagString + ".json",
						FolderGenerator.getBaseFolder(mod) + '/src/main/resources/data/minecraft/tags/blocks',
						'''
						{
							"replace": false,
						  	"values": [
						  	«FOR block: filteredBlocks SEPARATOR ','»
						  		"«mod.modId»:«block.blockId»"
							«ENDFOR»
							]
						}
						''',
						true
					)
				}
			}
		}
		
		for(miningTool : MiningToolType.values){
			var filteredBlocks = mod.blocks.filter[b|b.miningTool == miningTool]
			if(filteredBlocks.size > 0){
				FileGenerator.generateFile(
					project,
					miningTool.getToolTagString + ".json",
					FolderGenerator.getBaseFolder(mod) + '/src/main/resources/data/minecraft/tags/blocks/mineable',
					'''
					{
						"replace": false,
						"values": [
							«FOR block: filteredBlocks SEPARATOR ','»
								"«mod.modId»:«block.blockId»"
							«ENDFOR»
						]
					}
					''',
					true
				)
			}
		}
	}
	
	def private static String getMiningTagString(BlockMiningLevel level){
		switch level{
			case NONE: 'none'
		   	case STONE: 'needs_stone_tool'
		   	case IRON: 'needs_iron_tool'
		   	case DIAMOND: 'needs_diamond_tool'
		}
	}
	
	def private static String getToolTagString(MiningToolType miningTool){
		switch miningTool{
			case AXE: 'axe'
			case HOE: 'hoe'
			case SHOVEL: 'shovel'
			case PICKAXE: 'pickaxe'
		}
	}
	
	def private static String getSoundString(SoundType soundType){
		switch soundType{
			case WOOD: 'WOOD'
		   	case GRAVEL: 'GRAVEL'
		   	case GRASS: 'GRASS'
		   	case LILY_PAD: 'LILY_PAD'
		   	case STONE: 'STONE'
		   	case METAL: 'METAL'
		   	case GLASS: 'GLASS'
		   	case WOOL: 'WOOL'
		   	case SAND: 'SAND'
		   	case SNOW: 'SNOW'
		   	case LADDER: 'LADDER'
		   	case SLIME_BLOCK: 'SLIME_BLOCK'
		   	case WET_GRASS: 'WET_GRASS'
		   	case CROP: 'CROP'
		   	case LANTERN: 'LANTERN'
		   	case SOUL_SAND: 'SOUL_SAND'
		   	case NETHERRACK: 'NETHERRACK'
		   	case NETHER_ORE: 'NETHER_ORE'
		   	case AMETHYST: 'AMETHYST'
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