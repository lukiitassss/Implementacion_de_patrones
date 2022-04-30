package eslabones;

public class ExpendedorBillete100 extends ExpendedorBillete{

	@Override
	public void procesar(int monto) {
		String aux = String.valueOf(monto);//convierto el monto en string para saber lugo su longitud
		int contador=0;
		boolean b =true;
		while (b) {
		if (aux.length()>=3) {
			monto -= 100;
			contador +=1;
		}else if (aux.length()<3){
			if (monto == 0) {
				b=false;
				System.out.println("Operacion completada");
				System.out.println("Usted recibira "+ String.valueOf(contador)+" billetes de 100");
			}
		else {
			b=false;
			if (contador==0) {
				next.procesar(monto);
			}else {
			System.out.println("Operacion aun no completada");
			System.out.println("Por ahora recibira "+ String.valueOf(contador)+" billetes de 100");
			next.procesar(monto);
			}
		}
			
		}
		aux=  String.valueOf(monto);	
	}

	}}	
