package ProgrammingElements.level1;
import java.util.*;
public class sam's_marks {
    public static void main(String[] args) {
        samAverage();
    }
    public static void samAverage() {
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
