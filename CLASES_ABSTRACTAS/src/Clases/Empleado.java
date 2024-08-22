package Clases;

import java.util.GregorianCalendar;

/**
 * La clase Empleado representa a un empleado que extiende de Persona.
 */
public class Empleado extends Persona {
    private double sueldo;
    private GregorianCalendar fechacontrato;
    
    /**
     * Constructor de la clase Empleado.
     * @param n El nombre del empleado.
     * @param s El sueldo del empleado.
     * @param anno El año de contratación.
     * @param mes El mes de contratación.
     * @param dia El día de contratación.
     */
    public Empleado(String n, double s, int anno, int mes, int dia) {
        super(n);
        sueldo = s;
        GregorianCalendar calendario = new GregorianCalendar(anno, mes - 1, dia);
        fechacontrato = calendario;
    }

    /**
     * Obtiene el sueldo del empleado.
     * @return El sueldo del empleado.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Obtiene la fecha de contratación del empleado.
     * @return La fecha de contratación del empleado.
     */
    public GregorianCalendar getFechacontrato() {
        return fechacontrato;
    }

    /**
     * Obtiene la descripción del empleado.
     * @return La descripción del empleado.
     */
    public String getDescripcion() {
        return "Un empleado con un sueldo de " + sueldo;
    }

    /**
     * Aumenta el sueldo del empleado en un porcentaje dado.
     * @param porcentaje El porcentaje de aumento.
     */
    public void subirsueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
}
