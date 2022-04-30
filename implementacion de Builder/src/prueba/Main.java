package prueba;

import constructores.Carne;
import constructores.Humita;
import director.Director;
import productos.Empanada;

public class Main {

	public static void main(String[] args) {

		// Definimos un director, pas�ndole un constructor de empanada de carne como par�metro
		Director directorHumita = new Director(new Humita());
		directorHumita.ConstruirEmpanada();
		Empanada humita = directorHumita.gerEmpanada();
		// Definimos un director, pas�ndole un constructor de empanada de carne como par�metro
		
		Director directorCarne = new Director(new Carne());
		directorCarne.ConstruirEmpanada();
		Empanada carne = directorCarne.gerEmpanada();
		
		System.out.println("Vamos a mostrar la creacion de una empanada choclo (humita)");
		System.out.println(humita.mostrarEmpanada());
		System.out.println("Vamos a mostrar la creacion de una empanada carne");
		System.out.println(carne.mostrarEmpanada());
		
	}

}
