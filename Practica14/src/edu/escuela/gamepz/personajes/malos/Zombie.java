package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;
public class Zombie extends Personaje implements Muerto{
	public boolean ataque;

    public boolean getAtaque(){
        return ataque;
    }

	//constructores
    public Zombie(String nombre, int vida, boolean ataque){
    	super(nombre, vida, 0.0f);
        this.ataque=ataque;
    }

    public Zombie(String nombre, boolean ataque){
    	this(nombre, 3, ataque);

    }

    public Zombie(String nombre){
    	this(nombre, 3, false);
    }

    public Zombie(String nombre, float size){
        super(nombre,3,size);
    }

    public String toString(){
        return super.toString() +" "+ ataque;
    }

    public void comer(){
        System.out.println("Come cerebros");
    }

    //Decrementar
    public void decVida(){
        if (ataque == false){
            super.setVida(3);
        }
        else if (ataque == true){
            super.setVida(2);
        }
    }

    public void decVida(int dec){
        if (ataque == false){
            super.setVida(dec*3);
        }
        else if (ataque == true){
            super.setVida(dec*2);
        }

    }
    //Incrementar
    public void addVida(){
        if (ataque == false){
            super.setVida(0);
        }
        else if (ataque == true){
            super.setVida(0);
        }

    }

    public void addVida(int vida){
        if (ataque == true){
            super.setVida(vida *3);
        }
        else if (ataque == false){
            super.setVida(0);
        }
    }



}