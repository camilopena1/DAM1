package Voluntarios;

public class prueba{
    public static void main(String[] args) {
        int[] numero= new int[15];
        int[] cuadrado= new int [15];

        for (int i=0; i<numero.length; i++) {
            numero [i]= (int) (Math.random()*100);
        }

        for (int i=0; i<cuadrado.length; i++) {
            cuadrado[i]= numero[i] *numero[i];
        }
        for(int i=0;i<cuadrado.length;i++){
        System.out.println(numero [i]+","+ cuadrado[i]);
        }
    }


}
    

