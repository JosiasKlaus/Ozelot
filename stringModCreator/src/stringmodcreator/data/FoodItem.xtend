package stringmodcreator.data
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class FoodItem extends UsableItem {
	new(ToolProperty toolProperty, String iconPath, boolean glows, int maxStackSize, boolean isImmuneToFire, String itemId){
		super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId)
		
		this.nutrition = nutrition
		this.saturation = saturation
		this.isMeat = isMeat
		this.isAlwaysEdible = isAlwaysEdible
	}
	
	int nutrition
	float saturation
	boolean isMeat
	boolean isAlwaysEdible
}