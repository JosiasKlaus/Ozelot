package stringmodcreator.data;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class FoodItem extends UsableItem {
  public FoodItem(final ToolProperty toolProperty, final String iconPath, final boolean glows, final int maxStackSize, final boolean isImmuneToFire, final String itemId, final List<Translation> translations, final int nutrition, final float saturation, final boolean isMeat, final boolean isAlwaysEdible) {
    super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId, translations);
    this.nutrition = nutrition;
    this.saturation = saturation;
    this.isMeat = isMeat;
    this.isAlwaysEdible = isAlwaysEdible;
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
