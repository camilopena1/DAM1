package Tema3.Ejercicios_Completos.Fecha;

import java.util.Scanner;

public class fechaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, anno;
        do {
            System.out.print("Introduce el día: ");
            dia = scanner.nextInt();
            System.out.print("Introduce el mes: ");
            mes = scanner.nextInt();
            System.out.print("Introduce el año: ");
            anno = scanner.nextInt();
        } while (!Fecha.validarFecha(dia, mes, anno));

        Fecha miFechaNacimiento = new Fecha(dia, mes, anno);

        System.out.println("Introduce otra fecha para comparar:");
        System.out.print("Día: ");
        int otroDia = scanner.nextInt();
        System.out.print("Mes: ");
        int otroMes = scanner.nextInt();
        System.out.print("Año: ");
        int otroAnno = scanner.nextInt();

        if (Fecha.validarFecha(otroDia, otroMes, otroAnno)) {
            Fecha fechaReferencia = new Fecha(otroDia, otroMes, otroAnno);

            if (miFechaNacimiento.equals(fechaReferencia)) {
                System.out.println("Ambas fechas son iguales.");
            } else {
                System.out.println("Las fechas son diferentes.");
            }

            int diasTranscurridos = miFechaNacimiento.diasTranscurridos(otroDia, otroMes, otroAnno);
            if (diasTranscurridos >= 0) {
                System.out.println("Días transcurridos entre las fechas: " + diasTranscurridos);
            }
        } else {
            System.out.println("Fecha no válida.");
        }

        // Corrección para calcular los días transcurridos entre fechaInicio y fechaFin
        Fecha fechaInicio = new Fecha(1, 1, 2000);
        Fecha fechaFin = new Fecha(1, 1, 2001);

        int diasTranscurridos = fechaInicio.diasTranscurridos(1, 1, 2001);

        System.out.println("Días transcurridos entre las fechas: " + diasTranscurridos);

        scanner.close();
    }
}
