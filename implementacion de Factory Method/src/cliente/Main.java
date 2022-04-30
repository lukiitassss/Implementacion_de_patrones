package cliente;


import java.util.Scanner;

import fabricas.Creador;
import fabricas.CreadorDeTransportes;
import transporte.ITransporte;


public class Main {

	public static void main(String[] args) {
		Creador miFabrica= new CreadorDeTransportes() ;
		ITransporte miTransporte;
		boolean b = true;
		Scanner miScanner = new Scanner(System.in);
		String opcion;
		while (b) {
			System.out.println("diganos en que clase de transporte quiere ir");
			System.out.println("1) Avion");
			System.out.println("2) Auto");
			System.out.println("3) Barco");
			System.out.println("0) salir");
			opcion = miScanner.nextLine();
			if (opcion.equals("0")) {
				b=false;
				}
			else { 
				miTransporte = miFabrica.crearTransporte(Integer.parseInt(opcion));
				miTransporte.porDondeVas();
				}
			
		
		}
		System.exit(0);
		miScanner.close();
		
	}

}
