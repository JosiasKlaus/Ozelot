package ozelot.generator

import ozelot.Mod
import ozelot.Main

class FolderGenerator {
	def static String getBaseFolder(Mod mod){
		return mod.name.replace(' ', '')
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
}