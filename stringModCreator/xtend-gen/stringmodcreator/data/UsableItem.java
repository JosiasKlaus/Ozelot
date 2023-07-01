package stringmodcreator.data;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class UsableItem extends Item {
  public UsableItem(final ToolProperty toolProperty, final String iconPath, final boolean glows, final int maxStackSize, final boolean isImmuneToFire, final String itemId, final List<Translation> translations, final Rarity rarity, final CreativeModeTab creativeModeTab, final List<OnTickEffect> onTick, final List<SelfOtherEffect> onAttack, final List<Effect> onUse) {
    super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId, translations, rarity, creativeModeTab, onTick, onAttack);
    this.onUse = onUse;
  }

  private List<Effect> onUse;

  @Pure
  public List<Effect> getOnUse() {
    return this.onUse;
  }

  public void setOnUse(final List<Effect> onUse) {
    this.onUse = onUse;
  }
}
