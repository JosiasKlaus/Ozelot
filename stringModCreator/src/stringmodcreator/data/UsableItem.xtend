package stringmodcreator.data

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class UsableItem extends Item {
	new(ToolProperty toolProperty, String iconPath, boolean glows, int maxStackSize, boolean isImmuneToFire, String itemId, List<Translation> translations){
		super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId, translations)
	}	
	
	// todo
	// List<Integer> onUse
}