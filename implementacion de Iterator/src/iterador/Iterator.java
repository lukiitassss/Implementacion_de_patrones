package iterador;

import coleccion.Cliente;

public interface Iterator {
	 void Primero();
	 Cliente Actual();
	 Cliente Siguiente();
	 boolean QuedanElementos();
}
