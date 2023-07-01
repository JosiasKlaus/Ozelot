package stringmodcreator.generator.content

import stringmodcreator.data.PotionEffects
import stringmodcreator.data.Effect

class EffectHelper {
	def static String getPotionEffectString(PotionEffects potionEffect){
		switch potionEffect{
			case PotionEffects.MOVEMENT_SPEED : 'MobEffects.MOVEMENT_SPEED'
			case PotionEffects.MOVEMENT_SLOWDOWN : 'MobEffects.MOVEMENT_SLOWDOWN'
			case PotionEffects.DIG_SPEED : 'MobEffects.DIG_SPEED'
			case PotionEffects.DIG_SLOWDOWN : 'MobEffects.DIG_SLOWDOWN'
			case PotionEffects.DAMAGE_BOOST : 'MobEffects.DAMAGE_BOOST'
			case PotionEffects.HEAL : 'MobEffects.HEAL'
			case PotionEffects.HARM : 'MobEffects.HARM'
			case PotionEffects.JUMP : 'MobEffects.JUMP'
			case PotionEffects.CONFUSION : 'MobEffects.CONFUSION'
			case PotionEffects.REGENERATION : 'MobEffects.REGENERATION'
			case PotionEffects.DAMAGE_RESISTANCE : 'MobEffects.DAMAGE_RESISTANCE'
			case PotionEffects.FIRE_RESISTANCE : 'MobEffects.FIRE_RESISTANCE'
			case PotionEffects.WATER_BREATHING : 'MobEffects.WATER_BREATHING'
			case PotionEffects.INVISIBILITY : 'MobEffects.INVISIBILITY'
			case PotionEffects.BLINDNESS : 'MobEffects.BLINDNESS'
			case PotionEffects.NIGHT_VISION : 'MobEffects.NIGHT_VISION'
			case PotionEffects.HUNGER : 'MobEffects.HUNGER'
			case PotionEffects.WEAKNESS : 'MobEffects.WEAKNESS'
			case PotionEffects.POISON : 'MobEffects.POISON'
			case PotionEffects.WITHER : 'MobEffects.WITHER'
			case PotionEffects.HEALTH_BOOST : 'MobEffects.HEALTH_BOOST'
			case PotionEffects.ABSORPTION : 'MobEffects.ABSORPTION'
			case PotionEffects.SATURATION : 'MobEffects.SATURATION'
			case PotionEffects.GLOWING : 'MobEffects.GLOWING'
			case PotionEffects.LEVITATION : 'MobEffects.LEVITATION'
			case PotionEffects.LUCK : 'MobEffects.LUCK'
			case PotionEffects.UNLUCK : 'MobEffects.UNLUCK'
			case PotionEffects.SLOW_FALLING : 'MobEffects.SLOW_FALLING'
			case PotionEffects.CONDUIT_POWER : 'MobEffects.CONDUIT_POWER'
			case PotionEffects.DOLPHINS_GRACE : 'MobEffects.DOLPHINS_GRACE'
			case PotionEffects.BAD_OMEN : 'MobEffects.BAD_OMEN'			
		}
	}
	
	def static String getEffectInstaceString(Effect effect, String target){
		return 
		'''
		if(!player.hasEffect(«effect.potionEffects.potionEffectString») || player.getEffect(«effect.potionEffects.potionEffectString»).getAmplifier() < (level*factor - 1)){
			«target».addEffect(new MobEffectInstance(«effect.potionEffects.potionEffectString», «effect.duration * 20», «effect.level» - 1, «effect.visible», «effect.visible», «effect.visible»));
		}
		else{
			//Update the duration of the effect.
			«target».getEffect(«effect.potionEffects.potionEffectString»).update(new MobEffectInstance(«effect.potionEffects.potionEffectString», «effect.duration * 20», «effect.level» - 1, «effect.visible», «effect.visible», «effect.visible»));
		}
		
		'''
	}
}