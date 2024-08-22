package Tema3.Ejemplo_Array;

public class VectorMain {
    public static void main(String[] args) {
        Vector vector= new Vector();
        int [] array = new int[40];
        vector.cargar(array);
        vector.visualizar(array);
        int minimo=vector.minimo(array);
        int maximo=vector.maximo(array);
        System.out.println("el minimo es "+minimo);
        System.out.println("el maximo es "+maximo);
        vector.media(array);
        vector.sumaTotal(array);
        vector.mediana(array);
    }
}
