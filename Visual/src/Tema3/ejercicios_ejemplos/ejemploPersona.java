package Tema3.ejercicios_ejemplos;

public class ejemploPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("11","camilo","peña",22);
        Persona p2 = new Persona("12","camila","flores",20);
        p1.mostrarPersona();
        p2.mostrarPersona();

        // Verificar si son mayores de edad
        System.out.println("Persona 1 es mayor de edad: " + p1.esMayorEdad());
        System.out.println("Persona 2 es mayor de edad: " + p2.esMayorEdad());

        // Verificar si son jubilados
        System.out.println("Persona 1 es jubilada: " + p1.esJubilado());
        System.out.println("Persona 2 es jubilada: " + p2.esJubilado());

        // Calcular y mostrar la diferencia de edad
        System.out.println("Diferencia de edad entre persona1 y persona2: " + p1.diferenciaEdad(p2));
    }
}
