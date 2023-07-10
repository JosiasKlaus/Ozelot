package ozelot;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.eclipse.core.resources.IProject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import ozelot.generator.FolderGenerator;
import ozelot.generator.ForgeSetup;
import ozelot.generator.content.ContentGenerator;

@SuppressWarnings("all")
public class Main {
  public static final String SOURCE_FOLDER_PATH = "src-gen/";

  public static void run(final IProject project, final Mod mod) {
    ForgeSetup.run(project, mod);
    ContentGenerator.run(project, mod);
    Main.runClient(mod);
  }

  public static void runClient(final Mod mod) {
    try {
      boolean _isAutoStart = mod.isAutoStart();
      if (_isAutoStart) {
        String _projectPath = mod.getProjectPath();
        String _plus = ("cd \"" + _projectPath);
        String _plus_1 = (_plus + "\\src-gen\\");
        String _baseFolder = FolderGenerator.getBaseFolder(mod);
        String _plus_2 = (_plus_1 + _baseFolder);
        String _plus_3 = (_plus_2 + "\" && gradlew runClient");
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", _plus_3);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        InputStream _inputStream = p.getInputStream();
        InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
        BufferedReader r = new BufferedReader(_inputStreamReader);
        String line = "test";
        boolean isFirst = true;
        while ((line != null)) {
          {
            if ((!isFirst)) {
              System.out.println(line);
            }
            line = r.readLine();
            isFirst = false;
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
