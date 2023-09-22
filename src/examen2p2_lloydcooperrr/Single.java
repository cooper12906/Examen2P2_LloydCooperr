package examen2p2_lloydcooperrr;

import java.util.Date;

public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single(Cancion cancion, String tituloDePublicacion, Date fechaDeLanzamiento, int conteoLikes) {
        super(tituloDePublicacion, fechaDeLanzamiento, conteoLikes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }
}
