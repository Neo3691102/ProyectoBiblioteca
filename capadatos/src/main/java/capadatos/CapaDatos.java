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

    public void guardarUsuarioCD(Usuario usuario){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("coneccionLocalMySQL");
        EntityManager em = emf.createEntityManager();


        UsuarioModel um = new UsuarioModel(em);


        um.guardar(usuario);


        em.close();
        emf.close();

    }



}









