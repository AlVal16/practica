import java.util.Scanner;

public class Do3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num, suma, cont, i;
		suma = 0;
		cont = 1;

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cantidad de números ");
		do {
			num = scan.nextInt();
			cont++;
			suma = cont + num;
			System.out.println("Ingrese número" + cont);
		} while (cont >= num);
		System.out.println("La suma es " + suma);
	}

}
