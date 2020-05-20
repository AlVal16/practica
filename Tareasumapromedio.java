import java.util.Scanner;

public class Tareasumapromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0,i=0,par=0, supa = 0;
		double prod = 0;
		while(i<=270) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingresar número ");
			int num=scan.nextInt();
			if (num%2==0) {
				suma=suma+num;
				par=par+1;
			}else {
				prod=num*(i+1);
			}
			supa=suma/par;
			}
		System.out.println("La suma es : "+supa);
		System.out.println(" El promedio es : "+prod);
	
	}

}
