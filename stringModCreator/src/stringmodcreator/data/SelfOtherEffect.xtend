package stringmodcreator.data

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class SelfOtherEffect extends Effect{
	new(PotionEffects potionEffects, int level, int duration, boolean visible, boolean isSelf) {
		super(potionEffects, level, duration, visible)
		this.isSelf = isSelf
	}
	
	boolean isSelf
}