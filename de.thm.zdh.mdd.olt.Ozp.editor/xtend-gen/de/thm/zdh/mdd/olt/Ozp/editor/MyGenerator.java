package de.thm.zdh.mdd.olt.Ozp.editor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class MyGenerator extends AbstractHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    InputOutput.<String>println("Generator started!");
    return null;
  }
}
