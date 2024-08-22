package Tema5.Ejer_Amplicacion.Herencia;

public class empleMain {
    public static void main(String[] args) {
        Empleados[] listEmpleados = new Empleados[4];
        listEmpleados[0]=new EmpleadoAsalariado("1", "camilo", "pee", "2014", 1000, 10.5);
        listEmpleados[1]=new EmpleadoAsalariado("1", "camilo", "pee", "2014", 1000, 10.5);

        listEmpleados[2]=new EmpleadoAsalariado("1", "camilo", "pee", "2014", 1000, 10.5);

        listEmpleados[3]=new EmpleadoAsalariado("1", "camilo", "pee", "2014", 1000, 10.5);

    }
}
