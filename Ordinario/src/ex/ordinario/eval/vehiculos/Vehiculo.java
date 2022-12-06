package ex.ordinario.eval.vehiculos;
public class Vehiculo implements Comparable <Vehiculo>{
	String marca;
	int modelo;
	float costo;

	public Vehiculo(String marca, int modelo, float costo){
		this.marca=marca;
		this.modelo=modelo;
		this.costo=costo;
	}

	public String getMarca(){
		return marca;
	}

	public int modelo(){
		return modelo;
	}

	public float costo(){
		return costo;
	}

	public int compareTo(Vehiculo o){
		if (this.marca.compareTo(o.marca)!=0) {
			return(this.marca.compareTo(o.marca));
		}
	}

	public String toString(){
		return marca + "\t" + modelo + "\t" + costo;
	}

}