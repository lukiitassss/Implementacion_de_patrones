package cliente;


import fabricas.CrearMuebleHierro;
import fabricas.CrearMueblePino;
import fabricas.FabricaAbstracta;
import muebles.IMesa;
import muebles.ISilla;



public class CreadorDeMuebles {

	public static void main(String[] args) {
		//primero la idea es crear vehiculos de marca Bmw
		FabricaAbstracta fabricaMueblesPino = new CrearMueblePino();
		ISilla miSilla;
		IMesa miMesa;
		miSilla = fabricaMueblesPino.crearUnaSilla();
		miSilla.cantidadPatas();
		miSilla.tapizado();
		miSilla.tipoMaterial();
		miMesa = fabricaMueblesPino.crearUnaMesa();
		miMesa.tipoMaterial();
		miMesa.alto();
		miMesa.ancho();
		miMesa.largo();
		//ahora crearemos vehiculos de Honda
		FabricaAbstracta fabricaMueblesHierro = new CrearMuebleHierro();
		miSilla = fabricaMueblesHierro.crearUnaSilla();
		miSilla.cantidadPatas();
		miSilla.tapizado();
		miSilla.tipoMaterial();
		miMesa = fabricaMueblesHierro.crearUnaMesa();
		miMesa.tipoMaterial();
		miMesa.alto();
		miMesa.ancho();
		miMesa.largo();
	}

}
