package ozelot.generator.content

import ozelot.Effect
import ozelot.PotionEffect

class EffectHelper {
	def static String getPotionEffectString(PotionEffect potionEffect){
		switch potionEffect{
			case PotionEffect.MOVEMENT_SPEED : 'MobEffects.MOVEMENT_SPEED'
			case PotionEffect.MOVEMENT_SLOWDOWN : 'MobEffects.MOVEMENT_SLOWDOWN'
			case PotionEffect.DIG_SPEED : 'MobEffects.DIG_SPEED'
			case PotionEffect.DIG_SLOWDOWN : 'MobEffects.DIG_SLOWDOWN'
			case PotionEffect.DAMAGE_BOOST : 'MobEffects.DAMAGE_BOOST'
			case PotionEffect.HEAL : 'MobEffects.HEAL'
			case PotionEffect.HARM : 'MobEffects.HARM'
			case PotionEffect.JUMP : 'MobEffects.JUMP'
			case PotionEffect.CONFUSION : 'MobEffects.CONFUSION'
			case PotionEffect.REGENERATION : 'MobEffects.REGENERATION'
			case PotionEffect.DAMAGE_RESISTANCE : 'MobEffects.DAMAGE_RESISTANCE'
			case PotionEffect.FIRE_RESISTANCE : 'MobEffects.FIRE_RESISTANCE'
			case PotionEffect.WATER_BREATHING : 'MobEffects.WATER_BREATHING'
			case PotionEffect.INVISIBILITY : 'MobEffects.INVISIBILITY'
			case PotionEffect.BLINDNESS : 'MobEffects.BLINDNESS'
			case PotionEffect.NIGHT_VISION : 'MobEffects.NIGHT_VISION'
			case PotionEffect.HUNGER : 'MobEffects.HUNGER'
			case PotionEffect.WEAKNESS : 'MobEffects.WEAKNESS'
			case PotionEffect.POISON : 'MobEffects.POISON'
			case PotionEffect.WITHER : 'MobEffects.WITHER'
			case PotionEffect.HEALTH_BOOST : 'MobEffects.HEALTH_BOOST'
			case PotionEffect.ABSORPTION : 'MobEffects.ABSORPTION'
			case PotionEffect.SATURATION : 'MobEffects.SATURATION'
			case PotionEffect.GLOWING : 'MobEffects.GLOWING'
			case PotionEffect.LEVITATION : 'MobEffects.LEVITATION'
			case PotionEffect.LUCK : 'MobEffects.LUCK'
			case PotionEffect.UNLUCK : 'MobEffects.UNLUCK'
			case PotionEffect.SLOW_FALLING : 'MobEffects.SLOW_FALLING'
			case PotionEffect.CONDUIT_POWER : 'MobEffects.CONDUIT_POWER'
			case PotionEffect.DOLPHINS_GRACE : 'MobEffects.DOLPHINS_GRACE'
			case PotionEffect.BAD_OMEN : 'MobEffects.BAD_OMEN'			
		}
	}
	
	def static String getEffectInstaceString(Effect effect, String target){
		return 
		'''
		if(!«target».hasEffect(«effect.potionEffect.potionEffectString») || «target».getEffect(«effect.potionEffect.potionEffectString»).getAmplifier() < («effect.level» - 1)){
			«target».addEffect(new MobEffectInstance(«effect.potionEffect.potionEffectString», «((effect.duration * 20) as int)», «effect.level» - 1, «effect.visible», «effect.visible», «effect.visible»));
		}
		else{
			//Update the duration of the effect.
			«target».getEffect(«effect.potionEffect.potionEffectString»).update(new MobEffectInstance(«effect.potionEffect.potionEffectString», «((effect.duration * 20) as int)», «effect.level» - 1, «effect.visible», «effect.visible», «effect.visible»));
		}
		
		'''
	}
}