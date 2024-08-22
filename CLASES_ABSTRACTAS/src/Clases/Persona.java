package Clases;

/**
 * La clase abstracta Persona representa a una persona genérica.
 */
abstract class Persona {
    private String nombre; // Atributo de la clase Persona
    
    /**
     * Constructor de la clase Persona.
     * @param n El nombre de la persona.
     */
    public Persona(String n) {
        nombre = n;
    }
    
    /**
     * Método abstracto para obtener la descripción de la persona.
     * @return La descripción de la persona.
     */
    public abstract String getDescripcion();
    
    /**
     * Obtiene el nombre de la persona.
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
}
