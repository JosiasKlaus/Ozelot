package ozelot.generator.content;

import org.eclipse.xtend2.lib.StringConcatenation;
import ozelot.Effect;
import ozelot.PotionEffect;

@SuppressWarnings("all")
public class EffectHelper {
  public static String getPotionEffectString(final PotionEffect potionEffect) {
    String _switchResult = null;
    if (potionEffect != null) {
      switch (potionEffect) {
        case MOVEMENT_SPEED:
          _switchResult = "MobEffects.MOVEMENT_SPEED";
          break;
        case MOVEMENT_SLOWDOWN:
          _switchResult = "MobEffects.MOVEMENT_SLOWDOWN";
          break;
        case DIG_SPEED:
          _switchResult = "MobEffects.DIG_SPEED";
          break;
        case DIG_SLOWDOWN:
          _switchResult = "MobEffects.DIG_SLOWDOWN";
          break;
        case DAMAGE_BOOST:
          _switchResult = "MobEffects.DAMAGE_BOOST";
          break;
        case HEAL:
          _switchResult = "MobEffects.HEAL";
          break;
        case HARM:
          _switchResult = "MobEffects.HARM";
          break;
        case JUMP:
          _switchResult = "MobEffects.JUMP";
          break;
        case CONFUSION:
          _switchResult = "MobEffects.CONFUSION";
          break;
        case REGENERATION:
          _switchResult = "MobEffects.REGENERATION";
          break;
        case DAMAGE_RESISTANCE:
          _switchResult = "MobEffects.DAMAGE_RESISTANCE";
          break;
        case FIRE_RESISTANCE:
          _switchResult = "MobEffects.FIRE_RESISTANCE";
          break;
        case WATER_BREATHING:
          _switchResult = "MobEffects.WATER_BREATHING";
          break;
        case INVISIBILITY:
          _switchResult = "MobEffects.INVISIBILITY";
          break;
        case BLINDNESS:
          _switchResult = "MobEffects.BLINDNESS";
          break;
        case NIGHT_VISION:
          _switchResult = "MobEffects.NIGHT_VISION";
          break;
        case HUNGER:
          _switchResult = "MobEffects.HUNGER";
          break;
        case WEAKNESS:
          _switchResult = "MobEffects.WEAKNESS";
          break;
        case POISON:
          _switchResult = "MobEffects.POISON";
          break;
        case WITHER:
          _switchResult = "MobEffects.WITHER";
          break;
        case HEALTH_BOOST:
          _switchResult = "MobEffects.HEALTH_BOOST";
          break;
        case ABSORPTION:
          _switchResult = "MobEffects.ABSORPTION";
          break;
        case SATURATION:
          _switchResult = "MobEffects.SATURATION";
          break;
        case GLOWING:
          _switchResult = "MobEffects.GLOWING";
          break;
        case LEVITATION:
          _switchResult = "MobEffects.LEVITATION";
          break;
        case LUCK:
          _switchResult = "MobEffects.LUCK";
          break;
        case UNLUCK:
          _switchResult = "MobEffects.UNLUCK";
          break;
        case SLOW_FALLING:
          _switchResult = "MobEffects.SLOW_FALLING";
          break;
        case CONDUIT_POWER:
          _switchResult = "MobEffects.CONDUIT_POWER";
          break;
        case DOLPHINS_GRACE:
          _switchResult = "MobEffects.DOLPHINS_GRACE";
          break;
        case BAD_OMEN:
          _switchResult = "MobEffects.BAD_OMEN";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }

  public static String getEffectInstaceString(final Effect effect, final String target) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(!");
    _builder.append(target);
    _builder.append(".hasEffect(");
    String _potionEffectString = EffectHelper.getPotionEffectString(effect.getPotionEffect());
    _builder.append(_potionEffectString);
    _builder.append(") || ");
    _builder.append(target);
    _builder.append(".getEffect(");
    String _potionEffectString_1 = EffectHelper.getPotionEffectString(effect.getPotionEffect());
    _builder.append(_potionEffectString_1);
    _builder.append(").getAmplifier() < (");
    int _level = effect.getLevel();
    _builder.append(_level);
    _builder.append(" - 1)){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(target, "\t");
    _builder.append(".addEffect(new MobEffectInstance(");
    String _potionEffectString_2 = EffectHelper.getPotionEffectString(effect.getPotionEffect());
    _builder.append(_potionEffectString_2, "\t");
    _builder.append(", ");
    double _duration = effect.getDuration();
    double _multiply = (_duration * 20);
    _builder.append(((int) _multiply), "\t");
    _builder.append(", ");
    int _level_1 = effect.getLevel();
    _builder.append(_level_1, "\t");
    _builder.append(" - 1, ");
    boolean _isVisible = effect.isVisible();
    _builder.append(_isVisible, "\t");
    _builder.append(", ");
    boolean _isVisible_1 = effect.isVisible();
    _builder.append(_isVisible_1, "\t");
    _builder.append(", ");
    boolean _isVisible_2 = effect.isVisible();
    _builder.append(_isVisible_2, "\t");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("else{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Update the duration of the effect.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(target, "\t");
    _builder.append(".getEffect(");
    String _potionEffectString_3 = EffectHelper.getPotionEffectString(effect.getPotionEffect());
    _builder.append(_potionEffectString_3, "\t");
    _builder.append(").update(new MobEffectInstance(");
    String _potionEffectString_4 = EffectHelper.getPotionEffectString(effect.getPotionEffect());
    _builder.append(_potionEffectString_4, "\t");
    _builder.append(", ");
    double _duration_1 = effect.getDuration();
    double _multiply_1 = (_duration_1 * 20);
    _builder.append(((int) _multiply_1), "\t");
    _builder.append(", ");
    int _level_2 = effect.getLevel();
    _builder.append(_level_2, "\t");
    _builder.append(" - 1, ");
    boolean _isVisible_3 = effect.isVisible();
    _builder.append(_isVisible_3, "\t");
    _builder.append(", ");
    boolean _isVisible_4 = effect.isVisible();
    _builder.append(_isVisible_4, "\t");
    _builder.append(", ");
    boolean _isVisible_5 = effect.isVisible();
    _builder.append(_isVisible_5, "\t");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
