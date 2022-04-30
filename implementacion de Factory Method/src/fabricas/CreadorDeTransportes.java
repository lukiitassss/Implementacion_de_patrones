package fabricas;

import transporte.Auto;
import transporte.Avion;
import transporte.Barco;
import transporte.ITransporte;

public class CreadorDeTransportes extends Creador{

	@Override
	public ITransporte crearTransporte(int opcion) {
		 ITransporte transporteAux=null;
		 if (opcion==1) {//si la opcion ingresada es 1 devolvemos un avion
			 transporteAux = new Avion();
		 }else if (opcion==2) {//si la opcion ingresada es 1 devolvemos un auto
			 transporteAux = new Auto();
		 }
		 else if (opcion==3) {//si la opcion ingresada es 1 devolvemos un barco
			 transporteAux = new Barco();
		 }
		 return transporteAux;
	}
 


}
