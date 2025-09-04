class StudentModel {
    public int rollNumber;
    protected String name;
    private double cgpa;

    StudentModel() {
        this(0, "Unknown", 0.0);
    }

    StudentModel(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends StudentModel {
    private String specialization;

    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        StudentModel s1 = new StudentModel(101, "Alice", 9.1);
        s1.display();

        s1.setCGPA(9.5);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 8.8, "Data Science");
        pg1.displayPostgraduateDetails();
    }
}
