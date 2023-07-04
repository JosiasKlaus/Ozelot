package ozelot

import org.eclipse.core.resources.IProject
import ozelot.generator.ForgeSetup
import ozelot.generator.content.ContentGenerator

class Main {
	public static final String SOURCE_FOLDER_PATH = 'src-gen/';
	
	def static void run(IProject project, Mod mod) {
		ForgeSetup.run(project, mod)
		ContentGenerator.run(project, mod)
	}
}
