package stringmodcreator

import stringmodcreator.data.Block
import stringmodcreator.data.CreativeModeTab
import stringmodcreator.data.Item
import stringmodcreator.data.Mod
import stringmodcreator.data.OnTickEffect
import stringmodcreator.data.Rarity
import stringmodcreator.data.SelfOtherEffect
import stringmodcreator.data.Translation
import stringmodcreator.generator.FolderGenerator
import stringmodcreator.generator.ForgeSetup
import stringmodcreator.generator.content.MainGenerator
import stringmodcreator.data.PotionEffects
import stringmodcreator.data.FoodItem
import stringmodcreator.data.Effect

class Main {
	public static final String SOURCE_FOLDER_PATH = 'src-gen/';
	
	def static void main(String[] args) {
		var mod = data
		
		FolderGenerator.generateFolderStructure(mod)
		ForgeSetup.run(mod)
		MainGenerator.run(mod)
	} 

	def static Mod getData(){
		return new Mod('examplemod'
			, 'My Test Mod'
			, 'this is my test mod'
			, 'Author'
			, 'C:/Users/johfr/Desktop/my_mod.png'
			, '0.0.1'
			, <Item>newArrayList(
					new Item(null, 'C:/Users/johfr/Desktop/my_item.png', true, 64, false, 'my_1_item',
						<Translation>newArrayList(
							new Translation("en_us", "My 1 Item", "This is my 1st Item!")
						),
						Rarity.COMMON,
						CreativeModeTab.MISC,
						<OnTickEffect>newArrayList(),
						<SelfOtherEffect>newArrayList
					),
					new FoodItem(null, 'C:/Users/johfr/Desktop/my_item.png', false, 16, true, 'my_2_item',
						<Translation>newArrayList(
							new Translation("en_us", "My 1 Item", "This is my 2nd Item!"),
							new Translation("de_de", "Item 2", "Das ist mein 2. Item")
						),
						Rarity.COMMON,
						CreativeModeTab.MISC,
						<OnTickEffect>newArrayList(
							new OnTickEffect(PotionEffects.FIRE_RESISTANCE, 1, 1, false, true),
							new OnTickEffect(PotionEffects.INVISIBILITY, 1, 1, false, true)
						),
						<SelfOtherEffect>newArrayList,
						<Effect>newArrayList,
						10,
						0.3f,
						false,
						true,
						<Effect>newArrayList(
							new Effect(PotionEffects.HEALTH_BOOST, 10, 60, false),
							new Effect(PotionEffects.INVISIBILITY, 5, 10, false)
						)
					)
			), <Block>newArrayList(
					new Block(),
					new Block(),
					new Block()
			)
		)
	}
	
	
	
	
}