package stringmodcreator.data;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class FoodItem extends UsableItem {
  public FoodItem(final ToolProperty toolProperty, final String iconPath, final boolean glows, final int maxStackSize, final boolean isImmuneToFire, final String itemId) {
    super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId);
    this.nutrition = this.nutrition;
    this.saturation = this.saturation;
    this.isMeat = this.isMeat;
    this.isAlwaysEdible = this.isAlwaysEdible;
  }

  private int nutrition;

  private float saturation;

  private boolean isMeat;

  private boolean isAlwaysEdible;

  @Pure
  public int getNutrition() {
    return this.nutrition;
  }

  public void setNutrition(final int nutrition) {
    this.nutrition = nutrition;
  }

  @Pure
  public float getSaturation() {
    return this.saturation;
  }

  public void setSaturation(final float saturation) {
    this.saturation = saturation;
  }

  @Pure
  public boolean isMeat() {
    return this.isMeat;
  }

  public void setIsMeat(final boolean isMeat) {
    this.isMeat = isMeat;
  }

  @Pure
  public boolean isAlwaysEdible() {
    return this.isAlwaysEdible;
  }

  public void setIsAlwaysEdible(final boolean isAlwaysEdible) {
    this.isAlwaysEdible = isAlwaysEdible;
  }
}
