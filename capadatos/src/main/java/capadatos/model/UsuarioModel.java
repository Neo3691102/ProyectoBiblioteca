package capadatos.model;

import capadatos.dtoEntidades.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class UsuarioModel {

    private final EntityManager entityManager;

    public UsuarioModel(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public List<Usuario> listarUsuarios(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);

        Root<Usuario> rootEntry = cq.from(Usuario.class);
        CriteriaQuery<Usuario> select = cq.select(rootEntry);

        TypedQuery<Usuario> query = entityManager.createQuery(select);
        return query.getResultList();
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
