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
		return vida;
	}

	public void setNombre(String nombre){
		if (nombre.length()>5 && nombre.length()<25){
			this.nombre = nombre;
		}
	}

	public String getDetalle(){
		return nombre + "\t" + vida;
	}

	
	public String getNombre(){
		return nombre;
	}

	public void decVida(){
		if ((vida-1 >0) & (vida-1 < 100 )) {
			vida=vida-1;
		}
	}

	public void decVida(int dec){
		if ((vida-dec >0) & (vida-dec < 100 )) {
			vida=vida-dec;
		}
	}

	public void addVida(){
		if ((vida+1 > 0) && (vida+1 < 100)) {
			vida = vida + 1;
		}
	}

	public void addVida(int incvida){
		if ((vida+incvida > 0) && (vida+incvida < 100)) {
            vida = vida + incvida;
        }
	}
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