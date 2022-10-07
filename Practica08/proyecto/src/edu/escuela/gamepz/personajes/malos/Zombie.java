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

    //Decrementar
    public void decVida(){
        if (ataque == false){
            super.decVida(3);
        }
        else if (ataque == true){
            super.decVida(2);
        }
    }

    public void decVida(int dec){
        if (ataque == false){
            super.decVida(dec*3);
        }
        else if (ataque == true){
            super.decVida(dec*2);
        }
    }

    //Incrementar
    public void addVida(){
        if (ataque == false){
            super.addVida(0);
        }
        else if (ataque == true){
            super.addVida(0);
        }

    }

    public void addVida(int vida){
        if (ataque == true){
            super.addVida(vida *3);
        }
        else if (ataque == false){
            super.addVida(0);
        }
    }







}