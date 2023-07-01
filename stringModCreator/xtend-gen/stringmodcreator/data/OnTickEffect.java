package stringmodcreator.data;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class OnTickEffect extends Effect {
  public OnTickEffect(final PotionEffects potionEffects, final int level, final int duration, final boolean visible, final boolean needsSelected) {
    super(potionEffects, level, duration, visible);
    this.needsSelected = needsSelected;
  }

  private boolean needsSelected;

  @Pure
  public boolean isNeedsSelected() {
    return this.needsSelected;
  }

  public void setNeedsSelected(final boolean needsSelected) {
    this.needsSelected = needsSelected;
  }
}
