package Tema3.Ejercicios_Completos.Colegio;

public class Colegio {
    private String nombre;
    private int numeroAlumnos;
    private Alumno[] alumnos;

    public Colegio(String nombre, int numeroAlumnos) {
        this.nombre = nombre;
        this.numeroAlumnos = numeroAlumnos;
        this.alumnos = new Alumno[numeroAlumnos];
    }

    public void nuevoAlumno(String nombre, double notaMedia) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) { // Buscar un espacio nulo en el array
                Alumno nuevoAlumno = new Alumno();
                nuevoAlumno.setNombre(nombre);
                nuevoAlumno.setNotaMedia(notaMedia);
                alumnos[i] = nuevoAlumno; // Asignar el nuevo alumno al array
                System.out.println("Nuevo alumno creado: " + nuevoAlumno.getNombre() +
                        ", Nota Media: " + nuevoAlumno.getNotaMedia());
                return;
            }
        }
        System.out.println("No hay espacio disponible para agregar un nuevo alumno.");
    }

    public void getTodosAlumnos() {
        System.out.println("Información de todos los alumnos:");

        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.println("Nombre: " + alumno.getNombre() + ", Nota Media: " + alumno.getNotaMedia());
            }
        }
    }

    public void expulsarAlumno(String nombre) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNombre().equals(nombre)) {
                System.out.println("Alumno eliminado: " + alumnos[i].getNombre());
                alumnos[i] = null; // Eliminar el alumno del array
                return;
            }
        }

        System.out.println("No se encontró ningún alumno con el nombre: " + nombre);
    }

    public void getDatosAlumno(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno != null && alumno.getNombre().equals(nombre)) {
                System.out.println("Información del alumno " + nombre + ":");
                System.out.println("Nombre: " + alumno.getNombre() + ", Nota Media: " + alumno.getNotaMedia());
                return;
            }
        }

        System.out.println("No se encontró ningún alumno con el nombre: " + nombre);
    }

    public void setNotaMedia(String nombre, double nuevaNota) {
        for (Alumno alumno : alumnos) {
            if (alumno != null && alumno.getNombre().equals(nombre)) {
                alumno.setNotaMedia(nuevaNota);
                System.out.println("Nota actualizada para el alumno " + nombre + ": " + nuevaNota);
                return;
            }
        }

        System.out.println("No se encontró ningún alumno con el nombre: " + nombre);
    }
}
