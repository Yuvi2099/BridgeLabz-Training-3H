package constructor.level1;

class HotelBookingModel {
    private String guestName;
    private String roomType;
    private int nights;

    HotelBookingModel() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    HotelBookingModel(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBookingModel(HotelBookingModel other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBookingModel b1 = new HotelBookingModel();
        HotelBookingModel b2 = new HotelBookingModel("Alice", "Deluxe", 3);
        HotelBookingModel b3 = new HotelBookingModel(b2);

        System.out.println("Default Booking:");
        b1.display();

        System.out.println("Parameterized Booking:");
        b2.display();

        System.out.println("Copied Booking:");
        b3.display();
    }
}
