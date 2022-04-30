
public class UsoMateriaPrima {
	
	private MateriaPrima materiaPrima;
	
	private String nombre;
	
	private int cantidadAUsar;
	
	public UsoMateriaPrima(MateriaPrima materiaPrima, int cant) {
		this.materiaPrima = materiaPrima;
		this.cantidadAUsar = cant;
	}
	
	public String getNombre() {
		return materiaPrima.getNombre();
	}
	
	
	public void cambiarCantidad(int cantidad) {
		this.cantidadAUsar = cantidad;
	}
	
	public Double obtenerPrecioCosto() {
		return (cantidadAUsar * materiaPrima.getPrecio());
	}
}