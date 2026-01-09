package capadatos;

import capadatos.JPA.conexionJPA;
import capadatos.dtoEntidades.Usuario;
import capadatos.model.UsuarioModel;
import jakarta.persistence.EntityManager;
import capadatos.factory.UsuarioModelFactory;
import capadatos.model.IUsuarioModel;


import java.util.List;

public class CapaDatos {

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
}










