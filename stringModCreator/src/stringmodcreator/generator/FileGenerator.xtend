package stringmodcreator.generator

import stringmodcreator.data.Mod

class FileGenerator {
	def static void generateFile(String fullname, String path, String content, boolean overwrite){
		println(
			'''
			---------------------NEW FILE---------------------
			File:   «fullname» 
			At:     «path»
			Content:
			«"\t" + content.replace("\n", "\n\t")»
			---------------------FILE END---------------------
			'''
		)
	}
	
	def static void generateJavaClass(String className, String packageExtension, String extensions, String imports, String content, Mod mod, boolean isMain){
		generateFile(
			className + "Gen.java",
			(FolderGenerator.getBaseCodeFolder(mod) + (packageExtension.length > 0 ? "." + packageExtension : "")).replace(".", "/"),
			'''
			package «FolderGenerator.getBasePackage(mod) + (packageExtension.length > 0 ? "." + packageExtension : "")»
			
			«imports»
			
			/**
			 * This class is automatically generated. Any manual overwriting of this code will be overwritten upon generation.
			 * <br>If you want to overwrite the contents of the file, use the file "«className + ".java"»" instead.
			 * @see «className»
			 */
			class «className + 'Gen'» «extensions» {
				«FOR i : content.split("\n")»«i+"\n"»«ENDFOR»
			}
			''',
			true
		)
		
		generateFile(
			className + ".java",
			(FolderGenerator.getBaseCodeFolder(mod) + (packageExtension.length > 0 ? "." + packageExtension : "")).replace(".", "/"),
			'''
			package «FolderGenerator.getBasePackage(mod) + (packageExtension.length > 0 ? "." + packageExtension : "")»
			
			«isMain ? "import net.minecraftforge.fml.common.Mod;" : ""»
			
			/**
			 * This file is only initially generated. Manual changes to the file are retained after generation.
			 * @see «className + "Gen"»
			 */
			«isMain ? "@Mod(" + className + ".MOD_ID)" : ""»
			class «className» extends «className + 'Gen'»{
				
			}
			''',
			false
		)
	}
	
	def static void generateJavaClass(String className, String packageExtension, String extensions, String imports, String content, Mod mod){
		generateJavaClass(className, packageExtension, extensions, imports, content, mod, false);
	}
}