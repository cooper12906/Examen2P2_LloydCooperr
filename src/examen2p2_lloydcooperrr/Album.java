package examen2p2_lloydcooperrr;

import java.util.ArrayList;
import java.util.Date;

public class Album extends Lanzamiento{
    private ArrayList<Cancion> cancionesPertenecientes = new ArrayList();
    private int cantCanciones;

    public Album(int cantCanciones, String tituloDePublicacion, Date fechaDeLanzamiento, int conteoLikes) {
        super(tituloDePublicacion, fechaDeLanzamiento, conteoLikes);
        this.cantCanciones = cantCanciones;
    }

    public ArrayList<Cancion> getCancionesPertenecientes() {
        return cancionesPertenecientes;
    }

    public void setCancionesPertenecientes(ArrayList<Cancion> cancionesPertenecientes) {
        this.cancionesPertenecientes = cancionesPertenecientes;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }
}
