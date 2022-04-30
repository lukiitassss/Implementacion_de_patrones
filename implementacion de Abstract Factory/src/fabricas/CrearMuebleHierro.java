package fabricas;

import muebles.IMesa;
import muebles.ISilla;
import muebles.MesaHierro;
import muebles.SillaHierro;


public class CrearMuebleHierro extends FabricaAbstracta {

	@Override
	public ISilla crearUnaSilla() {
		return new SillaHierro();
	}

	@Override
	public IMesa crearUnaMesa() {
		// TODO Esbozo de método generado automáticamente
		return new MesaHierro();
	}

}
