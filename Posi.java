import java.util.Scanner;

public class Posi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n1;
		Scanner scanner=new Scanner(System.in);
        System.out.print("ingrese n�mero : ");
      n1=scanner.nextInt();
      if (n1<0) {
           System.out.println("N�mero negativo");
      }else {
    	  System.out.println("N�mero positivo");
      }
	}

}
