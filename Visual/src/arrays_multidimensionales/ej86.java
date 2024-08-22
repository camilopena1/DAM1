package arrays_multidimensionales;

public class ej86 {

    public static void main(String[] args) {
        int [][] array=new int [10][10];

        
        //int contador=1;
        for (int fila=0; fila<10; fila++) {
            for (int columna=0; columna<10; columna++) {
                array[fila][columna]=(fila+1)*(columna+1);
            System.out.print(array[fila][columna]+"\t");
            }
            System.out.println();
        }

        

}
}