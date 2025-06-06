/*
 * Program: Multi-level Inheritance with Person, Employee, and Teacher classes
 *
 * This program demonstrates multi-level inheritance in Java.
 * Class Person contains basic personal details.
 * Class Employee inherits from Person and adds employee-specific details.
 * Class Teacher inherits from Employee and adds teaching-specific details.
 * The program takes input for multiple teachers using an array of objects
 * and displays their complete details.
 */

import java.util.*;

class Person {
    String name, gender, address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName, qualification;
    double salary;

    Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department;
    int teacherId;

    Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display() {
        System.out.println("\nTeacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int n = in.nextInt();
        in.nextLine();  
        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = in.nextLine();
            System.out.print("Enter Gender: ");
            String gender = in.nextLine();
            System.out.print("Enter Address: ");
            String address = in.nextLine();
            System.out.print("Enter Age: ");
            int age = in.nextInt();
            in.nextLine();
            System.out.print("Enter Employee ID: ");
            int empId = in.nextInt();
            in.nextLine();
            System.out.print("Enter Company Name: ");
            String cmp = in.nextLine();
            System.out.print("Enter Qualification: ");
            String qualification = in.nextLine();
            System.out.print("Enter Salary: ");
            double salary = in.nextDouble();
            in.nextLine();
            System.out.print("Enter Subject: ");
            String subject = in.nextLine();
            System.out.print("Enter Department: ");
            String department = in.nextLine();
            System.out.print("Enter Teacher ID: ");
            int teacherId = in.nextInt();
            in.nextLine();

            t[i] = new Teacher(name, gender, address, age, empId, cmp, qualification, salary, subject, department, teacherId);
        }

        System.out.println("\nTEACHER DETAILS:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }
        in.close();
    }
}
