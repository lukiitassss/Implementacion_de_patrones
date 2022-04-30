package ejecutar;

import flyweight.NotebookReal;

public class Main {

	public static void main(String[] args) {
		NotebookReal n1 = new NotebookReal("HP","1","rojo","4gb","128gb", "i3 4ta gen");
		NotebookReal n2 = new NotebookReal("HP","2","rojo","8gb","256gb", "i5 4ta gen");
		NotebookReal n3 = new NotebookReal("HP","3","rojo","16gb","512gb", "Ryzen 7");
		NotebookReal n4 = new NotebookReal("HP","1","rojo","4gb","128gb", "i3 4ta gen");
		n1.mostrarInformacionNotebook();
		n2.mostrarInformacionNotebook();
		n3.mostrarInformacionNotebook();
		n4.mostrarInformacionNotebook();
	}

}
