package examen2p2_lloydcooperrr;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private ArrayList <Cancion> cancionesFavoritas = new ArrayList();
    private ArrayList <ListasDeReproduccion> listasCreadas = new ArrayList();
    private ArrayList <ListasDeReproduccion> listasConLike = new ArrayList();

    public Cliente(String tipoUser, String username, String password, int edad) {
        super(tipoUser, username, password, edad);
    }

    public ArrayList<Cancion> getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(ArrayList<Cancion> cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public ArrayList<ListasDeReproduccion> getListasCreadas() {
        return listasCreadas;
    }

    public void setListasCreadas(ArrayList<ListasDeReproduccion> listasCreadas) {
        this.listasCreadas = listasCreadas;
    }

    public ArrayList<ListasDeReproduccion> getListasConLike() {
        return listasConLike;
    }

    public void setListasConLike(ArrayList<ListasDeReproduccion> listasConLike) {
        this.listasConLike = listasConLike;
    }
    
    
}
