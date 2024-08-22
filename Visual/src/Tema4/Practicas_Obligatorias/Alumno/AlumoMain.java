package Tema4.Practicas_Obligatorias.Alumno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlumoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos alumnos vas a introducir");
        int numAlumnos = sc.nextInt();
        sc.nextLine();
        Alumno[] alumnos = new Alumno[numAlumnos];

        
        introducirDatosAlumnos(sc, alumnos);
        int atributo = seleccionarAtributo(sc);
        ordenar(alumnos, atributo);
        ordenarPorEdad(alumnos);
        mostrarEstadisticas(alumnos);
    }
    public static void introducirDatosAlumnos(Scanner sc, Alumno[] alumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            boolean error = true;
            String nombre="";
            String sexo="";
            int edad=0;
            while (error) {
                error = false;
                try {
                    System.out.println("introduce el nombre");
                     nombre = sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("valor incorrecto");
                    error = true;
                }
            }
            error = true;
            while (error) {
                try {
                    System.out.println("introduce el sexo (H/M)");
                     sexo = sc.nextLine().toLowerCase();
                    
                } catch (InputMismatchException e) {
                    System.out.println("valor incorrecto");
                    error = true;
                }
                error = verificarSexo(sexo);

            }
            error = true;
            while (error) {
                try {
                    System.out.println("introduce la edad");
                     edad = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("valor incorrecto ");
                    error=true;
                }

            }
            alumnos[i]=new Alumno(nombre, sexo, edad);
        }
    }
    public static void mostrarEstadisticas(Alumno[] alumnos) {
        // Cálculo de la edad media de la clase
        double sumaEdades = 0;
        int numAlumnosHombres = 0;
        int sumaEdadesHombres = 0;
        int numAlumnosMujeres = 0;
        int sumaEdadesMujeres = 0;

        for (int i = 0; i < alumnos.length; i++) {
            sumaEdades += alumnos[i].getEdad();

            if (alumnos[i].getSexo().equals("H")) {
                numAlumnosHombres++;
                sumaEdadesHombres += alumnos[i].getEdad();
            } else if (alumnos[i].getSexo().equals("M")) {
                numAlumnosMujeres++;
                sumaEdadesMujeres += alumnos[i].getEdad();
            }
        }

        double edadMediaClase = sumaEdades / alumnos.length;
        double edadMediaHombres = numAlumnosHombres > 0 ? (double) sumaEdadesHombres / numAlumnosHombres : 0;
        double edadMediaMujeres = numAlumnosMujeres > 0 ? (double) sumaEdadesMujeres / numAlumnosMujeres : 0;

        // Mostrar resultados
        System.out.println("Edad media de la clase: " + edadMediaClase);
        System.out.println("Edad media de los chicos: " + edadMediaHombres);
        System.out.println("Edad media de las chicas: " + edadMediaMujeres);
        System.out.println("Total de alumnos: " + alumnos.length);
        System.out.println("Número de chicos: " + numAlumnosHombres);
        System.out.println("Número de chicas: " + numAlumnosMujeres);
    }
    public static void ordenarPorEdad(Alumno[] alumnos) {
        int n = alumnos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (alumnos[j].getEdad() > alumnos[j + 1].getEdad()) {
                    // Intercambiar alumnos[j] y alumnos[j+1]
                    Alumno temp = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = temp;
                }
            }
        }
        
    }
    public static void ordenar(Alumno[] alumnos, int atributo) {
        switch (atributo) {
            case 1:
                ordenarPorNombre(alumnos);
                break;
            case 2:
                ordenarPorSexo(alumnos);
                break;
            case 3:
                ordenarPorEdad(alumnos);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public static void ordenarPorNombre(Alumno[] alumnos) {
        int n = alumnos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (alumnos[j].getNombre().compareTo(alumnos[j + 1].getNombre()) > 0) {
                    // Intercambiar alumnos[j] y alumnos[j+1]
                    Alumno temp = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = temp;
                }
            }
        }

    }

    public static void ordenarPorSexo(Alumno[] alumnos) {
        // Implementación para ordenar por sexo
        int n = alumnos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (alumnos[j].getSexo().compareTo(alumnos[j + 1].getSexo()) > 0) {
                    // Intercambiar alumnos[j] y alumnos[j+1]
                    Alumno temp = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = temp;
                }
            }
        }
    }

    public static int seleccionarAtributo(Scanner sc) {
        System.out.println("Selecciona el atributo por el cual quieres ordenar:");
        System.out.println("1. Nombre");
        System.out.println("2. Sexo");
        System.out.println("3. Edad");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer del scanner
        return opcion;
    }
    public static boolean verificarSexo(String sexo) {
        if (!sexo.equals("h") && !sexo.equals("m")) {
            System.out.println("introduce H o M");
            return true;
        } else {
            return false;
        }
    }
}
