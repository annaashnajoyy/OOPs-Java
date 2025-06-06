/*
 * Experiment 08 – Constructor to Initialize Employee Data
 * File: EmployeeConstructor.java
 *
 * This program demonstrates how to use a constructor in Java to initialize
 * the data members of a class. It collects employee number, name, and salary
 * from the user, sets them through a parameterized constructor,
 * and displays the employee details.
 */

import java.util.Scanner;

class Employee {
    int empno;
    String empname;
    int salary;

    Employee(int empno, String empname, int salary) {
        this.empno = empno;
        this.empname = empname;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        int empno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String empname = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        int salary = scanner.nextInt();

        Employee emp = new Employee(empno, empname, salary);
        emp.display();
    }
}
