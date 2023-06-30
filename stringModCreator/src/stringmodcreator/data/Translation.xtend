package stringmodcreator.data

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Translation {
	new (String lang, String name, String description){
		this.lang = lang
		this.name = name
		this.description = description
	}
	
	String lang
	String name
	String description
}