package ProgrammingElements.level2;

import java.util.Scanner;

public class quotient&remainder {
    public static void main(String[] args) {
        divoperations();
    }
    public static void divoperations{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        float num1=sc.nextFloat();
        System.out.println("Enter number 2");
        float num2=sc.nextFloat();
        float quo=num1/num2;
        float rem=num1%num2;
        System.out.println("The Quotient is" + quo + "and Reminder is" + rem +  "of two numbers" + num1 + "and" + num2);
    }
}
