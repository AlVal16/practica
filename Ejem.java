
import java.util.Scanner;
public class Ejem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan =new Scanner (System.in); 
	System.out.println("Ingrese Apellido Paterno");
	String apPat = scan.next();
	System.out.println("Ingrese Apellido Materno");
	String apMat = scan.next();
	System.out.println("Ingresar edad");
	int edad = scan.nextInt() ;
	System.out.println("APELLIDOS: " + apPat + " " + apMat + " " + edad + " de edad " );
	
	
	}

}
