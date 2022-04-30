package decorador;

import componente.ComidaRapida;

public abstract class Condimento extends ComidaRapida {
	private ComidaRapida miComida;
	public Condimento (ComidaRapida comida) {
		super();
		this.miComida= comida;
	};
	public String getContenido() {		
		return miComida.getContenido();}
}
