package decorador;

import componente.ComidaRapida;

public class Mayonesa extends Condimento {

	public Mayonesa(ComidaRapida comida) {
		super(comida);

	}

	@Override
	public String getContenido() {		
		return super.getContenido()+ "con aderezo de mayoneza ";
	}

}
