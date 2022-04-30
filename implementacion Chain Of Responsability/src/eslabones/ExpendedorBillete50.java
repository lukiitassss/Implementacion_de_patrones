package eslabones;

public class ExpendedorBillete50 extends ExpendedorBillete{

	@Override
	public void procesar(int monto) {
		int auxmonto= monto;
		int contador=0;
		boolean b =true;
		while (b) {
		auxmonto -=50;	
		if (auxmonto>0 ) {
			monto -= 50;
			contador +=1;
		}else if (auxmonto==0){
				contador +=1;
				b=false;
				System.out.println("Operacion completada");
				System.out.println("Usted tambien recibira "+ String.valueOf(contador)+" billete de 50");
		}else {
			b=false;
			if (contador==0) {next.procesar(monto);}else {
			System.out.println("Operacion aun no completada");
			System.out.println("Por ahora recibira "+ String.valueOf(contador)+" billetes de 50");
			next.procesar(monto);
			}
			
		}		
		
		}
	}

}	
