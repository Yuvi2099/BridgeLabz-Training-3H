package constructor.Instance(vs)Class;

import java.util.*;

class CourseModel {
    private String courseName;
    private int duration; // in days
    private double fee;
    private static String instituteName = "Unknown Institute";

    CourseModel() {
        this("Unknown", 0, 0.0);
    }

    CourseModel(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " days, Fee: $" + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        CourseModel c1 = new CourseModel();
        CourseModel c2 = new CourseModel("Java Programming", 30, 500.0);
        CourseModel c3 = new CourseModel("Python Programming", 25, 450.0);

        System.out.println("Before Updating Institute Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        CourseModel.updateInstituteName("Tech Academy");

        System.out.println("\nAfter Updating Institute Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}
