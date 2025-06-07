/*
 * Experiment 22 – User-Defined Exception: Negative Numbers Not Allowed
 * File: AverageCalculator.java
 *
 * This program calculates the average of n numbers entered by the user.
 * If a negative number is entered, a custom exception is thrown and handled.
 */

import java.util.Scanner;

// Custom Exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums;
        int sum = 0;

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        nums = new int[n];

        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                nums[i] = sc.nextInt();

                if (nums[i] < 0) {
                    throw new NegativeNumberException("Negative number entered: " + nums[i]);
                }

                sum += nums[i];
            }

            double avg = (double) sum / n;
            System.out.println("Average: " + avg);

        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
