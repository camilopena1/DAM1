package Voluntarios;

import java.util.Scanner;

public class volun2 {
    public static void main(String[] args) {
    int numero, cifra, nuevoNumero;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        
        nuevoNumero = 0; 
        
        while (numero != 0) {        
            cifra = numero % 10;     
            numero = numero / 10;    
            nuevoNumero = nuevoNumero * 10 + cifra;
        }
        
        numero = nuevoNumero;
        
        System.out.println("EL NUMERO INVERTIDO ES :" + numero);
        sc.close();
}
    
}
