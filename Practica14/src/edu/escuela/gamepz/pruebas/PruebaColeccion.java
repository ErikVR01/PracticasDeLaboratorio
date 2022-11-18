package edu.escuela.gamepz.pruebas;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.BySize;
import edu.escuela.gamepz.utils.ByVida;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Tablero;
public class PruebaColeccion{
	public static void main(String[] args) {
        String path = System.getProperty("user.home") + 
            System.getProperty("file.separator");
        
        Scanner s = new Scanner(System.in);
        String fname = s.nextLine();
        path += s.nextLine();

		Personaje[] datos = {
            new Planta("Fabian", Tablero.genVida(), Escudo.MEDIO), 
            new Zombie("Bianca",Tablero.genVida()),
            new Planta("Fabian", Tablero.genVida()),
            new Planta("Armando", Tablero.genVida(),Escudo.BAJO),
            new Planta("Bianca", Tablero.genVida()),
            new Planta("Dayan",Tablero.genVida()),
            new Zombie("Armando", Tablero.genVida(), false),
            new Zombie("Dayan",Tablero.genVida(), true),
            new Zombie("Armando",Tablero.genVida())
		};
		TreeSet<Personaje> ts = new TreeSet<>();
		LinkedList<Personaje> linked = new LinkedList<>();

		for (Personaje personaje : datos) {
            ts.add(personaje);
            linked.add(personaje);
        }

        System.out.println("---Orden Natural---");
        for (Personaje p : ts) {
            System.out.println(p);
        }

        System.out.println("---Orden Vida---");
        Collections.sort(linked, new ByVida());
        for (Personaje p : linked) {
            System.out.println(p);
        }

        ArrayList<Personaje> arr = new ArrayList<>();
        arr.addAll(linked);
        System.out.println("---Orden Tamanio---");
        Collections.sort(arr, new BySize());
        for (Personaje p : arr) {
            System.out.println(p);
        }

   }
}