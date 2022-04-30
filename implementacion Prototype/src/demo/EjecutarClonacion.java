package demo;

import java.util.ArrayList;
import java.util.List;

import clonacion.Animal;
import clonacion.Perro;

public class EjecutarClonacion {

	public static void main(String[] args) {
	     
	     Perro miPerro  = new Perro();
	     miPerro.cantidadPatas= 4 ;
	     miPerro.nombre="simon";
	     miPerro.pelo="corto";
	     miPerro.sonido="gua gua";
	     miPerro.vuela=false;
	     Perro miPerroClon = (Perro) miPerro.clone();
	     System.out.println(miPerro.toString());
	     System.out.println(miPerroClon.toString());
	     
	     
	     
	}

}
