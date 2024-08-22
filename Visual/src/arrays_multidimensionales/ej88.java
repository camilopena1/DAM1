package arrays_multidimensionales;

import java.util.Scanner;

public class ej88 {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce los alumnos");
        int alumnos=3;
        System.out.println("Introduce los asignaturas");
        int asignaturas=teclado.nextInt();
        int[][] array = new int[alumnos][asignaturas];
        int max=0;
        int min=10;
        int media=0;
int n=0;
        for (int fila=0; fila<alumnos; fila++){
            for (int columna=0; columna<asignaturas; columna++){

                System.out.println("Dime las notas de los alumnos");
                n= teclado.nextInt();
                array[fila][columna]=n;
                
                if (n>max){
                    max=n;               
                }

                if (n<min){
                    min=n;
                }

                media+=n;
                

                
            }
            
        }
        for (int fila=0; fila<alumnos; fila++){
            for (int columna=0; columna<asignaturas; columna++){
                System.out.print(array[alumnos][asignaturas]+" \t");
            }
            System.out.println();
        }
        media/=(alumnos*asignaturas);
        System.out.println("la nota maxima minima y la media es "+max+" "+ min +" "+ media);
        
    }
}