package stringmodcreator.data

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class UsableItem extends Item {
	//todo: Potentially this should be merged with the normal item
	
	new(ToolProperty toolProperty, String iconPath, boolean glows, int maxStackSize, boolean isImmuneToFire, String itemId, List<Translation> translations, Rarity rarity, CreativeModeTab creativeModeTab, List<OnTickEffect> onTick, List<SelfOtherEffect> onAttack, List<Effect> onUse){
		super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId, translations, rarity, creativeModeTab, onTick, onAttack)
		this.onUse = onUse
	}	
	
	List<Effect> onUse
}