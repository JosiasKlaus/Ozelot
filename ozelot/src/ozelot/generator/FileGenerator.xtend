package ozelot.generator

import java.io.ByteArrayInputStream
import java.io.InputStream
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import ozelot.Mod

class FileGenerator {
	def static void copy(IProject project, Mod mod, String originalPath, String newPath){
		var String currentFolderString = "src-gen/";
		var IFolder folder
		for(String s : newPath.split("/")){
			currentFolderString = currentFolderString + s + "/";
			
			folder = project.getFolder(currentFolderString);
			if(!folder.exists){
				folder.create(true,true,null);
			}
		}
		
		var builder = new ProcessBuilder("cmd.exe", "/c", "copy " + originalPath + " " + mod.projectPath + "\\src-gen\\" + newPath.replace('/', '\\') + "\\");
		var p = builder.start();
	}
	
	def static void generateFile(IProject project, String fileName, String path, CharSequence content, boolean overwrite){
		var String currentFolderString = "src-gen/";
		var IFolder folder
		for(String s : path.split("/")){
			currentFolderString = currentFolderString + s + "/";
			
			folder = project.getFolder(currentFolderString);
			if(!folder.exists){
				folder.create(true,true,null);
			}
		}
		
		var IFile file = folder.getFile(fileName);
		if(file.exists && overwrite){
			file.delete(true,null);
		}
		if(!file.exists){
			var byte[] bytes;
			bytes = content.toString.bytes;
			var InputStream source = new ByteArrayInputStream(bytes);
			file.create(source, true, null);
		}
	}
	
	def static void generateJavaClass(IProject project, String className, String packageExtension, String extensions, String imports, String content, Mod mod, boolean isMain, boolean onlyGen){
		generateFile(
			project, 
			className + "Gen.java",
			(FolderGenerator.getBaseCodeFolder(mod) + (packageExtension.length > 0 ? "." + packageExtension : "")).replace(".", "/"),
			'''
			package «FolderGenerator.getBasePackage(mod) + (packageExtension.length > 0 ? "." + packageExtension : "")»;
			
			«imports»
			
			/**
			 * This class is automatically generated. Any manual overwriting of this code will be overwritten upon generation.
			«IF !onlyGen»
			 * <br>If you want to overwrite the contents of the file, use the file "«className + ".java"»" instead.
			 * @see «className»
			«ENDIF»
			 */
			public class «className + 'Gen'» «extensions» {
				«FOR i : content.split("\n")»«i+"\n"»«ENDFOR»
			}
			''',
			true
		)
		
		if(!onlyGen){
			generateFile(
				project, 
				className + ".java",
				(FolderGenerator.getBaseCodeFolder(mod) + (packageExtension.length > 0 ? "." + packageExtension : "")).replace(".", "/"),
				'''
				package «FolderGenerator.getBasePackage(mod) + (packageExtension.length > 0 ? "." + packageExtension : "")»;
				
				«isMain ? "import net.minecraftforge.fml.common.Mod;" : ""»
				
				/**
				 * This file is only initially generated. Manual changes to the file are retained after generation.
				 * @see «className + "Gen"»
				 */
				«isMain ? "@Mod(" + className + ".MOD_ID)" : ""»
				public class «className» extends «className + 'Gen'» {
					
				}
				''',
				false
			)
		}
		
	}
	
	def static void generateJavaClass(IProject project, String className, String packageExtension, String extensions, String imports, String content, Mod mod){
		generateJavaClass(project, className, packageExtension, extensions, imports, content, mod, false, false);
	}
}