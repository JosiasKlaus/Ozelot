package stringmodcreator;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import stringmodcreator.data.Block;
import stringmodcreator.data.Item;
import stringmodcreator.data.Mod;
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
    Item _item = new Item(null, "C:/Users/johfr/Desktop/my_item.png", true, 64, false, "my_1_item", _newArrayList);
    Translation _translation_1 = new Translation("en_us", "My 1 Item", "This is my 2nd Item!");
    Translation _translation_2 = new Translation("de_de", "Item 2", "Das ist mein 2. Item");
    ArrayList<Translation> _newArrayList_1 = CollectionLiterals.<Translation>newArrayList(_translation_1, _translation_2);
    Item _item_1 = new Item(null, "C:/Users/johfr/Desktop/my_item.png", false, 16, true, "my_2_item", _newArrayList_1);
    ArrayList<Item> _newArrayList_2 = CollectionLiterals.<Item>newArrayList(_item, _item_1);
    Block _block = new Block();
    Block _block_1 = new Block();
    Block _block_2 = new Block();
    ArrayList<Block> _newArrayList_3 = CollectionLiterals.<Block>newArrayList(_block, _block_1, _block_2);
    return new Mod("examplemod", "My Test Mod", "this is my test mod", "Author", "C:/Users/johfr/Desktop/my_mod.png", "0.0.1", _newArrayList_2, _newArrayList_3);
  }
}
