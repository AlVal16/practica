import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double SUE;
		double NSUE;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar sueldo: ");
		SUE = scan.nextDouble();
		System.out.println("Ingresar categoría");
		System.out.println(" 1 ");
		System.out.println(" 2 ");
		System.out.println(" 3 ");
		System.out.println(" 4 ");
		int CATE = scan.nextInt();
		switch (CATE) {
		case 1:
			NSUE = SUE * 1.15;
		case 2:
			NSUE = SUE * 1.10;
			break;
		case 3:
			NSUE = SUE * 1.08;
			break;
		case 4:
			NSUE = SUE * 1.07;
			break;
		}

		System.out.println("Categoría: " + CATE + "Sueldo" + NSUE);

	}

}
