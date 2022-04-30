package comandos;

public class PrenderAuto implements ICommand {

	@Override
	public void excecute() {
		System.out.println("Se prendio el auto");
	}

}
