package app;

import camino.en.mapa.ElegirCamino;
import caminos.APie;
import caminos.EnAuto;
import caminos.EnBici;
import caminos.EnColectivo;
import caminos.IRuta;
//toda esta clase puede estar implementada en ele cliente
public class CambiarDeCamino {
 private ElegirCamino elegirCamino;
 
 public CambiarDeCamino() {elegirCamino = new ElegirCamino();};
 
 public void caminoEnBici()
 {
     IRuta bici = new EnBici();
     elegirCamino.setCamino(bici);
 }

 public void caminoAPie()
 {
     IRuta pie = new APie();
     elegirCamino.setCamino(pie);
 }
 
 public void caminoEnAuto()
 {
     IRuta auto = new EnAuto ();
     elegirCamino.setCamino(auto);
 }
 
 public void caminoEnColectivo()
 {
     IRuta cole = new EnColectivo();
     elegirCamino.setCamino(cole);
 }
 
 public void calcular(int origen, int destino) {
	 elegirCamino.ejecutarCalcular(origen, destino);
 };
 
}
