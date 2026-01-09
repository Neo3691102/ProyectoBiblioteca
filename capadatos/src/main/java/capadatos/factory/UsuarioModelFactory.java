package capadatos.factory;

import capadatos.model.IUsuarioModel;
import capadatos.model.UsuarioModel;
import jakarta.persistence.EntityManager;

public class UsuarioModelFactory {

    public static IUsuarioModel crear(EntityManager em) {
        return new UsuarioModel(em);
    }
}
