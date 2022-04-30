package visitantes;

import elementos.TextoNegrita;
import elementos.TextoNormal;
import elementos.TextoSubrayado;

public interface IVisitante {
	//aca van las sobrecarga la cual recibe los elementos concretos que poseo
 public String visitar (TextoNegrita t);
 public String visitar (TextoNormal t);
 public String visitar (TextoSubrayado t);
}
