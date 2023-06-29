package stringmodcreator.data;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Mod {
  public Mod(final String modId, final String name, final String description, final String author, final String iconPath, final String version, final List<Item> items, final List<Block> blocks) {
    this.modId = modId;
    this.name = name;
    this.description = description;
    this.author = author;
    this.iconPath = iconPath;
    this.version = version;
    this.items = items;
    this.blocks = blocks;
  }

  private String modId;

  private String name;

  private String description;

  private String author;

  private String iconPath;

  private String version;

  private List<Item> items;

  private List<Block> blocks;

  @Pure
  public String getModId() {
    return this.modId;
  }

  public void setModId(final String modId) {
    this.modId = modId;
  }

  @Pure
  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Pure
  public String getDescription() {
    return this.description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  @Pure
  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(final String author) {
    this.author = author;
  }

  @Pure
  public String getIconPath() {
    return this.iconPath;
  }

  public void setIconPath(final String iconPath) {
    this.iconPath = iconPath;
  }

  @Pure
  public String getVersion() {
    return this.version;
  }

  public void setVersion(final String version) {
    this.version = version;
  }

  @Pure
  public List<Item> getItems() {
    return this.items;
  }

  public void setItems(final List<Item> items) {
    this.items = items;
  }

  @Pure
  public List<Block> getBlocks() {
    return this.blocks;
  }

  public void setBlocks(final List<Block> blocks) {
    this.blocks = blocks;
  }
}
