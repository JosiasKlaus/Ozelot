package stringmodcreator.data

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class OnTickEffect extends Effect{
	
	new(PotionEffects potionEffects, int level, int duration, boolean visible, boolean needsSelected) {
		super(potionEffects, level, duration, visible)
		this.needsSelected = needsSelected
	}

	boolean needsSelected
	
}