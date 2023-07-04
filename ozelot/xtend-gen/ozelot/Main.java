package ozelot;

import org.eclipse.core.resources.IProject;
import ozelot.generator.FolderGenerator;
import ozelot.generator.ForgeSetup;
import ozelot.generator.content.ContentGenerator;

@SuppressWarnings("all")
public class Main {
  public static final String SOURCE_FOLDER_PATH = "src-gen/";

  public static void run(final IProject project, final Mod mod) {
    FolderGenerator.generateFolderStructure(mod);
    ForgeSetup.run(project, mod);
    ContentGenerator.run(project, mod);
  }
}
