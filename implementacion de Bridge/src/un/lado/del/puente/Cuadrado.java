package un.lado.del.puente;

import otro.lado.del.puente.IColores;

public class Cuadrado extends Formas {
private String grosorLinea;
	

public Cuadrado (IColores color,String linea) {
	super(color);
	this.grosorLinea=linea;
}
@Override
public void mostrarForma() {
	System.out.println("Soy un CUADRADO de linea: "+grosorLinea);
	
}
}
