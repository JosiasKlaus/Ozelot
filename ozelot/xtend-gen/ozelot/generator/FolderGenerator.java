package ozelot.generator;

import org.eclipse.xtext.xbase.lib.InputOutput;
import ozelot.Main;
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

  public static void generateFolderStructure(final Mod mod) {
    InputOutput.<String>println("\n\nGenerateFolderStructure:");
    InputOutput.<String>println(("Generate Folder:\t" + Main.SOURCE_FOLDER_PATH));
    String _baseFolder = FolderGenerator.getBaseFolder(mod);
    String _plus = ("Generate Folder:\t" + _baseFolder);
    InputOutput.<String>println(_plus);
    String _baseFolder_1 = FolderGenerator.getBaseFolder(mod);
    String _plus_1 = ("Generate Folder:\t" + _baseFolder_1);
    String _plus_2 = (_plus_1 + "/gradle");
    InputOutput.<String>println(_plus_2);
    String _baseFolder_2 = FolderGenerator.getBaseFolder(mod);
    String _plus_3 = ("Generate Folder:\t" + _baseFolder_2);
    String _plus_4 = (_plus_3 + "/gradle/wrapper");
    InputOutput.<String>println(_plus_4);
    String _baseFolder_3 = FolderGenerator.getBaseFolder(mod);
    String _plus_5 = ("Generate Folder:\t" + _baseFolder_3);
    String _plus_6 = (_plus_5 + "/src");
    InputOutput.<String>println(_plus_6);
    String _baseFolder_4 = FolderGenerator.getBaseFolder(mod);
    String _plus_7 = ("Generate Folder:\t" + _baseFolder_4);
    String _plus_8 = (_plus_7 + "/src/main");
    InputOutput.<String>println(_plus_8);
    String _baseFolder_5 = FolderGenerator.getBaseFolder(mod);
    String _plus_9 = ("Generate Folder:\t" + _baseFolder_5);
    String _plus_10 = (_plus_9 + "/src/main/java");
    InputOutput.<String>println(_plus_10);
    String _baseFolder_6 = FolderGenerator.getBaseFolder(mod);
    String _plus_11 = ("Generate Folder:\t" + _baseFolder_6);
    String _plus_12 = (_plus_11 + "/src/main/java/de");
    InputOutput.<String>println(_plus_12);
    String _baseFolder_7 = FolderGenerator.getBaseFolder(mod);
    String _plus_13 = ("Generate Folder:\t" + _baseFolder_7);
    String _plus_14 = (_plus_13 + "/src/main/java/de/thm");
    InputOutput.<String>println(_plus_14);
    String _baseFolder_8 = FolderGenerator.getBaseFolder(mod);
    String _plus_15 = ("Generate Folder:\t" + _baseFolder_8);
    String _plus_16 = (_plus_15 + "/src/main/java/de/thm/ozelot");
    InputOutput.<String>println(_plus_16);
    String _baseFolder_9 = FolderGenerator.getBaseFolder(mod);
    String _plus_17 = ("Generate Folder:\t" + _baseFolder_9);
    String _plus_18 = (_plus_17 + "/src/main/java/de/thm/ozelot/");
    String _modId = mod.getModId();
    String _plus_19 = (_plus_18 + _modId);
    InputOutput.<String>println(_plus_19);
    String _baseFolder_10 = FolderGenerator.getBaseFolder(mod);
    String _plus_20 = ("Generate Folder:\t" + _baseFolder_10);
    String _plus_21 = (_plus_20 + "/src/resources");
    InputOutput.<String>println(_plus_21);
    String _baseFolder_11 = FolderGenerator.getBaseFolder(mod);
    String _plus_22 = ("Generate Folder:\t" + _baseFolder_11);
    String _plus_23 = (_plus_22 + "/src/resources/META-INF");
    InputOutput.<String>println(_plus_23);
    if (((mod.getItems().size() > 0) || (mod.getBlocks().size() > 0))) {
      String _baseFolder_12 = FolderGenerator.getBaseFolder(mod);
      String _plus_24 = ("Generate Folder:\t" + _baseFolder_12);
      String _plus_25 = (_plus_24 + "/src/resources/assets");
      InputOutput.<String>println(_plus_25);
      String _baseFolder_13 = FolderGenerator.getBaseFolder(mod);
      String _plus_26 = ("Generate Folder:\t" + _baseFolder_13);
      String _plus_27 = (_plus_26 + "/src/resources/assets/");
      String _modId_1 = mod.getModId();
      String _plus_28 = (_plus_27 + _modId_1);
      InputOutput.<String>println(_plus_28);
      String _baseFolder_14 = FolderGenerator.getBaseFolder(mod);
      String _plus_29 = ("Generate Folder:\t" + _baseFolder_14);
      String _plus_30 = (_plus_29 + "/src/resources/assets/");
      String _modId_2 = mod.getModId();
      String _plus_31 = (_plus_30 + _modId_2);
      String _plus_32 = (_plus_31 + "/models");
      InputOutput.<String>println(_plus_32);
      String _baseFolder_15 = FolderGenerator.getBaseFolder(mod);
      String _plus_33 = ("Generate Folder:\t" + _baseFolder_15);
      String _plus_34 = (_plus_33 + "/src/resources/assets/");
      String _modId_3 = mod.getModId();
      String _plus_35 = (_plus_34 + _modId_3);
      String _plus_36 = (_plus_35 + "/textures");
      InputOutput.<String>println(_plus_36);
      String _baseFolder_16 = FolderGenerator.getBaseFolder(mod);
      String _plus_37 = ("Generate Folder:\t" + _baseFolder_16);
      String _plus_38 = (_plus_37 + "/src/resources/assets/");
      String _modId_4 = mod.getModId();
      String _plus_39 = (_plus_38 + _modId_4);
      String _plus_40 = (_plus_39 + "/lang");
      InputOutput.<String>println(_plus_40);
      int _size = mod.getItems().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _baseFolder_17 = FolderGenerator.getBaseFolder(mod);
        String _plus_41 = ("Generate Folder:\t" + _baseFolder_17);
        String _plus_42 = (_plus_41 + "/src/resources/assets/");
        String _modId_5 = mod.getModId();
        String _plus_43 = (_plus_42 + _modId_5);
        String _plus_44 = (_plus_43 + "/models/item");
        InputOutput.<String>println(_plus_44);
        String _baseFolder_18 = FolderGenerator.getBaseFolder(mod);
        String _plus_45 = ("Generate Folder:\t" + _baseFolder_18);
        String _plus_46 = (_plus_45 + "/src/resources/assets/");
        String _modId_6 = mod.getModId();
        String _plus_47 = (_plus_46 + _modId_6);
        String _plus_48 = (_plus_47 + "/textures/item");
        InputOutput.<String>println(_plus_48);
      }
      int _size_1 = mod.getBlocks().size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        String _baseFolder_19 = FolderGenerator.getBaseFolder(mod);
        String _plus_49 = ("Generate Folder:\t" + _baseFolder_19);
        String _plus_50 = (_plus_49 + "/src/resources/assets/");
        String _modId_7 = mod.getModId();
        String _plus_51 = (_plus_50 + _modId_7);
        String _plus_52 = (_plus_51 + "/models/block");
        InputOutput.<String>println(_plus_52);
        String _baseFolder_20 = FolderGenerator.getBaseFolder(mod);
        String _plus_53 = ("Generate Folder:\t" + _baseFolder_20);
        String _plus_54 = (_plus_53 + "/src/resources/assets/");
        String _modId_8 = mod.getModId();
        String _plus_55 = (_plus_54 + _modId_8);
        String _plus_56 = (_plus_55 + "/textures/block");
        InputOutput.<String>println(_plus_56);
      }
    }
    if (((mod.getBlocks().size() > 0) || false)) {
      String _baseFolder_21 = FolderGenerator.getBaseFolder(mod);
      String _plus_57 = ("Generate Folder:\t" + _baseFolder_21);
      String _plus_58 = (_plus_57 + "/src/resources/data");
      InputOutput.<String>println(_plus_58);
      if (false) {
        String _baseFolder_22 = FolderGenerator.getBaseFolder(mod);
        String _plus_59 = ("Generate Folder:\t" + _baseFolder_22);
        String _plus_60 = (_plus_59 + "/src/resources/data/curios");
        InputOutput.<String>println(_plus_60);
        String _baseFolder_23 = FolderGenerator.getBaseFolder(mod);
        String _plus_61 = ("Generate Folder:\t" + _baseFolder_23);
        String _plus_62 = (_plus_61 + "/src/resources/data/curios/tags");
        InputOutput.<String>println(_plus_62);
        String _baseFolder_24 = FolderGenerator.getBaseFolder(mod);
        String _plus_63 = ("Generate Folder:\t" + _baseFolder_24);
        String _plus_64 = (_plus_63 + "/src/resources/data/curios/tags/items");
        InputOutput.<String>println(_plus_64);
      }
      int _size_2 = mod.getBlocks().size();
      boolean _greaterThan_2 = (_size_2 > 0);
      if (_greaterThan_2) {
        String _baseFolder_25 = FolderGenerator.getBaseFolder(mod);
        String _plus_65 = ("Generate Folder:\t" + _baseFolder_25);
        String _plus_66 = (_plus_65 + "/src/resources/data/minecraft");
        InputOutput.<String>println(_plus_66);
        String _baseFolder_26 = FolderGenerator.getBaseFolder(mod);
        String _plus_67 = ("Generate Folder:\t" + _baseFolder_26);
        String _plus_68 = (_plus_67 + "/src/resources/data/minecraft/tags");
        InputOutput.<String>println(_plus_68);
        String _baseFolder_27 = FolderGenerator.getBaseFolder(mod);
        String _plus_69 = ("Generate Folder:\t" + _baseFolder_27);
        String _plus_70 = (_plus_69 + "/src/resources/data/minecraft/tags/blocks");
        InputOutput.<String>println(_plus_70);
        String _baseFolder_28 = FolderGenerator.getBaseFolder(mod);
        String _plus_71 = ("Generate Folder:\t" + _baseFolder_28);
        String _plus_72 = (_plus_71 + "/src/resources/data/minecraft/tags/blocks/mineable");
        InputOutput.<String>println(_plus_72);
      }
    }
  }
}
