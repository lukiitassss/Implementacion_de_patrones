package fabricas;

import muebles.IMesa;
import muebles.ISilla;
import muebles.MesaPino;
import muebles.SillaPino;

public class CrearMueblePino extends FabricaAbstracta {

	@Override
	public ISilla crearUnaSilla() {
		return new SillaPino();
	}

	@Override
	public IMesa crearUnaMesa() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new MesaPino();
	}

}
