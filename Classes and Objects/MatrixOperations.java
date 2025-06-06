/*
 * Experiment 09 – Matrix Addition and Multiplication (Simplified)
 * File: MatrixOperations.java
 *
 * This program takes two 2x2 matrices as input from the user,
 * performs addition and multiplication, and displays the result.
 */

import java.util.Scanner;

class MatrixOps {
    int[][] mat1 = new int[2][2];
    int[][] mat2 = new int[2][2];
    int[][] result = new int[2][2];

    void readMatrices(Scanner sc) {
        System.out.println("Enter elements of Matrix 1 (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                mat1[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix 2 (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                mat2[i][j] = sc.nextInt();
    }

    void addMatrices() {
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiplyMatrices() {
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++)
                    result[i][j] += mat1[i][k] * mat2[k][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixOps mo = new MatrixOps();

        mo.readMatrices(sc);
        mo.addMatrices();
        mo.multiplyMatrices();
    }
}
