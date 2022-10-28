public enum Escudo{
	SUPER(0),
	MEDIO(1),
	BAJO(2),
	NULO(3);

	int nivel;

	private Escudo(int nivel){
		this.nivel=nivel;
	}
}