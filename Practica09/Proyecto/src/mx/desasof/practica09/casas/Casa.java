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

}