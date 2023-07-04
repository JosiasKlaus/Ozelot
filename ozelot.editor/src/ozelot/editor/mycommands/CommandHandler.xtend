package ozelot.editor.mycommands

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.handlers.HandlerUtil
import ozelot.presentation.OzelotEditor
import org.eclipse.ui.IFileEditorInput
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.jface.viewers.TreeSelection
import ozelot.Main
import ozelot.Mod
import ozelot.Item
import org.eclipse.core.resources.IFolder
import java.io.InputStream
import java.io.ByteArrayInputStream

class CommandHandler extends AbstractHandler {
	
	override execute(ExecutionEvent event) throws ExecutionException {
		
		var IWorkbenchPart wbp = HandlerUtil.getActivePart(event);
		var OzelotEditor editor = (wbp as OzelotEditor);
		var IFileEditorInput input = editor.getEditorInput() as IFileEditorInput;
		var IFile file = input.file;
		var IProject project = file.project;
		
		var TreeSelection selection = editor.getSelection() as TreeSelection;
		var Mod mod = selection.getFirstElement as Mod;
		Main.run(project, mod)
		
		/*
		
		for(Item i : root.items){
		
			createFileWithContent(project,"de.thm.zdh",i.itemId+".java",i.compile);
	
		}*/
		
	
		return null;
	
	}
	
	def compile(Item v)'''
	kasjdölf
	'''
	
	def void createFileWithContent(IProject project,String pckgName, String fileName, CharSequence content){
	
		//var IFolder folder = project.getFolder("src-gen/");
		
		var String currentFolderString = "src-gen/";
		
		var IFolder folder
		
		for(String n : pckgName.split("\\.")){ //de . thm . zdh . Toll
		
			currentFolderString = currentFolderString + n + "/";
			
			folder = project.getFolder(currentFolderString);
			
			System.out.println("folder:" + folder);
			
			if(!folder.exists)
			
			folder.create(true,true,null);
		}
		
		var IFile file = folder.getFile(fileName);
		
		if(file.exists){
			file.delete(true,null);
		}
		
		if(!file.exists){
		
			var byte[] bytes;
			
			bytes = content.toString.bytes;
			
			var InputStream source = new ByteArrayInputStream(bytes);
			
			file.create(source, true, null);
		
		}
	
	}
	
}