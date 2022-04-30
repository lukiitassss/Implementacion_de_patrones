package adaptador;

import clase.extra.ClaseAIncorporar;

public class Calculadora implements IAdaptador {
	ClaseAIncorporar clase =  new ClaseAIncorporar();
	@Override
	public int sumar(int x, int y) {

		return x+y;
	}

	@Override
	public int restar(int x, int y) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return x-y;
	}

	@Override
	public int multiplicar(int x, int y) {
		int aux =(int) clase.multiplicador(x, y);
		return aux;
	}

	@Override
	public float dividir(int x, int y) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return x/y;
	}

}
