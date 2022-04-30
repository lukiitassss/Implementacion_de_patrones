package gestoria.mementos;

import java.util.ArrayList;

public class AdministradorDeMementos {
 private ArrayList<Memento> estados = new ArrayList<Memento>();
 
 public void agregarEstado(Memento m) {
	 estados.add(m);
 };
 
 public Memento recuperarEstado (int index) {
	 return estados.get(index);
 };
 
 public int cantidadDeEstados () {
	 return estados.size();
 };
 
}
