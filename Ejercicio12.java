package desc;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el número ");
			num = scan.nextInt();
		switch (num) {
		case 0:
			System.out.println(" cero ");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6: 
			System.out.println("seis");
			break;
		case 7: 
		    System.out.println(" siete ");
		case 8:
			System.out.println(" ocho");
		case 9:
		   System.out.println(" nueve ");
		case 10: 
			System.out.println(" diez ");
		}
		
	}

}
