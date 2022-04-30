package muebles;

public class SillaPino implements ISilla {

	@Override
	public void tipoMaterial() {
		System.out.println("mi material es madera de pino");
		
	}

	@Override
	public void cantidadPatas() {
		System.out.println("poseo 5 patas");
		
	}

	@Override
	public void tapizado() {
		System.out.println("no tengo tapizado");
		
	}

}
