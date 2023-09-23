package examen2p2_lloydcooperrr;

public class Cancion {
    private String tituloCancion;
    private int tiempoDuracion;
    private String referencia;

    public Cancion(String tituloCancion, int tiempoDuracion, Album referencia) {
        this.tituloCancion = tituloCancion;
        this.tiempoDuracion = tiempoDuracion;
        this.referencia = referencia.getTituloDePublicacion();
    }

    public Cancion(String tituloCancion, int tiempoDuracion, Single referencia) {
        this.tituloCancion = tituloCancion;
        this.tiempoDuracion = tiempoDuracion;
        this.referencia = referencia.getTituloDePublicacion();
    }
   
    public String getTituloCancion() {
        return tituloCancion;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return tituloCancion + "\n" + tiempoDuracion;
    }
    
    
}
