/*
 * Program: Complex Number Addition
 * File: complexNo.java
 *
 * This program takes two complex numbers as input from the user,
 * adds them using the `complex` class, and displays the result.
 * The `complex` class defines a complex number with real and imaginary parts,
 * supports addition, and printing in standard form.
 */

import java.util.Scanner;

class complex {
    double real, img;

    complex(double r, double i){
        real = r;
        img = i;
    }

    complex add(complex c){
        return new complex(real + c.real, img + c.img);
    }

    void display(){
        System.out.println(real + " + " + img + "i");
    }
}

public class complexNo {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of 1st complex number:");
        double r1 = s.nextDouble();
        double i1 = s.nextDouble();
        complex c1 = new complex(r1, i1);

        System.out.println("Enter real and imaginary part of 2nd complex number:");
        double r2 = s.nextDouble();
        double i2 = s.nextDouble();
        complex c2 = new complex(r2, i2);

        complex sum = c1.add(c2);

        System.out.print("Sum of complex numbers: ");
        sum.display();
    }
}
