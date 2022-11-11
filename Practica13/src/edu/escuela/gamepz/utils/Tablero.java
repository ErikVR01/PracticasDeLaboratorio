package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
public class Tablero{
	public static final int MAX_SIZE = 10;
	Personaje personajes [] = new Personaje[MAX_SIZE];
	private Tablero(){}

	public void mostrar(){
		System.out.println("\nInicio *** Contenido de arreglo en tablero");
		int contador=0;
		for (Personaje tmp : personajes ) {
			if (tmp == null) {
				System.out.println(contador + " - - -");
			}else{
				System.out.println(contador + " " + tmp);
			}
			contador++;
		}
		System.out.println("Fin *** Contenido de arreglo en tablero\n");
	}

	public void insertar(Personaje p, int pos)throws PersException{
		if ((pos < 0) || (pos > MAX_SIZE)) {
			throw new PersException("Indice fuera de rango", pos);
		}
		personajes[pos]=p;
	}

	public void borrar(int pos)throws PersException{
		if ((pos < 0) || (pos > MAX_SIZE)){
			throw new PersException("Indice fuera de rango", pos);
		}else if(personajes[pos] == null){
			throw new PersException("Si personaje para borrar", pos);
		}
		personajes[pos]=null;
	}

	public int genVida(){
		int x= (int)(Math.random()*10+1);
		return x;
	}
}