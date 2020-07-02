
public class Estudiante extends Persona {

	private int notafinal;
	private int codigoEstudiante;

	public int getNotafinal() {
		return notafinal;
	}

	public void setNotafinal(int notafinal) {
		this.notafinal = notafinal;
	}

	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	
	public void mostrar() {
		System.out.println("\nNombre: "+getNombre()+" \nApellido: "+getApellido()+" \nEdad: "+getEdad()+" \nCódigo E:"+getCodigoEstudiante()+" \nNota:"+getNotafinal());
	}
}

