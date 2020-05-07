import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, m1, m2, m3, m4;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero entre 0 y 9999");
		num = scan.nextInt();

		if (num < 10) {
			System.out.println("el numero es: " + num);
		} else {
			if (num < 100) {
				m1 = num % 10;
				m2 = num % 100 / 10;
				System.out.println("El numero es: " + m1 + m2);
			} else {
				if (num < 1000) {
					m1 = num % 10;
					m2 = num % 100 / 10;
					m3 = num % 1000 / 100;
					System.out.println("El numero es: " + m1 + m2 + m3);
				} else {
					if (num < 10000) {
						m1 = num % 10;
						m2 = num % 100 / 10;
						m3 = num % 1000 / 100;
						m4 = num % 10000 / 1000;
						System.out.println("El numero es: " + m1 + m2 + m3 + m4);
					}
				}
			}
		}
	}
}