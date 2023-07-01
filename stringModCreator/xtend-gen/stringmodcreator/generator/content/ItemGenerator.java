package stringmodcreator.generator.content;

import com.google.common.base.Objects;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import stringmodcreator.data.CreativeModeTab;
import stringmodcreator.data.Effect;
import stringmodcreator.data.FoodItem;
import stringmodcreator.data.Item;
import stringmodcreator.data.Mod;
import stringmodcreator.data.OnTickEffect;
import stringmodcreator.data.Rarity;
import stringmodcreator.data.SelfOtherEffect;
import stringmodcreator.data.ToolProperty;
import stringmodcreator.data.Translation;
import stringmodcreator.data.UsableItem;
import stringmodcreator.generator.FileGenerator;
import stringmodcreator.generator.FolderGenerator;

@SuppressWarnings("all")
public class ItemGenerator {
  public static void run(final Mod mod) {
    ItemGenerator.generateLang(mod);
    ItemGenerator.generateItemInit(mod);
    ItemGenerator.generateItemClass(mod);
    ItemGenerator.generateModels(mod);
  }

  public static String getClassName(final Item item) {
    final Function2<String, String, String> _function = (String s1, String s2) -> {
      String _firstUpper = StringExtensions.toFirstUpper(s1);
      String _firstUpper_1 = StringExtensions.toFirstUpper(s2);
      return (_firstUpper + _firstUpper_1);
    };
    return IterableExtensions.<String>reduce(((Iterable<? extends String>)Conversions.doWrapArray(item.getItemId().replace("-", " ").replace("_", " ").split(" "))), _function);
  }

  public static String getPackageExtension(final Item item) {
    ToolProperty _toolProperty = item.getToolProperty();
    boolean _tripleNotEquals = (_toolProperty != null);
    if (_tripleNotEquals) {
      return "item.tool";
    } else {
      if ((item instanceof FoodItem)) {
        return "item.food";
      } else {
        return "item.base";
      }
    }
  }

