
public abstract class Animal extends Servivo {
	public abstract void alimentarse();
	
	public Animal() {
		// TODO Auto-generated constructor stub
		abstract public static void main(String[] args) {
			AnimalCarnivoro anicar=new AnimalCarnivoro();
			anicar.alimentarse();
			
			AnimalHerbivoro animalh=new AnimalHerbivoro();
			animalh.alimentarse();
		}
		
	}

}
