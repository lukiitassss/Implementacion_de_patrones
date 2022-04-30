package cliente;

import coleccion.Cliente;
import coleccion.IRegistroCliente;
import coleccion.RegistrarCliente;
import iterador.Iterator;

public class Main {

	public static void main(String[] args) {
		//cargamos mis elementos
		IRegistroCliente cliente = new RegistrarCliente();
		cliente.InsertarCliente("juan", "perez", "lejos lejos donde cago el conejo");
		cliente.InsertarCliente("tomy", "rumbai de fiesta", "en la aca");
		cliente.InsertarCliente("melu", "ramos", "en la casa llena de perros");
		Iterator iterador = cliente.ObtenerIterator();
		while (iterador.QuedanElementos()) {
			Cliente c = iterador.Siguiente();
			System.out.println(c.mostrarDatos());
		}
	}
}
