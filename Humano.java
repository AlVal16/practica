
public class Humano {
	
	String hablando;
	int altura;
	String genero;
	int edad;
	String caracter;
	
	void hablar() {
		System.out.println("Hello");
	}
	void correr() {
		System.out.println("correr maratón");
	}
	void comer() {
		System.out.println(" comer comida");
		
	}
	
	Humano(){
	this.hablando="Soy humano";
	this.altura=1;
	this.genero="hombre";
	this.edad=17;
	this.caracter="Alegre";
	
	
	}
}
