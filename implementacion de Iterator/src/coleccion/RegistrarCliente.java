package coleccion;

import java.util.ArrayList;

import iterador.Iterator;
import iterador.IteratorCliente;

public class RegistrarCliente implements IRegistroCliente {

	 private ArrayList<Cliente> misClientes;
	 public RegistrarCliente()
	    {
	        this.misClientes = new ArrayList<Cliente>();
	    }
	
	@Override
	public void InsertarCliente(String nombre, String apellido, String direccion) {
		Cliente c = new Cliente(nombre,apellido,direccion);
        misClientes.add(c);
	}

	@Override
	public Cliente MostrarInformacionCliente(int indice) {
		
		return (Cliente)misClientes.get(indice);
	}

	@Override
	public Iterator ObtenerIterator() {
		 return new IteratorCliente(misClientes);
	}

}
