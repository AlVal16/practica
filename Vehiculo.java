
public class Vehiculo {
	public String matricula;
	public String marca;
	public String modelo;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}

class VehiculoTurismo extends Vehiculo {
	int numeropuertas = 4;
	  VehiculoDeportivo vehi=new VehiculoDeportivo();
	   vehi.setMarca("Nissa");
	   vehi.setModelo("Ultimo");
	  	}



class VehiculoDeportivo extends Vehiculo{
    int cilandra=2;
   VehiculoDeportivo vehi=new VehiculoDeportivo();
   vehi.setMarca("Kia");
   vehi.setmodelo("Segundo");
  	}

class VehiculoFurgoneta extends Vehiculo{
	int carga;
	  VehiculoDeportivo vehi=new VehiculoDeportivo();
	   vehi.setMarca("Abarth");
	   vehi.setmodelo("Tercero");
	 }

}
