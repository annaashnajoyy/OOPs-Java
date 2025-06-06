/*
 * Program: Student Count Using Static Variable
 *
 * This program defines a Student class with roll number and name.
 * It uses a static variable 'count' to track the total number of Student objects created.
 * The main method creates three Student objects, displays their details,
 * and finally prints the total count of students.
 */

class Student {
    int rollno;
    String name;
    static int count = 0;

    Student(int r, String n) {
        rollno = r;
        name = n;
        count++;
    }

    void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Anu");
        Student s2 = new Student(2, "Rahul");
        Student s3 = new Student(3, "Sneha");

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Total number of students: " + Student.count);
    }
}
