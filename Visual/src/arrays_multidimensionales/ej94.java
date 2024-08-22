package arrays_multidimensionales;

import java.util.Scanner;

public class ej94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el una frese para decir si es un palindromo o no");
        String cadena=sc.nextLine();
        String palabraMinusculas=cadena.replaceAll("\\s", "").toLowerCase();
        boolean esPalindromo=true;
        for (int i = 0, j = palabraMinusculas.length() - 1; i < j; i++, j--) {
            if (palabraMinusculas.charAt(i) != palabraMinusculas.charAt(j)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println(palabraMinusculas + " es un palíndromo.");
        } else {
            System.out.println(palabraMinusculas + " no es un palíndromo.");
        }

        sc.close();
    }
    
}
