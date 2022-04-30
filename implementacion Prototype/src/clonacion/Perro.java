package clonacion;

public class Perro extends Animal{
	
	public String pelo;
	
	
	
	public Perro() {};
	
	 public Perro (Perro unperro) {
	        super(unperro);
	        if (unperro != null) {
	            this.pelo = unperro.pelo;
	        }
	    }

	
	
	@Override
	public Animal clone() {
		return new Perro(this);
	}
	
	@Override
	public String toString() {
		
		return "Pelo: " + this.pelo + ", Nombre: " + this.nombre + ", Patas: " + String.valueOf(this.cantidadPatas) + ", Sonido: " + this.sonido + "Vuela?: "+String.valueOf(this.vuela);
		
	};

}
