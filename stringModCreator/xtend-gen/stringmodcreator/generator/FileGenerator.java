package stringmodcreator.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class FileGenerator {
  public static void generateFile(final String fullname, final String path, final String content) {
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
}
