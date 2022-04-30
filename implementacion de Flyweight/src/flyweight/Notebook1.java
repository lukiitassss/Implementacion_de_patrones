package flyweight;

public class Notebook1 extends Notebook{

	public Notebook1(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}
	@Override
	public void mostrarCaracteristicas(String datosExtra) {
		super.mostrarCaracteristicas(datosExtra + "\n"+"Base");
	}
	
	
}
