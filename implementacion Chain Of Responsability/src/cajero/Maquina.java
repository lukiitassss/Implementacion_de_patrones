package cajero;

import eslabones.ExpendedorBillete10;
import eslabones.ExpendedorBillete100;
import eslabones.ExpendedorBillete5;
import eslabones.ExpendedorBillete50;

public class Maquina {
	private ExpendedorBillete100 de100 = new ExpendedorBillete100();
	private ExpendedorBillete50 de50 = new ExpendedorBillete50();
	private ExpendedorBillete10 de10 = new ExpendedorBillete10();
	private ExpendedorBillete5 de5 = new ExpendedorBillete5();

	public Maquina() {
		de100.agregarSiguiente(de50);
		de50.agregarSiguiente(de10);
		de10.agregarSiguiente(de5);
		de5.agregarSiguiente(null);
	}
	
	public void ExtraerDinero (int importe) {
		System.out.println("Usted quiere extraer: "+ String.valueOf(importe));
		System.out.println("Procesando Operacion");
		de100.procesar(importe);
	}
	
	
	
	
}
