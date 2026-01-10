package capadatos;

import capadatos.JPA.conexionJPA;
import capadatos.dtoEntidades.Usuario;
import capadatos.dtoEntidades.Autor;
import capadatos.dtoEntidades.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CapaDatosTest {

    private CapaDatos cd;

    @BeforeEach
    void setUp() {
        cd = new CapaDatos();
    }

    @Test
    void listarUsuarios_noDebeSerNull() {
        List<Usuario> usuarios = cd.listarUsuariosCD();
        assertNotNull(usuarios);
    }

    @Test
    void guardarUsuario_yObtenerPorId() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Usuario CD");
        usuario.setCorreo("cd@mail.com");
        usuario.setPassword("123");

        cd.guardarUsuarioCD(usuario);

        Usuario recuperado = cd.obtenerPorIdCD(usuario.getIdUsuario());

        assertNotNull(recuperado);
        assertEquals("Usuario CD", recuperado.getNombre());
    }


    @Test
    void actualizarUsuario_modificaDatos() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Original");
        usuario.setCorreo("ori@mail.com");
        usuario.setPassword("111");

        cd.guardarUsuarioCD(usuario);

        usuario.setNombre("Modificado");
        cd.actualizarusuarioCD(usuario);

        Usuario actualizado = cd.obtenerPorIdCD(usuario.getIdUsuario());
        assertEquals("Modificado", actualizado.getNombre());
    }

    @Test
    void eliminarUsuario_porId() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Eliminar CD");
        usuario.setCorreo("del@mail.com");
        usuario.setPassword("123");

        cd.guardarUsuarioCD(usuario);
        int id = usuario.getIdUsuario();

        cd.eliminarUsuarioCD(id);

        Usuario eliminado = cd.obtenerPorIdCD(id);
        assertNull(eliminado);
    }

    //Autor
    @Test
    void guardarAutor_yListar() {
        Autor autor = new Autor();
        autor.setNombreAutor("Autor CD");
        autor.setApellidoAutor("Apellido");
        autor.setBiografia("Bio");

        cd.guardarAutorCD(autor);

        List<Autor> autores = cd.listarAutoresCD();

        assertTrue(
                autores.stream().anyMatch(a -> a.getNombreAutor().equals("Autor CD"))
        );
    }

    //Libro
    @Test
    void guardarLibro_yObtener() {
        Libro libro = new Libro();
        libro.setTitulo("Libro CD");
        libro.setAutor("Autor");
        libro.setAnioPublicacion(2025);
        libro.setISBN(999999);

        cd.guardarLibroCD(libro);

        Libro recuperado = cd.obtenerLibroPorIdCD(libro.getIdLibro());
        assertNotNull(recuperado);
    }

    //Limpar BD despues de las pruebas

    @AfterEach
    void limpiar() {
        EntityManager em = conexionJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            em.createQuery("DELETE FROM capadatos.dtoEntidades.Libro").executeUpdate();
            em.createQuery("DELETE FROM capadatos.dtoEntidades.Autor").executeUpdate();
            em.createQuery("DELETE FROM capadatos.dtoEntidades.Usuario").executeUpdate();

            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }



}