package constructor.level1;

class CarRentalModel {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    CarRentalModel() {
        this("Unknown", "Standard", 1);
    }

    CarRentalModel(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    CarRentalModel(CarRentalModel other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.totalCost = other.totalCost;
    }

    private void calculateTotalCost() {
        double ratePerDay;
        switch (carModel.toLowerCase()) {
            case "suv":
                ratePerDay = 100;
                break;
            case "sedan":
                ratePerDay = 70;
                break;
            default:
                ratePerDay = 50; // Standard car
        }
        totalCost = ratePerDay * rentalDays;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: $" + totalCost);
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        CarRentalModel r1 = new CarRentalModel();
        CarRentalModel r2 = new CarRentalModel("Alice", "SUV", 3);
        CarRentalModel r3 = new CarRentalModel(r2);

        System.out.println("Car Rentals:");
        r1.display();
        r2.display();
        r3.display();
    }
}
