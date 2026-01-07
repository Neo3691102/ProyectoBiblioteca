package capanegocio;

import capadatos.CapaDatos;
import capadatos.UsuarioEjemplo;
import capadatos.dtoEntidades.Usuario;

public class CapaNegocio {
    public String getUserInfo(UsuarioEjemplo usuarioEjemplo){
        CapaDatos capaDatos = new CapaDatos();
        return capaDatos.infoUsuario(usuarioEjemplo);
    }

    public void guardarUsuarioCN(Usuario usuario){
        CapaDatos obj = new CapaDatos();
        obj.guardarUsuarioCP(usuario);
    }
}
