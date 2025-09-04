package constructor;

class MyCircle {  
    private double radius;

    
    MyCircle() {
        this(1.0);
    }

    
    MyCircle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Circle radius: " + radius);
    }
}

public class Circle {   
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();       
        MyCircle c2 = new MyCircle(5.5);    

        c1.display();
        c2.display();
    }
}
