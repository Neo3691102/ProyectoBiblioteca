package capadatos.model;

import capadatos.dtoEntidades.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class UsuarioModel implements IUsuarioModel {

    private final EntityManager entityManager;

    public UsuarioModel(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);

        Root<Usuario> rootEntry = cq.from(Usuario.class);
        CriteriaQuery<Usuario> select = cq.select(rootEntry);

        TypedQuery<Usuario> query = entityManager.createQuery(select);
        return query.getResultList();
    }

    @Override
    public Usuario obtenerporId(int id) {
        return entityManager.find(Usuario.class, id);
    }

    @Override
    public void guardar(Usuario usuario) {
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

    @Override
    public void actualizar(Usuario usuario) {
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            entityManager.merge(usuario);
            transaction.commit();
        }catch(Exception e){
            System.out.println("Ocurrio un error al actualizar el usuario");
            transaction.rollback();
        }
    }

    @Override
    public void eliminarPorId(int id) {
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Usuario usuario = entityManager.find(Usuario.class, id);
            if (usuario != null) {
                entityManager.remove(usuario);
            }

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

}
