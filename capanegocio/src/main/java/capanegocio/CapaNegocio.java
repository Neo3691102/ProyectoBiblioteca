package capanegocio;

import capadatos.CapaDatos;
import capadatos.Usuario;

public class CapaNegocio {
    public String getUserInfo(Usuario usuario){
        CapaDatos capaDatos = new CapaDatos();
        return capaDatos.infoUsuario(usuario);
    }
}
