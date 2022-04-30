package constructores;

import productos.Coccion;
import productos.Empanada;
import productos.Ingredientes;
import productos.Tamaño;

public class Carne extends EmpanadaBuilder {

	@Override
	public void definirTipoEmpanada() {
		e = new Empanada();
		e.nombre="Empanada de Carne";
				
	}

	@Override
	public void definirCondimentos() {
		e.condimentos.add("Sal");
		e.condimentos.add("Condimento para pizza");
		e.condimentos.add("Oregano");
	
	}

	@Override
	public void definirIngredientes() {
		e.ingredientes.add(Ingredientes.ACEITUNA);
		e.ingredientes.add(Ingredientes.CARNE);
		e.ingredientes.add(Ingredientes.CEBOLLA);
		e.ingredientes.add(Ingredientes.CEBOLLA_DE_VERDEO);
		
	}

	@Override
	public void definirTipoCoccion() {
		e.tipoCoccion = Coccion.AL_HORNO;
		
	}

	@Override
	public void definirExtras() {
		e.repulgue="Repulgue de Carne";
		e.tamaño = Tamaño.GRANDE;
		
	}

}
