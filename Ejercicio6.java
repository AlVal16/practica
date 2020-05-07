import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("ingrese número : ");
		num = scanner.nextInt();
		if (num == 0) {
			System.out.println("No tiene cifras ");
		} else {
			if (num < 10) {
				System.out.println("Tiene una cifras ");
			} else {
				if (num < 100) {
					System.out.println("Tiene dos cifras ");
				} else {
					if (num < 1000) {
						System.out.println("Tiene tres cifras ");
					} else {
						if (num < 10000) {
							System.out.println("Tiene cuatro cifras ");
						} else {
							if (num < 100000)
								System.out.println("Tiene cinco cifras ");
						}
					}
				}
			}
		}

	}

}
