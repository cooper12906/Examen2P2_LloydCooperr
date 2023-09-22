package examen2p2_lloydcooperrr;

import java.util.ArrayList;

public class ListasDeReproduccion {
    private String nombre;
    private int conteoLikesLR;
    private ArrayList <Cancion> cancionesAgregadas = new ArrayList();

    public ListasDeReproduccion(String nombre, int conteoLikesLR) {
        this.nombre = nombre;
        this.conteoLikesLR = conteoLikesLR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConteoLikesLR() {
        return conteoLikesLR;
    }

    public void setConteoLikesLR(int conteoLikesLR) {
        this.conteoLikesLR = conteoLikesLR;
    }

    public ArrayList<Cancion> getCancionesAgregadas() {
        return cancionesAgregadas;
    }

    public void setCancionesAgregadas(ArrayList<Cancion> cancionesAgregadas) {
        this.cancionesAgregadas = cancionesAgregadas;
    }
    
    
}
