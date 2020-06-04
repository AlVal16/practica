import java.util.Scanner;

public class TarS8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int c1=0, c2=0, c3=0;
		int n,i,c;
		System.out.println("Ingrese número de ventas: ");
		n=scan.nextInt();
		for(i = 1; i<=n; i++){
			System.out.println("Ingrese costo ");
			c=scan.nextInt();
			
			if(c<200) 
				c1++;
			 if (c>200 && c<400)
				c2++;
			if(c>=400)
				c3++;            
	     
		}
		System.out.println(" Ventas menores a 200: " +c1);
		System.out.println(" Ventas entre 200 y 400: "+c2);
		System.out.println(" Ventas mayores a 400 "+c3);
	}
}
	

