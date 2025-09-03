package oops.level2;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0.0;
    }

    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicketDetails() {
        System.out.println("Movie Name  : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price       : " + price);
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avatar 3");
        MovieTicket ticket2 = new MovieTicket("Inception");

        ticket1.bookTicket("A5", 350.0);
        ticket2.bookTicket("B3", 300.0);

        System.out.println("------------------------");
        ticket1.displayTicketDetails();
        System.out.println("------------------------");
        ticket2.displayTicketDetails();
    }
}

