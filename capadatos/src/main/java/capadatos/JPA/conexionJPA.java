package capadatos.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class conexionJPA {

    private static EntityManagerFactory emf;

    private conexionJPA() {
        // constructor privado → evita instancias
    }

    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("coneccionLocalMySQL");
        }
        return emf.createEntityManager();
    }
}
