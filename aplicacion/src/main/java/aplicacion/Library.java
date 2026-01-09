package aplicacion;

import capadatos.dtoEntidades.Autor;
import capadatos.dtoEntidades.Libro;
import capadatos.dtoEntidades.Usuario;
import capanegocio.CapaNegocio;

import java.util.List;


public class Library {
    public static void main(String[] args) {
        System.out.println("---------Bienvenido a la biblioteca---------");
//        Usuario usuario = new Usuario();
//        usuario.setNombre("Judith Marquez");
//        usuario.setCorreo("JM@mail.com");
//        usuario.setPassword("369");
        CapaNegocio cn = new CapaNegocio();
//        cn.guardarUsuarioCN(usuario);


        System.out.println("-------Lista de usuarios------");
        List<Usuario> listadeusuarios =  cn.listarUsuariosCN();
        listadeusuarios.forEach(user -> System.out.println(user));
        System.out.println("-----------------------------------");

        System.out.println("-------------------Usuario por id------------------------");
        Usuario usuarioid3 = new Usuario();
        usuarioid3 = cn.obtenerusuarioPorIDCN(3);
        System.out.println("El usuario con el id#3 -> " + usuarioid3);


        System.out.println("-----------------Actualizar usuario------------------------");
        usuarioid3.setNombre("Abigail");
        usuarioid3.setPassword("contraseña actualizada!");
        usuarioid3.setCorreo("Aupdated@mail.com");
        cn.actualizarUsuarioCN(usuarioid3);
        System.out.println("Usuario con Id#3 actualizado -> " + cn.obtenerusuarioPorIDCN(3));

        System.out.println("--------------Eliminar usuario-------------------");


        cn.eliminarUsuarioporIdCN(2);
        System.out.println("--------Nueva lista de usuarios-----------");
        List<Usuario> nuevalistausuarios = cn.listarUsuariosCN();
        nuevalistausuarios.forEach(u -> System.out.println(u));
        System.out.println("---------------------------------------------");


        //Creacion de Autor
//        Autor autor1 = new Autor();
//        autor1.setNombreAutor("William");
//        autor1.setApellidoAutor("Shakespeare");
//        autor1.setBiografia("Dramaturgo, poeta y actor inglés.  " +
//                "Conocido en ocasiones como el Bardo de Avon, se le considera el escritor más importante " +
//                "en lengua inglesa y como uno de los más célebres de la literatura universal.");
//        cn.guardarAutorCN(autor1);
//
//        Autor autor2 = new Autor();
//        autor2.setNombreAutor("Franz");
//        autor2.setApellidoAutor("Kafka");
//        autor2.setBiografia("escritor bohemio de lengua alemana. Su obra, tiene como temas los conflictos paternofiliales, " +
//                "la ansiedad, el existencialismo, la brutalidad física y psicológica, la culpa," +
//                " la filosofía del absurdo, la burocracia y las transformaciones espirituales.");
//        cn.guardarAutorCN(autor2);

        System.out.println("-----------------Lista de Autores------------------");
        List<Autor> autores = cn.listarAutoresCN();
        autores.forEach(au -> System.out.println(au));
        System.out.println("----------------------------------------------------");

        System.out.println("-----------------Actualizar autor--------------------");
        Autor autorParaUPDTE = cn.obtenerAutorPorIdCN(2);
        autorParaUPDTE.setNombreAutor("Jose Luis");
        autorParaUPDTE.setApellidoAutor("Borges");
        autorParaUPDTE.setBiografia("escritor, poeta, ensayista y traductor argentino, " +
                "extensamente considerado una figura clave tanto para la literatura en español" +
                " como para la literatura universal.");
        cn.actualizarAutorCN(autorParaUPDTE);
        System.out.println("---------------------Autores actualizados----------------");
        autores.forEach(au -> System.out.println(au));

        //eliminar autor
        cn.eliminarAutorPorIdCN(5);
        System.out.println("----------------------Lista despues de la eliminacion-----------------------");
        List<Autor> autoresafterDelete = cn.listarAutoresCN();
        autoresafterDelete.forEach(a -> System.out.println(a));

        //Creacion de libro
//        Libro libro1 = new Libro();
//        libro1.setTitulo("¡Callate y escucha!");
//        libro1.setAutor("Tilman Fertitta");
//        libro1.setAnioPublicacion(2015);
//        libro1.setISBN(545646523);
//        cn.guardarLibroCN(libro1);
//
//        Libro libro2 = new Libro();
//        libro2.setTitulo("Padre rico y padre pobre");
//        libro2.setAutor("Robert Kiyosaki");
//        libro2.setAnioPublicacion(1992);
//        libro2.setISBN(421687541);
//        cn.guardarLibroCN(libro2);

//        Libro libro3 = new Libro();
//        libro3.setTitulo("El cuadrante del flujo del dinero");
//        libro3.setAutor("Ronaldinho");
//        libro3.setAnioPublicacion(1995);
//        libro3.setISBN(1547894447);
//        cn.guardarLibroCN(libro3);

        //Actualizar libro
        Libro libroparaactualizar = cn.obtenerLibroPorIdCN(3);
        libroparaactualizar.setAutor("Robert Kiyosaki");
        cn.actualizarLibroCN(libroparaactualizar);

        //Eliminar libro
        cn.eliminarLibroPorIdCN(1);

        System.out.println("------------Lista de libros-----------");
        List<Libro> libros = cn.listarLibrosCN();
        libros.forEach(l -> System.out.println(l));
    }
}
