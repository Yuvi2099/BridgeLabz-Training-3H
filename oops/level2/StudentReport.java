package oops.level2;

class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 92.5);
        Student s2 = new Student("Bob", 102, 67.0);
        Student s3 = new Student("Charlie", 103, 45.0);

        s1.displayDetails();
        System.out.println("------------------------");
        s2.displayDetails();
        System.out.println("------------------------");
        s3.displayDetails();
    }
}
