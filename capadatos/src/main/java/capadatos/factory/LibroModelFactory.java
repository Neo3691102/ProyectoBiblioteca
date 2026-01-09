package capadatos.factory;


import capadatos.model.Libro.ILibroModel;
import capadatos.model.Libro.LibroModel;
import jakarta.persistence.EntityManager;

public class LibroModelFactory {
    public static ILibroModel crear(EntityManager em) {
        return new LibroModel(em);
    }
}
