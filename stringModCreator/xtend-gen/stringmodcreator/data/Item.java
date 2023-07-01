package stringmodcreator.data;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Item {
  public Item(final ToolProperty toolProperty, final String iconPath, final boolean glows, final int maxStackSize, final boolean isImmuneToFire, final String itemId, final List<Translation> translations, final Rarity rarity, final CreativeModeTab creativeModeTab, final List<OnTickEffect> onTick, final List<SelfOtherEffect> onAttack) {
    this.toolProperty = toolProperty;
    this.iconPath = iconPath;
    this.glows = glows;
    this.maxStackSize = maxStackSize;
    this.isImmuneToFire = isImmuneToFire;
    this.itemId = itemId;
    this.translations = translations;
    this.rarity = rarity;
    this.creativeModeTab = creativeModeTab;
    this.onTick = onTick;
    this.onAttack = onAttack;
  }

  private ToolProperty toolProperty;

  private String iconPath;

  private boolean glows;

  private int maxStackSize;

  private boolean isImmuneToFire;

  private String itemId;

  private List<Translation> translations;

  private Rarity rarity;

  private CreativeModeTab creativeModeTab;

  private List<OnTickEffect> onTick;

  private List<SelfOtherEffect> onAttack;

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

  @Pure
  public List<Translation> getTranslations() {
    return this.translations;
  }

  public void setTranslations(final List<Translation> translations) {
    this.translations = translations;
  }

  @Pure
  public Rarity getRarity() {
    return this.rarity;
  }

  public void setRarity(final Rarity rarity) {
    this.rarity = rarity;
  }

  @Pure
  public CreativeModeTab getCreativeModeTab() {
    return this.creativeModeTab;
  }

  public void setCreativeModeTab(final CreativeModeTab creativeModeTab) {
    this.creativeModeTab = creativeModeTab;
  }

  @Pure
  public List<OnTickEffect> getOnTick() {
    return this.onTick;
  }

  public void setOnTick(final List<OnTickEffect> onTick) {
    this.onTick = onTick;
  }

  @Pure
  public List<SelfOtherEffect> getOnAttack() {
    return this.onAttack;
  }

  public void setOnAttack(final List<SelfOtherEffect> onAttack) {
    this.onAttack = onAttack;
  }
}
