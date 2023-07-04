package ozelot.editor.mycommands;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import ozelot.Item;
import ozelot.Main;
import ozelot.Mod;
import ozelot.presentation.OzelotEditor;

@SuppressWarnings("all")
public class CommandHandler extends AbstractHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    IWorkbenchPart wbp = HandlerUtil.getActivePart(event);
    OzelotEditor editor = ((OzelotEditor) wbp);
    IEditorInput _editorInput = editor.getEditorInput();
    IFileEditorInput input = ((IFileEditorInput) _editorInput);
    IFile file = input.getFile();
    IProject project = file.getProject();
    ISelection _selection = editor.getSelection();
    TreeSelection selection = ((TreeSelection) _selection);
    Object _firstElement = selection.getFirstElement();
    Mod mod = ((Mod) _firstElement);
    Main.run(project, mod);
    return null;
  }

  public CharSequence compile(final Item v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("kasjdölf");
    _builder.newLine();
    return _builder;
  }

  public void createFileWithContent(final IProject project, final String pckgName, final String fileName, final CharSequence content) {
    try {
      String currentFolderString = "src-gen/";
      IFolder folder = null;
      String[] _split = pckgName.split("\\.");
      for (final String n : _split) {
        {
          currentFolderString = ((currentFolderString + n) + "/");
          folder = project.getFolder(currentFolderString);
          System.out.println(("folder:" + folder));
          boolean _exists = folder.exists();
          boolean _not = (!_exists);
          if (_not) {
            folder.create(true, true, null);
          }
        }
      }
      IFile file = folder.getFile(fileName);
      boolean _exists = file.exists();
      if (_exists) {
        file.delete(true, null);
      }
      boolean _exists_1 = file.exists();
      boolean _not = (!_exists_1);
      if (_not) {
        byte[] bytes = null;
        bytes = content.toString().getBytes();
        InputStream source = new ByteArrayInputStream(bytes);
        file.create(source, true, null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
