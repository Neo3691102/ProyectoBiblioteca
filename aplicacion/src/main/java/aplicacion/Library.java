package aplicacion;

import capadatos.Usuario;
import capanegocio.CapaNegocio;

public class Library {
    public static void main(String[] args) {

        System.out.println("---------Bienvenido a la biblioteca---------");

        //Creacion de usuario
        Usuario u1 = new Usuario("Nestor", "n@mail.com", "123");
        CapaNegocio cN = new CapaNegocio();
        String usuario = cN.getUserInfo(u1);
        System.out.println(usuario);





    }
}
