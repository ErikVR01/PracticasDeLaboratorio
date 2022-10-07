package edu.escuela.gamepz.personajes;
public class Personaje{
	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre=nombre;
		this.vida=vida;

	}
	public Personaje(String nombre){
		this.nombre=nombre;
		vida=3;
	}
	
	public int getVida(){
		return edad;
	}

	public void setNombre(String nombre){
		if (nombre.length()>5 && nombre.length()<25){
			this.nombre = nombre;
		}
	}

	public String getDetalle(){
		return nombre + "\t" + edad;
	}

	
	public String getNombre(){
		return nombre;
	}

	public static void decVida(){

	}

	

	/*
	public void saludar(){
		System.out.println("Hola Alumno de POO " +nombre);
	}


	public boolean setEdad(int edad){
		if (edad>0) {
			if (edad<120){
			
				this.edad=edad;
				return true;

			}else{
				
				return false;

			}
		}return false;
	}
}
*/