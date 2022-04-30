package muebles;

public class SillaHierro implements ISilla {

	@Override
	public void tipoMaterial() {
		System.out.println("mi material es hierro ");
		
	}

	@Override
	public void cantidadPatas() {
		System.out.println("poseo 4 patas");
		
	}

	@Override
	public void tapizado() {
		System.out.println("tengo tapizado de cuerina");
		
	}

}
