package edu.escuela.gamepz.personajes;
import java.text.DecimalFormat;
public abstract class Personaje{
	private String nombre;
	protected int vida;
	private float size;

	public Personaje(String nombre, int vida, float size){
		this.nombre=nombre;
		this.vida=vida;

		if (size==0.0f) {
			this.size=genSize();
		} else{
			this.size = Math.round(size)/100;
		}

	}
	public Personaje(String nombre){
		this.nombre=nombre;
		vida=3;
		size=0.0f
	}
	
	public int getVida(){
		return vida;
	}

	public boolean setVida(int edad){
		if (vida>0) {
			if (vida<99){
			
				this.vida=vida;
				return true;

			}else{
				
				return false;

			}
		}return false;
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

	public float genSize(){
		float size = (float)(Math.random()*10);
		DecimalFormat df = new DecimalFormat("#.00");
		size = Float.valueOf(df.format(size));
		return size;
	}

	public abstract void decVida();

	public abstract void decVida(int dec);

	public abstract void addVida();

	public abstract void addVida(int incvida);
}
	