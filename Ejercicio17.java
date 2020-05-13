import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double sueldo, nsueldo;
		System.out.println("Ingrese sueldo:  ");
		sueldo=scan.nextDouble();
		
		if (sueldo<1000) {
			nsueldo=sueldo+ (sueldo*0.15);
			System.out.println("Su sueldo es:  "+nsueldo);
			
			}
		else {
			System.out.println("Su sueldo es: "+sueldo);
		}
		
	}

}
