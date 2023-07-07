package ozelot.generator.content;

import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import ozelot.Block;
import ozelot.BlockMiningLevel;
import ozelot.CreativeModeTab;
import ozelot.MiningToolType;
import ozelot.Mod;
import ozelot.SoundType;
import ozelot.Translation;
import ozelot.generator.FileGenerator;
import ozelot.generator.FolderGenerator;

@SuppressWarnings("all")
public class BlockGenerator {
  public static void run(final IProject project, final Mod mod) {
    BlockGenerator.generateBlockInit(project, mod);
    BlockGenerator.generateBlockClass(project, mod);
    BlockGenerator.generateBlockJson(project, mod);
    BlockGenerator.generateMinable(project, mod);
  }

  public static String getClassName(final Block block) {
    final Function2<String, String, String> _function = (String s1, String s2) -> {
      String _firstUpper = StringExtensions.toFirstUpper(s2);
      return (s1 + _firstUpper);
    };
    return StringExtensions.toFirstUpper(IterableExtensions.<String>reduce(((Iterable<? extends String>)Conversions.doWrapArray(block.getBlockId().replace("-", " ").replace("_", " ").split(" "))), _function));
  }

  private static void generateBlockInit(final IProject project, final Mod mod) {
    if (((mod.getItems().size() > 0) || (mod.getBlocks().size() > 0))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import net.minecraft.world.item.BlockItem;");
      _builder.newLine();
      _builder.append("import net.minecraft.world.item.CreativeModeTab;");
      _builder.newLine();
      _builder.append("import net.minecraft.world.item.Item;");
      _builder.newLine();
      _builder.append("import net.minecraft.world.level.block.Block;");
      _builder.newLine();
      _builder.append("import net.minecraftforge.eventbus.api.IEventBus;");
      _builder.newLine();
      _builder.append("import net.minecraftforge.registries.DeferredRegister;");
      _builder.newLine();
      _builder.append("import net.minecraftforge.registries.ForgeRegistries;");
      _builder.newLine();
      _builder.append("import net.minecraftforge.registries.RegistryObject;");
      _builder.newLine();
      _builder.append("import java.util.function.Supplier;");
      _builder.newLine();
      {
        EList<Block> _blocks = mod.getBlocks();
        for(final Block block : _blocks) {
          _builder.append("import ");
          String _basePackage = FolderGenerator.getBasePackage(mod);
          String _plus = (_basePackage + ".block.base.");
          String _className = BlockGenerator.getClassName(block);
          String _plus_1 = (_plus + _className);
          _builder.append(_plus_1);
          _builder.append("; ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("import ");
      String _basePackage_1 = FolderGenerator.getBasePackage(mod);
      String _plus_2 = (_basePackage_1 + ".");
      String _replace = mod.getName().replace(" ", "");
      String _plus_3 = (_plus_2 + _replace);
      _builder.append(_plus_3);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("import ");
      String _basePackage_2 = FolderGenerator.getBasePackage(mod);
      _builder.append(_basePackage_2);
      _builder.append(".item.ItemInitGen;");
      _builder.newLineIfNotEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("public static final DeferredRegister<Block> BLOCKS =");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("DeferredRegister.create(ForgeRegistries.BLOCKS, ");
      String _replace_1 = mod.getName().replace(" ", "");
      _builder_1.append(_replace_1, "            ");
      _builder_1.append(".MOD_ID);");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.newLine();
      {
        EList<Block> _blocks_1 = mod.getBlocks();
        for(final Block block_1 : _blocks_1) {
          _builder_1.append("public static final RegistryObject<Block> ");
          String _upperCase = block_1.getBlockId().toUpperCase();
          _builder_1.append(_upperCase);
          _builder_1.append(" = registerBlock(\"");
          String _blockId = block_1.getBlockId();
          _builder_1.append(_blockId);
          _builder_1.append("\",");
          String _className_1 = BlockGenerator.getClassName(block_1);
          _builder_1.append(_className_1);
          _builder_1.append("::new, CreativeModeTab.");
          String _tabString = BlockGenerator.getTabString(block_1.getCreativeModeTab());
          _builder_1.append(_tabString);
          _builder_1.append(");");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.newLine();
      _builder_1.append("private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("RegistryObject<T> toReturn = BLOCKS.register(name, block);");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("registerBlockItem(name, toReturn, tab);");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("return toReturn;");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("return ItemInitGen.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("public static void register(IEventBus eventBus) {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("BLOCKS.register(eventBus);");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      FileGenerator.generateJavaClass(project, 
        "BlockInit", 
        "block", 
        "", _builder.toString(), _builder_1.toString(), mod, 
        false, 
        true);
    }
  }

  private static void generateBlockClass(final IProject project, final Mod mod) {
    final Consumer<Block> _function = (Block block) -> {
      String _className = BlockGenerator.getClassName(block);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("extends ");
      String _xifexpression = null;
      boolean _isHasGravity = block.isHasGravity();
      if (_isHasGravity) {
        _xifexpression = "FallingBlock";
      } else {
        _xifexpression = "Block";
      }
      _builder.append(_xifexpression);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import net.minecraft.world.level.block.state.BlockBehaviour;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.world.level.material.Material;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.world.level.block.SoundType;");
      _builder_1.newLine();
      {
        final Function1<Translation, Boolean> _function_1 = (Translation t) -> {
          String _description = t.getDescription();
          return Boolean.valueOf((!Objects.equal(_description, "")));
        };
        int _size = IterableExtensions.size(IterableExtensions.<Translation>filter(block.getTranslations(), _function_1));
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          _builder_1.append("import java.util.List;");
          _builder_1.newLine();
          _builder_1.append("import net.minecraft.network.chat.Component;");
          _builder_1.newLine();
          _builder_1.append("import net.minecraft.network.chat.TranslatableComponent;");
          _builder_1.newLine();
          _builder_1.append("import net.minecraft.world.item.ItemStack;");
          _builder_1.newLine();
          _builder_1.append("import net.minecraft.world.item.TooltipFlag;");
          _builder_1.newLine();
        }
      }
      {
        if ((((block.getLuminance() > 0) || (block.getRedstoneSignal() > 0)) || (IterableExtensions.size(IterableExtensions.<Translation>filter(block.getTranslations(), ((Function1<Translation, Boolean>) (Translation t) -> {
          String _description = t.getDescription();
          return Boolean.valueOf((!Objects.equal(_description, "")));
        }))) > 0))) {
          _builder_1.append("import net.minecraft.world.level.BlockGetter;");
          _builder_1.newLine();
        }
      }
      {
        if (((block.getLuminance() > 0) || (block.getRedstoneSignal() > 0))) {
          _builder_1.append("import net.minecraft.core.BlockPos;");
          _builder_1.newLine();
        }
      }
      {
        if (((block.getLuminance() > 0) || (block.getRedstoneSignal() > 0))) {
          _builder_1.append("import net.minecraft.world.level.block.state.BlockState;");
          _builder_1.newLine();
        }
      }
      {
        int _redstoneSignal = block.getRedstoneSignal();
        boolean _greaterThan_1 = (_redstoneSignal > 0);
        if (_greaterThan_1) {
          _builder_1.append("import net.minecraft.core.Direction;");
          _builder_1.newLine();
        }
      }
      _builder_1.append("import net.minecraft.world.level.block.");
      String _xifexpression_1 = null;
      boolean _isHasGravity_1 = block.isHasGravity();
      if (_isHasGravity_1) {
        _xifexpression_1 = "FallingBlock";
      } else {
        _xifexpression_1 = "Block";
      }
      _builder_1.append(_xifexpression_1);
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("public ");
      String _className_1 = BlockGenerator.getClassName(block);
      _builder_2.append(_className_1);
      _builder_2.append("Gen() {");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.append("super(BlockBehaviour.Properties.of(Material.STONE)");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append(".sound(SoundType.");
      String _soundString = BlockGenerator.getSoundString(block.getSoundType());
      _builder_2.append(_soundString, "\t\t\t");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append(".strength(");
      float _harddness = block.getHarddness();
      _builder_2.append(_harddness, "\t\t\t");
      _builder_2.append("f, ");
      float _explosionResistance = block.getExplosionResistance();
      _builder_2.append(_explosionResistance, "\t\t\t");
      _builder_2.append("f)");
      _builder_2.newLineIfNotEmpty();
      {
        int _luminance = block.getLuminance();
        boolean _greaterThan_2 = (_luminance > 0);
        if (_greaterThan_2) {
          _builder_2.append("\t\t\t");
          _builder_2.append(".lightLevel(s -> ");
          int _max = Math.max(block.getLuminance(), 15);
          _builder_2.append(_max, "\t\t\t");
          _builder_2.append(")");
          _builder_2.newLineIfNotEmpty();
        }
      }
      {
        boolean _isRequiresCorrectToolForDrops = block.isRequiresCorrectToolForDrops();
        if (_isRequiresCorrectToolForDrops) {
          _builder_2.append("\t\t\t");
          _builder_2.append(".requiresCorrectToolForDrops()");
          _builder_2.newLine();
        }
      }
      {
        boolean _isCanWalkThrough = block.isCanWalkThrough();
        if (_isCanWalkThrough) {
          _builder_2.append("\t\t\t");
          _builder_2.append(".noCollission()");
          _builder_2.newLine();
        }
      }
      _builder_2.append("\t\t\t");
      _builder_2.append(".friction(");
      float _slipperiness = block.getSlipperiness();
      _builder_2.append(_slipperiness, "\t\t\t");
      _builder_2.append("f)");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append(".speedFactor(");
      float _speedFactor = block.getSpeedFactor();
      _builder_2.append(_speedFactor, "\t\t\t");
      _builder_2.append("f)");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append(".jumpFactor(");
      float _jumpFactor = block.getJumpFactor();
      _builder_2.append(_jumpFactor, "\t\t\t");
      _builder_2.append("f)");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append(".hasPostProcess((bs, br, bp) -> true)");
      _builder_2.newLine();
      {
        int _luminance_1 = block.getLuminance();
        boolean _greaterThan_3 = (_luminance_1 > 0);
        if (_greaterThan_3) {
          _builder_2.append("\t\t\t");
          _builder_2.append(".emissiveRendering((bs, br, bp) -> true)");
          _builder_2.newLine();
        }
      }
      _builder_2.append("\t\t\t");
      _builder_2.append(");");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      {
        final Function1<Translation, Boolean> _function_2 = (Translation t) -> {
          String _description = t.getDescription();
          return Boolean.valueOf((!Objects.equal(_description, "")));
        };
        int _size_1 = IterableExtensions.size(IterableExtensions.<Translation>filter(block.getTranslations(), _function_2));
        boolean _greaterThan_4 = (_size_1 > 0);
        if (_greaterThan_4) {
          _builder_2.newLine();
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> tooltip, TooltipFlag flag) {");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("super.appendHoverText(itemstack, world, tooltip, flag);");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("tooltip.add(new TranslatableComponent(\"tooltip.");
          String _modId = mod.getModId();
          _builder_2.append(_modId, "\t");
          _builder_2.append(".block.");
          String _blockId = block.getBlockId();
          _builder_2.append(_blockId, "\t");
          _builder_2.append("\"));");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      {
        int _luminance_2 = block.getLuminance();
        boolean _greaterThan_5 = (_luminance_2 > 0);
        if (_greaterThan_5) {
          _builder_2.append("\t");
          _builder_2.newLine();
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("return ");
          int _max_1 = Math.max(block.getLuminance(), 15);
          _builder_2.append(_max_1, "\t");
          _builder_2.append(";");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      {
        int _redstoneSignal_1 = block.getRedstoneSignal();
        boolean _greaterThan_6 = (_redstoneSignal_1 > 0);
        if (_greaterThan_6) {
          _builder_2.newLine();
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public boolean isSignalSource(BlockState state) {");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("return true;");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
          _builder_2.newLine();
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("return ");
          int _max_2 = Math.max(block.getRedstoneSignal(), 15);
          _builder_2.append(_max_2, "\t");
          _builder_2.append(";");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("}");
          _builder_2.newLine();
          _builder_2.newLine();
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("return true;");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      FileGenerator.generateJavaClass(project, _className, 
        "block.base", _builder.toString(), _builder_1.toString(), _builder_2.toString(), mod);
    };
    mod.getBlocks().forEach(_function);
  }

  private static void generateBlockJson(final IProject project, final Mod mod) {
    final Consumer<Block> _function = (Block block) -> {
      String _texturePath = block.getTexturePath();
      String _baseFolder = FolderGenerator.getBaseFolder(mod);
      String _plus = (_baseFolder + "/src/main/resources/assets/");
      String _modId = mod.getModId();
      String _plus_1 = (_plus + _modId);
      String _plus_2 = (_plus_1 + "/textures/block");
      FileGenerator.copy(_texturePath, _plus_2);
      String _blockId = block.getBlockId();
      String _plus_3 = (_blockId + ".json");
      String _baseFolder_1 = FolderGenerator.getBaseFolder(mod);
      String _plus_4 = (_baseFolder_1 + "/src/main/resources/assets/");
      String _modId_1 = mod.getModId();
      String _plus_5 = (_plus_4 + _modId_1);
      String _plus_6 = (_plus_5 + "/blockstates");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"variants\": {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"\": { \"model\": \"");
      String _modId_2 = mod.getModId();
      _builder.append(_modId_2, "    ");
      _builder.append(":block/");
      String _blockId_1 = block.getBlockId();
      _builder.append(_blockId_1, "    ");
      _builder.append("\" }");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      FileGenerator.generateFile(project, _plus_3, _plus_6, _builder, 
        true);
      String _blockId_2 = block.getBlockId();
      String _plus_7 = (_blockId_2 + ".json");
      String _baseFolder_2 = FolderGenerator.getBaseFolder(mod);
      String _plus_8 = (_baseFolder_2 + "/src/main/resources/assets/");
      String _modId_3 = mod.getModId();
      String _plus_9 = (_plus_8 + _modId_3);
      String _plus_10 = (_plus_9 + "/models/block");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("{");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("\"parent\": \"block/cube_all\",");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("\"textures\": {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"all\": \"");
      String _modId_4 = mod.getModId();
      _builder_1.append(_modId_4, "    ");
      _builder_1.append(":block/");
      String _replace = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(block.getTexturePath().split("/")))).replace(".png", "");
      _builder_1.append(_replace, "    ");
      _builder_1.append("\"");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      FileGenerator.generateFile(project, _plus_7, _plus_10, _builder_1, 
        true);
      String _blockId_3 = block.getBlockId();
      String _plus_11 = (_blockId_3 + ".json");
      String _baseFolder_3 = FolderGenerator.getBaseFolder(mod);
      String _plus_12 = (_baseFolder_3 + "/src/main/resources/data/");
      String _modId_5 = mod.getModId();
      String _plus_13 = (_plus_12 + _modId_5);
      String _plus_14 = (_plus_13 + "/loot_tables/blocks");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("{");
      _builder_2.newLine();
      _builder_2.append("  ");
      _builder_2.append("\"type\": \"minecraft:block\",");
      _builder_2.newLine();
      _builder_2.append("  ");
      _builder_2.append("\"pools\": [");
      _builder_2.newLine();
      _builder_2.append("    ");
      _builder_2.append("{");
      _builder_2.newLine();
      _builder_2.append("      ");
      _builder_2.append("\"rolls\": 1.0,");
      _builder_2.newLine();
      _builder_2.append("      ");
      _builder_2.append("\"bonus_rolls\": 0.0,");
      _builder_2.newLine();
      _builder_2.append("      ");
      _builder_2.append("\"entries\": [");
      _builder_2.newLine();
      _builder_2.append("        ");
      _builder_2.append("{");
      _builder_2.newLine();
      _builder_2.append("          ");
      _builder_2.append("\"type\": \"minecraft:item\",");
      _builder_2.newLine();
      _builder_2.append("          ");
      _builder_2.append("\"name\": \"");
      String _modId_6 = mod.getModId();
      _builder_2.append(_modId_6, "          ");
      _builder_2.append(":");
      String _blockId_4 = block.getBlockId();
      _builder_2.append(_blockId_4, "          ");
      _builder_2.append("\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("        ");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("      ");
      _builder_2.append("],");
      _builder_2.newLine();
      _builder_2.append("      ");
      _builder_2.append("\"conditions\": [");
      _builder_2.newLine();
      _builder_2.append("        ");
      _builder_2.append("{");
      _builder_2.newLine();
      _builder_2.append("          ");
      _builder_2.append("\"condition\": \"minecraft:survives_explosion\"");
      _builder_2.newLine();
      _builder_2.append("        ");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("      ");
      _builder_2.append("]");
      _builder_2.newLine();
      _builder_2.append("    ");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("  ");
      _builder_2.append("]");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      FileGenerator.generateFile(project, _plus_11, _plus_14, _builder_2, 
        true);
      String _blockId_5 = block.getBlockId();
      String _plus_15 = (_blockId_5 + ".json");
      String _baseFolder_4 = FolderGenerator.getBaseFolder(mod);
      String _plus_16 = (_baseFolder_4 + "/src/main/resources/assets/");
      String _modId_7 = mod.getModId();
      String _plus_17 = (_plus_16 + _modId_7);
      String _plus_18 = (_plus_17 + "/models/item");
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("{");
      _builder_3.newLine();
      _builder_3.append("  ");
      _builder_3.append("\"parent\": \"");
      String _modId_8 = mod.getModId();
      _builder_3.append(_modId_8, "  ");
      _builder_3.append(":block/");
      String _blockId_6 = block.getBlockId();
      _builder_3.append(_blockId_6, "  ");
      _builder_3.append("\"");
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("}");
      _builder_3.newLine();
      FileGenerator.generateFile(project, _plus_15, _plus_18, _builder_3, 
        true);
    };
    mod.getBlocks().forEach(_function);
  }

  private static void generateMinable(final IProject project, final Mod mod) {
    BlockMiningLevel[] _values = BlockMiningLevel.values();
    for (final BlockMiningLevel miningLevel : _values) {
      boolean _notEquals = (!Objects.equal(miningLevel, BlockMiningLevel.NONE));
      if (_notEquals) {
        final Function1<Block, Boolean> _function = (Block b) -> {
          BlockMiningLevel _miningLevel = b.getMiningLevel();
          return Boolean.valueOf(Objects.equal(_miningLevel, miningLevel));
        };
        Iterable<Block> filteredBlocks = IterableExtensions.<Block>filter(mod.getBlocks(), _function);
        int _size = IterableExtensions.size(filteredBlocks);
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          String _miningTagString = BlockGenerator.getMiningTagString(miningLevel);
          String _plus = (_miningTagString + ".json");
          String _baseFolder = FolderGenerator.getBaseFolder(mod);
          String _plus_1 = (_baseFolder + "/src/main/resources/data/minecraft/tags/blocks");
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\"replace\": false,");
          _builder.newLine();
          _builder.append("  \t");
          _builder.append("\"values\": [");
          _builder.newLine();
          {
            boolean _hasElements = false;
            for(final Block block : filteredBlocks) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(",", "  \t");
              }
              _builder.append("  \t");
              _builder.append("\"");
              String _modId = mod.getModId();
              _builder.append(_modId, "  \t");
              _builder.append(":");
              String _blockId = block.getBlockId();
              _builder.append(_blockId, "  \t");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("]");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          FileGenerator.generateFile(project, _plus, _plus_1, _builder, 
            true);
        }
      }
    }
    MiningToolType[] _values_1 = MiningToolType.values();
    for (final MiningToolType miningTool : _values_1) {
      {
        final Function1<Block, Boolean> _function_1 = (Block b) -> {
          MiningToolType _miningTool = b.getMiningTool();
          return Boolean.valueOf(Objects.equal(_miningTool, miningTool));
        };
        Iterable<Block> filteredBlocks_1 = IterableExtensions.<Block>filter(mod.getBlocks(), _function_1);
        int _size_1 = IterableExtensions.size(filteredBlocks_1);
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          String _toolTagString = BlockGenerator.getToolTagString(miningTool);
          String _plus_2 = (_toolTagString + ".json");
          String _baseFolder_1 = FolderGenerator.getBaseFolder(mod);
          String _plus_3 = (_baseFolder_1 + "/src/main/resources/data/minecraft/tags/blocks/mineable");
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("\"replace\": false,");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("\"values\": [");
          _builder_1.newLine();
          {
            boolean _hasElements_1 = false;
            for(final Block block_1 : filteredBlocks_1) {
              if (!_hasElements_1) {
                _hasElements_1 = true;
              } else {
                _builder_1.appendImmediate(",", "\t\t");
              }
              _builder_1.append("\t\t");
              _builder_1.append("\"");
              String _modId_1 = mod.getModId();
              _builder_1.append(_modId_1, "\t\t");
              _builder_1.append(":");
              String _blockId_1 = block_1.getBlockId();
              _builder_1.append(_blockId_1, "\t\t");
              _builder_1.append("\"");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append("\t");
          _builder_1.append("]");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
          FileGenerator.generateFile(project, _plus_2, _plus_3, _builder_1, 
            true);
        }
      }
    }
  }

  private static String getMiningTagString(final BlockMiningLevel level) {
    String _switchResult = null;
    if (level != null) {
      switch (level) {
        case NONE:
          _switchResult = "none";
          break;
        case STONE:
          _switchResult = "needs_stone_tool";
          break;
        case IRON:
          _switchResult = "needs_iron_tool";
          break;
        case DIAMOND:
          _switchResult = "needs_diamond_tool";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }

  private static String getToolTagString(final MiningToolType miningTool) {
    String _switchResult = null;
    if (miningTool != null) {
      switch (miningTool) {
        case AXE:
          _switchResult = "axe";
          break;
        case HOE:
          _switchResult = "hoe";
          break;
        case SHOVEL:
          _switchResult = "shovel";
          break;
        case PICKAXE:
          _switchResult = "pickaxe";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }

  private static String getSoundString(final SoundType soundType) {
    String _switchResult = null;
    if (soundType != null) {
      switch (soundType) {
        case WOOD:
          _switchResult = "WOOD";
          break;
        case GRAVEL:
          _switchResult = "GRAVEL";
          break;
        case GRASS:
          _switchResult = "GRASS";
          break;
        case LILY_PAD:
          _switchResult = "LILY_PAD";
          break;
        case STONE:
          _switchResult = "STONE";
          break;
        case METAL:
          _switchResult = "METAL";
          break;
        case GLASS:
          _switchResult = "GLASS";
          break;
        case WOOL:
          _switchResult = "WOOL";
          break;
        case SAND:
          _switchResult = "SAND";
          break;
        case SNOW:
          _switchResult = "SNOW";
          break;
        case LADDER:
          _switchResult = "LADDER";
          break;
        case SLIME_BLOCK:
          _switchResult = "SLIME_BLOCK";
          break;
        case WET_GRASS:
          _switchResult = "WET_GRASS";
          break;
        case CROP:
          _switchResult = "CROP";
          break;
        case LANTERN:
          _switchResult = "LANTERN";
          break;
        case SOUL_SAND:
          _switchResult = "SOUL_SAND";
          break;
        case NETHERRACK:
          _switchResult = "NETHERRACK";
          break;
        case NETHER_ORE:
          _switchResult = "NETHER_ORE";
          break;
        case AMETHYST:
          _switchResult = "AMETHYST";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }

  private static String getTabString(final CreativeModeTab creativeModeTab) {
    String _switchResult = null;
    if (creativeModeTab != null) {
      switch (creativeModeTab) {
        case BUILDING_BLOCKS:
          _switchResult = "TAB_BUILDING_BLOCKS";
          break;
        case DECORATIONS:
          _switchResult = "TAB_DECORATIONS";
          break;
        case REDSTONE:
          _switchResult = "TAB_REDSTONE";
          break;
        case TRANSPORTATION:
          _switchResult = "TAB_TRANSPORTATION";
          break;
        case MISC:
          _switchResult = "TAB_MISC";
          break;
        case FOOD:
          _switchResult = "TAB_FOOD";
          break;
        case TOOLS:
          _switchResult = "TAB_TOOLS";
          break;
        case COMBAT:
          _switchResult = "TAB_COMBAT";
          break;
        case BREWING:
          _switchResult = "TAB_BREWING";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
