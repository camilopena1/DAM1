package Tema5.Herencia.Ejer6;

import javax.swing.JOptionPane;

public class GeneradorMain {
    public static void main(String[] args) {

        int arraySize = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));

        int passwordLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the passwords:"));

        Generador[] passwords = new Generador[arraySize];

        // Generating passwords

        for (int i = 0; i < arraySize; i++) {
  
              passwords[i] = new Generador(passwordLength);

        }

        // Printing passwords and their evaluation

        for (Generador password : passwords) {

            System.out.println("Password: " + password.getPassword());

            System.out.println("Length: " + password.getLength());

            System.out.println("Strong password: " + password.isStrongPassword());

            System.out.println();

        }

    }
}
