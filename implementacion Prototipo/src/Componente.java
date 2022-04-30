import java.util.ArrayList;

public class Componente extends Producto {
	

	ArrayList<UsoMateriaPrima> materiaPrima = new ArrayList<>();
	
	public Componente(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public Componente(Componente copia) {
		this.nombre = copia.getNombre();
		this.codigo= copia.getCodigo();
		this.materiaPrima = copia.getMateriaPrima();
	}
	
	public ProductoClonable clonar() {
		return new Componente(this);
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
	public void agregarMateriaPrima(MateriaPrima materiaPrima, int cantidad) {
		this.materiaPrima.add(new UsoMateriaPrima(materiaPrima, cantidad));
	}

	public ArrayList<UsoMateriaPrima> getMateriaPrima() {
		return materiaPrima;
	}
	
	
	public void cambiarCantidadMateriaPrima(MateriaPrima matPrima, int cantidadNueva ) {
		for (UsoMateriaPrima mp : materiaPrima) {
			if (mp.getNombre() == matPrima.getNombre()) {
				mp.cambiarCantidad(cantidadNueva);			
			}
		}
	}

	public void eliminarMateriaPrima(MateriaPrima matPrima) {
		for (UsoMateriaPrima mp : materiaPrima) {
			if (mp.getNombre() == matPrima.getNombre()) {
				materiaPrima.remove(matPrima);		
			}
		}
	}
	
	
	@Override
	public void agregarComponente(Producto componente, int cantidad) {
		//no hace nada, lo agregué por la herencia
	}
	
	@Override
	public Double obtenerPrecioCosto() {
		Double precio = 0.0;
		for (UsoMateriaPrima mp : materiaPrima) {
			precio += mp.obtenerPrecioCosto();
		}
		return precio;
	}
	
}
