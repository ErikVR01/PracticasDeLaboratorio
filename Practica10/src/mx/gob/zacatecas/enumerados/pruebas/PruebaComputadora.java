package mx.gob.zacatecas.enumerados.pruebas;
import mx.gob.zacatecas.enumerados.utilerias.*;
import mx.gob.zacatecas.enumerados.equipos.*;

public class PruebaComputadora{
	public static void main(String[] args) {
		Computadora comp1 = Computadora("Asus", Memoria.DDR);
		Computadora comp2 = Computadora("Lenovo", Memoria.DDR2);
		Computadora comp3 = Computadora("Dell", Memoria.DDR3);
		Computadora comp4 = Computadora("HP", Memoria.DDR4);

		Computadora laptop[]= {comp1, comp2, comp3, comp4};

		for (Computadora tmp : laptop) {
			System.out.println(tmp);
		}
	}
}