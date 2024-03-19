/*
* This program uses a basic class to make an array of integers
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-03-08
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class Stacks {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Stacks() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Add stack
        final BasicClass basicStack = new BasicClass();

        // Scanners
        final Scanner input = new Scanner(System.in);

        // Enter array loop
        System.out.print("Enter a string: ");
        final String string = input.nextLine();
        basicStack.push(string);

        // Show stack
        basicStack.showStack();

        // Close scanners
        input.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}