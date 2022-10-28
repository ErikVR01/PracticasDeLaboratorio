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
    	super(nombre, vida);
        this.ataque=ataque;
    }

    public Zombie(String nombre, boolean ataque){
    	this(nombre, 3, ataque);

    }

    public Zombie(String nombre){
    	this(nombre, 3, false);
    }

    public String toString(){
        return this.toString() +" "+ ataque;
    }

    //Decrementar
    public void decVida(){
        if (ataque == false){
            this.decVida(3);
        }
        else if (ataque == true){
            this.decVida(2);
        }
    }

    public void decVida(int dec){
        if (ataque == false){
            this.decVida(dec*3);
        }
        else if (ataque == true){
            this.decVida(dec*2);
        }
    }

    //Incrementar
    public void addVida(){
        if (ataque == false){
            this.addVida(0);
        }
        else if (ataque == true){
            this.addVida(0);
        }

    }

    public void addVida(int vida){
        if (ataque == true){
            this.addVida(vida *3);
        }
        else if (ataque == false){
            this.addVida(0);
        }
    }


    public void comer(){
        System.out.println("Come cerebros");
    }




}