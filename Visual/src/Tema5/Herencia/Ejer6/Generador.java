package Tema5.Herencia.Ejer6;

import java.util.Random;

public class Generador {
    private String password;
    private int length;

    // Constructor

    public Generador(int length) {

        this.length = length;

        generatePassword();

    }

    // Getter for password

    public String getPassword() {

        return password;

    }

    // Getter for length

    public int getLength() {

        return length;

    }

    // Method to generate password

    private void generatePassword() {

        Random random = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {

            int choice = random.nextInt(3);

            switch (choice) {

            case 0:

                sb.append((char) (random.nextInt(26) + 'a')); // Lowercase letter

                break;

            case 1:

                sb.append((char) (random.nextInt(26) + 'A')); // Uppercase letter

                break;

            case 2:

                sb.append(random.nextInt(10)); // Digit

                break;

            }

        }

        password = sb.toString();

    }

    // Method to evaluate password strength

    public boolean isStrongPassword() {

        int lowercaseCount = 0;

        int uppercaseCount = 0;

        int digitCount = 0;

        for (char c : password.toCharArray()) {

            if (Character.isLowerCase(c)) {

                lowercaseCount++;

            } else if (Character.isUpperCase(c)) {

                uppercaseCount++;

            } else if (Character.isDigit(c)) {

                digitCount++;

            }

        }

        return digitCount > 5 && lowercaseCount > 1 && uppercaseCount > 2;

    }

}
