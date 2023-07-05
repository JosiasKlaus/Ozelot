package ozelot.generator.content;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.function.Consumer;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import ozelot.CreativeModeTab;
import ozelot.Effect;
import ozelot.FoodItem;
import ozelot.Item;
import ozelot.MiningLevel;
import ozelot.Mod;
import ozelot.OnTickEffect;
import ozelot.Rarity;
import ozelot.SelfOtherEffect;
import ozelot.ToolItem;
import ozelot.ToolType;
import ozelot.Translation;
import ozelot.generator.FileGenerator;
import ozelot.generator.FolderGenerator;

@SuppressWarnings("all")
public class ItemGenerator {
  public static void run(final IProject project, final Mod mod) {
    ItemGenerator.generateLang(project, mod);
    ItemGenerator.generateItemInit(project, mod);
    ItemGenerator.generateItemClass(project, mod);
    ItemGenerator.generateModels(project, mod);
    ItemGenerator.generateTiers(project, mod);
  }

  public static String getClassName(final Item item) {
    final Function2<String, String, String> _function = (String s1, String s2) -> {
      String _firstUpper = StringExtensions.toFirstUpper(s2);
      return (s1 + _firstUpper);
    };
    return StringExtensions.toFirstUpper(IterableExtensions.<String>reduce(((Iterable<? extends String>)Conversions.doWrapArray(item.getItemId().replace("-", " ").replace("_", " ").split(" "))), _function));
  }

  public static String getPackageExtension(final Item item) {
    if ((item instanceof ToolItem)) {
      return "item.tool";
    } else {
      if ((item instanceof FoodItem)) {
        return "item.food";
      } else {
        return "item.base";
      }
    }
  }

  private static void generateLang(final IProject project, final Mod mod) {
    final Function1<Item, EList<Translation>> _function = (Item i) -> {
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
      String _plus = (_baseFolder + "/src/main/resources/assets/");
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
      FileGenerator.generateFile(project, 
        (lang + ".json"), _plus_2, _builder, 
        true);
    };
    IterableExtensions.<String>toSet(ListExtensions.<Translation, String>map(IterableExtensions.<Translation>toList(IterableExtensions.<Item, Translation>flatMap(mod.getItems(), _function)), _function_1)).forEach(_function_2);
  }

  private static void generateItemInit(final IProject project, final Mod mod) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    String _basePackage = FolderGenerator.getBasePackage(mod);
    String _plus = (_basePackage + ".");
    String _replace = mod.getName().replace(" ", "");
    String _plus_1 = (_plus + _replace);
    _builder.append(_plus_1);
    _builder.append("; ");
    _builder.newLineIfNotEmpty();
    {
      EList<Item> _items = mod.getItems();
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
        _builder.append("; ");
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
      EList<Item> _items_1 = mod.getItems();
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
    FileGenerator.generateJavaClass(project, 
      "ItemInit", 
      "item", 
      "", _builder.toString(), _builder_1.toString(), mod, 
      false, 
      true);
  }

