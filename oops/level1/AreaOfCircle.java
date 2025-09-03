package oops.level1;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(7.0);
        Circle c2 = new Circle(3.5);

        c1.displayDetails();
        System.out.println("------------------------");
        c2.displayDetails();
    }
}
