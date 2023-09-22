package examen2p2_lloydcooperrr;

import java.util.ArrayList;

public class Artista extends Usuario{
    private String nombreArtistico;
    private ArrayList <Cancion> cancionesSubidas = new ArrayList();
    private ArrayList <Album> albumesPublicados = new ArrayList();

    public Artista(String nombreArtistico, String tipoUser, String username, String password, int edad) {
        super(tipoUser, username, password, edad);
        this.nombreArtistico = nombreArtistico;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCancionesSubidas() {
        return cancionesSubidas;
    }

    public void setCancionesSubidas(ArrayList<Cancion> cancionesSubidas) {
        this.cancionesSubidas = cancionesSubidas;
    }

    public ArrayList<Album> getAlbumesPublicados() {
        return albumesPublicados;
    }

    public void setAlbumesPublicados(ArrayList<Album> albumesPublicados) {
        this.albumesPublicados = albumesPublicados;
    }
    
    
}
