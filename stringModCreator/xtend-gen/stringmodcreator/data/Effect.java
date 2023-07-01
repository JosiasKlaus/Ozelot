package stringmodcreator.data;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Effect {
  public Effect(final PotionEffects potionEffects, final int level, final int duration, final boolean visible) {
    this.potionEffects = potionEffects;
    this.level = level;
    this.duration = duration;
    this.visible = visible;
  }

  private PotionEffects potionEffects;

  private int level;

  private int duration;

  private boolean visible;

  @Pure
  public PotionEffects getPotionEffects() {
    return this.potionEffects;
  }

  public void setPotionEffects(final PotionEffects potionEffects) {
    this.potionEffects = potionEffects;
  }

  @Pure
  public int getLevel() {
    return this.level;
  }

  public void setLevel(final int level) {
    this.level = level;
  }

  @Pure
  public int getDuration() {
    return this.duration;
  }

  public void setDuration(final int duration) {
    this.duration = duration;
  }

  @Pure
  public boolean isVisible() {
    return this.visible;
  }

  public void setVisible(final boolean visible) {
    this.visible = visible;
  }
}
