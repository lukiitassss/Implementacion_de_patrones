package coleccion;

import iterador.Iterator;

public interface IRegistroCliente {

	void InsertarCliente(String nombre, String apellido, String direccion);
    Cliente MostrarInformacionCliente(int indice);
    Iterator ObtenerIterator();
	
}
