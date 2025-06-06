/*
 * Program: Product Price Comparison
 * File: product.java
 *
 * This program defines a 'product' class with product code, name, and price.
 * It takes input for three product objects from the user,
 * then finds and displays the product with the lowest price.
 * 
 * The program demonstrates object creation, user input handling,
 * and comparison between object attributes.
 */

import java.util.*;

class product {
    int pcode;
    String pname;
    int price;

    product(int c, String n, int p) {
        pcode = c;
        pname = n;
        price = p;
    }

    void display() {
        System.out.println("PRODUCT CODE: " + pcode);
        System.out.println("PRODUCT NAME: " + pname);
        System.out.println("PRODUCT PRICE: " + price);
    }
}

class product {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE DETAILS OF THE FIRST PRODUCT");
        System.out.print("Enter the product code: ");
        int c1 = in.nextInt();
        in.nextLine();
        System.out.print("Enter the product name: ");
        String n1 = in.nextLine();
        System.out.print("Enter the product price: ");
        int p1 = in.nextInt();
        product obj1 = new product(c1, n1, p1);

        System.out.println("\nENTER THE DETAILS OF THE SECOND PRODUCT");
        System.out.print("Enter the product code: ");
        int c2 = in.nextInt();
        in.nextLine();
        System.out.print("Enter the product name: ");
        String n2 = in.nextLine();
        System.out.print("Enter the product price: ");
        int p2 = in.nextInt();
        product obj2 = new product(c2, n2, p2);

        System.out.println("\nENTER THE DETAILS OF THE THIRD PRODUCT");
        System.out.print("Enter the product code: ");
        int c3 = in.nextInt();
        in.nextLine();
        System.out.print("Enter the product name: ");
        String n3 = in.nextLine();
        System.out.print("Enter the product price: ");
        int p3 = in.nextInt();
        product obj3 = new product(c3, n3, p3);

        product min = obj1;
        if (obj2.price < min.price) {
            min = obj2;
        }
        if (obj3.price < min.price) {
            min = obj3;
        }

        System.out.println("\nLOWEST PRICED PRODUCT DETAILS");
        min.display();

        in.close();
    }
}
