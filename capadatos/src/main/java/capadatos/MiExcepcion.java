package capadatos;

public class MiExcepcion extends Exception {

    public MiExcepcion(String message) {
        super("Ocurrio un error - " + message);
    }

    public MiExcepcion() {
        super("Ocurrio un error");
    }

}
