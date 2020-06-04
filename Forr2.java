import java.util.Scanner;

public class Forr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sn = 0, i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar número");

		for (n = scan.nextInt(); n > 0; i++) {
			System.out.println("Numero: ");
			n = scan.nextInt();
		}
		System.out.println("Se han introducido : "+i+ "números");
	}
}
