package aplicacion;

import capadatos.Biblioteca;
import capadatos.Usuario;
import capanegocio.CapaNegocio;

public class Library {
    public static void main(String[] args) {

        System.out.println("---------Bienvenido a la biblioteca---------");



        //Creacion de usuario
        Usuario u1 = new Usuario("Nestor", "n@mail.com", "123");
        Usuario u2 = new Usuario("Juan", "Juan@mail.com", "2333");
        CapaNegocio cN = new CapaNegocio();
        String usuario = cN.getUserInfo(u1);
        System.out.println(usuario);

        //Creacion de biblioteca
        Biblioteca b = new Biblioteca();
        b.agregarUsuario(u1);
        b.agregarUsuario(u2);

        b.getUsers();








    }
}
