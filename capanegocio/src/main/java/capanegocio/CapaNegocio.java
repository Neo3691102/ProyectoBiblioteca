package capanegocio;

import capadatos.CapaDatos;
import capadatos.MiExcepcion;
import capadatos.UsuarioEjemplo;
import capadatos.dtoEntidades.Autor;
import capadatos.dtoEntidades.Libro;
import capadatos.dtoEntidades.Usuario;

import java.util.List;

public class CapaNegocio {

    //Metodos Usuario
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

    public void actualizarUsuarioCN(Usuario usuario) throws MiExcepcion {
        CapaDatos obj = new CapaDatos();
        if(usuario == null){
            throw new MiExcepcion("No hay ningun usuario para actualizar");
        }
        obj.actualizarusuarioCD(usuario);
    }

    public void eliminarUsuarioporIdCN(int id){
        CapaDatos cd = new CapaDatos();
        cd.eliminarUsuarioCD(id);
    }

    //Metodos Autor
    public List<Autor> listarAutoresCN(){
        CapaDatos cd = new CapaDatos();
        return cd.listarAutoresCD();
    }

    public Autor obtenerAutorPorIdCN(int id){
        CapaDatos cd = new CapaDatos();
        return cd.obtenerAutorPorIdCD(id);
    }

    public void guardarAutorCN(Autor autor){
        CapaDatos cd = new CapaDatos();
        cd.guardarAutorCD(autor);
    }

    public void actualizarAutorCN(Autor autor){
        CapaDatos cd = new CapaDatos();
        cd.actualizarAutorCD(autor);
    }

    public void eliminarAutorPorIdCN(int id){
        CapaDatos cd = new CapaDatos();
        cd.eliminarAutorxIdCD(id);
    }

    //Metodos Libro
    public List<Libro> listarLibrosCN(){
        CapaDatos cd = new CapaDatos();
        return cd.listarLibrosCD();
    }

    public Libro obtenerLibroPorIdCN(int id){
        CapaDatos cd = new CapaDatos();
        return cd.obtenerLibroPorIdCD(id);
    }

    public void guardarLibroCN(Libro libro){
        CapaDatos cd = new CapaDatos();
        cd.guardarLibroCD(libro);
    }

    public void actualizarLibroCN(Libro libro){
        CapaDatos cd = new CapaDatos();
        cd.actualizarLibroCD(libro);
    }

    public void eliminarLibroPorIdCN(int id){
        CapaDatos cd = new CapaDatos();
        cd.eliminarLibroPorId(id);
    }
}
