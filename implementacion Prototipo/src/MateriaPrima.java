
public class MateriaPrima {
	
	private Double precio;
	private int codigo;
	private String nombre;
	
	
	public MateriaPrima(String nombre, int codigo, Double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;	
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public Double getPrecio() {
		return precio;
	}


	public void cambiarPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
