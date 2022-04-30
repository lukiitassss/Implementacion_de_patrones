package director;

import constructores.EmpanadaBuilder;
import productos.Empanada;

public class Director {

	private EmpanadaBuilder builder;
	
	public Director(EmpanadaBuilder builder)
    {
        this.builder = builder;
    }
	public void ConstruirEmpanada()
    {
        // Construimos la empanada definiendo el orden del proceso
        builder.definirTipoEmpanada();
        builder.definirCondimentos();
        builder.definirIngredientes();
        builder.definirTipoCoccion();
        builder.definirExtras();
        
    }
	public Empanada gerEmpanada()
    {
        return builder.getEmpanada();
    }
	
	
	
}
