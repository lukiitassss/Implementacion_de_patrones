package flyweight;

import factory.FactoryNotebook;

public class NotebookReal {
 private Notebook datosCompartidos;
 public   String memoria;
 public   String disco;
 public   String procesador;
public  String getMemoria() {
	return memoria;
}
public  void setMemoria(String memoria) {
	this.memoria = memoria;
}
public  String getDisco() {
	return disco;
}
public  void setDisco(String disco) {
	this.disco = disco;
}
public  String getProcesador() {
	return procesador;
}
public  void setProcesador(String procesador) {
	this.procesador = procesador;
}
 
 
public String marca() { return datosCompartidos.getMarca();  }
public String modelo() { return datosCompartidos.getModelo();  }
public String color() { return datosCompartidos.getColor();  }
 
 
public NotebookReal(String marca, String modelo, String color,                  // Datos impl�citos
        String memoria, String disco, String procesador)       // Datos expl�citos
    {
        // Instanciamos o referenciamos los datos impl�citos a trav�s de la factor�a
        this.datosCompartidos = FactoryNotebook.setNotebook(marca, modelo, color);
        // Asignamos los datos propios, exclusivos de este objeto
        this.memoria = memoria;
        this.disco = disco;
        this.procesador = procesador;
    }
public void mostrarInformacionNotebook()
{
    datosCompartidos.mostrarCaracteristicas("Memoria ram:  " + memoria +"\n"+ "Disco: " + disco +"\n"+  "Procesador: " + procesador);
}

}
