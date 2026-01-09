package capadatos.model.Autor;

import capadatos.dtoEntidades.Autor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class AutorModel implements IAutorModel{

    private final EntityManager entityManager;

    public AutorModel(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Autor> listarAutores() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Autor> cq = cb.createQuery(Autor.class);

        Root<Autor> rootEntry = cq.from(Autor.class);
        CriteriaQuery<Autor> select = cq.select(rootEntry);

        TypedQuery<Autor> query = entityManager.createQuery(select);
        return query.getResultList();
    }

    @Override
    public Autor obtenerPorId(int id) {
        return entityManager.find(Autor.class, id);
    }

    @Override
    public void guardarAutor(Autor autor) {
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            entityManager.persist(autor);
            transaction.commit();
        }catch(Exception e){
            System.out.println("Error al guardar un usuario");
            transaction.rollback();
        }
    }

    @Override
    public void actualizarAutor(Autor autor) {
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            entityManager.merge(autor);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error al actualizar usuario");
            transaction.rollback();
        }
    }

    @Override
    public void eliminarAutorPorId(int id) {
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            Autor autor = entityManager.find(Autor.class, id);
            if(autor != null){
                entityManager.remove(autor);
            }
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error al eliminar usuario");
            transaction.rollback();
        }
    }
}
