package SaberYGanar;

public class Jugador {
    private String nombre;
    private TipoJugador tipo;
    private int puntuacion;

    public Jugador(String nombre, TipoJugador tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validar que el nombre no esté vacío
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public TipoJugador getTipo() {
        return tipo;
    }

    public void setTipo(TipoJugador tipo) {
        this.tipo = tipo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        // Validar que la puntuación no sea negativa
        if (puntuacion >= 0) {
            this.puntuacion = puntuacion;
        } else {
            System.out.println("La puntuación no puede ser negativa.");
        }
    }

    public void aumentarPuntuacion(int puntos) {
        puntuacion += puntos;
    }

    public void reiniciarPuntuacion() {
        puntuacion = 0;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Puntuación: " + puntuacion);
    }
}
