package ProgrammingElements.level2;
import java.util.Scanner;
public class squarefinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double perimeter = scanner.nextDouble();
        double side = perimeter / 4;
        System.out.println("The side of the square is " + side);
        scanner.close();
    }
    
}
