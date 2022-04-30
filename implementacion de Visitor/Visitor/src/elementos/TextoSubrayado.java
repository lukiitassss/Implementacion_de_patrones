package elementos;

import visitantes.IVisitante;

public class TextoSubrayado implements IElemento {
	private String texto;
	
	public String getTexto() {
		return "Texto Subrayado: "+texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@Override
	public String aceptar(IVisitante visitante) {
		return visitante.visitar(this);
		
	}


}
