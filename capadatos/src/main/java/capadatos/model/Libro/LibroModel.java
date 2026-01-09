package capadatos.model.Libro;

import capadatos.dtoEntidades.Autor;
import capadatos.dtoEntidades.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class LibroModel implements ILibroModel{

    private final EntityManager entityManager;

    public LibroModel(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Libro> listarLibros() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Libro> cq = cb.createQuery(Libro.class);

        Root<Libro> rootEntry = cq.from(Libro.class);
        CriteriaQuery<Libro> select = cq.select(rootEntry);

        TypedQuery<Libro> query = entityManager.createQuery(select);
        return query.getResultList();
    }

    @Override
    public Libro obtenerLibroPorId(int id) {
        return entityManager.find(Libro.class, id);
    }

    @Override
    public void guardarLibro(Libro libro) {
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            entityManager.persist(libro);
            transaction.commit();
        }catch(Exception e){
            System.out.println("Error al guardar un libro");
            transaction.rollback();
        }
    }

    @Override
    public void actualizarLibro(Libro libro) {
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            entityManager.merge(libro);
            transaction.commit();
        }catch(Exception e){
            System.out.println("Error al actualizar libro");
            transaction.rollback();
        }
    }

    @Override
    public void eliminarLibroporID(int id) {
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            Libro libro = entityManager.find(Libro.class, id);
            if(libro != null){
                entityManager.remove(libro);
            }
            transaction.commit();
        }catch (Exception e){
            System.out.println("Error al eliminar el usuario");
            transaction.rollback();
        }
    }
}
