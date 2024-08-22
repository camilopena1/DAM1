package Clases;

/**
 * La clase Alumno representa a un alumno que extiende de Persona.
 */
public class Alumno extends Persona {
    private String especialidad;
    
    /**
     * Constructor de la clase Alumno.
     * @param n El nombre del alumno.
     * @param m La especialidad del alumno.
     */
    public Alumno(String n, String m) {
        super(n);
        especialidad = m;
    }
    
    /**
     * Obtiene la descripción del alumno.
     * @return La descripción del alumno.
     */
    public String getDescripcion() {
        return "Un alumno que estudia " + especialidad;
    }
}
