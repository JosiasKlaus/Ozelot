package ozelot

import ozelot.generator.FolderGenerator
import ozelot.generator.ForgeSetup
import ozelot.generator.content.ContentGenerator
import org.eclipse.core.resources.IProject

class Main {
	public static final String SOURCE_FOLDER_PATH = 'src-gen/';
	
	def static void run(IProject project, Mod mod) {
		
		FolderGenerator.generateFolderStructure(mod)
		ForgeSetup.run(project, mod)
		ContentGenerator.run(project, mod)
	}
}
