
public class Arbol {
	
	int cantidadHojas;
	String tipo;
	int antiguedad;
	int altura; 

	void crecer() {
		System.out.println("Crecimiento árbol");
	}
	void crearHojas() {
		System.out.println(" Muchas hojas");
	}
	void fotosintesis() {
		System.out.println(" Fotosintesis por el sol");
		
	}
	Arbol(){
	this.cantidadHojas=3;
	this.tipo="Croto";
	this.altura=23;
	this.antiguedad=5;
	}
}
