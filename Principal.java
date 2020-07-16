
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub

		Portatil p=new Portatil();
		p.setCodigo(23456);
		p.setPeso(1.25);
		p.setPrecio(12.345);
		p.slogan();
		p.mostrar();
	
		Computadora c=new Computadora();
		c.setCodigo(28372);
		c.setPrecio(9.500);
		c.setDescripcion(2321);
		c.slogan();
		c.mostrar();
	}

}
