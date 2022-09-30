package mx.parc1.soft.parcial.series;
import mx.parc1.soft.parcial.pruebas.*;
public class TestSeries{
	public static void main(String[] args){
		
		Series s= new Serie;
		/*
		int m = s.genNumero(100);
		s.primos(m);
		int o = s.primoN(m/10);
		System.out.println(o);
		*/

		int n = s.genNumero(10);
		s.fibo(n);
		//int p = s.fiboN(3, 11);
		System.out.println(s.fibo(n));
	}
}