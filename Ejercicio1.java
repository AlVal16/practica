
public class Ejercicio1 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Tienda a = new Portatil();
				Tienda b = new Sobremesa();
				a.Makesound();
				b.Makesound();
	}
	

class Tienda{
		public void Makesound() {
	    int codigo; 
		double precio;
					
		}
		
	}

class Portatil extends Tienda {
	public void Makesound() {
		double precio=1.3;
		System.out.println("Ideal para sus viajes");
	}
}


class Sobremesa extends Tienda {
	public void Makesound() {
		
	}
		String descripcion=("grande");	
		String slogan=("El que más pesa, pero el que menos cuesta");
		
		}
}
