package personas;

import gestoria.mementos.Memento;

public class Persona {
	private String nombre;
	private String hambre;
	
	public Memento guardarEstado () {
		System.out.println("Guardando el estado de hambre");
		return new Memento(hambre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadoDeHambre() {
		return hambre;
	}

	public void setEstadoDeHambre(String hambre) {
		this.hambre = hambre;
	};
	
	

}
