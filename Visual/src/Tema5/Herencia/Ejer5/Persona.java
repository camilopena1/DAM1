package Tema5.Herencia.Ejer5;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean esMayorDeEdad() {
        int edad = getEdad();
        if (edad > 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean dniValido(String dni) {
        // Verificar si la longitud es correcta
        if (dni.length() == 9) {
            // Extraer los primeros 8 caracteres (dígitos)
            String digitos = dni.substring(0, 8);

            // Verificar si los primeros 8 caracteres son dígitos
            if (digitos.matches("\\d{8}")) {
                // Extraer la última letra
                char letra = dni.charAt(8);

                // Verificar si la letra es válida (Puedes agregar las letras válidas según tus criterios)
                if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
    }

}
