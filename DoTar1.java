import java.util.Scanner;

public class DoTar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dinero, n, suma,i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar meses");
		n= scan.nextInt();
		suma = 0;
		i=1;
		do {
			System.out.println("Ingrese cantidad");
			dinero = scan.nextInt();
			suma = suma + dinero;
			i++;
		} while (i<= n);

		System.out.println("El dinero total es :  "+suma);

	}
}
