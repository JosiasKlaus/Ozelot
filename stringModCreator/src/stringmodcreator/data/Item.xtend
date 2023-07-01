package stringmodcreator.data

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Item {
	new(ToolProperty toolProperty, String iconPath, boolean glows, int maxStackSize, boolean isImmuneToFire, String itemId, List<Translation> translations, Rarity rarity, CreativeModeTab creativeModeTab, List<OnTickEffect> onTick, List<SelfOtherEffect> onAttack){
		this.toolProperty = toolProperty
		this.iconPath = iconPath
		this.glows = glows
		this.maxStackSize = maxStackSize
		this.isImmuneToFire = isImmuneToFire
		this.itemId = itemId
		this.translations = translations
		this.rarity = rarity
		this.creativeModeTab = creativeModeTab
		this.onTick = onTick
		this.onAttack = onAttack
	}
	
	ToolProperty toolProperty
	String iconPath
	boolean glows
	int maxStackSize
	boolean isImmuneToFire
	String itemId
	List<Translation> translations
	Rarity rarity
	CreativeModeTab creativeModeTab
	
	List<OnTickEffect> onTick
	List<SelfOtherEffect> onAttack
}