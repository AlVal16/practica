
public class Computadora extends Tienda{
	public int descripcion;
	
	
	public int getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}
	public void slogan () {
			System.out.println("\nCOMPUTADORA");
			System.out.println("Es el que m�s pesa, pero el que menos cuesta");
		}
	public Computadora() {
		// TODO Auto-generated constructor stub		
	}
	public void mostrar() {
		
		System.out.println("\nSu codigo es: "+getCodigo()+"\nSu precio es: "+getPrecio()+"\nDescripci�n de la Torre: "+getDescripcion());
	}

}
