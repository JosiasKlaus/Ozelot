package stringmodcreator.data;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Translation {
  public Translation(final String lang, final String name, final String description) {
    this.lang = lang;
    this.name = name;
    this.description = description;
  }

  private String lang;

  private String name;

  private String description;

  @Pure
  public String getLang() {
    return this.lang;
  }

  public void setLang(final String lang) {
    this.lang = lang;
  }

  @Pure
  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Pure
  public String getDescription() {
    return this.description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }
}
