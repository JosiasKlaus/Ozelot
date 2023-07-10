package ozelot

import org.eclipse.core.resources.IProject
import ozelot.generator.ForgeSetup
import ozelot.generator.content.ContentGenerator
import java.io.BufferedReader
import java.io.InputStreamReader
import ozelot.generator.FolderGenerator

class Main {
	public static final String SOURCE_FOLDER_PATH = 'src-gen/';
	
	def static void run(IProject project, Mod mod) {
		ForgeSetup.run(project, mod)
		ContentGenerator.run(project, mod)
		mod.runClient		
	}
	
	def static void runClient(Mod mod) {
		if(mod.autoStart){
			var builder = new ProcessBuilder("cmd.exe", "/c", "cd \"" + mod.projectPath + "\\src-gen\\" + FolderGenerator.getBaseFolder(mod) + "\" && gradlew runClient");
			builder.redirectErrorStream(true);
	    	var p = builder.start();
	    	
	    	var r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        var line = "test";
	        var isFirst = true;
	        while (line !== null) {
	        	if(!isFirst){
	            	System.out.println(line);
	        	}
	            line = r.readLine();
	            isFirst = false
	        }
		}		
	}	
}
