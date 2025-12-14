package aplicacion;

import capadatos.*;
import capanegocio.CapaNegocio;

import java.util.List;
import java.util.stream.Stream;

public class Library {
    public static void main(String[] args) {

        System.out.println("---------Bienvenido a la biblioteca---------");



        //Creacion de usuario
        Usuario u1 = new Usuario("Nestor", "n@mail.com", "123");
        Usuario u2 = new Usuario("Juan", "Juan@mail.com", "2333");
//        CapaNegocio cN = new CapaNegocio();
//        String usuario = cN.getUserInfo(u1);
//        System.out.println(usuario);

        //Creacion de Autores
        Autor a1 = new Autor("Carl", "Jung",
                "Psicoterapeuta estadounidense que se dedico a estudiar la mente humana");
        Autor a2 = new Autor("William", "Sheakspeare", "Dramaturgo y poeta inglés");

        //Creacion de Libros
        Libro l1 = new Libro("Romeo y Julieta", "William Shakespeare", 1597, 2255447);
        Libro l2 = new Libro("Freud y el psicoanalisis", "Carl Jung", 1906, 5448771);

        //Creacion de biblioteca
        Biblioteca b = new Biblioteca();
        b.agregarUsuario(u1);
        b.agregarUsuario(u2);
        b.agregarAutor(a1);
        b.agregarAutor(a2);
        b.agregarLibro(l1);
        b.agregarLibro(l2);

        //Creacion de stream de usuarios
        Stream<Usuario> sU = b.getUsers().stream();
        System.out.println("------------------------------");
        sU.forEach(u -> {
            System.out.println(u);
        });
        System.out.println("------------------------------");

        //Creacion de stream de autores
        Stream<Autor> sA = b.getAuthors()
                .stream()
                .filter(a -> a.getNombreAutor().equalsIgnoreCase("Carl"));

        sA.forEach(a -> { //modificacion del nombre del autor
            a.setNombreAutor("Carl Gustav");
            System.out.println(a);
        });



        System.out.println("------------------------------");

        //Creacion de stream de libros
        Stream<Libro> sL = b.getBooks().stream();
        System.out.println("------------------------------"); //Filtro de un libro por autor
        sL.filter(l -> l.getAutor().equalsIgnoreCase("Carl Jung")).forEach(l -> {
            System.out.println(l);
        });
        System.out.println("------------------------------");


        //Creacion y eliminacion de un libro de la lista de la biblioteca
        Libro l3 = new Libro("Periquillo Sarniento",
                "José Fernandez de Lizardi", 1816, 5646634);

        b.agregarLibro(l3);

        List<Libro> libros = b.getBooks();
        libros.forEach(l -> {
            System.out.println(l);
        });

        b.eliminarLibro(l3);

        libros.forEach(l -> {
            System.out.println(l);
        });

        //Modificacion de un Usuario
        Stream<Usuario> modU = b.getUsers().stream();

        try {
                    modU
                    .filter(u -> u.getCorreo().equalsIgnoreCase("Juan@mail.com"))
                    .findFirst()
                    .orElseThrow(() -> new MiExcepcion("Usuario no encontrado"))
                    .setNombre("Juan Perez");

        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }







    }
}
