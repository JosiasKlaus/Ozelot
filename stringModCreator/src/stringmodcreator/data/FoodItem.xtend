package stringmodcreator.data
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

@Accessors
class FoodItem extends UsableItem {
	new(ToolProperty toolProperty, String iconPath, boolean glows, int maxStackSize, boolean isImmuneToFire, String itemId, List<Translation> translations, Rarity rarity, CreativeModeTab creativeModeTab, List<OnTickEffect> onTick, List<SelfOtherEffect> onAttack, List<Effect> onUse, int nutrition, float saturation, boolean isMeat, boolean isAlwaysEdible, List<Effect> afterEating){
		super(toolProperty, iconPath, glows, maxStackSize, isImmuneToFire, itemId, translations, rarity, creativeModeTab, onTick, onAttack, onUse)
		
		this.nutrition = nutrition
		this.saturation = saturation
		this.isMeat = isMeat
		this.isAlwaysEdible = isAlwaysEdible
		this.afterEating = afterEating
	}
	
	int nutrition
	float saturation
	boolean isMeat
	boolean isAlwaysEdible
	List<Effect> afterEating
}