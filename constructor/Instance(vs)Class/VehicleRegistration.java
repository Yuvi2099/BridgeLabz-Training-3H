package constructor.Instance(vs)Class;

import java.util.*;

class VehicleModel {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0;

    VehicleModel() {
        this("Unknown", "Unknown");
    }

    VehicleModel(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: $" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        VehicleModel v1 = new VehicleModel();
        VehicleModel v2 = new VehicleModel("Alice", "Car");
        VehicleModel v3 = new VehicleModel("Bob", "Motorbike");

        System.out.println("Before Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();

        VehicleModel.updateRegistrationFee(150.0);

        System.out.println("\nAfter Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();
    }
}
