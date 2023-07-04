package ozelot.editor.mycommands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class CommandHandler extends AbstractHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    InputOutput.<String>println("Execution triggered!");
    return null;
  }
}
