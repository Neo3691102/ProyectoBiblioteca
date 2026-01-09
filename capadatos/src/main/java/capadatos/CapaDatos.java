package capadatos;


import capadatos.dtoEntidades.Usuario;
import capadatos.model.UsuarioModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class CapaDatos {
    public String infoUsuario(UsuarioEjemplo usuarioEjemplo){
        return usuarioEjemplo.toString();
    }

    public List<Usuario> listarUsuariosCD(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coneccionLocalMySQL");
        EntityManager em = emf.createEntityManager();

        UsuarioModel um = new UsuarioModel(em);

        return um.listarUsuarios();
    }

    public Usuario obtenerPorIdCD(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coneccionLocalMySQL");
        EntityManager em = emf.createEntityManager();

        UsuarioModel um = new UsuarioModel(em);

        return um.obtenerporId(id);
    }

    public void guardarUsuarioCD(Usuario usuario){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("coneccionLocalMySQL");
        EntityManager em = emf.createEntityManager();


        UsuarioModel um = new UsuarioModel(em);


        um.guardar(usuario);


        em.close();
        emf.close();

    }

    public void actualizarusuarioCD(Usuario usuario){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coneccionLocalMySQL");
        EntityManager em = emf.createEntityManager();

        UsuarioModel um = new UsuarioModel(em);

        um.actualizar(usuario);

        em.close();
        emf.close();
    }

    public void eliminarUsuarioCD(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coneccionLocalMySQL");
        EntityManager em = emf.createEntityManager();

        UsuarioModel um = new UsuarioModel(em);

        um.eliminarPorId(id);

        em.close();
        emf.close();
    }

}









