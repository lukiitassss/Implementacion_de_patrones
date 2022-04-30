package elementos;

import visitantes.IVisitante;

public class TextoNormal implements IElemento {
	private String texto;
	public String getTexto() {
		return "Texto Normal: "+texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@Override
	public String aceptar(IVisitante visitante) {
		return visitante.visitar(this);
		
	}


}
