import java.util.List;

public class CapaDatos {
    public static void main(String[] args) {

    }
}

class Usuario{
    private String nombre;
    private String correo;
    private String password;
    private List<String> librosprestados;

    public Usuario(String nombre, String correo, String password, List<String>librosprestados){
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.librosprestados = librosprestados;
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

    public List<String> getLibrosprestados() {
        return librosprestados;
    }

    public void setLibrosprestados(List<String> librosprestados) {
        this.librosprestados = librosprestados;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", librosprestados=" + librosprestados +
                '}';
    }
}

