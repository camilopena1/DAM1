package Voluntarios;

import java.util.Scanner;

public class volun3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int cifraPrincipal;
        

        System.out.println("Introduce un número para saber su factorial");
        cifraPrincipal=sc.nextInt();

        int cifraFactorial=cifraPrincipal;

        for (int i=cifraFactorial-1; i>=1; i--){
            cifraFactorial=cifraFactorial*i;

        }
        System.out.println("El factorial de "+cifraPrincipal+" es:");
        System.out.println(cifraPrincipal+" = "+ cifraFactorial);
        sc.close();
}
    
}
