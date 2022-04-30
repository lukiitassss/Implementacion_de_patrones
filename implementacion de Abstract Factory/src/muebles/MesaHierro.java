package muebles;

public class MesaHierro implements IMesa {

	@Override
	public void tipoMaterial() {
		System.out.println("soy una mesa de hierro");

	}

	@Override
	public void largo() {
		System.out.println("de lago tengo 2,5mts");

	}

	@Override
	public void ancho() {
		System.out.println("de ancho tengo 1mt");

	}

	@Override
	public void alto() {
		System.out.println("de alto tengo 80cm");

	}

}
