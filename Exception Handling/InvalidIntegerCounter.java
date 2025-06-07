/*
 * Experiment 23 – Exception Handling: Invalid Command-Line Integers
 * File: InvalidIntegerCounter.java
 *
 * This program accepts numbers as command-line arguments.
 * It attempts to parse each input as an integer.
 * If the input is not an integer, it catches the exception and keeps count.
 */

public class InvalidIntegerCounter {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                System.out.println("Valid integer: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer input: " + args[i]);
                count++;
            }
        }

        System.out.println("Total number of invalid inputs: " + count);
    }
}
