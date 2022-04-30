package entidades;

public interface Vendible {

	String getCodigo();

	String getNombre();

	void setNombre(String nombre);

	Double getPrecio();

	void setPrecio(Double precio);

	Integer getStock();

	void vender(Integer stock);

	void comprar(Integer stock);

	String toString();

}