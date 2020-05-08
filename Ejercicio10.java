import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el número ");
		System.out.println("1.- 0 < 5");
		System.out.println("2. nota = 5 ");
		System.out.println("3. nota = 6");
		System.out.println("4. nota=7");
		System.out.println("5. nota =10");

		nota = scan.nextInt;
		switch (nota) {

		case 1:
			System.out.println("Insuficiente");
			break;
		case 2:
			System.out.println("Suficiente");
			break;
		case 3:
			System.out.println("Bien");
			break;
		case 4:
			System.out.println("Notable");
			break;
		case 5:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("No hay opción");
			break;
		}
	}
}
