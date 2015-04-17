package modelo;

import excepciones.*;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class Empleado {

    private int codigoEmpleado;
    private String nombre, apellido1, apellido2, nombreUsuario, password;

    public Empleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

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
    public String toString() {
        return "CODIGO EMPLEADO: " + codigoEmpleado + "\nNOMBRE: " + nombre + " " + apellido1 + " " + apellido2;
    }

}
