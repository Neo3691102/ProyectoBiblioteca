package capadatos.model.Libro;

import capadatos.dtoEntidades.Libro;

import java.util.List;

public interface ILibroModel {
    List<Libro> listarLibros();

    Libro obtenerLibroPorId(int id);

    void guardarLibro(Libro libro);

    void actualizarLibro(Libro libro);

    void eliminarLibroporID(int id);
}
