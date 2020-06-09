import java.util.Scanner;

public class TarS82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int v1 = 0, v2 = 0, v3 = 0, v4 = 0, tv = 0;
		int n, i, v;
		double por1, por2, por3, por4;
		System.out.println("Ingrese número de votos: ");
		n = scan.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.println("Ingrese voto ");
			v = scan.nextInt();

			if (v == 1) {
				v1++;

			}
			if (v == 2) {
				v2++;

			}
			if (v == 3) {
				v3++;

			}
			if (v == 4) {
				v4++;
			}

			tv=tv+1;
		}
		por1 = (v1 * tv) / 100;
		por2 = (v2 * tv) / 100;
		por3 = (v3 * tv) / 100;
		por4 = (v4 * tv) / 100;

		System.out.println("El candidato 1 : " + por1 + "% de votos");
		System.out.println("El candidato 2 : " + por2 + "% de votos");
		System.out.println("El candidato 3 : " + por3 + "% de votos");
		System.out.println("El candidato 4 : " + por4 + "% de votos ");

	}

}
