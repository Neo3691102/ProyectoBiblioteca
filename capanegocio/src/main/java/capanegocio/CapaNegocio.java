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

    public Usuario obtenerusuarioPorIDCN(int id){
        CapaDatos obj = new CapaDatos();
        return obj.obtenerPorIdCD(id);
    }

    public void guardarUsuarioCN(Usuario usuario){
        CapaDatos obj = new CapaDatos();
        obj.guardarUsuarioCD(usuario);
    }

    public void actualizarUsuarioCN(Usuario usuario){
        CapaDatos obj = new CapaDatos();
        obj.actualizarusuarioCD(usuario);
    }

    public void eliminarUsuarioporIdCN(int id){
        CapaDatos cd = new CapaDatos();
        cd.eliminarUsuarioCD(id);
    }
}
