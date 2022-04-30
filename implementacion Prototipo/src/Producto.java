
public abstract class Producto implements ProductoClonable {
	
	protected String nombre;
	protected int codigo;
	
	public abstract ProductoClonable clonar();
	
	public abstract void agregarMateriaPrima(MateriaPrima materiaPrima, int cantidad);
	
	public abstract void agregarComponente(Producto componente, int cantidad);

	protected abstract String getNombre();
	
	public abstract Double obtenerPrecioCosto();
}
