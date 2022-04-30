package app;

import componente.ComidaRapida;
import componente.Hamburguesa;
import decorador.Mayonesa;
import decorador.Mostaza;

public class ProbarDecorador {

	public static void main(String[] args) {
		ComidaRapida hambuguesa = new Hamburguesa();
		System.out.println(hambuguesa.getContenido());
		hambuguesa = new Mayonesa(hambuguesa);
		System.out.println(hambuguesa.getContenido());
		hambuguesa = new Mostaza(hambuguesa);
		System.out.println(hambuguesa.getContenido());
		hambuguesa = new Mayonesa(hambuguesa);
		System.out.println(hambuguesa.getContenido());
	}

}
