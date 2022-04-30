package entidades;

import java.util.ArrayList;

public class ProductoCompuesto implements Vendible {
	private String codigo;
	private String nombre;
	private Double precio=0.0;//en realidad es al precio de mis partes lo multiplico por este porcentaje de descuento
	private ArrayList<Vendible> misPartes= new ArrayList<>();//de esta manera puedo apilar promos y no solo productos
	public ProductoCompuesto(String codigo, String nombre, Double descuento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = descuento;
	}
	
	public void add(Vendible element) {
		misPartes.add( element);
	}

	public Vendible remove(int index) {
		return misPartes.remove(index);
	}

	public void clear() {
		misPartes.clear();
	}

	@Override
	public String getCodigo() {
		return codigo;
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
		Double suma=0.0;
		for (Vendible v: misPartes) {
			suma += v.getPrecio();
		}
		if (this.precio>0) {
			suma -= suma* (this.precio /100);
		}
		return suma;
	}
	@Override
	public void setPrecio(Double precio) {
		
		this.precio = precio;
	}
	@Override
	public Integer getStock() {
		int minimo=0;
		if (misPartes.size()>0) {
			minimo = misPartes.get(0).getStock();
		}
		for (Vendible v: misPartes) {
			if (v.getStock()<minimo) {
				minimo=v.getStock();
			}
			
		}
		return minimo;
	}
	@Override
	public void vender(Integer stock) {
		if (this.getStock()>=stock) 			
			for (Vendible v: misPartes)
				v.vender(stock);			  
	}
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + getPrecio() + ", stock=" + getStock() + "]";
	}

	
	public void comprar(Integer stock) {
		// TODO Esbozo de método generado automáticamente
		
	}
	
}
