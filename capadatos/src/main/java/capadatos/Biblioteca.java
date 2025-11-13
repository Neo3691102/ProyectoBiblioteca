package capadatos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    private final List<Libro> libros = new ArrayList<>();
    private final List<Autor> autores = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();

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
