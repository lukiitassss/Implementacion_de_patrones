package visitantes;

import elementos.TextoNegrita;
import elementos.TextoNormal;
import elementos.TextoSubrayado;

public class Pantalla implements IVisitante {
	private final String tipoVista = " Mostrando por Pantalla";
	@Override
	public String visitar(TextoNegrita t) {

		return t.getTexto()+ tipoVista;
	}

	@Override
	public String visitar(TextoNormal t) {
		return t.getTexto()+ tipoVista;
	}

	@Override
	public String visitar(TextoSubrayado t) {
		return t.getTexto()+ tipoVista;
	}

}
