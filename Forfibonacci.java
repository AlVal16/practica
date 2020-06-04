
public class Forfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n1=0,n2=1, lim=180, r;
		System.out.println(n1);
		System.out.println(n2);
		for (i=1; n1+n2<=lim;i++) {
		r=n1;
		n1=n2;
		n2=r+n1;
		System.out.println(n2);
		}
	}

}
