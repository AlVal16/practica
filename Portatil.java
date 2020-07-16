
public class Portatil extends Tienda{
		double peso;
		
	public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

	public void slogan() {	
		System.out.println("\nPORTATIL");
		System.out.println("Ideal para sus viajes");		
	}
	
	public void mostrar() {
		
		System.out.println("\nSu código es:  "+getCodigo()+"\nSu precio es: "+getPrecio()+"\nSu peso es: "+getPeso());
	}
	
	public Portatil() {
		// TODO Auto-generated constructor stub
	}

}
