/*
 * Program: Interface-based Area and Perimeter Calculation
 * File: shapeAreaPerimeter.java
 *
 * This program demonstrates the concept of interfaces in Java.
 * It defines a Shape interface with area and perimeter methods.
 * Two classes, Circle and Rectangle, implement this interface.
 * A menu-driven approach allows the user to choose a shape and
 * compute its area and perimeter based on user input.
 */

import java.util.*;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public double area() {
        return Math.PI * r * r;
    }
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Rectangle implements Shape {
    double l, w;
    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    public double area() {
        return l * w;
    }
    public double perimeter() {
        return 2 * (l + w);
    }
}

public class shapeAreaPerimeter {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = in.nextInt();
            if (choice == 3) {
                System.out.println("Exiting..... ");
                break;
            }
            Shape shape;
            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double ra = in.nextDouble();
                    shape = new Circle(ra);
                    System.out.println("Area of Circle: " + shape.area());
                    System.out.println("Perimeter of Circle: " + shape.perimeter());
                    break;
                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double l = in.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double w = in.nextDouble();
                    shape = new Rectangle(l, w);
                    System.out.println("Area of Rectangle: " + shape.area());
                    System.out.println("Perimeter of Rectangle: " + shape.perimeter());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        in.close();
    }
}
