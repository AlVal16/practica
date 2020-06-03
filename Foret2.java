import java.util.Scanner;

public class Foret2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pedir un nmero N, introducir N sueldos y mostrar el sueldo máximo
		int N, NS = 0, SM = 0, i, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar un número");
		N = scan.nextInt();
		for (i = 1; i <= N; i++) {
				System.out.println("Ingresar sueldo");
				NS=scan.nextInt();
				SM = SM + NS;
			
		}
		System.out.println("El sueldo máximo es " + SM);

	}

}
