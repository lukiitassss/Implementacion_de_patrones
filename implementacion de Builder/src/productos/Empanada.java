package productos;

import java.util.ArrayList;

public class Empanada {
public String nombre;
public Coccion tipoCoccion;
public ArrayList<String> condimentos = new ArrayList<String>();
public ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
public Tamaño tamaño;
public String repulgue;	

public String mostrarEmpanada(){
	String aux="Esta empanada tiene las siguientes caracteristicas:"+"\n";
	aux +="Nombre: "+this.nombre+"\n";
	aux +="Tipo De Coccion: "+tipoCoccion.toString()+"\n";
	aux +="Condimentos: ";
	 for (int i=0;i<condimentos.size();i++) {
		 if (i == condimentos.size()-1) {
			   aux += condimentos.get(i) + "\n";}
		 
	 	else {
	 		aux += condimentos.get(i)+", ";
	 		}
	 }
	 aux +="Ingredientes: ";
	 for (int i=0;i<ingredientes.size();i++) {
		 if (i == ingredientes.size()-1) {
			   aux += ingredientes.get(i).toString() + "\n";}
		 
	 	else {
	 		aux += ingredientes.get(i).toString()+", ";
	 		}
	 }
	
	 aux +="Tamaño: "+tamaño.toString()+"\n";
	 aux +="Repulgue: "+repulgue+"\n";
	
	return aux;
	
	
}



}
