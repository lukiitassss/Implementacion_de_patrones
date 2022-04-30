package fabricas;

import transporte.Auto;
import transporte.Avion;
import transporte.Barco;
import transporte.ITransporte;

public abstract class Creador {
	
 public abstract ITransporte crearTransporte(int opcion);
	
}
