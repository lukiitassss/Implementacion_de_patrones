package cliente;

import otro.lado.del.puente.ColorVerde;
import otro.lado.del.puente.IColores;
import un.lado.del.puente.Formas;
import un.lado.del.puente.Triangulo;

public class Main {

	public static void main(String[] args) {
		IColores colores = new ColorVerde();
		Formas triangulo = new Triangulo(colores,"gruesa");
		triangulo.mostrarForma();
		triangulo.pintando();

	}

}
