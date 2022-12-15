package mx.edu.elextra.extraeval.dispositivos;
public class Celular extends Dispositivo{
	float procesador;
	public Celular(String marca, float costo, float procesador){
		super(marca, costo);
		this.procesador=procesador;
	}

	public float getProcesador(){
		return procesador;
	}

}