package capadatos.factory;

import capadatos.model.Autor.IAutorModel;
import capadatos.model.Autor.AutorModel;
import jakarta.persistence.EntityManager;

public class AutorModelFactory {
    public static IAutorModel crear(EntityManager em) {
        return new AutorModel(em);
    }
}
