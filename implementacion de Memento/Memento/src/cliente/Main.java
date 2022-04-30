package cliente;

import gestoria.mementos.AdministradorDeMementos;
import personas.Persona;

public class Main {

	public static void main(String[] args) {
		AdministradorDeMementos miAdministrador = new AdministradorDeMementos();
		Persona miPersona = new Persona();
		miPersona.setNombre("pepe");
		miPersona.setEstadoDeHambre("Con hambre");//primer estado de hambre de pepe 
		System.out.println("La persona es: "+miPersona.getNombre() +" Aun no comio, entonces su estado de hambre es: "+miPersona.getEstadoDeHambre());
		miAdministrador.agregarEstado(miPersona.guardarEstado());
		miPersona.setEstadoDeHambre("Satisfecho");//hora pepe comio
		System.out.println(miPersona.getNombre() +" Ya comio, entonces su estado de hambre es: "+miPersona.getEstadoDeHambre());
		miAdministrador.agregarEstado(miPersona.guardarEstado());
		miPersona.setEstadoDeHambre("Lleno");//como  pepe siguio comuiendo ahora esta lleno
		System.out.println(miPersona.getNombre() +" Siguio comiendo, entonces su estado de hambre es: "+miPersona.getEstadoDeHambre());
		miAdministrador.agregarEstado(miPersona.guardarEstado());
		System.out.println(miPersona.getNombre()+" Ahora no recuersa como se sentia antes de estar en el estado "+miPersona.getEstadoDeHambre());
		System.out.println("Para ayudarle a recordad podemos recurrir al ultimo estado de hambre que tenia antes del actual");
		System.out.println("Su estado anterior al actual era: "+ miAdministrador.recuperarEstado(miAdministrador.cantidadDeEstados()-2/*porque -1 obtengo el ultimo*/).getEstadoDeHambre());
		miPersona.setEstadoDeHambre(miAdministrador.recuperarEstado(0).getEstadoDeHambre());
		System.out.println("A pasado todo un dia asi que el estado de "+miPersona.getNombre()+" a vuelto al estado "+miPersona.getEstadoDeHambre());
		
		
		

	}

}
