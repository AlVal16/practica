package desc;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d1, m1, a1;  //d es d�a, m es mes, a es a�o
		int d2, m2, a2;
		int totald; // el total de d�as 
		Scanner scan = new Scanner(System.in);
		System.out.println("Fecha 1:");
		System.out.print("Introduzca d�a: ");
		d1 = scan.nextInt();
		System.out.print("Introduzca mes: ");
		m1 = scan.nextInt();
		System.out.print("Introduzca a�o: ");
		a1 = scan.nextInt();
		System.out.println("Fecha 2:");
		System.out.print("Introduzca d�a: ");
		d2 = scan.nextInt();
		System.out.print("Introduzca mes: ");
		m2 = scan.nextInt();
		System.out.print("Introduzca a�o: ");
		a2 = scan.nextInt();
		totald = d2 - d1 + 30 * (m2 - m1) + 365 * (a2 - a1);
		System.out.println("Los d�as de diferencia son : " + totald);
	}

}
