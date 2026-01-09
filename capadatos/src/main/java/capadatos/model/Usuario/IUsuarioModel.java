package capadatos.model.Usuario;

import capadatos.dtoEntidades.Usuario;

import java.util.List;

public interface IUsuarioModel {
    List<Usuario> listarUsuarios();

    Usuario obtenerporId(int id);

    void guardar(Usuario usuario);

    void actualizar(Usuario usuario);

    void eliminarPorId(int id);

}
