package ozelot.generator.content;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import ozelot.Block;
import ozelot.Item;
import ozelot.Mod;
import ozelot.Translation;
import ozelot.generator.FileGenerator;
import ozelot.generator.FolderGenerator;

@SuppressWarnings("all")
public class ContentGenerator {
  public static void run(final IProject project, final Mod mod) {
    String _iconPath = mod.getIconPath();
    String _baseFolder = FolderGenerator.getBaseFolder(mod);
    String _plus = (_baseFolder + "/src/main/resources");
    FileGenerator.copy(_iconPath, _plus);
    ContentGenerator.generateMainClass(project, mod);
    ContentGenerator.generateModsToml(project, mod);
    ContentGenerator.generatePackMeta(project, mod);
    ContentGenerator.generateLang(project, mod);
    ItemGenerator.run(project, mod);
    BlockGenerator.run(project, mod);
  }

  private static void generateMainClass(final IProject project, final Mod mod) {
    String _replace = mod.getName().replace(" ", "");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.slf4j.Logger;");
    _builder.newLine();
    _builder.append("import com.mojang.logging.LogUtils;");
    _builder.newLine();
    _builder.append("import net.minecraftforge.common.MinecraftForge;");
    _builder.newLine();
    _builder.append("import net.minecraftforge.eventbus.api.IEventBus;");
    _builder.newLine();
    _builder.append("import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;");
    _builder.newLine();
    {
      if (((mod.getItems().size() > 0) || (mod.getBlocks().size() > 0))) {
        _builder.append("import ");
        String _basePackage = FolderGenerator.getBasePackage(mod);
        String _plus = (_basePackage + ".item.ItemInitGen");
        _builder.append(_plus);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _size = mod.getBlocks().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("import ");
        String _basePackage_1 = FolderGenerator.getBasePackage(mod);
        String _plus_1 = (_basePackage_1 + ".block.BlockInitGen");
        _builder.append(_plus_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("public static final String MOD_ID = \"");
    String _modId = mod.getModId();
    _builder_1.append(_modId);
    _builder_1.append("\";");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("public static final Logger LOGGER = LogUtils.getLogger();");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public ");
    String _replace_1 = mod.getName().replace(" ", "");
    _builder_1.append(_replace_1);
    _builder_1.append("Gen() {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();");
    _builder_1.newLine();
    {
      if (((mod.getItems().size() > 0) || (mod.getBlocks().size() > 0))) {
        _builder_1.append("\t");
        _builder_1.append("ItemInitGen.register(eventBus);");
        _builder_1.newLine();
      }
    }
    {
      int _size_1 = mod.getBlocks().size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder_1.append("\t");
        _builder_1.append("BlockInitGen.register(eventBus);");
        _builder_1.newLine();
      }
    }
    _builder_1.append("\t");
    _builder_1.append("// EffectInit.register(eventBus);");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("MinecraftForge.EVENT_BUS.register(this);");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    FileGenerator.generateJavaClass(project, _replace, "", "", _builder.toString(), _builder_1.toString(), mod, 
      true, 
      false);
  }

  private static void generateModsToml(final IProject project, final Mod mod) {
    String _baseFolder = FolderGenerator.getBaseFolder(mod);
    String _plus = (_baseFolder + "/src/main/resources/META-INF");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("modLoader=\"javafml\"");
    _builder.newLine();
    _builder.append("loaderVersion=\"[40,)\"");
    _builder.newLine();
    _builder.append("license=\"All Rights Reserved\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("[[mods]]");
    _builder.newLine();
    _builder.append("modId=\"");
    String _modId = mod.getModId();
    _builder.append(_modId);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("version=\"");
    String _version = mod.getVersion();
    _builder.append(_version);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("displayName=\"");
    String _name = mod.getName();
    _builder.append(_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("credits=\"This mod was created with the Ozelot project.\"");
    _builder.newLine();
    _builder.append("authors=\"");
    String _authors = mod.getAuthors();
    _builder.append(_authors);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("logoFile=\"");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(mod.getIconPath().split("/"))));
    _builder.append(_last);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("description=");
    _builder.append("\'\'\'");
    _builder.newLineIfNotEmpty();
    String _description = mod.getDescription();
    _builder.append(_description);
    _builder.newLineIfNotEmpty();
    _builder.append("\'\'\'");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("[[dependencies.");
    String _modId_1 = mod.getModId();
    _builder.append(_modId_1);
    _builder.append("]]");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("modId=\"forge\"");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("mandatory=true");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("versionRange=\"[40.1.84,)\"");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("ordering=\"NONE\"");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("side=\"BOTH\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# [[dependencies.");
    String _modId_2 = mod.getModId();
    _builder.append(_modId_2);
    _builder.append("]]");
    _builder.newLineIfNotEmpty();
    _builder.append("#    modId=\"curios\"");
    _builder.newLine();
    _builder.append("#    mandatory=true");
    _builder.newLine();
    _builder.append("#    versionRange=\"[1.18.2-5,)\"");
    _builder.newLine();
    _builder.append("#    ordering=\"NONE\"");
    _builder.newLine();
    _builder.append("#    side=\"BOTH\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# [[dependencies.");
    String _modId_3 = mod.getModId();
    _builder.append(_modId_3);
    _builder.append("]]");
    _builder.newLineIfNotEmpty();
    _builder.append("#     modId=\"caelus\"");
    _builder.newLine();
    _builder.append("#     mandatory=true");
    _builder.newLine();
    _builder.append("#     versionRange=\"[1.18.1-3,)\"");
    _builder.newLine();
    _builder.append("#     ordering=\"NONE\"");
    _builder.newLine();
    _builder.append("#     side=\"BOTH\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("[[dependencies.");
    String _modId_4 = mod.getModId();
    _builder.append(_modId_4);
    _builder.append("]]");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("modId=\"minecraft\"");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("mandatory=true");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("versionRange=\"[1.18.2]\"");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("ordering=\"NONE\"");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("side=\"BOTH\"");
    _builder.newLine();
    FileGenerator.generateFile(project, 
      "mods.toml", _plus, _builder, 
      true);
  }

  private static void generatePackMeta(final IProject project, final Mod mod) {
    String _baseFolder = FolderGenerator.getBaseFolder(mod);
    String _plus = (_baseFolder + "/src/main/resources");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"pack\": {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\"description\": \"");
    String _modId = mod.getModId();
    _builder.append(_modId, "        ");
    _builder.append(" resources\",");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("\"pack_format\": 9,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\"forge:resource_pack_format\": 8,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\"forge:data_pack_format\": 9");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    FileGenerator.generateFile(project, 
      "pack.mcmeta", _plus, _builder, 
      true);
  }

  private static void generateLang(final IProject project, final Mod mod) {
    final Function1<Item, EList<Translation>> _function = (Item i) -> {
      return i.getTranslations();
    };
    Iterable<Translation> _flatMap = IterableExtensions.<Item, Translation>flatMap(mod.getItems(), _function);
    final Function1<Block, EList<Translation>> _function_1 = (Block i) -> {
      return i.getTranslations();
    };
    Iterable<Translation> _flatMap_1 = IterableExtensions.<Block, Translation>flatMap(mod.getBlocks(), _function_1);
    final Function1<Translation, String> _function_2 = (Translation t) -> {
      return t.getLang();
    };
    final Consumer<String> _function_3 = (String lang) -> {
      String _baseFolder = FolderGenerator.getBaseFolder(mod);
      String _plus = (_baseFolder + "/src/main/resources/assets/");
      String _modId = mod.getModId();
      String _plus_1 = (_plus + _modId);
      String _plus_2 = (_plus_1 + "/lang");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      {
        Iterable<String> _langEntry = ContentGenerator.getLangEntry(mod, lang);
        boolean _hasElements = false;
        for(final String string : _langEntry) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(",", "\t");
          }
          _builder.append("\t");
          _builder.append(string, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      FileGenerator.generateFile(project, 
        (lang + ".json"), _plus_2, _builder, 
        true);
    };
    IterableExtensions.<String>toSet(ListExtensions.<Translation, String>map(IterableExtensions.<Translation>toList(Iterables.<Translation>concat(_flatMap, _flatMap_1)), _function_2)).forEach(_function_3);
  }

  public static Iterable<String> getLangEntry(final Mod mod, final String lang) {
    ArrayList<String> ret = new ArrayList<String>();
    final Function1<Item, Boolean> _function = (Item i) -> {
      final Function1<Translation, String> _function_1 = (Translation t) -> {
        return t.getLang();
      };
      final Function1<String, Boolean> _function_2 = (String s) -> {
        return Boolean.valueOf(Objects.equal(s, lang));
      };
      int _size = IterableExtensions.size(IterableExtensions.<String>filter(ListExtensions.<Translation, String>map(i.getTranslations(), _function_1), _function_2));
      return Boolean.valueOf((_size > 0));
    };
    Iterable<Item> _filter = IterableExtensions.<Item>filter(mod.getItems(), _function);
    for (final Item item : _filter) {
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"item.");
        String _modId = mod.getModId();
        _builder.append(_modId);
        _builder.append(".");
        String _itemId = item.getItemId();
        _builder.append(_itemId);
        _builder.append("\": \"");
        final Function1<Translation, Boolean> _function_1 = (Translation t) -> {
          String _lang = t.getLang();
          return Boolean.valueOf(Objects.equal(_lang, lang));
        };
        String _name = (((Translation[])Conversions.unwrapArray(IterableExtensions.<Translation>filter(item.getTranslations(), _function_1), Translation.class))[0]).getName();
        _builder.append(_name);
        _builder.append("\"");
        ret.add(_builder.toString());
        final Function1<Translation, Boolean> _function_2 = (Translation t) -> {
          String _lang = t.getLang();
          return Boolean.valueOf(Objects.equal(_lang, lang));
        };
        String _description = (((Translation[])Conversions.unwrapArray(IterableExtensions.<Translation>filter(item.getTranslations(), _function_2), Translation.class))[0]).getDescription();
        boolean _notEquals = (!Objects.equal(_description, ""));
        if (_notEquals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("\"tooltip.");
          String _modId_1 = mod.getModId();
          _builder_1.append(_modId_1);
          _builder_1.append(".item.");
          String _itemId_1 = item.getItemId();
          _builder_1.append(_itemId_1);
          _builder_1.append("\": \"");
          final Function1<Translation, Boolean> _function_3 = (Translation t) -> {
            String _lang = t.getLang();
            return Boolean.valueOf(Objects.equal(_lang, lang));
          };
          String _description_1 = (((Translation[])Conversions.unwrapArray(IterableExtensions.<Translation>filter(item.getTranslations(), _function_3), Translation.class))[0]).getDescription();
          _builder_1.append(_description_1);
          _builder_1.append("\"");
          ret.add(_builder_1.toString());
        }
      }
    }
    final Function1<Block, Boolean> _function_1 = (Block i) -> {
      final Function1<Translation, String> _function_2 = (Translation t) -> {
        return t.getLang();
      };
      final Function1<String, Boolean> _function_3 = (String s) -> {
        return Boolean.valueOf(Objects.equal(s, lang));
      };
      int _size = IterableExtensions.size(IterableExtensions.<String>filter(ListExtensions.<Translation, String>map(i.getTranslations(), _function_2), _function_3));
      return Boolean.valueOf((_size > 0));
    };
    Iterable<Block> _filter_1 = IterableExtensions.<Block>filter(mod.getBlocks(), _function_1);
    for (final Block block : _filter_1) {
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"block.");
        String _modId = mod.getModId();
        _builder.append(_modId);
        _builder.append(".");
        String _blockId = block.getBlockId();
        _builder.append(_blockId);
        _builder.append("\": \"");
        final Function1<Translation, Boolean> _function_2 = (Translation t) -> {
          String _lang = t.getLang();
          return Boolean.valueOf(Objects.equal(_lang, lang));
        };
        String _name = (((Translation[])Conversions.unwrapArray(IterableExtensions.<Translation>filter(block.getTranslations(), _function_2), Translation.class))[0]).getName();
        _builder.append(_name);
        _builder.append("\"");
        ret.add(_builder.toString());
        final Function1<Translation, Boolean> _function_3 = (Translation t) -> {
          String _lang = t.getLang();
          return Boolean.valueOf(Objects.equal(_lang, lang));
        };
        String _description = (((Translation[])Conversions.unwrapArray(IterableExtensions.<Translation>filter(block.getTranslations(), _function_3), Translation.class))[0]).getDescription();
        boolean _notEquals = (!Objects.equal(_description, ""));
        if (_notEquals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("\"tooltip.");
          String _modId_1 = mod.getModId();
          _builder_1.append(_modId_1);
          _builder_1.append(".block.");
          String _blockId_1 = block.getBlockId();
          _builder_1.append(_blockId_1);
          _builder_1.append("\": \"");
          final Function1<Translation, Boolean> _function_4 = (Translation t) -> {
            String _lang = t.getLang();
            return Boolean.valueOf(Objects.equal(_lang, lang));
          };
          String _description_1 = (((Translation[])Conversions.unwrapArray(IterableExtensions.<Translation>filter(block.getTranslations(), _function_4), Translation.class))[0]).getDescription();
          _builder_1.append(_description_1);
          _builder_1.append("\"");
          ret.add(_builder_1.toString());
        }
      }
    }
    return ret;
  }
}
