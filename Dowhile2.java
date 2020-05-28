import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero, n1, n2, n3, i;
		n1 = 0;
		n2 = 1;
		n3 = 1;
		i = 1;

		System.out.println("Ingresa el términos ");
		numero = scan.nextInt();
		do {
			System.out.print(n1 + ", ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		} while (i <= numero);
	}
}