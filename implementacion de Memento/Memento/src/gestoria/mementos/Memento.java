package gestoria.mementos;

public class Memento {
	private String estadoDeHambre;
	
	public Memento (String estadoDeHambre) {
		this.estadoDeHambre = estadoDeHambre;
	};
	
	public String getEstadoDeHambre() {return this.estadoDeHambre;};
	
}
