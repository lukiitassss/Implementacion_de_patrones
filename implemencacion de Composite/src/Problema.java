import java.util.ArrayList;

import entidades.Producto;
import entidades.ProductoCompuesto;
import entidades.Vendible;

public class Problema {

	public static void main(String[] args) {
		ArrayList<Vendible> catalogo = new ArrayList<>();
//agregamos unos productos a nuestro catalogo
		catalogo.add(new Producto ("1000", "puerta de madera", 4000.00));
		catalogo.add(new Producto ("1001", "ventana de madera", 5000.00));
		catalogo.add(new Producto ("1002", "reja de hierro", 8000.00));
		catalogo.add(new Producto ("1003", "rollo plastico", 2000.00));
		for (Vendible p: catalogo ) {
			((Producto)p).comprar(10);
			System.out.println(p);
		}
		System.out.println("-------------------------");
		catalogo.get(0).vender(5);
		System.out.println("vendi");
		ProductoCompuesto c = new ProductoCompuesto  ("1004", "puerta de madera + ventana de madera", 0.00);
		c.add(catalogo.get(0));
		c.add(catalogo.get(1));
		catalogo.add(c);
		for (Vendible p: catalogo ) {
			System.out.println(p);
		}
		System.out.println("-------------------------");
		c.vender(2);
		System.out.println("vendi");
		for (Vendible p: catalogo ) {
			System.out.println(p);}
		
		System.out.println("-------------------------");
		ProductoCompuesto d = new ProductoCompuesto  ("1005", "puerta de madera + ventana de madera+reja e hierro", 0.00);
		d.add(catalogo.get(4));
		d.add(catalogo.get(2));
		catalogo.add(d);
		for (Vendible p: catalogo ) {
			System.out.println(p);}
		System.out.println("-------------------------");
		d.vender(1);
		System.out.println("vendi");
		for (Vendible p: catalogo ) {
			System.out.println(p);}
		
	}

}
