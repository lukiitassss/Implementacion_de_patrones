package un.lado.del.puente;

import otro.lado.del.puente.IColores;

public class Triangulo extends Formas {
private String grosorLinea="normal";
	

public Triangulo (IColores color,String linea) {
	super(color);
	this.grosorLinea=linea;
}
@Override
public void mostrarForma() {
	System.out.println("Soy un TRIANGULO de linea: "+grosorLinea);
	
}
}
