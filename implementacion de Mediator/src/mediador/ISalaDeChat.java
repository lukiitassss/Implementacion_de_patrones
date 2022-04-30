package mediador;

import colega.Usuario;

public interface ISalaDeChat {
	
public void registrarUsuario(Usuario participante);	
public void enviar(String de, String a, String msj);
	

}
 