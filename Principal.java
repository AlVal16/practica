
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante estudio=new Estudiante();
		estudio.setNombre("Alma");
		estudio.setApellido("Valer");
		estudio.setEdad(23);
		estudio.setCodigoEstudiante(1620629);
		estudio.setNotafinal(20);
		
		estudio.mostrar();
	}

}
