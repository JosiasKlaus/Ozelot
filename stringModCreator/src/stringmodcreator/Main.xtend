package stringmodcreator

import stringmodcreator.data.Block
import stringmodcreator.data.Item
import stringmodcreator.data.Mod
import stringmodcreator.generator.FolderGenerator
import stringmodcreator.generator.ForgeSetup

class Main {
	public static final String SOURCE_FOLDER_PATH = 'src-gen/';
	
	def static void main(String[] args) {
		var mod = data
		
		FolderGenerator.generateFolderStructure(mod)
		ForgeSetup.run(mod)
	} 

	def static Mod getData(){
		return new Mod('mtm'
			, 'My Test Mod'
			, 'this is my test mod'
			, 'Author'
			, 'C:/Users/johfr/Desktop/my_mod.png'
			, '0.0.1'
			, <Item>newArrayList(
					new Item(null, 'C:/Users/johfr/Desktop/my_item.png', false, 64, false, 'my_1_item'),
					new Item(null, 'C:/Users/johfr/Desktop/my_item.png', false, 16, false, 'my_2_item')
			), <Block>newArrayList(
					new Block(),
					new Block(),
					new Block()
			)
		)
	}
	
	
	
	
}