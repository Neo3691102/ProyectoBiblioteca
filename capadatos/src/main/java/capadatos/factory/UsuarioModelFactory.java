package capadatos.factory;

import capadatos.model.Usuario.IUsuarioModel;
import capadatos.model.Usuario.UsuarioModel;
import jakarta.persistence.EntityManager;

public class UsuarioModelFactory {

    public static IUsuarioModel crear(EntityManager em) {
        return new UsuarioModel(em);
    }
}
