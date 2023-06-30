package stringmodcreator.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import stringmodcreator.data.Mod;

@SuppressWarnings("all")
public class FileGenerator {
  public static void generateFile(final String fullname, final String path, final String content, final boolean overwrite) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("---------------------NEW FILE---------------------");
    _builder.newLine();
    _builder.append("File:   ");
    _builder.append(fullname);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("At:     ");
    _builder.append(path);
    _builder.newLineIfNotEmpty();
    _builder.append("Content:");
    _builder.newLine();
    String _replace = content.replace("\n", "\n\t");
    String _plus = ("\t" + _replace);
    _builder.append(_plus);
    _builder.newLineIfNotEmpty();
    _builder.append("---------------------FILE END---------------------");
    _builder.newLine();
    InputOutput.<String>println(_builder.toString());
  }

  public static void generateJavaClass(final String className, final String packageExtension, final String extensions, final String imports, final String content, final Mod mod, final boolean isMain, final boolean onlyGen) {
    String _baseCodeFolder = FolderGenerator.getBaseCodeFolder(mod);
    String _xifexpression = null;
    int _length = packageExtension.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      _xifexpression = ("." + packageExtension);
    } else {
      _xifexpression = "";
    }
    String _replace = (_baseCodeFolder + _xifexpression).replace(".", "/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = FolderGenerator.getBasePackage(mod);
    String _xifexpression_1 = null;
    int _length_1 = packageExtension.length();
    boolean _greaterThan_1 = (_length_1 > 0);
    if (_greaterThan_1) {
      _xifexpression_1 = ("." + packageExtension);
    } else {
      _xifexpression_1 = "";
    }
    String _plus = (_basePackage + _xifexpression_1);
    _builder.append(_plus);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(imports);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This class is automatically generated. Any manual overwriting of this code will be overwritten upon generation.");
    _builder.newLine();
    {
      if ((!onlyGen)) {
        _builder.append("* <br>If you want to overwrite the contents of the file, use the file \"");
        _builder.append((className + ".java"));
        _builder.append("\" instead.");
        _builder.newLineIfNotEmpty();
        _builder.append("* @see ");
        _builder.append(className);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("class ");
    _builder.append((className + "Gen"));
    _builder.append(" ");
    _builder.append(extensions);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String[] _split = content.split("\n");
      for(final String i : _split) {
        _builder.append((i + "\n"), "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    FileGenerator.generateFile(
      (className + "Gen.java"), _replace, _builder.toString(), 
      true);
    if ((!onlyGen)) {
      String _baseCodeFolder_1 = FolderGenerator.getBaseCodeFolder(mod);
      String _xifexpression_2 = null;
      int _length_2 = packageExtension.length();
      boolean _greaterThan_2 = (_length_2 > 0);
      if (_greaterThan_2) {
        _xifexpression_2 = ("." + packageExtension);
      } else {
        _xifexpression_2 = "";
      }
      String _replace_1 = (_baseCodeFolder_1 + _xifexpression_2).replace(".", "/");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package ");
      String _basePackage_1 = FolderGenerator.getBasePackage(mod);
      String _xifexpression_3 = null;
      int _length_3 = packageExtension.length();
      boolean _greaterThan_3 = (_length_3 > 0);
      if (_greaterThan_3) {
        _xifexpression_3 = ("." + packageExtension);
      } else {
        _xifexpression_3 = "";
      }
      String _plus_1 = (_basePackage_1 + _xifexpression_3);
      _builder_1.append(_plus_1);
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      String _xifexpression_4 = null;
      if (isMain) {
        _xifexpression_4 = "import net.minecraftforge.fml.common.Mod;";
      } else {
        _xifexpression_4 = "";
      }
      _builder_1.append(_xifexpression_4);
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* This file is only initially generated. Manual changes to the file are retained after generation.");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* @see ");
      _builder_1.append((className + "Gen"), " ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      String _xifexpression_5 = null;
      if (isMain) {
        _xifexpression_5 = (("@Mod(" + className) + ".MOD_ID)");
      } else {
        _xifexpression_5 = "";
      }
      _builder_1.append(_xifexpression_5);
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("class ");
      _builder_1.append(className);
      _builder_1.append(" extends ");
      _builder_1.append((className + "Gen"));
      _builder_1.append(" {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      FileGenerator.generateFile(
        (className + ".java"), _replace_1, _builder_1.toString(), 
        false);
    }
  }

  public static void generateJavaClass(final String className, final String packageExtension, final String extensions, final String imports, final String content, final Mod mod) {
    FileGenerator.generateJavaClass(className, packageExtension, extensions, imports, content, mod, false, false);
  }
}
