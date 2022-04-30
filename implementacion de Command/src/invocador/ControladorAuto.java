package invocador;

import comandos.ICommand;

public class ControladorAuto implements IInvoker {
	ICommand comando;
	@Override
	public void setCommand(ICommand command) {
		this.comando=command;

	}

	@Override
	public void invoke() {
		comando.excecute();

	}

}
