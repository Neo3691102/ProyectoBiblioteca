package capadatos;

import capadatos.JPA.conexionJPA;
import capadatos.dtoEntidades.Autor;
import capadatos.dtoEntidades.Libro;
import capadatos.dtoEntidades.Usuario;
import capadatos.factory.AutorModelFactory;
import capadatos.factory.LibroModelFactory;
import capadatos.model.Autor.IAutorModel;
import capadatos.model.Libro.ILibroModel;
import jakarta.persistence.EntityManager;
import capadatos.factory.UsuarioModelFactory;
import capadatos.model.Usuario.IUsuarioModel;


import java.util.List;

public class CapaDatos {

    //METODOS USUARIOS
    public List<Usuario> listarUsuariosCD() {
        EntityManager em = conexionJPA.getEntityManager();
        IUsuarioModel um = UsuarioModelFactory.crear(em);

        List<Usuario> usuarios = um.listarUsuarios();

        em.close();
        return usuarios;
    }


    public Usuario obtenerPorIdCD(int id) {
        EntityManager em = conexionJPA.getEntityManager();
        IUsuarioModel um = UsuarioModelFactory.crear(em);

        Usuario usuario = um.obtenerporId(id);

        em.close();
        return usuario;
    }

    public void guardarUsuarioCD(Usuario usuario) {
        EntityManager em = conexionJPA.getEntityManager();
        IUsuarioModel um = UsuarioModelFactory.crear(em);

        um.guardar(usuario);

        em.close();
    }

    public void actualizarusuarioCD(Usuario usuario) {
        EntityManager em = conexionJPA.getEntityManager();
        IUsuarioModel um = UsuarioModelFactory.crear(em);

        um.actualizar(usuario);

        em.close();
    }

    public void eliminarUsuarioCD(int id) {
        EntityManager em = conexionJPA.getEntityManager();
        IUsuarioModel um = UsuarioModelFactory.crear(em);

        um.eliminarPorId(id);

        em.close();
    }

    //METODOS AUTORES
    public List<Autor> listarAutoresCD(){
        EntityManager em = conexionJPA.getEntityManager();
        IAutorModel am = AutorModelFactory.crear(em);

        List<Autor> autores = am.listarAutores();

        em.close();
        return autores;
    }

    public Autor obtenerAutorPorIdCD(int id){
        EntityManager em = conexionJPA.getEntityManager();
        IAutorModel am = AutorModelFactory.crear(em);

        Autor autor = am.obtenerPorId(id);

        em.close();
        return autor;
    }

    public void guardarAutorCD(Autor autor){
        EntityManager em = conexionJPA.getEntityManager();
        IAutorModel am = AutorModelFactory.crear(em);

        am.guardarAutor(autor);
        em.close();
    }

    public void actualizarAutorCD(Autor autor){
        EntityManager em = conexionJPA.getEntityManager();
        IAutorModel am = AutorModelFactory.crear(em);

        am.actualizarAutor(autor);
        em.close();

    }

    public void eliminarAutorxIdCD(int id){
        EntityManager em = conexionJPA.getEntityManager();
        IAutorModel am = AutorModelFactory.crear(em);

        am.eliminarAutorPorId(id);
        em.close();
    }

    //METODOS LIBROS
    public List<Libro> listarLibrosCD(){
        EntityManager em = conexionJPA.getEntityManager();
        ILibroModel lm = LibroModelFactory.crear(em);

        List<Libro> libros = lm.listarLibros();
        em.close();

        return libros;
    }

    public Libro obtenerLibroPorIdCD(int id){
        EntityManager em = conexionJPA.getEntityManager();
        ILibroModel lm = LibroModelFactory.crear(em);

        Libro libro = lm.obtenerLibroPorId(id);
        em.close();

        return libro;

    }

    public void guardarLibroCD(Libro libro){
        EntityManager em = conexionJPA.getEntityManager();
        ILibroModel lm = LibroModelFactory.crear(em);

        lm.guardarLibro(libro);
        em.close();
    }

    public void actualizarLibroCD(Libro libro){
        EntityManager em = conexionJPA.getEntityManager();
        ILibroModel lm = LibroModelFactory.crear(em);

        lm.actualizarLibro(libro);
        em.close();
    }

    public void eliminarLibroPorId(int id){
        EntityManager em = conexionJPA.getEntityManager();
        ILibroModel lm = LibroModelFactory.crear(em);

        lm.eliminarLibroporID(id);
        em.close();
    }
}










