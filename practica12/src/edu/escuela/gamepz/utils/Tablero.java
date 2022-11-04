package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
public class Tablero{
	public static final int MAX_SIZE = 10;
	Personaje personajes [] = new Personaje[MAX_SIZE];
	private Tablero(){}

	public void mostrar(){
		System.out.println("\nInicio *** Contenido de arreglo en tablero");
	}
}