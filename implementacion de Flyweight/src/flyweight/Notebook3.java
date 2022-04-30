package flyweight;

public class Notebook3 extends Notebook{

	public Notebook3(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}
	@Override
	public void mostrarCaracteristicas(String datosExtra) {
		super.mostrarCaracteristicas(datosExtra+ "\n"+"Gamer");
	}
	
	
}
