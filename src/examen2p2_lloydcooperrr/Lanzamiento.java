package examen2p2_lloydcooperrr;

import java.util.Date;

public class Lanzamiento {
    private String tituloDePublicacion;
    private Date fechaDeLanzamiento;
    private int conteoLikes;
    
    public Lanzamiento(String tituloDePublicacion, Date fechaDeLanzamiento, int conteoLikes) {
        this.tituloDePublicacion = tituloDePublicacion;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.conteoLikes = conteoLikes;
    }

    public String getTituloDePublicacion() {
        return tituloDePublicacion;
    }

    public void setTituloDePublicacion(String tituloDePublicacion) {
        this.tituloDePublicacion = tituloDePublicacion;
    }

    public Date getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(Date fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getConteoLikes() {
        return conteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        this.conteoLikes = conteoLikes;
    }
}
