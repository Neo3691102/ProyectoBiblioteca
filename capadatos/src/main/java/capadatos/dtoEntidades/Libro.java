package capadatos.dtoEntidades;

import jakarta.persistence.*;

@Entity
@Table (name = "libros")
public class Libro {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int IdLibro;

    @Column (name = "titulo")
    private String titulo;

    @Column (name = "autor")
    private String autor;

    @Column (name = "anioPublicacion")
    private int anioPublicacion;

    @Column (name = "ISBN")
    private int ISBN;

    //Getters y setters

    public int getIdLibro() {
        return IdLibro;
    }

    public void setIdLibro(int idLibro) {
        IdLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "IdLibro=" + IdLibro +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", ISBN=" + ISBN +
                '}';
    }
}
