package Tema3.Ejemplo_Array;

import java.util.Arrays;
import java.util.Random;

public class Vector {

    public void cargar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            int numeroAleotorio = rand.nextInt(201);
            array[i] = numeroAleotorio;

        }
    }

    public void visualizar(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public int maximo(int[] array) {
        int maximo = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo)
                maximo = array[i];
        }
        return maximo;
    }

    public int minimo(int[] array) {
        int minimo = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo)
                minimo = array[i];
        }
        return minimo;
    }

    public void media(int[] array) {
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            contador++;
        }
        double media = suma / contador;
        System.out.println("la media del array es " + media);
    }

    public void sumaTotal(int[] array) {
        int sumaTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumaTotal += array[i];
        }
        System.out.println("La suma total es " + sumaTotal);
    }

    public void mediana(int[] array) {
        Arrays.sort(array);
        int tamanioArray = array.length;
        if (tamanioArray % 2 != 0) {
            int posicionMediana = (tamanioArray - 1) / 2;
            System.out.println("la mediana es " + array[posicionMediana]);

        } else {
            int valor1 = array[tamanioArray / 2];
            int valor2 = array[tamanioArray / 2 - 1];
            double mediana = (double) (valor1 + valor2) / 2;
            System.out.println("La mediana es " + mediana);
        }

    }

}
