package eslabones;

public abstract class ExpendedorBillete {
protected ExpendedorBillete next;

public void agregarSiguiente (ExpendedorBillete siguiente) {
	next = siguiente;
}
	
public abstract void procesar (int monto);





}
