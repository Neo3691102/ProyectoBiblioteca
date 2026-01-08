package capanegocio;

import capadatos.CapaDatos;
import capadatos.UsuarioEjemplo;
import capadatos.dtoEntidades.Usuario;

import java.util.List;

public class CapaNegocio {
    public String getUserInfo(UsuarioEjemplo usuarioEjemplo){
        CapaDatos capaDatos = new CapaDatos();
        return capaDatos.infoUsuario(usuarioEjemplo);
    }

    public List<Usuario> listarUsuariosCN(){
        CapaDatos obj = new CapaDatos();

        return obj.listarUsuariosCD();
    }

    public void guardarUsuarioCN(Usuario usuario){
        CapaDatos obj = new CapaDatos();
        obj.guardarUsuarioCD(usuario);
    }
}
