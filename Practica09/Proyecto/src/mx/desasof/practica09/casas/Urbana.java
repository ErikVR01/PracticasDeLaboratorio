public class Urbana extends Casa{

	public Urbana(String tipo, int hab, float costo){
		super(tipo, hab, costo);
	}

	public Urbana(String tipo, int banios){
		super(tipo);
		this.banios=banios;
	}

	public int hashcode(){

	}

	public boolean equals(Object ov){
		return super.equals(ov) && ov instanceof Urbana;
	}

	public String toString(){
		return tipo + " " + hab + " " + costo;
	}



}