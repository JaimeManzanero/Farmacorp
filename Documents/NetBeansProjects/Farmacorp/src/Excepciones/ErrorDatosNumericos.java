package excepciones;

/**
 * Clase que representa una excepcion generada en tiempo
 * de ejecucion relacionada con algun dato de entrada numerico
 * con un valor no permitido.
 *
 * @author PEDRO DEL BARRIO
 * @version 1.0
 */
public class ErrorDatosNumericos extends RuntimeException {
    
    /**
     * Constructor de la clase ErrorDatosNumericos con un parametro de entrada.
     *
     * @param mensaje cadena con el mensaje que se asociará al
     * error generado durante la ejecucion.
     */
    public ErrorDatosNumericos(String mensaje) {
        super(mensaje);
    }

}
