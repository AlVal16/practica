import java.util.Scanner;

public class Tar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom;
		int emp, cate, i=0;
		double stotal, s, b,sb=0, sumas = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar número de empleados");
		emp = scan.nextInt();
		
		while (emp>i) {
			i++;
			System.out.println("Ingresar nombre");
			nom = scan.next();
			System.out.println("Ingrese sueldo");
			s = scan.nextDouble();
			System.out.println("INGRESE CATEGORÍA: 1 / 2 / 3 / 4 Sin categoría ");
			cate = scan.nextInt();
			switch (cate) {
			case 1:
				
				b = s * 1.12;
				sumas = sumas + s;
				sb=sb+s;
				break;
			case 2:
				b = s * 1.10;
				sumas = sumas + s;
				sb=sb+s;
				break;
			case 3:
				b = s * 1.08;
				sumas = sumas + s;
				sb=sb+s;
				break;
			case 4:
				b = s * 1.06;
				sumas = sumas + s;
				sb=sb+s;
				break;
			}
			System.out.println(" Total de sueldos" + sumas);
			System.out.println(" Suma de sueldos básicos" +sb);
			

		}

	}
}
