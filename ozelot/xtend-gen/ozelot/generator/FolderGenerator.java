package ozelot.generator;

import ozelot.Mod;

@SuppressWarnings("all")
public class FolderGenerator {
  public static String getBaseFolder(final Mod mod) {
    return mod.getName().replace(" ", "");
  }

  public static String getOzelotPackage() {
    return "de.thm.ozelot";
  }

  public static String getBaseCodeFolder(final Mod mod) {
    String _baseFolder = FolderGenerator.getBaseFolder(mod);
    String _plus = (_baseFolder + "/src/main/java/");
    String _replace = FolderGenerator.getOzelotPackage().replace(".", "/");
    String _plus_1 = (_plus + _replace);
    String _plus_2 = (_plus_1 + "/");
    String _modId = mod.getModId();
    return (_plus_2 + _modId);
  }

  public static String getBasePackage(final Mod mod) {
    String _ozelotPackage = FolderGenerator.getOzelotPackage();
    String _plus = (_ozelotPackage + ".");
    String _modId = mod.getModId();
    return (_plus + _modId);
  }
}
