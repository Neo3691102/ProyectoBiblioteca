package capadatos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    private final List<Libro> libros = new ArrayList<>();
    private final List<Autor> autores = new ArrayList<>();
    private final List<UsuarioEjemplo> usuarioEjemplos = new ArrayList<>();

    //metodos para imprimir en consola las listas
    public List<UsuarioEjemplo> getUsers() {
        return usuarioEjemplos;
    }

    public List<Autor> getAuthors(){
        return autores;
    }

    public List<Libro> getBooks(){
        return libros;
    }

    //metodos para agregar
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void agregarAutor(Autor autor){
        autores.add(autor);
    }

    public void agregarUsuario(UsuarioEjemplo usuarioEjemplo){
        usuarioEjemplos.add(usuarioEjemplo);
    }

    //Metodos para eliminar
    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }

    public void eliminarUsuario(UsuarioEjemplo usuarioEjemplo){
        usuarioEjemplos.remove(usuarioEjemplo);
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

    public UsuarioEjemplo modificarUsuario(UsuarioEjemplo usuarioEjemplo){
        return usuarioEjemplos.set(usuarioEjemplos.indexOf(usuarioEjemplo), usuarioEjemplo);
    }
}
