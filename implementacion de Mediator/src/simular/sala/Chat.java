package simular.sala;

import colega.Usuario;
import mediador.SalaDeChat;

public class Chat {

	public static void main(String[] args) {
		SalaDeChat miSala = new SalaDeChat ();
		Usuario u1 = new Usuario(miSala);
		u1.setNombre("Juan");
		miSala.registrarUsuario(u1);
		Usuario u2 = new Usuario(miSala);
		u2.setNombre("Sofia");
		miSala.registrarUsuario(u2);
		
		u1.enviarMensaje("Sofia","hola Sofia, todo bien?");
		u2.enviarMensaje("Juan", "Hola juan, todo bien por suerte");
		u2.enviarMensaje("Carlos", "Che carlos estas conectado?");
		
	}

}
