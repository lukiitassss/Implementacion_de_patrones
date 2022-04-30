package cliente;

import adaptador.Calculadora;
import adaptador.IAdaptador;

public class Main {

	public static void main(String[] args) {
		IAdaptador miCalculadora = new Calculadora();
		int aux = miCalculadora.restar(2, 1);
		System.out.println("implementacion de la propia clase");
		System.out.println(aux);
		aux = miCalculadora.multiplicar(2, 2);//ESTA CLASE FUE ADAPTADA
		System.out.println("implementacion de la clase adaptada");
		System.out.println(aux);
	}

}
