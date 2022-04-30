package invocador;

import comandos.ICommand;

public interface IInvoker {
	  void setCommand(ICommand command);
	  void invoke();
}
