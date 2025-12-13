import java.util.ArrayList;
import java.util.List;

public class CapaDatos {
    public static void main(String[] args) {

    }
}

class Usuario{
    private String nombre;
    private String correo;
    private String password;
    private List<String> librosprestados = new ArrayList<>();

    public Usuario(String nombre, String correo, String password){
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

class Autor{
    private String nombreAutor;
    private String apellidoAutor;
    private String biografia;
    private List<String> librosPublicados = new ArrayList<>();

    public Autor(String nombreAutor, String apellidoAutor,
                 String biografia){
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.biografia = biografia;

    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public List<String> getLibrosPublicados() {
        return librosPublicados;
    }

    public void setLibrosPublicados(List<String> librosPublicados) {
        this.librosPublicados = librosPublicados;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombreAutor='" + nombreAutor + '\'' +
                ", apellidoAutor='" + apellidoAutor + '\'' +
                ", biografia='" + biografia + '\'' +
                ", librosPublicados=" + librosPublicados +
                '}';
    }
}

class Libro{
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int ISBN;

    public Libro(String titulo, String autor, int anioPublicacion, int ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", ISBN=" + ISBN +
                '}';
    }
}

class Biblioteca{
    private List<Libro> libros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    //metodos para agregar
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void agregarAutor(Autor autor){
        autores.add(autor);
    }

    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    //Metodos para eliminar
    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }

    public void eliminarUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

    public void eliminarAutor(Autor autor){
        autores.remove(autor);
    }

    //metodos para modificar
    public Libro modificarLibro(Libro libro){
        return libros.set(libros.indexOf(libro), libro ); //validar si el indice existe
    }

    public Autor modificarAutor(Autor autor){
        return autores.set(autores.indexOf(autor), autor);
    }

    public Usuario modificarUsuario(Usuario usuario){
        return usuarios.set(usuarios.indexOf(usuario), usuario );
    }
}

