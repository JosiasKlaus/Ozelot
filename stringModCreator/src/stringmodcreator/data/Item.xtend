package stringmodcreator.data

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Item {
	new(ToolProperty toolProperty, String iconPath, boolean glows, int maxStackSize, boolean isImmuneToFire, String itemId){
		this.toolProperty = toolProperty
		this.iconPath = iconPath
		this.glows = glows
		this.maxStackSize = maxStackSize
		this.isImmuneToFire = isImmuneToFire
		this.itemId = itemId
	}
	
	ToolProperty toolProperty
	String iconPath
	boolean glows
	int maxStackSize
	boolean isImmuneToFire
	String itemId
	
	// todo
	// List<> onTick
	// List<> onAttack
}