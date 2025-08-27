package Workshop_27_August;
import java.util.*;
public class GymMemberShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isOpen = true;

        System.out.println("Welcome to Fitness Center Membership System");

        do {
            System.out.print("Enter number of members to register: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("Registering Member " + i + " ---");

                System.out.println("Select Membership Type: ");
                System.out.println("1. Monthly (₹1000)");
                System.out.println("2. Quarterly (₹2500)");
                System.out.println("3. Yearly (₹9000)");
                int choice = sc.nextInt();

                double fee = 0;
                switch (choice) {
                    case 1:
                        fee = 1000;
                        break;
                    case 2:
                        fee = 2500;
                        break;
                    case 3:
                        fee = 9000;
                        break;
                    default:
                        System.out.println("Invalid choice! Defaulting to Monthly.");
                        fee = 1000;
                }
                System.out.print("Are you a Student (S) or Senior Citizen (C)? (Y/N): ");
                char ch = sc.next().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    System.out.print("Enter type (S for Student / C for Senior Citizen): ");
                    char type = sc.next().charAt(0);
                    if (type == 'S' || type == 's') {
                        fee = fee * 0.8;
                        System.out.println("Student discount applied!");
                    } else if (type == 'C' || type == 'c') {
                        fee = fee * 0.7;
                        System.out.println("Senior Citizen discount applied!");
                    } else {
                        System.out.println("Invalid type, no discount applied.");
                    }
                } else {
                    System.out.println("No discount applied.");
                }
                System.out.println("Final Fee for Member " + i + " = ₹" + fee);
            }
            System.out.print("Do you want to register more members? (Y/N): ");
            char again = sc.next().charAt(0);
            if (again == 'N' || again == 'n') {
                isOpen = false; 
            }

        } while (isOpen);
        System.out.println("Fitness Center Closed. Thank You!");
    }
}
