package modelo;

import excepciones.*;

/**
 * Clase que representa un empleado de la farmacia
 *
 * @author PEDRO DEL BARRIO
 * @version 1.0
 * @see excepciones.ErrorDatosLogin
 */
public class Empleado {

    private int codigoEmpleado;
    private String nombre, apellido1, apellido2, nombreUsuario, password;

    /**
     * Constructor de la clase Empleado con un parametro de entrada.
     *
     * @param codigoEmpleado numero entero con el codigo a asignar al empleado.
     */
    public Empleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    /**
     * Devuelve un numero entero con el codigo del empleado.
     *
     * @return codigo del empleado.
     */
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Asigna al atributo codigoEmpleado del empleado el numero
     * entero pasado como parametro de entrada.
     *
     * @param codigoEmpleado el codigo numerico a asignar al empleado.
     */
    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    /**
     * Devuelve una cadena con el nombre del empleado.
     *
     * @return nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna al atributo nombre del empleado la cadena
     * pasada como parametro de entrada.
     *
     * @param nombre el nombre a asignar al empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve una cadena con el primer apellido del
     * empleado.
     * 
     * @return primer apellido del empleado.
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Asigna al atributo apellido1 del empleado la cadena
     * pasada como parametro de entrada.
     *
     * @param apellido1 el nombre a asignar al empleado.
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    
    /**
     * Devuelve una cadena con el segundo apellido del
     * empleado.
     * 
     * @return segundo apellido del empleado.
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Asigna al atributo apellido2 del empleado la cadena
     * pasada como parametro de entrada.
     *
     * @param apellido2 el nombre a asignar al empleado.
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Devuelve una cadena con el nombre de usuario del
     * empleado.
     * 
     * @return nombreUsuario del empleado.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Asigna al atributo nombreUsuario del empleado la cadena pasada 
     * como parametro de entrada.
     *
     * @param nombreUsuario el nombre de usuario a asignar al empleado.
     *
     * @exception ErrorDatosLogin si el nombre de usuario no tiene un minimo de 4
     * caracteres, un maximo de 20, no empieza por una letra, o se utiliza algun 
     * caracter que no sea letra, numero, o guiones.
     * @see excepciones.ErrorDatosLogin
     */
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario.length() < 4) {
            throw new ErrorDatosLogin("NOMBRE DE USUARIO DEMASIADO CORTO (MINIMO 4 CARACTERES)");
        } else if (nombreUsuario.length() > 20) {
            throw new ErrorDatosLogin("NOMBRE DE USUARIO DEMASIADO LARGO (MAXIMO 20 CARACTERES)");
        } else if (!(nombreUsuario.toUpperCase().charAt(0) >= 65 && nombreUsuario.toUpperCase().charAt(0) <= 90)) {
            throw new ErrorDatosLogin("EL NOMBRE DE USUARIO DEBE EMPEZAR POR UNA LETRA");
        } else {
            for (int i = 0; i < nombreUsuario.length(); i++) {
                if (!(nombreUsuario.toUpperCase().charAt(i) >= 65 && nombreUsuario.toUpperCase().charAt(i) <= 90)
                        && !(nombreUsuario.charAt(i) >= 48 && nombreUsuario.charAt(i) <= 57)
                        && nombreUsuario.charAt(i) != '_' && nombreUsuario.charAt(i) != '-') {
                    throw new ErrorDatosLogin("NOMBRE DE USUARIO INCORRECTO. SOLO LETRAS, NUMEROS, '-' Y '_'");
                }
            }
        }
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    /**
     * Asigna al atributo password del empleado la cadena pasada como parametro
     * de entrada.
     *
     * @param password el password a asignar al empleado.
     *
     * @exception ErrorDatosLogin si el password no tiene un minimo de 4
     * caracteres, un maximo de 20, o se utiliza algun caracter que no sea
     * letra, numero, o guiones.
     * @see excepciones.ErrorDatosLogin
     */
    public void setPassword(String password) {
        if (password.length() < 4) {
            throw new ErrorDatosLogin("PASSWORD DEMASIADO CORTO (MINIMO 4 CARACTERES)");
        } else if (password.length() > 20) {
            throw new ErrorDatosLogin("PASSWORD DEMASIADO LARGO (MAXIMO 20 CARACTERES)");
        } else {
            for (int i = 0; i < password.length(); i++) {
                if (!(password.toUpperCase().charAt(i) >= 65 && password.toUpperCase().charAt(i) <= 90)
                        && !(password.charAt(i) >= 48 && password.charAt(i) <= 57)
                        && password.charAt(i) != '_' && password.charAt(i) != '-') {
                    throw new ErrorDatosLogin("PASSWORD INCORRECTO. SOLO LETRAS, NUMEROS, '-' Y '_'");
                }
            }
        }
        this.password = password;
    }
    
    @Override
    /**
     * Devuelve una cadena con informacion sobre los datos de un
     * empleado.
     *
     * @return datos del empleado con formato.
     */
    public String toString() {
        return "CODIGO EMPLEADO: " + codigoEmpleado + "\nNOMBRE: " + nombre + " " + apellido1 + " " + apellido2;
    }

}
