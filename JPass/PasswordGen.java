// This was coded by Sami Elsayed 
// PassGen - the ultimate password generator

import java.util.Scanner;

public class PasswordGen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PassGen: The ultimate password generator - Developed by Sami Elsayed 2022 \nType a digit to generate a password:");

        // User types a random number
        int digit = input.nextInt();

        // All of the characters for the generator
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String characters = "`~!@#$%^&*()_{}|:<>?/.,';][-";

        // An empty string for the password, the base
        String password = "";

        // The generator
        for (int i = 0; i < digit; i++) {
            int rand = (int)(5 * Math.random());

            switch (rand) {
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    rand = (int)(lowercase.length() * Math.random());
                    password += String.valueOf(lowercase.charAt(rand));
                    break;
                case 2:
                    rand = (int)(lowercase.length() * Math.random());
                    password += String.valueOf(uppercase.charAt(rand));
                    break;
                case 3:
                    rand = (int)(numbers.length() * Math.random());
                    password += String.valueOf(numbers.charAt(rand));
                    break;
                case 4:
                    rand = (int)(characters.length() * Math.random());
                    password += String.valueOf(characters.charAt(rand));
                    break;
            }
        }

        System.out.println(password);
    }
}
