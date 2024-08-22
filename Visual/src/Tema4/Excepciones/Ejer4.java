package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Random ramdom1 =  new Random();
        Scanner sc = new Scanner(System.in);
        int [] vector = new int [ramdom1.nextInt(100)+1];
       try{
        for (int i = 0; i < vector.length; i++) {
            Random ramdom2 =  new Random();
            vector[i]=ramdom2.nextInt(10)+1;
        

        } 
        }catch(Exception e){    

        }
        int num=0;
        do{
            System.out.println(" introduce que posicion quieres ver");
            try {
                num=sc.nextInt();
            } catch (InputMismatchException  e) {
              System.out.println("Error valor invalido");
              System.out.println(e.getMessage());
              System.out.println(e);
              break;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(" Te has salido del array");
                System.out.println(e);
            }
            System.out.println(vector[num]);
            
        }while(num>=0);
        sc.close();
    }
}
