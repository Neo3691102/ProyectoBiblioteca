package capadatos;

import capadatos.JPA.conexionJPA;
import capadatos.dtoEntidades.Usuario;
import capadatos.model.UsuarioModel;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CapaDatos {

    public List<Usuario> listarUsuariosCD() {
        EntityManager em = conexionJPA.getEntityManager();
        UsuarioModel um = new UsuarioModel(em);

        List<Usuario> usuarios = um.listarUsuarios();

        em.close();
        return usuarios;
    }

    public Usuario obtenerPorIdCD(int id) {
        EntityManager em = conexionJPA.getEntityManager();
        UsuarioModel um = new UsuarioModel(em);

        Usuario usuario = um.obtenerporId(id);

        em.close();
        return usuario;
    }

    public void guardarUsuarioCD(Usuario usuario) {
        EntityManager em = conexionJPA.getEntityManager();
        UsuarioModel um = new UsuarioModel(em);

        um.guardar(usuario);

        em.close();
    }

    public void actualizarusuarioCD(Usuario usuario) {
        EntityManager em = conexionJPA.getEntityManager();
        UsuarioModel um = new UsuarioModel(em);

        um.actualizar(usuario);

        em.close();
    }

    public void eliminarUsuarioCD(int id) {
        EntityManager em = conexionJPA.getEntityManager();
        UsuarioModel um = new UsuarioModel(em);

        um.eliminarPorId(id);

        em.close();
    }
}










