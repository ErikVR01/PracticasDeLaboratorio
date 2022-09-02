package com.patito.poo1pract.personajes;
public class Personaje{
	private String nombre;
	private int edad;

	public Personaje(String nombre){
		this.nombre=nombre;
		this.edad=0;
	}

	public int getEdad(){
		return edad;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;

	}

	public String getNombre(){
		return nombre;
	}

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