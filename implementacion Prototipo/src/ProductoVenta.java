import java.util.ArrayList;

public class ProductoVenta extends Producto {

	private Double precioVenta = 1.5;
	
	ArrayList<UsoComponentes> componentes  = new ArrayList<>();
	
	public ProductoVenta(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	
	public ProductoVenta(ProductoVenta copia) {
		this.nombre = copia.getNombre();
		this.codigo = copia.getCodigo();
		this.componentes = copia.getComponentes();
	}
	
	
	@Override
	public ProductoClonable clonar() {
		return new ProductoVenta(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public ArrayList<UsoComponentes> getComponentes(){
		return componentes;
	}
	
	public Double getPrecioVenta() {
		return precioVenta;
	}
	
	public void agregarComponente(Producto componente, int cantidad) {
		this.componentes.add(new UsoComponentes(componente, cantidad));
	}

	
	public void cambiarCantidadComponente(Componente componente, int cantidadNueva ) {
		for (UsoComponentes comp : componentes) {
			if (comp.getNombre() == componente.getNombre()) {
				comp.cambiarCantidad(cantidadNueva);			
			}
		}
	}
	
	public void eliminarComponente(Componente componente) {
		for (UsoComponentes comp : componentes) {
			if (comp.getNombre() == componente.getNombre()) {
				componentes.remove(componente);		
			}
		}
	}
	
	
	public Double calcularPrecio() {
		Double precio = 0.0;
		for (UsoComponentes comp : componentes) {
			precio += comp.obtenerPrecioCosto();
		}
		return precio * precioVenta;
	}

	@Override
	public void agregarMateriaPrima(MateriaPrima materiaPrima, int cantidad) {
		//no hace nada, lo agregué por la herencia
	}


	@Override
	public String toString() {
		return "ProductoVenta [Nombre= " + this.nombre + ", precio de Venta= "  + calcularPrecio() + "]";
	}


	@Override
	public Double obtenerPrecioCosto() {
		return null;
	}
	
	public void cambiarGanancia(Double ganancia) {
		this.precioVenta = ganancia;
	}


	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
		
	}



}
