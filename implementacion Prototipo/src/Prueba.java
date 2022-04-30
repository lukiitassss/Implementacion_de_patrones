
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo 2 materias primas, leche y chocolate
		MateriaPrima leche = new MateriaPrima("leche", 001, 10.0);
		MateriaPrima chocolateEnPolvo = new MateriaPrima("Chocolate en polvo", 002, 5.0);
		
		//creo la leche chocolatada (componente)
		Componente lecheChocolatada = new Componente("Leche chocolatada", 001);
		
		//agrego la materia prima con la que se crea la leche chocolatada, tambien se pordría agregar mediante el constructor pero elegí con metodo
		lecheChocolatada.agregarMateriaPrima(leche, 5);
		lecheChocolatada.agregarMateriaPrima(chocolateEnPolvo, 2);
		
		//lo mismo que con el componente, creo el producto venta y agrego sus componentes
		ProductoVenta chocolatadaChica = new ProductoVenta("Chocolatada 250 ml", 001);
		
		chocolatadaChica.agregarComponente(lecheChocolatada, 1);
		
		//muestro info general
		System.out.println(chocolatadaChica.toString());
		
		//clono la leche chocolatada chica en un nuevo objeto para modificarlo
		ProductoVenta chocolatadaGrande = (ProductoVenta) chocolatadaChica.clonar();
		chocolatadaGrande.cambiarNombre("Chocolatada 1 L");
		chocolatadaGrande.cambiarCantidadComponente(lecheChocolatada, 4);
		chocolatadaGrande.cambiarGanancia(1.3); // por defecto 1.5, la bajo porque si es mas grande debería costar un poco mas barato que la suma de las mas chicas
												//tambien se puede eliminar un componente o una matería prima de un objeto, pero no llegué a probarlo
		
		
		//muestro info despues del cambio
		System.out.println(chocolatadaGrande.toString());
		
		
		
	}

}
