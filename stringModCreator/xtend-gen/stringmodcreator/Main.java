package stringmodcreator;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import stringmodcreator.data.Block;
import stringmodcreator.data.CreativeModeTab;
import stringmodcreator.data.Effect;
import stringmodcreator.data.FoodItem;
import stringmodcreator.data.Item;
import stringmodcreator.data.Mod;
import stringmodcreator.data.OnTickEffect;
import stringmodcreator.data.PotionEffects;
import stringmodcreator.data.Rarity;
import stringmodcreator.data.SelfOtherEffect;
import stringmodcreator.data.Translation;
import stringmodcreator.generator.FolderGenerator;
import stringmodcreator.generator.ForgeSetup;
import stringmodcreator.generator.content.MainGenerator;

@SuppressWarnings("all")
public class Main {
  public static final String SOURCE_FOLDER_PATH = "src-gen/";

  public static void main(final String[] args) {
    Mod mod = Main.getData();
    FolderGenerator.generateFolderStructure(mod);
    ForgeSetup.run(mod);
    MainGenerator.run(mod);
  }

  public static Mod getData() {
    Translation _translation = new Translation("en_us", "My 1 Item", "This is my 1st Item!");
    ArrayList<Translation> _newArrayList = CollectionLiterals.<Translation>newArrayList(_translation);
    ArrayList<OnTickEffect> _newArrayList_1 = CollectionLiterals.<OnTickEffect>newArrayList();
    ArrayList<SelfOtherEffect> _newArrayList_2 = CollectionLiterals.<SelfOtherEffect>newArrayList();
    ArrayList<Effect> _newArrayList_3 = CollectionLiterals.<Effect>newArrayList();
    Item _item = new Item(null, "C:/Users/johfr/Desktop/my_item.png", true, 64, false, "my_1_item", _newArrayList, 
      Rarity.COMMON, 
      CreativeModeTab.MISC, _newArrayList_1, _newArrayList_2, _newArrayList_3);
    Translation _translation_1 = new Translation("en_us", "My 1 Item", "This is my 2nd Item!");
    Translation _translation_2 = new Translation("de_de", "Item 2", "Das ist mein 2. Item");
    ArrayList<Translation> _newArrayList_4 = CollectionLiterals.<Translation>newArrayList(_translation_1, _translation_2);
    OnTickEffect _onTickEffect = new OnTickEffect(PotionEffects.FIRE_RESISTANCE, 1, 1, false, true);
    OnTickEffect _onTickEffect_1 = new OnTickEffect(PotionEffects.INVISIBILITY, 1, 1, false, true);
    ArrayList<OnTickEffect> _newArrayList_5 = CollectionLiterals.<OnTickEffect>newArrayList(_onTickEffect, _onTickEffect_1);
    ArrayList<SelfOtherEffect> _newArrayList_6 = CollectionLiterals.<SelfOtherEffect>newArrayList();
    ArrayList<Effect> _newArrayList_7 = CollectionLiterals.<Effect>newArrayList();
    Effect _effect = new Effect(PotionEffects.HEALTH_BOOST, 10, 60, false);
    Effect _effect_1 = new Effect(PotionEffects.INVISIBILITY, 5, 10, false);
    ArrayList<Effect> _newArrayList_8 = CollectionLiterals.<Effect>newArrayList(_effect, _effect_1);
    FoodItem _foodItem = new FoodItem(null, "C:/Users/johfr/Desktop/my_item.png", false, 16, true, "my_2_item", _newArrayList_4, 
      Rarity.COMMON, 
      CreativeModeTab.MISC, _newArrayList_5, _newArrayList_6, _newArrayList_7, 
      10, 
      0.3f, 
      false, 
      true, _newArrayList_8);
    ArrayList<Item> _newArrayList_9 = CollectionLiterals.<Item>newArrayList(_item, _foodItem);
    Block _block = new Block();
    Block _block_1 = new Block();
    Block _block_2 = new Block();
    ArrayList<Block> _newArrayList_10 = CollectionLiterals.<Block>newArrayList(_block, _block_1, _block_2);
    return new Mod("examplemod", "My Test Mod", "this is my test mod", "Author", "C:/Users/johfr/Desktop/my_mod.png", "0.0.1", _newArrayList_9, _newArrayList_10);
  }
}
