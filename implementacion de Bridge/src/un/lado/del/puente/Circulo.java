package un.lado.del.puente;

import otro.lado.del.puente.IColores;

public class Circulo extends Formas {
private String grosorLinea;
	

public Circulo (IColores color,String linea) {
	super(color);
	this.grosorLinea=linea;
}
@Override
public void mostrarForma() {
	System.out.println("Soy un CIRCULO de linea: "+grosorLinea);
	
}
}
