import java.util.Scanner;

public class DoTar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aho, mes, dinero;
		aho=0;
		mes=1;		
		Scanner scan=new Scanner (System.in);
		System.out.println("Ingrese monto ");
		do {
			dinero=scan.nextInt();
			aho=aho+dinero;
			mes=mes+1;
			System.out.println("Ahorro del mes  " +mes+ " : "+dinero);
			System.out.println("Ingrese el monto ");
			//instrucciones
		}while(mes<=12);
		System.out.println(" El ahorro final es "+aho);
	}

}
