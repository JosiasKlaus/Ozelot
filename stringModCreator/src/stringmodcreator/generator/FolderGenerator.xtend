package stringmodcreator.generator

import stringmodcreator.data.Mod
import stringmodcreator.Main

class FolderGenerator {
	def static String getBaseFolder(Mod mod){
		return Main.SOURCE_FOLDER_PATH + mod.name.replace(' ', '')
	}
	
	def static String getOzelotPackage(){
		return 'de.thm.ozelot'
	}
	
	def static String getBaseCodeFolder(Mod mod){
		return mod.baseFolder + '/src/main/java/' + getOzelotPackage.replace('.', '/') + '/' + mod.modId
	}
	
	def static String getBasePackage(Mod mod){
		return getOzelotPackage() + '.' + mod.modId
	}
	
	def static void generateFolderStructure(Mod mod){
		println("\n\nGenerateFolderStructure:")
		
		println('Generate Folder:\t' + Main.SOURCE_FOLDER_PATH)
		println('Generate Folder:\t' + mod.baseFolder)
		
		println('Generate Folder:\t' + mod.baseFolder + '/gradle')
		println('Generate Folder:\t' + mod.baseFolder + '/gradle/wrapper')
		
		println('Generate Folder:\t' + mod.baseFolder + '/src')
		println('Generate Folder:\t' + mod.baseFolder + '/src/main')
		
		println('Generate Folder:\t' + mod.baseFolder + '/src/main/java')
		println('Generate Folder:\t' + mod.baseFolder + '/src/main/java/de')
		println('Generate Folder:\t' + mod.baseFolder + '/src/main/java/de/thm')
		println('Generate Folder:\t' + mod.baseFolder + '/src/main/java/de/thm/ozelot')
		println('Generate Folder:\t' + mod.baseFolder + '/src/main/java/de/thm/ozelot/' + mod.modId)
		
		println('Generate Folder:\t' + mod.baseFolder + '/src/resources')
		println('Generate Folder:\t' + mod.baseFolder + '/src/resources/META-INF')
		
		if(mod.items.size > 0 || mod.blocks.size > 0){
			println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets')
			println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets/' + mod.modId)
			println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets/' + mod.modId + '/models')
			println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets/' + mod.modId + '/textures')
			println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets/' + mod.modId + '/lang')
			
			if(mod.items.size > 0){
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets/' + mod.modId + '/models/item')
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets/' + mod.modId + '/textures/item')
			}
			
			if(mod.blocks.size > 0){
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets/' + mod.modId + '/models/block')
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/assets/' + mod.modId + '/textures/block')
			}
			
		}
		
		if(mod.blocks.size > 0 || false /*todo: curios*/){
			println('Generate Folder:\t' + mod.baseFolder + '/src/resources/data')
			
			if(false /*todo: curios*/){
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/data/curios')
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/data/curios/tags')
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/data/curios/tags/items')
			}
			
			if(mod.blocks.size > 0){
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/data/minecraft')
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/data/minecraft/tags')
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/data/minecraft/tags/blocks')
				println('Generate Folder:\t' + mod.baseFolder + '/src/resources/data/minecraft/tags/blocks/mineable')
			}
		}
	}
}