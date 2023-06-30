package stringmodcreator.data;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;

@Accessors
@SuppressWarnings("all")
public class UsableItem extends Item {
  public UsableItem(final ToolProperty toolProperty, final String iconPath, final boolean glows, final int maxStackSize, final boolean isImmuneToFire, final String itemId, final List<Translation> translations) {
    super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId, translations);
  }
}
