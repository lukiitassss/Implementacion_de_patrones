package factory;


import java.util.HashMap;

import flyweight.Notebook;
import flyweight.Notebook1;
import flyweight.Notebook2;
import flyweight.Notebook3;

public class FactoryNotebook {
	private static HashMap<String, Notebook> pool = new HashMap<String,Notebook>();

	
	  public static Notebook setNotebook(String marca, String modelo, String color)
	    {
	        Notebook n = null;
	 
	        // Si el modelo ya ha sido creado anteriormente, se recupera del pool
	        if (pool.containsKey(modelo))
	        {
	            n = pool.get(modelo);
	            System.out.println("Datos recuperados del pool: "+"\n"+n.toString());
	        }
	 
	        // En caso de que no exista, se instancia un nuevo objeto y se a�ade al pool.
	        // Las pr�ximas ocasiones en las que el objeto sea utilizado, se devolver� una referencia
	        // al objeto existente, evitando ocupar m�s memoria en crear una nueva instancia
	        else
	        {
	            // Dependiendo de alg�n par�metro (por ejemplo, si el modelo tiene el sufijo 'sport'), se
	            // instanciar� una clase u otra.
	            if (modelo.equals("1"))
	                n = new Notebook1(marca, modelo, color);
	            else {if (modelo.equals("2"))
	            		n = new Notebook2(marca, modelo, color);
	            else
	            	n = new Notebook3(marca, modelo, color);
	            }
	 
	            // Se a�ade el objeto al pool: las sucesivas llamadas usar�n este objeto en lugar de
	            // instanciar uno nuevo
	            pool.put(modelo, n);
	           System.out.println("Se ingreso una notebook: "+"\n"+n.toString());
	        }
	 
	        return n;
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
