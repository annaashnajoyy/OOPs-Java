/*
 * This program defines an Employee class with basic employee details.
 * The Teacher class extends Employee and adds department and subjects taught.
 * The main method takes input for multiple Teacher objects,
 * stores them in an array, and displays their details.
 */

import java.util.*;

class Employee {
    int empId;
    String name;
    double salary;
    String address;

    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subjects;

    Teacher(int empId, String name, double salary, String address, String department, String subjects) {
        super(empId, name, salary, address);
        this.department = department;
        this.subjects = subjects;
    }

    void display() {
        System.out.println("=========================================");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjects);
    }
}

public class inheritance {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int n = in.nextInt();
        Teacher t[] = new Teacher[10];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            System.out.print("Enter Employee ID: ");
            int empId = in.nextInt();
            in.nextLine();
            System.out.print("Enter Name: ");
            String name = in.nextLine();
            System.out.print("Enter Department: ");
            String department = in.nextLine();
            System.out.print("Enter Salary: ");
            double salary = in.nextDouble();
            in.nextLine();
            System.out.print("Enter Address: ");
            String address = in.nextLine();
            System.out.print("Enter Subjects Taught: ");
            String sub = in.nextLine();

            t[i] = new Teacher(empId, name, salary, address, department, sub);
        }

        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }
        in.close();
    }
}
