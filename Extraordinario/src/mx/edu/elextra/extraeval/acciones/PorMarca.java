package mx.edu.elextra.extraeval.acciones;

import java.util.Comparator;
import mx.edu.elextra.extraeval.dispositivos.Dispositivo;
public class PorMarca implements Comparator<Dispositivo>{
	public int compare(Dispositivo p1, Dispositivo p2) {
        if (p1.getCosto() != p2.getCosto()){
            return (p2.getCosto()<p1.getCosto())? -1:1;
		}
        return p1.getMarca().compareTo(p2.getMarca());
    }
}