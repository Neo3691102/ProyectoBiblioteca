package capadatos.dtoEntidades;

import jakarta.persistence.*;

@Entity
@Table (name = "autores")
public class Autor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idAutor;

    @Column (name = "nombreautor")
    private String nombreAutor;

    @Column (name = "apellidoautor")
    private String apellidoAutor;

    @Column (name = "biografia")
    private String biografia;

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "idAutor=" + idAutor +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", apellidoAutor='" + apellidoAutor + '\'' +
                ", biografia='" + biografia + '\'' +
                '}';
    }
}
