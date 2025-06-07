/*
 * Experiment 20 – Using Package: Arithmetic Operations
 * File: arithmeticOp.java
 *
 * This program demonstrates the use of a custom package 'arithmetic'
 * which contains classes for basic operations: Add, Subtract, Multiply, and Divide.
 */

import arithmetic.Add;
import arithmetic.Subtract;
import arithmetic.Multiply;
import arithmetic.Divide;
import java.util.Scanner;

public class arithmeticOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = in.nextInt();
        int y = in.nextInt();

        Add a = new Add();
        Subtract s = new Subtract();
        Multiply m = new Multiply();
        Divide d = new Divide();

        System.out.println("Addition: " + a.add(x, y));
        System.out.println("Subtraction: " + s.subtract(x, y));
        System.out.println("Multiplication: " + m.multiply(x, y));
        System.out.println("Division: " + d.divide(x, y));
    }
}
