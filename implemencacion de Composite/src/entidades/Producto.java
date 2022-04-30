package entidades;

public class Producto implements Vendible {
	private String codigo;
	private String nombre;
	private Double precio;
	private Integer stock=0;
	public Producto(String codigo, String nombre, Double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	@Override
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public Double getPrecio() {
		return precio;
	}
	@Override
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public Integer getStock() {
		return stock;
	}
	@Override
	public void vender(Integer stock) {
		this.stock -= stock;
	}
	
	@Override
	public void comprar (Integer stock) {
		this.stock += stock;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
}
