package validate;

import java.util.Scanner;

public class CheckInputValid {

    public static int readPositiveInt(Scanner scanner, String prompt) {
        int number = 0;
        while (number <= 0) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                number = Integer.parseInt(input);
                if (number <= 0) {
                    System.out.println("Please enter a number > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Re-input");
            }
        }
        return number;
    }

    public static int readInt(Scanner scanner, String prompt) {
        int number = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                number = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return number;
    }
}
