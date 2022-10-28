package edu.escuela.gamepz.personajes;
public abstract class Personaje{
	private String nombre;
	protected int vida;

	public Personaje(String nombre, int vida){
		this.nombre=nombre;
		this.vida=vida;

	}
	public Personaje(String nombre){
		this.nombre=nombre;
		vida=3;
	}
	
	public int getVida(){
		return vida;
	}

	public void setNombre(String nombre){
		if (nombre.length()>5 && nombre.length()<25){
			this.nombre = nombre;
		}
	}

	public String toString(){
		return nombre + " " + vida;
	}

	
	public String getNombre(){
		return nombre;
	}

	public abstract void decVida();

	public void decVida(int dec);

	public abstract void addVida();

	public void addVida(int incvida);
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
*/