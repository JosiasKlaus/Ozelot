package de.thm.zdh.mdd.olt.Ozp.editor

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException

class MyGenerator extends AbstractHandler {
	
	override execute(ExecutionEvent event) throws ExecutionException {
		println("Generator started!")
		return null
	}
	
}