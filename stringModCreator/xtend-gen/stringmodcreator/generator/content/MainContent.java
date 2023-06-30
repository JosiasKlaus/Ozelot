package stringmodcreator.generator.content;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import stringmodcreator.data.Mod;
import stringmodcreator.generator.FileGenerator;

@SuppressWarnings("all")
public class MainContent {
  public static void run(final Mod mod) {
    InputOutput.<String>println("\n\nContentSetup:");
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
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("public static final String MOD_ID = \"examplemod\";");
    _builder_1.newLine();
    _builder_1.append("public static final Logger LOGGER = LogUtils.getLogger();");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public ExampleModGen() {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("// ItemInit.register(eventBus);");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("// BlockInit.register(eventBus);");
    _builder_1.newLine();
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
    FileGenerator.generateJavaClass(_replace, "", "", _builder.toString(), _builder_1.toString(), mod, 
      true);
  }
}
