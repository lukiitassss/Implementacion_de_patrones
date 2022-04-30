package mediador;

import java.util.HashMap;

import colega.Usuario;

public class SalaDeChat implements ISalaDeChat {
	private HashMap<String, Usuario> participantes = new HashMap<String,Usuario>();

	@Override
	public void registrarUsuario(Usuario participante) {
		participantes.put(participante.getNombre(), participante);

	}

	@Override
	public void enviar(String de, String a, String msj) {
		if (participantes.containsKey(de) && participantes.containsKey(a)) {
			participantes.get(a).recibirMensaje(de, msj);
			//= participantes.get(a);
			//u.recibirMensaje(de, msj);
		}else {
			System.out.println("Error de envio. "+de+" el usuario: "+a+" no esta en esta sala");
		}

	}

}
