package iterador;

import java.util.ArrayList;

import coleccion.Cliente;

public class IteratorCliente implements Iterator {
	private ArrayList clientes;
	private int posicionActual = -1;
	
	public IteratorCliente(ArrayList listado)
    {
        this.clientes = listado;
    }
	
	@Override
	public Cliente Actual() {
		if ((this.clientes == null) || 
		        (this.clientes.size() == 0) || 
		        (posicionActual > this.clientes.size() - 1) ||
		        (this.posicionActual < 0))
		        return null;
		 
		    // Devolvemos el elemento correspondiente al elemento actual
		    else
		        return (Cliente) this.clientes.get(posicionActual);
	}
	
	
	@Override
	public void Primero() {
		// este metodo reinicia el recorrido
		this.posicionActual=-1;
	}
	
	
	
	@Override
	public Cliente Siguiente() {
	    // Si no existen elementos, devolveremos null.
	    // Si el indice siguiente es mayor que el mayor indice aceptable, devolveremos null.
	    if ((this.clientes == null) || 
	        (this.clientes.size() == 0) || 
	        (posicionActual + 1 > this.clientes.size() - 1))
	        return null;
	 
	    // Aumentamos el índice en una unidad y devolvemos ese elemento
	    else
	    {this.posicionActual += 1;
	        return (Cliente)this.clientes.get(posicionActual);}
	}
	
	

	@Override
	public boolean QuedanElementos() {
		return (posicionActual + 1 <= this.clientes.size() - 1);
	}

	

}
