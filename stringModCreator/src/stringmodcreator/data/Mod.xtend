package stringmodcreator.data

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Mod {
	new(String modId, String name, String description, String author, String iconPath, String version, List<Item> items, List<Block> blocks){
		this.modId = modId
		this.name = name
		this.description = description
		this.author = author
		this.iconPath = iconPath
		this.version = version
		
		this.items = items
		this.blocks = blocks
	}
	
	String modId
	String name
	String description
	String author
	String iconPath
	String version
	
	List<Item> items
	
	List<Block> blocks
	
	
}