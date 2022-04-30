package camino.en.mapa;
import caminos.IRuta;

public class ElegirCamino {

	private IRuta miRuta;
	

	public  void setCamino (IRuta ruta) {
		this.miRuta=ruta;
		
	};
	
	public void ejecutarCalcular (int origen, int destino) {
		miRuta.calcular(origen, destino);
	};
}
