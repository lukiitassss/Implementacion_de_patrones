package un.lado.del.puente;

import otro.lado.del.puente.IColores;

public abstract class Formas {
private IColores colores;
public Formas (IColores color) {this.colores=color;}
public void pintando () {colores.pintar();}
public abstract void mostrarForma ();
	
}
