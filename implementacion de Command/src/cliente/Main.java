package cliente;

import java.util.Scanner;

import comandos.ApagarAuto;
import comandos.ApagarLuces;
import comandos.PrenderAuto;
import comandos.PrenderLuces;
import invocador.ControladorAuto;
import invocador.IInvoker;

public class Main {

	public static void main(String[] args) {
		//vamos a crear la lista de nuestros comandos
		ApagarAuto aa = new ApagarAuto();
		ApagarLuces al = new ApagarLuces();
		PrenderAuto pa = new PrenderAuto();
		PrenderLuces pl = new PrenderLuces();
		IInvoker invoker = new ControladorAuto();
		
		Scanner miScanner=new Scanner(System.in);
		boolean b=true;
		int opcion;
		
		while (b) {
			System.out.println("------Programa para constrolar auto-------");
			System.out.println("1) Encender Auto");
			System.out.println("2) Encender Luces");
			System.out.println("3) Apagar Auto");
			System.out.println("4) Apagar Luces");
			System.out.println("");
			System.out.println("0) Salir");
			System.out.println("elija que hacer");
			opcion=miScanner.nextInt();
		
		switch(opcion)
		{
		   
		   case 1 :
			   invoker.setCommand(pa);
			   invoker.invoke();
		    break; 
		   
		   case 2 :
			   invoker.setCommand(pl);
			   invoker.invoke();
		     break; 
		    
		   case 3:
			   invoker.setCommand(aa);
			   invoker.invoke();
			 break;
			 
		   case 4:
			   invoker.setCommand(al);
			   invoker.invoke();
			 break;
				 
		   case 0:
			 b=false;  
			break;	 
		
		}
		
		}
		miScanner.close();
		System. exit(0);
	}

}
