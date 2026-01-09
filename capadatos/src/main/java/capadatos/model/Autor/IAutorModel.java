package capadatos.model.Autor;

import capadatos.dtoEntidades.Autor;

import java.util.List;

public interface IAutorModel {
    List<Autor> listarAutores();

    Autor obtenerPorId(int id);

    void guardarAutor(Autor autor);

    void actualizarAutor(Autor autor);

    void eliminarAutorPorId(int id);
}
