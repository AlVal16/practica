import java.util.Scanner;

public class Ret2 {
	static int  n1, n2, n3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
        System.out.print("ingrese el primer numero : ");
      n1=scanner.nextInt();
      System.out.print("ingrese el sugundo numero : ");
      n2=scanner.nextInt();
      System.out.print("ingrese el tercer numero : ");
      n3=scanner.nextInt();
      
          if (n1>n3 && n3>n2) 
          System.out.print(n1+","+n3+","+n2);
      
               else{
                  if(n2>n1 && n1>n3)
                      System.out.println(n2+", "+n1+", "+n3);
                  else{
                     if(n2>n3 && n3>n1)
                         System.out.println(n2+", "+n3+", "+n1);
                     else{
                         if(n3>n1 && n1>n2)
                            System.out.println(n3+", "+n1+", "+n2);
                         else{
                            if(n3>n2 && n2>n1)
                               System.out.println(n3+", "+n2+", "+n1);
                         }
                     }
                  }
               }
	         }
	    }


	