package vacaciones;

public class ejer4 {

    public static void main(String[] args) {
        int[][] arrayBidimensional = {
                { 45, 92, 14, 20, 25 },
                { 78, 60, 39, 48, 18 },
                { 11, 94, 45, 98, 32 },
                { 35, 21, 67, 84, 73 }
        };

        int[] resultado = corteza(arrayBidimensional);

        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }

    public static int[] corteza(int[][] n) {
        int filas = n.length;
        int columnas = n[0].length;
        int elementosCorteza = 2 * filas + 2 * (columnas - 2);

        int[] cortezaArray = new int[elementosCorteza];
        int indice = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = i; j < columnas - i; j++) {
                cortezaArray[indice++] = n[i][j];
            }

            for (int k = i + 1; k < filas - i; k++) {
                cortezaArray[indice++] = n[k][columnas - i - 1];
            }

            if (filas - i - 1 > i) {
                for (int l = columnas - i - 2; l >= i; l--) {
                    cortezaArray[indice++] = n[filas - i - 1][l];
                }
            }

            if (columnas - i - 1 > i) {
                for (int m = filas - i - 2; m > i; m--) {
                    cortezaArray[indice++] = n[m][i];
                }
            }
        }

        return cortezaArray;

    }

}
