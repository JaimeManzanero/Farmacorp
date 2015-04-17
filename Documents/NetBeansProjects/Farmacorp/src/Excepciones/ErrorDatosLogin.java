package excepciones;

/**
 *
 * @author PEDRO
 */
public class ErrorDatosLogin extends RuntimeException {

    public ErrorDatosLogin(String mensaje) {
        super(mensaje);
    }
}
