package cliente;

import elementos.TextoNegrita;
import elementos.TextoNormal;
import elementos.TextoSubrayado;
import visitantes.Holograma;
import visitantes.Pantalla;
import visitantes.Proyector;

public class Main {

	public static void main(String[] args) {
		//mis tipos de texto
		TextoNegrita tne = new TextoNegrita();
		tne.setTexto("¡Hola Mundo!");
		TextoNormal tno = new TextoNormal();
		tno.setTexto("¡Hola Mundo!");
		TextoSubrayado ts = new TextoSubrayado();
		ts.setTexto("¡Hola Mundo!");
		
		//donde muestros los textos
		Holograma h = new Holograma();
		Pantalla pa = new Pantalla();
		Proyector pr = new Proyector();
		String mostrar = tne.aceptar(h);
		System.out.println(mostrar);
		mostrar = tne.aceptar(pr);
		System.out.println(mostrar);
		mostrar = ts.aceptar(pa);
		System.out.println(mostrar);
	}

}
