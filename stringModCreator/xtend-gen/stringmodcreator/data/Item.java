package stringmodcreator.data;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Item {
  public Item(final ToolProperty toolProperty, final String iconPath, final boolean glows, final int maxStackSize, final boolean isImmuneToFire, final String itemId) {
    this.toolProperty = toolProperty;
    this.iconPath = iconPath;
    this.glows = glows;
    this.maxStackSize = maxStackSize;
    this.isImmuneToFire = isImmuneToFire;
    this.itemId = itemId;
  }

  private ToolProperty toolProperty;

  private String iconPath;

  private boolean glows;

  private int maxStackSize;

  private boolean isImmuneToFire;

  private String itemId;

  @Pure
  public ToolProperty getToolProperty() {
    return this.toolProperty;
  }

  public void setToolProperty(final ToolProperty toolProperty) {
    this.toolProperty = toolProperty;
  }

  @Pure
  public String getIconPath() {
    return this.iconPath;
  }

  public void setIconPath(final String iconPath) {
    this.iconPath = iconPath;
  }

  @Pure
  public boolean isGlows() {
    return this.glows;
  }

  public void setGlows(final boolean glows) {
    this.glows = glows;
  }

  @Pure
  public int getMaxStackSize() {
    return this.maxStackSize;
  }

  public void setMaxStackSize(final int maxStackSize) {
    this.maxStackSize = maxStackSize;
  }

  @Pure
  public boolean isImmuneToFire() {
    return this.isImmuneToFire;
  }

  public void setIsImmuneToFire(final boolean isImmuneToFire) {
    this.isImmuneToFire = isImmuneToFire;
  }

  @Pure
  public String getItemId() {
    return this.itemId;
  }

  public void setItemId(final String itemId) {
    this.itemId = itemId;
  }
}