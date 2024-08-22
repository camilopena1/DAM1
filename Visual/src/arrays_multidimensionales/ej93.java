package arrays_multidimensionales;

public class ej93 {
    public static void main(String[] args) {
       String frase = "Mi mama me mima";
        int contadorI = 0;
        int contadorA = 0;
        int contadorE = 0;
        int contadorO = 0;
        int contadorU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char vocal = Character.toUpperCase(frase.charAt(i));
            switch (vocal) {
                case 'A':
                    contadorA++;
                    break;
                case 'E':
                    contadorE++;
                    break;
                case 'I':
                    contadorI++;
                    break;
                case 'O':
                    contadorO++;
                    break;
                case 'U':
                    contadorU++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Nº de A's: " + contadorA + "\n"
                + "Nº de E's: " + contadorE + "\n"
                + "Nº de I's: " + contadorI + "\n"
                + "Nº de O's: " + contadorO + "\n"
                + "Nº de U's: " + contadorU);
    }
    
}
