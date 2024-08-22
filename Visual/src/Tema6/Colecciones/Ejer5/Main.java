package Tema6.Colecciones.Ejer5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 Al instanciar el objeto ArrayList dale 5 posiciones inicialmente.

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> arrayEmpleados = new ArrayList<>(5);
        //2. Añadir 4 elementos utilizando add. Los elementos deben ser de las 3 clases
        Empleado emple1 = new Empleado("camilo", "123", 500);
        Empleado emple2 = new Empleado("camila", "321", 500);
        Consultor consult1 = new Consultor("pepe", "111", 600, 30, 10);
        Comercial comer1 = new Comercial("lola", "222", 700, 10);
        arrayEmpleados.add(emple1);
        arrayEmpleados.add(emple2);
        arrayEmpleados.add(consult1);
        arrayEmpleados.add(comer1);
        //3. Borrar elementos de una posición facilitada por el usuario.

        System.out.println("que posicion quieres borrar?");
        int posicion=sc.nextInt();
        arrayEmpleados.remove(posicion);
        for (Empleado empleado : arrayEmpleados) {
            System.out.println(empleado);
        }
        //6. Sustituye el cuarto elemento de la lista por otro contenido.
        Empleado emple3 = new Empleado("sasa", "123", 500);
        arrayEmpleados.set(4, emple1);
        //7. Recorrer el arrayList con iterator. 
        // Comprueba el efecto del polimorfismo en el ArrayList.
        
        Iterator<Empleado> iterator = arrayEmpleados.iterator();
        while (iterator.hasNext()) {
            Empleado elemento = iterator.next();
            System.out.println(elemento);
        }


        Empleado [] arrayEmpleados2 = new Empleado[arrayEmpleados.size()];
        arrayEmpleados2=arrayEmpleados.toArray(arrayEmpleados2);

    }
}
