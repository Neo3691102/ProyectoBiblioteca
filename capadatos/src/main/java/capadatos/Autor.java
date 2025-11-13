package capadatos;

import java.util.ArrayList;
import java.util.List;

public class Autor{
    private String nombreAutor;
    private String apellidoAutor;
    private String biografia;
    private List<String> librosPublicados = new ArrayList<>();

    public Autor(String nombreAutor, String apellidoAutor,
                 String biografia){
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.biografia = biografia;

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
        return "capadatos.Autor{" +
                "nombreAutor='" + nombreAutor + '\'' +
                ", apellidoAutor='" + apellidoAutor + '\'' +
                ", biografia='" + biografia + '\'' +
                ", librosPublicados=" + librosPublicados +
                '}';
    }
}