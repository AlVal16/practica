import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("ingrese n�mero : ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		if (n1 % n2 == 0) {
			System.out.println("Son m�ltiplos ");
		} else {
			System.out.println("No son m�ltiplos ");

		}
	}

}
