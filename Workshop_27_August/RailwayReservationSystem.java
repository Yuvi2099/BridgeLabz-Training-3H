package Workshop_27_August;
import java.util.*;
public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seats = 5;
        int waitingList = 3; 
	    int booked = 0;  
	    int waiting = 0;

        System.out.println("=== Welcome to Railway Reservation System ===");
	    System.out.println("Choose a Train:");
	    System.out.println("1. Express Train (Fare: 500)");
	    System.out.println("2. SuperFast Train (Fare: 800)");
	    System.out.println("3. Rajdhani (Fare: 1200)");

	    int choice = sc.nextInt();
	    int fare = 0;

	    switch (choice) {
	    	case 1:
	    	    fare = 500;
	    	    break;
	    	case 2:
	    	    fare = 800;
	    	    break;
	    	case 3:
	    	    fare = 1200;
	    	    break;
	    	default:
	    	    System.out.println("Invalid Train Choice!");
	    	    return;
	    }

	    System.out.println("Train Selected! Fare: " + fare);

	    do {
	    	System.out.print("Enter number of passengers to book: ");
	    	int n = sc.nextInt();

	    	for (int i = 1; i <= n; i++) {
	    	    if (booked < seats) {
	    	        booked++;
	    	        System.out.println("Passenger " + i + " → Seat Confirmed! Seat No: " + booked);
	    	    } 
                else if (waiting < waitingList) {
	    	        waiting++;
	    	        System.out.println("Passenger " + i + " → Added to Waiting List. WL No: " + waiting);
	    	    } 
                else {
	    	        System.out.println("Passenger " + i + " → Sorry, No Seats/Waiting available!");
	    	    }
	    	}
            while (booked < seats + waitingList) {
	    	    System.out.print("Do you want to book more tickets? (yes/no): ");
	    	    String ans = sc.next();
	    	    if (ans.equalsIgnoreCase("yes")) {
	    	        System.out.print("Enter number of passengers to book: ");
	    	        int more = sc.nextInt();
	    	        for (int i = 1; i <= more; i++) {
	    	            if (booked < seats) {
	    	                booked++;
	    	                System.out.println("Passenger " + i + " → Seat Confirmed! Seat No: " + booked);
	    	            } 
                        else if (waiting < waitingList) {
	    	                waiting++;
	    	                System.out.println("Passenger " + i + " → Added to Waiting List. WL No: " + waiting);
	    	            } 
                        else {
	    	                System.out.println("Passenger " + i + " → Sorry, No Seats/Waiting available!");
	    	            }
	    	        }
	    	    } 
	    	    else {
	    	        break;
	    	    }
	    	}

	    	System.out.println("Booking Closed. All seats filled!");
	    	break; 

	    } while (true);
    }
}
