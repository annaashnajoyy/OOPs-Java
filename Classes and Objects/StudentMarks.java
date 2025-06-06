/*
 * Experiment: Command Line Arguments – Student Marks
 * File: StudentMarks.java
 *
 * This program:
 * - Accepts 4 command line arguments: roll number, name, English mark, Maths mark
 * - Calculates total marks
 * - Displays the student's details
 */


class Student {
    int Rlno;
    String stud_name;
    int engmark, mathsmark, totalmark;

    Student(int r, String s, int e, int m) {
        Rlno = r;
        stud_name = s;
        engmark = e;
        mathsmark = m;
    }

    void calculatetotal() {
        totalmark = engmark + mathsmark;
    }

    void display() {
        System.out.println("Rollno: " + Rlno);
        System.out.println("Name: " + stud_name);
        System.out.println("English Marks: " + engmark);
        System.out.println("Maths Marks: " + mathsmark);
        System.out.println("Total Marks: " + totalmark);
    }
}

public class StudentMarks {
    public static void main(String args[]) {
        int r = Integer.parseInt(args[0]);
        String s = args[1];
        int e = Integer.parseInt(args[2]);
        int m = Integer.parseInt(args[3]);

        Student s1 = new Student(r, s, e, m);
        s1.calculatetotal();
        s1.display();
    }
}
