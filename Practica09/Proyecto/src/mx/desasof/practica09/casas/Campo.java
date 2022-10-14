public class Campo extends Casa{
	
	float piscina []= new piscina();

	public Campo(String tipo, int hab, float costo, float largo, float ancho){
		super(tipo, hab, costo);
		ancho=0;
		largo=1;

	}

	public int hashcode(){
		super.hashCode()*(int)ancho*(int)largo/5;
	}

	public boolean equals(Object ob){
		return super.equals(ob) && ob instanceof Campo;
	}

	public String toString(){
		return tipo + " " + hab + " " + costo;
	}


}