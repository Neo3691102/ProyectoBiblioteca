package capadatos;

import java.util.ArrayList;
import java.util.List;

public class UsuarioEjemplo {
    private String nombre;
    private String correo;
    private String password;
    private List<String> librosprestados = new ArrayList<>();

    public UsuarioEjemplo(String nombre, String correo, String password){
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





    @Override
    public String toString() {
        return "capadatos.Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", librosprestados=" + librosprestados +
                '}';
    }
}
