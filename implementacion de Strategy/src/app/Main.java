package app;

import camino.en.mapa.ElegirCamino;
import caminos.APie;
import caminos.EnAuto;

public class Main {

	public static void main(String[] args) {
		CambiarDeCamino miCamino = new CambiarDeCamino();
		//el cliente eligui ir a pie en la siguiente ruta
		miCamino.caminoAPie();
		miCamino.calcular(1, 10);
		//ahora el cliente elige ir en auto en la siguiente ruta
		miCamino.caminoEnAuto();
		miCamino.calcular(1, 20);
	}

}
