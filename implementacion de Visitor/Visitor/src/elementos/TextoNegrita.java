package elementos;

import visitantes.IVisitante;

public class TextoNegrita implements IElemento {
	private String texto;
	public String getTexto() {
		return "Texto en Negrita: " + texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@Override
	public String aceptar(IVisitante visitante) {
		return visitante.visitar(this);
		
	}


}
