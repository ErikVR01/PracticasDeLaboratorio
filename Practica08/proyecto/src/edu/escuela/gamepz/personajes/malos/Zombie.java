package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
public class Zombie extends Personaje{
	public boolean ataque;

    public boolean getAtaque(){
        return ataque;
    }

	//constructores
    public Zombie(String nombre, int vida, boolean ataque){
    	super(nombre, vida);
        this.ataque = ataque;
    }

    public Zombie(String nombre, boolean ataque){
    	super(nombre, 3);
        this.ataque = ataque;
    }

    public Zombie(String nombre){
    	super(nombre, 3);
        ataque = false;
    }

    public String getDetalle(){
        return super.getDetalle() +" "+ ataque;
    }







}