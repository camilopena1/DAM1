package vacaciones;

public class ejer3 {
    public static String[] eliminarRepetidos(String[] arrayOriginal) {
        int tamañoArraySinRepetidos = 0;

        // Determinar el tamaño del nuevo array sin repeticiones
        for (int i = 0; i < arrayOriginal.length; i++) {
            boolean esRepetido = false;

            for (int j = 0; j < i; j++) {
                if (arrayOriginal[i].equals(arrayOriginal[j])) {
                    esRepetido = true;
                    break;
                }
            }

            if (!esRepetido) {
                tamañoArraySinRepetidos++;
            }
        }

        // Crear el nuevo array sin repeticiones
        String[] arraySinRepetidos = new String[tamañoArraySinRepetidos];
        int indice = 0;

        // Transferir elementos no repetidos al nuevo array
        for (int i = 0; i < arrayOriginal.length; i++) {
            boolean esRepetido = false;

            for (int j = 0; j < i; j++) {
                if (arrayOriginal[i].equals(arrayOriginal[j])) {
                    esRepetido = true;
                    break;
                }
            }

            if (!esRepetido) {
                arraySinRepetidos[indice] = arrayOriginal[i];
                indice++;
            }
        }

        return arraySinRepetidos;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String[] arrayOriginal = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};

        String[] arraySinRepetidos = eliminarRepetidos(arrayOriginal);

        // Mostrar el nuevo array sin repeticiones
        System.out.println("Array sin repeticiones:");
        
        for (String string : arraySinRepetidos) {
            System.out.println(string);
        }
    }
}
