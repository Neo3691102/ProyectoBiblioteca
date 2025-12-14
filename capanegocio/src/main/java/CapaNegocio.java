public class CapaNegocio {
    public String getUserInfo(Usuario usuario){
        CapaDatos capaDatos = new CapaDatos();
        return capaDatos.infoUsuario(usuario);
    }
}
