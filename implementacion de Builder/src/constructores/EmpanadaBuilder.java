package constructores;

import productos.Empanada;

public abstract class EmpanadaBuilder {

	protected Empanada e;
	
	public	Empanada getEmpanada() {return this.e;};
	
	 public abstract void definirTipoEmpanada();
	 public abstract void definirCondimentos();
	 public abstract void definirIngredientes();
	 public abstract void definirTipoCoccion();
	 public abstract void definirExtras();	
	
	
}
