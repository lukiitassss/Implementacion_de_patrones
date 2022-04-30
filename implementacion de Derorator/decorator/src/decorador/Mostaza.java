package decorador;

import componente.ComidaRapida;

public class Mostaza extends Condimento {

	public Mostaza(ComidaRapida comida) {
		super(comida);
	}
	public String getContenido() {		
		return super.getContenido()+ "con aderezo de mostaza ";
	}
}
