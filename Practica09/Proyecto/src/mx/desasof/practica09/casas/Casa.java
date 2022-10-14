public class Casa{
	private String tipo;
	private int hab;
	private float costo;

	public Casa(String tipo, int hab, float costo){
		this.tipo=tipo;
		this.hab=hab;
		this.costo=costo;
	}

	public Casa(String tipo){
		this.tipo=tipo;
		hab=2;
		costo=2000000;
	}

	public int hashcode(){
		return tipo.hashcode()*hab*costo;
	}


	public boolean equals(Object o){
		if (o != null && o instanceof Casa) {
			Casa p= (Casa) o;

			if (tipo.equals(p.tipo) && (hab == p.hab)) {
				return true;
			}
		}
		return false;
	}

	public String toString(){
		return tipo + " " + hab + " " + costo;
	}




}