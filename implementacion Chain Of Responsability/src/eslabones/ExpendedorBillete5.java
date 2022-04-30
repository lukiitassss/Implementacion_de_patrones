package eslabones;

public class ExpendedorBillete5 extends ExpendedorBillete{

	@Override
	public void procesar(int monto) {
		int auxmonto= monto;
		int contador=0;
		boolean b =true;
		while (b) {
		auxmonto -=5;	
		if (auxmonto>=0 ) {
			monto -= 5;
			contador +=1;
		}else {	if (monto==0) {
				System.out.println("Operacion completada");
				System.out.println("Usted recibira "+ String.valueOf(contador)+" billetes de 5 " );
				b=false;
				}
				else	
				{
				b=false;
				if (contador==0) {
					System.out.println("Operacion completada");
					System.out.println("Usted recibira "+String.valueOf(monto) + " monedas de 1 peso" );
						
				}
				else {
				System.out.println("Operacion completada");
				System.out.println("Usted recibira "+ String.valueOf(contador)+" billetes de 5 y tambien recibira "+String.valueOf(monto) + " monedas de 1 peso" );
				}
				}
		}		
		
		}
	}

}	
