
public abstract  class Servivo {
	
	public abstract void alimentarse();

	public static void main(String[] args) {
		Animal ani=new Animal();
		ani.alimentarse();
		
		Planta plan=new Planta();
		plan.alimentarse();
	}
	
	
	public Servivo() {
		// TODO Auto-generated constructor stub
	}

}
