package examen2p2_lloydcooperrr;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String tipoUser;
    private String username;
    private String password;
    private int edad;

    public Usuario(String tipoUser, String username, String password, int edad) {
        this.tipoUser = tipoUser;
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }   
}
