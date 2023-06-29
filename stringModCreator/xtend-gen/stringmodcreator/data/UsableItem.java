package stringmodcreator.data;

import org.eclipse.xtend.lib.annotations.Accessors;

@Accessors
@SuppressWarnings("all")
public class UsableItem extends Item {
  public UsableItem(final ToolProperty toolProperty, final String iconPath, final boolean glows, final int maxStackSize, final boolean isImmuneToFire, final String itemId) {
    super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId);
  }
}
