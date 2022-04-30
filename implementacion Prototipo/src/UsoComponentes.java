
public class UsoComponentes {
	
	private Producto componente;
	
	private String nombre;
	
	private int cantidadAUsar;
	
	public UsoComponentes(Producto componente, int cant) {
		this.componente = componente;
		this.cantidadAUsar = cant;
	}
	
	public String getNombre() {
		return componente.getNombre();
	}
	
	public void cambiarCantidad(int cantidad) {
		this.cantidadAUsar = cantidad;
	}
	
	public Double obtenerPrecioCosto() {
		return cantidadAUsar * componente.obtenerPrecioCosto();
	}
	
}
