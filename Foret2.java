import java.util.Scanner;

public class Foret2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pedir un nmero N, introducir N sueldos y mostrar el sueldo máximo
		 Scanner scan = new Scanner(System.in);
	        int n, sueldo, i, sueldomax;
	        sueldomax = 0;
	        
	        System.out.println("Ingrese un numero");
	        n = scan.nextInt();
	        
	        for(i = 1; i<=n; i++){
	            System.out.println("Ingresa el sueldo");
	            sueldo = scan.nextInt();
	            if(sueldo>=sueldomax){
	                sueldomax = sueldo;
	            }
	        }
	        System.out.println("El sueldo maximo es: " + sueldomax);
	    }
	}