  private static void generateItemClass(final IProject project, final Mod mod) {
    final Consumer<Item> _function = (Item item) -> {
      String _className = ItemGenerator.getClassName(item);
      String _packageExtension = ItemGenerator.getPackageExtension(item);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("extends ");
      String _baseClassString = ItemGenerator.getBaseClassString(item);
      _builder.append(_baseClassString);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import net.minecraft.world.item.CreativeModeTab;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.world.item.Item;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.world.item.Rarity;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.world.item.TooltipFlag;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraftforge.api.distmarker.OnlyIn;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraftforge.api.distmarker.Dist;");
      _builder_1.newLine();
      _builder_1.append("import java.util.List;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.network.chat.Component;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.network.chat.TranslatableComponent;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.world.level.Level;");
      _builder_1.newLine();
      _builder_1.append("import net.minecraft.world.item.ItemStack;");
      _builder_1.newLine();
      {
        if ((item instanceof ToolItem)) {
          _builder_1.append("import ");
          String _basePackage = FolderGenerator.getBasePackage(mod);
          _builder_1.append(_basePackage);
          _builder_1.append(".item.tool.TiersGen;");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("import net.minecraft.world.item.");
          String _baseClassString_1 = ItemGenerator.getBaseClassString(item);
          _builder_1.append(_baseClassString_1);
          _builder_1.append(";");
          _builder_1.newLineIfNotEmpty();
        }
      }
      {
        if ((item instanceof FoodItem)) {
          _builder_1.append("import net.minecraft.world.food.FoodProperties;");
          _builder_1.newLine();
        }
      }
      {
        int _size = item.getOnUse().size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          _builder_1.append("import net.minecraft.world.InteractionResultHolder;");
          _builder_1.newLine();
          _builder_1.append("import net.minecraft.world.InteractionHand;");
          _builder_1.newLine();
          _builder_1.append("import net.minecraft.world.entity.player.Player;");
          _builder_1.newLine();
        }
      }
      {
        if ((((item.getOnTick().size() > 0) || (item.getOnAttack().size() > 0)) || ((item instanceof FoodItem) && (((FoodItem) item).getAfterEating().size() > 0)))) {
          _builder_1.append("import net.minecraft.world.entity.LivingEntity;");
          _builder_1.newLine();
        }
      }
      {
        int _size_1 = item.getOnTick().size();
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          _builder_1.append("import net.minecraft.world.entity.Entity;");
          _builder_1.newLine();
        }
      }
      {
        if (((((item.getOnTick().size() > 0) || (item.getOnAttack().size() > 0)) || (item.getOnUse().size() > 0)) || ((item instanceof FoodItem) && (((FoodItem) item).getAfterEating().size() > 0)))) {
          _builder_1.append("import net.minecraft.world.effect.MobEffectInstance;");
          _builder_1.newLine();
          _builder_1.append("import net.minecraft.world.effect.MobEffects;");
          _builder_1.newLine();
        }
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("public ");
      String _className_1 = ItemGenerator.getClassName(item);
      _builder_2.append(_className_1);
      _builder_2.append("Gen() {");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.append("super(");
      _builder_2.newLine();
      {
        if ((item instanceof ToolItem)) {
          _builder_2.append("\t\t");
          _builder_2.append("TiersGen.");
          String _upperCase = ((ToolItem)item).getItemId().toUpperCase();
          _builder_2.append(_upperCase, "\t\t");
          _builder_2.append(", 0, 0f, ");
          _builder_2.newLineIfNotEmpty();
        }
      }
      _builder_2.append("\t\t");
      _builder_2.append("new Item.Properties()");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append(".tab(CreativeModeTab.");
      String _tabString = ItemGenerator.getTabString(item.getCreativeModeTab());
      _builder_2.append(_tabString, "\t\t");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      {
        boolean _isIsImmuneToFire = item.isIsImmuneToFire();
        if (_isIsImmuneToFire) {
          _builder_2.append("\t\t");
          _builder_2.append(".fireResistant()");
          _builder_2.newLine();
        }
      }
      {
        if ((item instanceof FoodItem)) {
          _builder_2.append("\t\t");
          _builder_2.append(".food((new FoodProperties.Builder())");
          _builder_2.newLine();
          _builder_2.append("\t\t");
          _builder_2.append("\t");
          _builder_2.append(".nutrition(");
          int _nutrition = ((FoodItem) item).getNutrition();
          _builder_2.append(_nutrition, "\t\t\t");
          _builder_2.append(")");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t");
          _builder_2.append("\t");
          _builder_2.append(".saturationMod(");
          float _saturation = ((FoodItem) item).getSaturation();
          _builder_2.append(_saturation, "\t\t\t");
          _builder_2.append("f)");
          _builder_2.newLineIfNotEmpty();
          {
            boolean _isIsAlwaysEdible = ((FoodItem) item).isIsAlwaysEdible();
            if (_isIsAlwaysEdible) {
              _builder_2.append("\t\t");
              _builder_2.append("\t");
              _builder_2.append(".alwaysEat()");
              _builder_2.newLine();
            }
          }
          {
            boolean _isIsMeat = ((FoodItem) item).isIsMeat();
            if (_isIsMeat) {
              _builder_2.append("\t\t");
              _builder_2.append("\t");
              _builder_2.append(".meat()");
              _builder_2.newLine();
            }
          }
          _builder_2.append("\t\t");
          _builder_2.append("\t");
          _builder_2.append(".build())");
          _builder_2.newLine();
        }
      }
      _builder_2.append("\t\t");
      _builder_2.append(".stacksTo(");
      int _maxStackSize = item.getMaxStackSize();
      _builder_2.append(_maxStackSize, "\t\t");
      _builder_2.append(")");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append(".rarity(Rarity.");
      String _rarityString = ItemGenerator.getRarityString(item.getRarity());
      _builder_2.append(_rarityString, "\t\t");
      _builder_2.append("));");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.newLine();
      {
        int _size_2 = item.getOnUse().size();
        boolean _greaterThan_2 = (_size_2 > 0);
        if (_greaterThan_2) {
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {");
          _builder_2.newLine();
          {
            EList<Effect> _onUse = item.getOnUse();
            boolean _hasElements = false;
            for(final Effect onUse : _onUse) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder_2.appendImmediate("\n", "\t");
              }
              _builder_2.append("\t");
              String _effectInstaceString = EffectHelper.getEffectInstaceString(onUse, "player");
              _builder_2.append(_effectInstaceString, "\t");
              _builder_2.newLineIfNotEmpty();
            }
          }
          _builder_2.append("\t");
          _builder_2.append("return super.use(world, player, hand);");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      _builder_2.newLine();
      {
        int _size_3 = item.getOnTick().size();
        boolean _greaterThan_3 = (_size_3 > 0);
        if (_greaterThan_3) {
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("super.inventoryTick(itemstack, world, entity, slot, selected);");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("if(entity instanceof LivingEntity livingEntity) {");
          _builder_2.newLine();
          {
            final Function1<OnTickEffect, Boolean> _function_1 = (OnTickEffect e) -> {
              return Boolean.valueOf(e.isNeedsSelected());
            };
            int _size_4 = IterableExtensions.size(IterableExtensions.<OnTickEffect>filter(item.getOnTick(), _function_1));
            boolean _greaterThan_4 = (_size_4 > 0);
            if (_greaterThan_4) {
              _builder_2.append("\t\t");
              _builder_2.append("if (selected) {");
              _builder_2.newLine();
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
                    _builder_2.appendImmediate("\n", "\t\t\t");
                  }
                  _builder_2.append("\t\t");
                  _builder_2.append("\t");
                  String _effectInstaceString_1 = EffectHelper.getEffectInstaceString(onTick, "livingEntity");
                  _builder_2.append(_effectInstaceString_1, "\t\t\t");
                  _builder_2.newLineIfNotEmpty();
                }
              }
              _builder_2.append("\t\t");
              _builder_2.append("}");
              _builder_2.newLine();
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
                _builder_2.appendImmediate("\n", "\t\t");
              }
              _builder_2.append("\t\t");
              String _effectInstaceString_2 = EffectHelper.getEffectInstaceString(onTick_1, "livingEntity");
              _builder_2.append(_effectInstaceString_2, "\t\t");
              _builder_2.newLineIfNotEmpty();
            }
          }
          _builder_2.append("\t");
          _builder_2.append("}");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      _builder_2.newLine();
      {
        int _size_5 = item.getOnAttack().size();
        boolean _greaterThan_5 = (_size_5 > 0);
        if (_greaterThan_5) {
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public boolean hurtEnemy(ItemStack itemstack, LivingEntity target, LivingEntity source) {");
          _builder_2.newLine();
          {
            EList<SelfOtherEffect> _onAttack = item.getOnAttack();
            boolean _hasElements_3 = false;
            for(final SelfOtherEffect onAttack : _onAttack) {
              if (!_hasElements_3) {
                _hasElements_3 = true;
              } else {
                _builder_2.appendImmediate("\n", "\t");
              }
              _builder_2.append("\t");
              String _xifexpression = null;
              boolean _isIsSelf = onAttack.isIsSelf();
              if (_isIsSelf) {
                _xifexpression = "source";
              } else {
                _xifexpression = "target";
              }
              String _effectInstaceString_3 = EffectHelper.getEffectInstaceString(onAttack, _xifexpression);
              _builder_2.append(_effectInstaceString_3, "\t");
              _builder_2.newLineIfNotEmpty();
            }
          }
          _builder_2.append("\t");
          _builder_2.append("return super.hurtEnemy(itemstack, target, source);");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      _builder_2.newLine();
      {
        if (((item instanceof FoodItem) && (((FoodItem) item).getAfterEating().size() > 0))) {
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity livingEntity) {");
          _builder_2.newLine();
          {
            EList<Effect> _afterEating = ((FoodItem) item).getAfterEating();
            boolean _hasElements_4 = false;
            for(final Effect afterEating : _afterEating) {
              if (!_hasElements_4) {
                _hasElements_4 = true;
              } else {
                _builder_2.appendImmediate("\n", "\t");
              }
              _builder_2.append("\t");
              String _effectInstaceString_4 = EffectHelper.getEffectInstaceString(afterEating, "livingEntity");
              _builder_2.append(_effectInstaceString_4, "\t");
              _builder_2.newLineIfNotEmpty();
            }
          }
          _builder_2.append("\t");
          _builder_2.append("return super.finishUsingItem(itemstack, world, livingEntity);");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      _builder_2.newLine();
      _builder_2.append("@OnlyIn(Dist.CLIENT)");
      _builder_2.newLine();
      _builder_2.append("@Override");
      _builder_2.newLine();
      _builder_2.append("public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag) {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("tooltip.add(new TranslatableComponent(\"tooltip.");
      String _modId = mod.getModId();
      _builder_2.append(_modId, "\t");
      _builder_2.append(".item.");
      String _itemId = item.getItemId();
      _builder_2.append(_itemId, "\t");
      _builder_2.append("\"));");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.newLine();
      {
        boolean _isGlows = item.isGlows();
        if (_isGlows) {
          _builder_2.append("@Override");
          _builder_2.newLine();
          _builder_2.append("@OnlyIn(Dist.CLIENT)");
          _builder_2.newLine();
          _builder_2.append("public boolean isFoil(ItemStack itemStack){");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("return true;");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      FileGenerator.generateJavaClass(project, _className, _packageExtension, _builder.toString(), _builder_1.toString(), _builder_2.toString(), mod);
    };
    mod.getItems().forEach(_function);
  }

  private static void generateModels(final IProject project, final Mod mod) {
    final Consumer<Item> _function = (Item item) -> {
      String _iconPath = item.getIconPath();
      String _plus = ("Coping \"" + _iconPath);
      String _plus_1 = (_plus + "\" to \"");
      String _baseFolder = FolderGenerator.getBaseFolder(mod);
      String _plus_2 = (_plus_1 + _baseFolder);
      String _plus_3 = (_plus_2 + "/src/main/resources/assets/");
      String _modId = mod.getModId();
      String _plus_4 = (_plus_3 + _modId);
      String _plus_5 = (_plus_4 + "/textures/item\"");
      InputOutput.<String>println(_plus_5);
      String _iconPath_1 = item.getIconPath();
      String _baseFolder_1 = FolderGenerator.getBaseFolder(mod);
      String _plus_6 = (_baseFolder_1 + "/src/main/resources/assets/");
      String _modId_1 = mod.getModId();
      String _plus_7 = (_plus_6 + _modId_1);
      String _plus_8 = (_plus_7 + "/textures/item");
      FileGenerator.copy(_iconPath_1, _plus_8);
      String _itemId = item.getItemId();
      String _plus_9 = (_itemId + ".json");
      String _baseFolder_2 = FolderGenerator.getBaseFolder(mod);
      String _plus_10 = (_baseFolder_2 + "/src/main/resources/assets/");
      String _modId_2 = mod.getModId();
      String _plus_11 = (_plus_10 + _modId_2);
      String _plus_12 = (_plus_11 + "/models/item");
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
      String _modId_3 = mod.getModId();
      _builder.append(_modId_3, "\t\t");
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
      FileGenerator.generateFile(project, _plus_9, _plus_12, _builder, 
        true);
    };
    mod.getItems().forEach(_function);
  }

  private static void generateTiers(final IProject project, final Mod mod) {
    Iterable<ToolItem> tieredItems = Iterables.<ToolItem>filter(mod.getItems(), ToolItem.class);
    int _size = IterableExtensions.size(tieredItems);
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      StringConcatenation _builder = new StringConcatenation();
      {
        final Function1<ToolItem, MiningLevel> _function = (ToolItem it) -> {
          return it.getMiningLevel();
        };
        final Function1<MiningLevel, Boolean> _function_1 = (MiningLevel ml) -> {
          return Boolean.valueOf(((Objects.equal(ml, MiningLevel.STONE) || Objects.equal(ml, MiningLevel.IRON)) || Objects.equal(ml, MiningLevel.DIAMOND)));
        };
        int _size_1 = IterableExtensions.size(IterableExtensions.<MiningLevel>filter(IterableExtensions.<ToolItem, MiningLevel>map(tieredItems, _function), _function_1));
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          _builder.append("import net.minecraft.tags.BlockTags;");
          _builder.newLine();
        }
      }
      {
        final Function1<ToolItem, MiningLevel> _function_2 = (ToolItem it) -> {
          return it.getMiningLevel();
        };
        final Function1<MiningLevel, Boolean> _function_3 = (MiningLevel ml) -> {
          return Boolean.valueOf((Objects.equal(ml, MiningLevel.WOOD) || Objects.equal(ml, MiningLevel.NETHERITE)));
        };
        int _size_2 = IterableExtensions.size(IterableExtensions.<MiningLevel>filter(IterableExtensions.<ToolItem, MiningLevel>map(tieredItems, _function_2), _function_3));
        boolean _greaterThan_2 = (_size_2 > 0);
        if (_greaterThan_2) {
          _builder.append("import net.minecraftforge.common.Tags;");
          _builder.newLine();
        }
      }
      _builder.append("import net.minecraft.world.item.crafting.Ingredient;");
      _builder.newLine();
      _builder.append("import net.minecraftforge.common.ForgeTier;");
      _builder.newLine();
      _builder.append("import ");
      String _basePackage = FolderGenerator.getBasePackage(mod);
      _builder.append(_basePackage);
      _builder.append(".item.ItemInitGen;");
      _builder.newLineIfNotEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      {
        for(final ToolItem tieredItem : tieredItems) {
          _builder_1.append("public static final ForgeTier ");
          String _upperCase = tieredItem.getItemId().toUpperCase();
          _builder_1.append(_upperCase);
          _builder_1.append(" = new ForgeTier(");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t\t");
          int _value = tieredItem.getMiningLevel().getValue();
          _builder_1.append(_value, "\t\t\t");
          _builder_1.append(", ");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t\t");
          int _durability = tieredItem.getDurability();
          _builder_1.append(_durability, "\t\t\t");
          _builder_1.append(",");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t\t");
          float _speed = tieredItem.getSpeed();
          _builder_1.append(_speed, "\t\t\t");
          _builder_1.append("f, ");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t\t");
          float _damage = tieredItem.getDamage();
          _builder_1.append(_damage, "\t\t\t");
          _builder_1.append("f, ");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t\t");
          int _enchantmentValue = tieredItem.getEnchantmentValue();
          _builder_1.append(_enchantmentValue, "\t\t\t");
          _builder_1.append(", ");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t\t");
          String _miningTagString = ItemGenerator.getMiningTagString(tieredItem.getMiningLevel());
          _builder_1.append(_miningTagString, "\t\t\t");
          _builder_1.append(",");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t\t");
          _builder_1.append("() -> Ingredient.of(ItemInitGen.");
          String _upperCase_1 = tieredItem.getItemId().toUpperCase();
          _builder_1.append(_upperCase_1, "\t\t\t");
          _builder_1.append(".get()));");
          _builder_1.newLineIfNotEmpty();
        }
      }
      FileGenerator.generateJavaClass(project, 
        "Tiers", 
        "item.tool", 
        "", _builder.toString(), _builder_1.toString(), mod, 
        false, 
        true);
    }
  }

  private static String getMiningTagString(final MiningLevel level) {
    String _switchResult = null;
    if (level != null) {
      switch (level) {
        case WOOD:
          _switchResult = "Tags.Blocks.NEEDS_WOOD_TOOL";
          break;
        case STONE:
          _switchResult = "BlockTags.NEEDS_STONE_TOOL";
          break;
        case IRON:
          _switchResult = "BlockTags.NEEDS_IRON_TOOL";
          break;
        case DIAMOND:
          _switchResult = "BlockTags.NEEDS_DIAMOND_TOOL";
          break;
        case NETHERITE:
          _switchResult = "Tags.Blocks.NEEDS_NETHERITE_TOOL";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }

  private static String getBaseClassString(final Item item) {
    if ((item instanceof ToolItem)) {
      String _switchResult = null;
      ToolType _type = ((ToolItem) item).getType();
      if (_type != null) {
        switch (_type) {
          case SWORD:
            _switchResult = "SwordItem";
            break;
          case PICKAXE:
            _switchResult = "PickaxeItem";
            break;
          case SHOVEL:
            _switchResult = "ShovelItem";
            break;
          case AXE:
            _switchResult = "AxeItem";
            break;
          case HOE:
            _switchResult = "HoeItem";
            break;
          default:
            break;
        }
      }
      return _switchResult;
    } else {
      return "Item";
    }
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
