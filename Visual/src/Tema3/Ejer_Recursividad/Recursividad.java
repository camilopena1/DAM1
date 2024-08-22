package Tema3.Ejer_Recursividad;

public class Recursividad {
    // 1. Calcular el cociente de dos números enteros de forma recursiva.
    public static int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        } else {
            return 1 + cociente(dividendo - divisor, divisor);
        }
    }

    // 2. Pasar de decimal a binario de forma recursiva.
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            return decimalToBinary(decimal / 2) + decimal % 2;
        }
    }

    // 3. Calcular 2 elevado a n de forma recursiva.
    public static int powerOfTwo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * powerOfTwo(n - 1);
        }
    }

    // 4. Calcular el número de cifras de un número entero de forma recursiva.
    public static int countDigits(int number) {
        if (number < 10) {
            return 1;
        } else {
            return 1 + countDigits(number / 10);
        }
    }

    // 5. Sumar dos números enteros de forma recursiva.
    public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sum(a + 1, b - 1);
        }
    }

    // 6. Calcular el resto de la división de forma recursiva.
    public static int remainder(int dividend, int divisor) {
        if (dividend < divisor) {
            return dividend;
        } else {
            return remainder(dividend - divisor, divisor);
        }
    }

    // 7. Sumar los números naturales hasta N de forma recursiva.
    public static int sumNaturals(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumNaturals(n - 1);
        }
    }

    // 8. Invertir una palabra de forma recursiva.
    public static String reverseString(String word) {
        if (word.isEmpty()) {
            return "";
        } else {
            return reverseString(word.substring(1)) + word.charAt(0);
        }
    }

    // 9. Recorrer un array de forma recursiva.
    public static void traverseArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            traverseArray(arr, index + 1);
        }
    }

    // 10. Calcula la potencia de un número de forma recursiva, tanto para
    // exponentes negativos como positivos.
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / (base * power(base, -exponent - 1));
        }
    }

    // 11 Sumar los digitos de un numero recursivamente
    public static int  sumaRecursiva(int numero) {
    // Caso base: Si el número es de un solo dígito, retornamos ese número
    if (numero < 10) {

        return numero;
    }
    // Caso recursivo: Sumamos el último dígito y llamamos a la función
    // recursivamente con el resto del número
    else {
        return (numero % 10) + sumaRecursiva(numero / 10);
    }
}
     

    // 12. Buscar un elemento de un array de forma recursiva.
    public static boolean buscarElemento(int[] array, int elemento, int indice) {
        // Caso base: Si el índice supera el tamaño del array, retorna false
        if (indice >= array.length) {
            return false;
        }
        // Caso base: Si el elemento es encontrado, retorna true
        if (array[indice] == elemento) {
            return true;
        }
        // Caso recursivo: Llama a la función con el siguiente índice
        return buscarElemento(array, elemento, indice + 1);
    }

    // 13. Recorrer una matriz de forma recursiva.
    public static void recorrerMatriz(int[][] matriz, int fila, int columna) {
        // Caso base: Si hemos alcanzado el final de la matriz, retornamos
        if (fila >= matriz.length) {
            return;
        }
        // Imprimimos el elemento actual
        System.out.println(matriz[fila][columna]);
        // Si hemos alcanzado el final de la fila actual, pasamos a la siguiente fila y
        // reiniciamos la columna
        if (columna >= matriz[fila].length - 1) {
            recorrerMatriz(matriz, fila + 1, 0);
        }
        // Si no, avanzamos a la siguiente columna de la misma fila
        else {
            recorrerMatriz(matriz, fila, columna + 1);
        }
    }

    // 14. Obtener el máximo número de un array de forma recursiva, pasando el
    // índice y el número máximo actual.
    public static int maximoArray(int[] array, int indice, int maximoActual) {
        // Caso base: Si hemos alcanzado el final del array, retornamos el máximo actual
        if (indice >= array.length) {
            return maximoActual;
        }
        // Actualizamos el máximo actual si encontramos un número mayor
        if (array[indice] > maximoActual) {
            maximoActual = array[indice];
        }
        // Llamamos recursivamente con el siguiente índice
        return maximoArray(array, indice + 1, maximoActual);
    }

    // 15. Obtener el máximo número de un array de forma recursiva, sin necesidad de
    // pasar el tercer parámetro.
    public static int maximoArray(int[] array, int indice) {
        // Caso base: Si hemos alcanzado el final del array, retornamos el valor en el
        // último índice
        if (indice == array.length - 1) {
            return array[indice];
        }
        // Llamamos recursivamente con el siguiente índice y comparamos con el máximo
        // actual
        return Math.max(array[indice], maximoArray(array, indice + 1));
    }

    // 16. Obtener el mínimo número de un array de forma recursiva.
    public static int minimoArray(int[] array, int indice) {
        // Caso base: Si hemos alcanzado el final del array, retornamos el valor en el
        // último índice
        if (indice == array.length - 1) {
            return array[indice];
        }
        // Llamamos recursivamente con el siguiente índice y comparamos con el mínimo
        // actual
        return Math.min(array[indice], minimoArray(array, indice + 1));
    }

    public static void main(String[] args) {
        // Ejemplos de uso:
        System.out.println("1. Cociente: " + cociente(10, 3));
        System.out.println("2. Decimal a binario: " + decimalToBinary(13));
        System.out.println("3. 2 elevado a 5: " + powerOfTwo(5));
        System.out.println("4. Número de cifras: " + countDigits(12345));
        System.out.println("5. Suma de 5 y 3: " + sum(5, 3));
        System.out.println("6. Resto de la división: " + remainder(10, 3));
        System.out.println("7. Suma de números naturales hasta 5: " + sumNaturals(5));
        System.out.println("8. Palabra invertida: " + reverseString("recursion"));
        int[] array1 = { 1, 2, 3, 4, 5 };
        System.out.print("9. Recorrer array: ");
        traverseArray(array1, 0);
        System.out.println("\n10. Potencia: " + power(2, -3));
        System.out.println("\n11. sumaRecursiva: " + sumaRecursiva(1234));
        int[] array2 = {4, 2, 9, 1, 5, 7};
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("\n12. ¿El elemento 5 está en el array? " + buscarElemento(array2, 5, 0));
        System.out.println("\n13. Recorriendo la matriz:");
        recorrerMatriz(matriz, 0, 0);

        System.out.println("\n14.El máximo número del array es (método con 3 parámetros): "
                + maximoArray(array2, 0, Integer.MIN_VALUE));
        System.out.println("\n15. El máximo número del array es (método sin 3er parámetro): " + maximoArray(array2, 0));
        System.out.println("\n16. El mínimo número del array es: " + minimoArray(array2, 0));

    }
}
