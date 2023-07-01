package stringmodcreator.data

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Effect {
	new (PotionEffects potionEffects, int level, int duration, boolean visible){
		this.potionEffects = potionEffects
		this.level = level
		this.duration = duration
		this.visible = visible
	}
		
	PotionEffects potionEffects
	int level
	int duration
	boolean visible
}