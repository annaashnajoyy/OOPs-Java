/*
 * Program: Method Overloading to Calculate Area
 *
 * This program demonstrates method overloading in Java to calculate
 * the area of different geometric shapes: circle, rectangle, and triangle.
 * The class 'Area' contains overloaded methods named `calarea` that differ
 * in parameter types and count to compute the respective areas.
 * The main method collects user input and invokes the appropriate method.
 */

import java.util.*;

class Area {
    double calarea(double r) {
        return 3.14 * r * r;
    }

    float calarea(float l, float w) {
        return l * w;
    }

    double calarea(double b, double h) {
        return 0.5 * b * h;
    }
}

public class areac {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Area c = new Area();

        System.out.print("Enter the radius of the circle: ");
        double r = in.nextDouble();
        System.out.println("Area of Circle: " + c.calarea(r));

        System.out.print("Enter the length of the rectangle: ");
        float l = in.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float w = in.nextFloat();
        System.out.println("Area of Rectangle: " + c.calarea(l, w));

        System.out.print("Enter the base of the triangle: ");
        double ba = in.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double h = in.nextDouble();
        System.out.println("Area of Triangle: " + c.calarea(ba, h));

        in.close();
    }
}
