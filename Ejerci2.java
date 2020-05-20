import java.util.Scanner;

public class Ejerci2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, n=1;
		System.out.println("Ingresa un número");
		num = scan.nextInt();

		while (num >= 0) {
			n+=1;
			System.out.println("Siguiente número");
			num = scan.nextInt();
		}
		System.out.println(" Ingresaste = "+n);
	}
}