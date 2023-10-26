import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0.0;

        System.out.print("Enter your favorite integer: ");
        if (in.hasNextInt()) {
            favInt = in.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            System.exit(1); // Exit the program with an error code
        }

        System.out.print("Enter your favorite double: ");
        if (in.hasNextDouble()) {
            favDouble = in.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid double.");
            System.exit(1); // Exit the program with an error code
        }

        System.out.println("\nYour favorite integer is: " + favInt + " and your favorite double is: " + favDouble);

        // Close the Scanner when done to prevent resource leak
        in.close();
    }
}
