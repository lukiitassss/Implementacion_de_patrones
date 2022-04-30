package flyweight;

public class Notebook2 extends Notebook{

	public Notebook2(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}
	@Override
	public void mostrarCaracteristicas(String datosExtra) {
		super.mostrarCaracteristicas(datosExtra+ "\n"+"Estandar");
	}
	
	
}
