package capadatos.dtoEntidades;
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "correo")
    private String correo;

    @Column (name = "password")
    private String password;

}
