package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        try {
            System.out.println("introduce un numero");
            int num1=sc.nextInt();
            System.out.println("introduce otro numero");
            int num2=sc.nextInt();
            
            System.out.println(num1/num2);
        }catch (InputMismatchException e) {
            System.out.println("has introducido un valor incorrecto");
        }
        catch(ArithmeticException e1){
            System.out.println(" has dividido entre 0");
        }
        sc.close();
    }


}
