import java.util.Scanner;

public class Do5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad, n, suma,i;
		double prom;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingresa cantidad de alumnos");
		n= scan.nextInt();
		suma = 0;
		i=1;
		do {
			System.out.println("ingrese edad");
			edad = scan.nextInt();
			suma = suma + edad;
			i++;
		} while (i<= n);
		prom=suma/n;
		System.out.println(prom);

	}
}
	
