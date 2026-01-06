package capadatos.model;

import capadatos.dtoEntidades.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UsuarioModel {

    private final EntityManager entityManager;

    public UsuarioModel(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void guardar(Usuario usuario){
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            entityManager.persist(usuario);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Ocurrio un error al guardar el nuevo usuario");
            transaction.rollback();
        }
    }
}
