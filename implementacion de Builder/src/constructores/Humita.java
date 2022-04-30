package constructores;

import productos.Coccion;
import productos.Empanada;
import productos.Ingredientes;
import productos.Tamaño;

public class Humita extends EmpanadaBuilder {

	@Override
	public void definirTipoEmpanada() {
		e = new Empanada();
		e.nombre="Humita";
				
	}

	@Override
	public void definirCondimentos() {
		e.condimentos.add("Sal");
	
	}

	@Override
	public void definirIngredientes() {
		e.ingredientes.add(Ingredientes.QUESO);
		e.ingredientes.add(Ingredientes.CHOCLO);
		
	}

	@Override
	public void definirTipoCoccion() {
		e.tipoCoccion = Coccion.AL_HORNO;
		
	}

	@Override
	public void definirExtras() {
		e.repulgue="Repulgue de Humita";
		e.tamaño = Tamaño.MEDIANA;
		
	}

}