  private static void generateLang(final Mod mod) {
    final Function1<Item, List<Translation>> _function = (Item i) -> {
      return i.getTranslations();
    };
    final Function1<Translation, String> _function_1 = (Translation t) -> {
      return t.getLang();
    };
    final Consumer<String> _function_2 = (String lang) -> {
      final Function1<Item, Boolean> _function_3 = (Item i) -> {
        final Function1<Translation, String> _function_4 = (Translation t) -> {
          return t.getLang();
        };
        final Function1<String, Boolean> _function_5 = (String s) -> {
          return Boolean.valueOf(Objects.equal(s, lang));
        };
        int _size = IterableExtensions.size(IterableExtensions.<String>filter(ListExtensions.<Translation, String>map(i.getTranslations(), _function_4), _function_5));
        return Boolean.valueOf((_size > 0));
      };
      Iterable<Item> filteredItems = IterableExtensions.<Item>filter(mod.getItems(), _function_3);
      String _baseFolder = FolderGenerator.getBaseFolder(mod);
      String _plus = (_baseFolder + "/src/resources/assets/");
      String _modId = mod.getModId();
      String _plus_1 = (_plus + _modId);
      String _plus_2 = (_plus_1 + "/lang");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      {
        boolean _hasElements = false;
        for(final Item item : filteredItems) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate("\n", "\t");
          }
          _builder.append("\t");
          _builder.append("\"item.");
          String _modId_1 = mod.getModId();
          _builder.append(_modId_1, "\t");
          _builder.append(".");
          String _itemId = item.getItemId();
          _builder.append(_itemId, "\t");
          _builder.append("\": \"");
          final Function1<Translation, Boolean> _function_4 = (Translation t) -> {
            String _lang = t.getLang();
            return Boolean.valueOf(Objects.equal(_lang, lang));
          };
          String _name = (((Translation[])Conversions.unwrapArray(IterableExtensions.<Translation>filter(item.getTranslations(), _function_4), Translation.class))[0]).getName();
          _builder.append(_name, "\t");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\"tooltip.");
          String _modId_2 = mod.getModId();
          _builder.append(_modId_2, "\t");
          _builder.append(".item.");
          String _itemId_1 = item.getItemId();
          _builder.append(_itemId_1, "\t");
          _builder.append("\": \"");
          final Function1<Translation, Boolean> _function_5 = (Translation t) -> {
            String _lang = t.getLang();
            return Boolean.valueOf(Objects.equal(_lang, lang));
          };
          String _description = (((Translation[])Conversions.unwrapArray(IterableExtensions.<Translation>filter(item.getTranslations(), _function_5), Translation.class))[0]).getDescription();
          _builder.append(_description, "\t");
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      FileGenerator.generateFile(
        (lang + ".json"), _plus_2, _builder.toString(), 
        true);
    };
    IterableExtensions.<String>toSet(ListExtensions.<Translation, String>map(IterableExtensions.<Translation>toList(IterableExtensions.<Item, Translation>flatMap(mod.getItems(), _function)), _function_1)).forEach(_function_2);
  }

  private static void generateItemInit(final Mod mod) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    String _basePackage = FolderGenerator.getBasePackage(mod);
    String _plus = (_basePackage + ".");
    String _replace = mod.getName().replace(" ", "");
    String _plus_1 = (_plus + _replace);
    _builder.append(_plus_1);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    {
      List<Item> _items = mod.getItems();
      for(final Item item : _items) {
        _builder.append("import ");
        String _basePackage_1 = FolderGenerator.getBasePackage(mod);
        String _plus_2 = (_basePackage_1 + ".");
        String _packageExtension = ItemGenerator.getPackageExtension(item);
        String _plus_3 = (_plus_2 + _packageExtension);
        String _plus_4 = (_plus_3 + ".");
        String _className = ItemGenerator.getClassName(item);
        String _plus_5 = (_plus_4 + _className);
        _builder.append(_plus_5);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import net.minecraft.world.item.Item;");
    _builder.newLine();
    _builder.append("import net.minecraftforge.eventbus.api.IEventBus;");
    _builder.newLine();
    _builder.append("import net.minecraftforge.registries.DeferredRegister;");
    _builder.newLine();
    _builder.append("import net.minecraftforge.registries.ForgeRegistries;");
    _builder.newLine();
    _builder.append("import net.minecraftforge.registries.RegistryObject;");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ");
    String _replace_1 = mod.getName().replace(" ", "");
    _builder_1.append(_replace_1);
    _builder_1.append(".MOD_ID);");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    {
      List<Item> _items_1 = mod.getItems();
      for(final Item item_1 : _items_1) {
        _builder_1.append("public static final RegistryObject<Item> ");
        String _upperCase = item_1.getItemId().toUpperCase();
        _builder_1.append(_upperCase);
        _builder_1.append(" = ITEMS.register(\"");
        String _itemId = item_1.getItemId();
        _builder_1.append(_itemId);
        _builder_1.append("\", ");
        String _className_1 = ItemGenerator.getClassName(item_1);
        _builder_1.append(_className_1);
        _builder_1.append("::new);");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.newLine();
    _builder_1.append("public static void register(IEventBus eventBus){");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("ITEMS.register(eventBus);");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    FileGenerator.generateJavaClass(
      "ItemInit", 
      "item", 
      "", _builder.toString(), _builder_1.toString(), mod, 
      false, 
      true);
  }

  private static void generateItemClass(final Mod mod) {
    final Consumer<Item> _function = (Item item) -> {
      String _className = ItemGenerator.getClassName(item);
      String _packageExtension = ItemGenerator.getPackageExtension(item);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import net.minecraft.world.item.CreativeModeTab;");
      _builder.newLine();
      _builder.append("import net.minecraft.world.item.Item;");
      _builder.newLine();
      _builder.append("import net.minecraft.world.item.Rarity;");
      _builder.newLine();
      {
        if ((item instanceof FoodItem)) {
          _builder.append("import net.minecraft.world.food.FoodProperties;");
          _builder.newLine();
        }
      }
      {
        if (((item instanceof UsableItem) && (((UsableItem) item).getOnUse().size() > 0))) {
          _builder.append("import net.minecraft.world.InteractionResultHolder;");
          _builder.newLine();
          _builder.append("import net.minecraft.world.InteractionHand;");
          _builder.newLine();
          _builder.append("import net.minecraft.world.entity.player.Player;");
          _builder.newLine();
        }
      }
      {
        if ((((item.getOnTick().size() > 0) || (item.getOnAttack().size() > 0)) || ((item instanceof FoodItem) && (((FoodItem) item).getAfterEating().size() > 0)))) {
          _builder.append("import net.minecraft.world.entity.LivingEntity;");
          _builder.newLine();
        }
      }
      {
        int _size = item.getOnTick().size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          _builder.append("import net.minecraft.world.entity.Entity;");
          _builder.newLine();
        }
      }
      {
        if (((((item.getOnTick().size() > 0) || (item.getOnAttack().size() > 0)) || ((item instanceof UsableItem) && (((UsableItem) item).getOnUse().size() > 0))) || ((item instanceof FoodItem) && (((FoodItem) item).getAfterEating().size() > 0)))) {
          _builder.append("import net.minecraft.world.effect.MobEffectInstance;");
          _builder.newLine();
          _builder.append("import net.minecraft.world.effect.MobEffects;");
          _builder.newLine();
          _builder.append("import net.minecraft.world.level.Level;");
          _builder.newLine();
          _builder.append("import net.minecraft.world.item.ItemStack;");
          _builder.newLine();
        }
      }
      {
        boolean _isGlows = item.isGlows();
        if (_isGlows) {
          _builder.append("import net.minecraftforge.api.distmarker.OnlyIn;");
          _builder.newLine();
          _builder.append("import net.minecraftforge.api.distmarker.Dist;");
          _builder.newLine();
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("public Item1Gen() {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("super(new Item.Properties()");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append(".tab(CreativeModeTab.");
      String _tabString = ItemGenerator.getTabString(item.getCreativeModeTab());
      _builder_1.append(_tabString, "\t\t");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      {
        boolean _isImmuneToFire = item.isImmuneToFire();
        if (_isImmuneToFire) {
          _builder_1.append("\t\t");
          _builder_1.append(".fireResistant()");
          _builder_1.newLine();
        }
      }
      {
        if ((item instanceof FoodItem)) {
          _builder_1.append("\t\t");
          _builder_1.append(".food((new FoodProperties.Builder())");
          _builder_1.newLine();
          _builder_1.append("\t\t");
          _builder_1.append("\t");
          _builder_1.append(".nutrition(");
          int _nutrition = ((FoodItem) item).getNutrition();
          _builder_1.append(_nutrition, "\t\t\t");
          _builder_1.append(")");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t");
          _builder_1.append("\t");
          _builder_1.append(".saturationMod(");
          float _saturation = ((FoodItem) item).getSaturation();
          _builder_1.append(_saturation, "\t\t\t");
          _builder_1.append("f)");
          _builder_1.newLineIfNotEmpty();
          {
            boolean _isAlwaysEdible = ((FoodItem) item).isAlwaysEdible();
            if (_isAlwaysEdible) {
              _builder_1.append("\t\t");
              _builder_1.append("\t");
              _builder_1.append(".alwaysEat()");
              _builder_1.newLine();
            }
          }
          {
            boolean _isMeat = ((FoodItem) item).isMeat();
            if (_isMeat) {
              _builder_1.append("\t\t");
              _builder_1.append("\t");
              _builder_1.append(".meat()");
              _builder_1.newLine();
            }
          }
          _builder_1.append("\t\t");
          _builder_1.append("\t");
          _builder_1.append(".build())");
          _builder_1.newLine();
        }
      }
      _builder_1.append("\t\t");
      _builder_1.append(".stacksTo(");
      int _maxStackSize = item.getMaxStackSize();
      _builder_1.append(_maxStackSize, "\t\t");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append(".rarity(");
      String _rarityString = ItemGenerator.getRarityString(item.getRarity());
      _builder_1.append(_rarityString, "\t\t");
      _builder_1.append("));");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      {
        if (((item instanceof UsableItem) && (((UsableItem) item).getOnUse().size() > 0))) {
          _builder_1.append("@Override");
          _builder_1.newLine();
          _builder_1.append("public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {");
          _builder_1.newLine();
          {
            List<Effect> _onUse = ((UsableItem) item).getOnUse();
            boolean _hasElements = false;
            for(final Effect onUse : _onUse) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder_1.appendImmediate("\n", "\t");
              }
              _builder_1.append("\t");
              String _effectInstaceString = EffectHelper.getEffectInstaceString(onUse, "player");
              _builder_1.append(_effectInstaceString, "\t");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append("\t");
          _builder_1.append("return super.use(world, player, hand);");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
        }
      }
      _builder_1.newLine();
      {
        int _size_1 = item.getOnTick().size();
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          _builder_1.append("@Override");
          _builder_1.newLine();
          _builder_1.append("public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("super.inventoryTick(itemstack, world, entity, slot, selected);");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("if(entity instanceof LivingEntity livingEntity) {");
          _builder_1.newLine();
          {
            final Function1<OnTickEffect, Boolean> _function_1 = (OnTickEffect e) -> {
              return Boolean.valueOf(e.isNeedsSelected());
            };
            int _size_2 = IterableExtensions.size(IterableExtensions.<OnTickEffect>filter(item.getOnTick(), _function_1));
            boolean _greaterThan_2 = (_size_2 > 0);
            if (_greaterThan_2) {
              _builder_1.append("\t\t");
              _builder_1.append("if (selected) {");
              _builder_1.newLine();
              {
                final Function1<OnTickEffect, Boolean> _function_2 = (OnTickEffect e) -> {
                  return Boolean.valueOf(e.isNeedsSelected());
                };
                Iterable<OnTickEffect> _filter = IterableExtensions.<OnTickEffect>filter(item.getOnTick(), _function_2);
                boolean _hasElements_1 = false;
                for(final OnTickEffect onTick : _filter) {
                  if (!_hasElements_1) {
                    _hasElements_1 = true;
                  } else {
                    _builder_1.appendImmediate("\n", "\t\t\t");
                  }
                  _builder_1.append("\t\t");
                  _builder_1.append("\t");
                  String _effectInstaceString_1 = EffectHelper.getEffectInstaceString(onTick, "livingEntity");
                  _builder_1.append(_effectInstaceString_1, "\t\t\t");
                  _builder_1.newLineIfNotEmpty();
                }
              }
              _builder_1.append("\t\t");
              _builder_1.append("}");
              _builder_1.newLine();
            }
          }
          {
            final Function1<OnTickEffect, Boolean> _function_3 = (OnTickEffect e) -> {
              boolean _isNeedsSelected = e.isNeedsSelected();
              return Boolean.valueOf((!_isNeedsSelected));
            };
            Iterable<OnTickEffect> _filter_1 = IterableExtensions.<OnTickEffect>filter(item.getOnTick(), _function_3);
            boolean _hasElements_2 = false;
            for(final OnTickEffect onTick_1 : _filter_1) {
              if (!_hasElements_2) {
                _hasElements_2 = true;
              } else {
                _builder_1.appendImmediate("\n", "\t\t");
              }
              _builder_1.append("\t\t");
              String _effectInstaceString_2 = EffectHelper.getEffectInstaceString(onTick_1, "livingEntity");
              _builder_1.append(_effectInstaceString_2, "\t\t");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append("\t");
          _builder_1.append("}");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
        }
      }
      _builder_1.newLine();
      {
        int _size_3 = item.getOnAttack().size();
        boolean _greaterThan_3 = (_size_3 > 0);
        if (_greaterThan_3) {
          _builder_1.append("@Override");
          _builder_1.newLine();
          _builder_1.append("public boolean hurtEnemy(ItemStack itemstack, LivingEntity target, LivingEntity source) {");
          _builder_1.newLine();
          {
            List<SelfOtherEffect> _onAttack = item.getOnAttack();
            boolean _hasElements_3 = false;
            for(final SelfOtherEffect onAttack : _onAttack) {
              if (!_hasElements_3) {
                _hasElements_3 = true;
              } else {
                _builder_1.appendImmediate("\n", "\t");
              }
              _builder_1.append("\t");
              String _xifexpression = null;
              boolean _isSelf = onAttack.isSelf();
              if (_isSelf) {
                _xifexpression = "source";
              } else {
                _xifexpression = "target";
              }
              String _effectInstaceString_3 = EffectHelper.getEffectInstaceString(onAttack, _xifexpression);
              _builder_1.append(_effectInstaceString_3, "\t");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append("\t");
          _builder_1.append("return super.hurtEnemy(itemstack, target, source);");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
        }
      }
      _builder_1.newLine();
      {
        if (((item instanceof FoodItem) && (((FoodItem) item).getAfterEating().size() > 0))) {
          _builder_1.append("@Override");
          _builder_1.newLine();
          _builder_1.append("public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity livingEntity) {");
          _builder_1.newLine();
          {
            List<Effect> _afterEating = ((FoodItem) item).getAfterEating();
            boolean _hasElements_4 = false;
            for(final Effect afterEating : _afterEating) {
              if (!_hasElements_4) {
                _hasElements_4 = true;
              } else {
                _builder_1.appendImmediate("\n", "\t");
              }
              _builder_1.append("\t");
              String _effectInstaceString_4 = EffectHelper.getEffectInstaceString(afterEating, "livingEntity");
              _builder_1.append(_effectInstaceString_4, "\t");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append("\t");
          _builder_1.append("return super.finishUsingItem(itemstack, world, livingEntity);");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
        }
      }
      _builder_1.newLine();
      {
        boolean _isGlows_1 = item.isGlows();
        if (_isGlows_1) {
          _builder_1.append("@Override");
          _builder_1.newLine();
          _builder_1.append("@OnlyIn(Dist.CLIENT)");
          _builder_1.newLine();
          _builder_1.append("public boolean isFoil(ItemStack itemStack){");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("return true;");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
        }
      }
      FileGenerator.generateJavaClass(_className, _packageExtension, 
        "extends Item", _builder.toString(), _builder_1.toString(), mod);
    };
    mod.getItems().forEach(_function);
  }

  private static void generateModels(final Mod mod) {
    final Consumer<Item> _function = (Item item) -> {
      String _iconPath = item.getIconPath();
      String _plus = ("Coping \"" + _iconPath);
      String _plus_1 = (_plus + "\" to \"");
      String _baseFolder = FolderGenerator.getBaseFolder(mod);
      String _plus_2 = (_plus_1 + _baseFolder);
      String _plus_3 = (_plus_2 + "/src/resources/assets/");
      String _modId = mod.getModId();
      String _plus_4 = (_plus_3 + _modId);
      String _plus_5 = (_plus_4 + "/textures/item\"");
      InputOutput.<String>println(_plus_5);
      String _itemId = item.getItemId();
      String _plus_6 = (_itemId + ".json");
      String _baseFolder_1 = FolderGenerator.getBaseFolder(mod);
      String _plus_7 = (_baseFolder_1 + "/src/resources/assets/");
      String _modId_1 = mod.getModId();
      String _plus_8 = (_plus_7 + _modId_1);
      String _plus_9 = (_plus_8 + "/models/item");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"parent\": \"item/generated\",");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"textures\": {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("\"layer0\": \"");
      String _modId_2 = mod.getModId();
      _builder.append(_modId_2, "\t\t");
      _builder.append(":item/");
      String _replace = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(item.getIconPath().split("/")))).replace(".png", "");
      _builder.append(_replace, "\t\t");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      FileGenerator.generateFile(_plus_6, _plus_9, _builder.toString(), 
        true);
    };
    mod.getItems().forEach(_function);
  }

  private static String getRarityString(final Rarity rarity) {
    String _switchResult = null;
    if (rarity != null) {
      switch (rarity) {
        case COMMON:
          _switchResult = "COMMON";
          break;
        case UNCOMMON:
          _switchResult = "UNCOMMON";
          break;
        case RARE:
          _switchResult = "RARE";
          break;
        case EPIC:
          _switchResult = "EPIC";
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
