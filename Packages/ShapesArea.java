/*
 * Experiment 19 – Using Packages: Area of Shapes
 * File: ShapesArea
 *
 * This program demonstrates the use of a user-defined package named 'shapes'
 * that contains classes to calculate the area of different shapes.
 */

import shapes.Rectangle;
import shapes.Triangle;
import shapes.Square;
import shapes.Circle;
import java.util.Scanner;

public class ShapesArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length and width of rectangle: ");
        double l = in.nextDouble();
        double w = in.nextDouble();
        Rectangle rect = new Rectangle(l, w);
        System.out.println("Area of Rectangle: " + rect.area());

        System.out.print("\nEnter three sides of triangle (a, b, c): ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        Triangle tria = new Triangle(a, b, c);
        System.out.println("Area of Triangle: " + tria.area());

        System.out.print("\nEnter side of square: ");
        double side = in.nextDouble();
        Square sq = new Square(side);
        System.out.println("Area of Square: " + sq.area());

        System.out.print("\nEnter radius of circle: ");
        double r = in.nextDouble();
        Circle cc = new Circle(r);
        System.out.println("Area of Circle: " + cc.area());
    }
}
