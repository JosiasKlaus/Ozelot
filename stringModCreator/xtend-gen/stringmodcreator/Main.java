package stringmodcreator;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import stringmodcreator.data.Block;
import stringmodcreator.data.Item;
import stringmodcreator.data.Mod;
import stringmodcreator.generator.FolderGenerator;
import stringmodcreator.generator.ForgeSetup;
import stringmodcreator.generator.content.MainContent;

@SuppressWarnings("all")
public class Main {
  public static final String SOURCE_FOLDER_PATH = "src-gen/";

  public static void main(final String[] args) {
    Mod mod = Main.getData();
    FolderGenerator.generateFolderStructure(mod);
    ForgeSetup.run(mod);
    MainContent.run(mod);
  }

  public static Mod getData() {
    Item _item = new Item(null, "C:/Users/johfr/Desktop/my_item.png", false, 64, false, "my_1_item");
    Item _item_1 = new Item(null, "C:/Users/johfr/Desktop/my_item.png", false, 16, false, "my_2_item");
    ArrayList<Item> _newArrayList = CollectionLiterals.<Item>newArrayList(_item, _item_1);
    Block _block = new Block();
    Block _block_1 = new Block();
    Block _block_2 = new Block();
    ArrayList<Block> _newArrayList_1 = CollectionLiterals.<Block>newArrayList(_block, _block_1, _block_2);
    return new Mod("mtm", "My Test Mod", "this is my test mod", "Author", "C:/Users/johfr/Desktop/my_mod.png", "0.0.1", _newArrayList, _newArrayList_1);
  }
}
