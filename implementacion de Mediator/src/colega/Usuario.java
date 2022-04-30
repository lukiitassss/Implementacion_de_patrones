package colega;

import mediador.SalaDeChat;

public class Usuario implements IUsuario {
	private String nombre;
	private SalaDeChat salaDeChat;
	
	public Usuario(SalaDeChat sala) {this.salaDeChat=sala;};

	@Override
	public void recibirMensaje(String de, String msj) {
		String aux = "Recibiste un mensaje de: "+ de+ " el cual dice: "+msj;
		System.out.println(nombre+": "+aux);

	}

	@Override
	public void enviarMensaje(String a, String msj) {
		salaDeChat.enviar(nombre, a, msj);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
