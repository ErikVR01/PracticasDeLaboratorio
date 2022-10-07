public class Planta extends Personaje{
	public char escudo;
    
    public char getEscudo(){
        return escudo;
    }

    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }

    public Planta(String nombre, char escudo){
        super(nombre, 3);
        this.escudo = escudo;
    }

    public Planta(String nombre, int vida){
        super(nombre, vida);
        escudo = 'A';
    }

    public Planta(String nombre){
        super(nombre, 3);
        escudo = 'A';
    }

    public String getDetalle(){
        return super.getDetalle() + " " + escudo;
    }

    public static void decVida(){
    	if (escudo == 'A'){
            super.decVida(2);
        } else{
        	super.decVida();
        }
    }

    public static void decVida(int dec){
        if (escudo == 'A'){
            super.decVida(dec*2);
        } else {
            super.decVida();
        }
    }




}