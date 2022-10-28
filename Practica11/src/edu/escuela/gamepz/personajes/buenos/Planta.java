package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.*;

public class Planta extends Personaje{
	public Escudo escudo;
    
    public char getEscudo(){
        return escudo;
    }

	//constructores
    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }

    public Planta(String nombre, char escudo){
        super(nombre, 3);
        this.escudo = escudo;
    }

    public Planta(String nombre, int vida,){
        super(nombre, vida, Escudo.NULO);
    }

    public Planta(String nombre, Escudo.NULO){
        super(nombre, 3, Escudo.NULO);
    }

    public String toString(){
        return super.toString() + " " + escudo;
    }

    //Decrementar
    public void decVida(){
    	setVida(vida-escudo.getNivel());
    }

    public void decVida(int dec){
        setVida(vida-escudo.getNivel()*dec);
    }

    //incrementar
    public void addVida(){
        if (escudo == 'A'){
            super.addVida(2);
        } else {
            super.decVida();
        }
    }

    public void addVida(int incvida){
        if (escudo == 'A'){
            super.addVida(incvida*2);
        } else {
            super.decVida();
        }
    }




}