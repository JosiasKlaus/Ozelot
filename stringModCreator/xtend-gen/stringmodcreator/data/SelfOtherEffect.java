package stringmodcreator.data;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class SelfOtherEffect extends Effect {
  public SelfOtherEffect(final PotionEffects potionEffects, final int level, final int duration, final boolean visible, final boolean isSelf) {
    super(potionEffects, level, duration, visible);
    this.isSelf = isSelf;
  }

  private boolean isSelf;

  @Pure
  public boolean isSelf() {
    return this.isSelf;
  }

  public void setIsSelf(final boolean isSelf) {
    this.isSelf = isSelf;
  }
}
