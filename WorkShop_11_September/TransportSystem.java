package WorkShop_11_September;

class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println(brand + " is starting at speed " + speed + " km/h.");
    }
}

// Subclass Car
class Car extends Vehicle {
    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed); // calling Vehicle constructor
        this.doors = doors;
    }

    public void showCarDetails() {
        System.out.println("Car has " + doors + " doors.");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    boolean hasHelmet;

    public Bike(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    public void checkHelmet() {
        if (hasHelmet) {
            System.out.println("Helmet is available.");
        } else {
            System.out.println("Helmet is missing! Please wear one.");
        }
    }
}

// Subclass Bus
class Bus extends Vehicle {
    int capacity;

    public Bus(String brand, int speed, int capacity) {
        super(brand, speed);
        this.capacity = capacity;
    }

    // Child-specific feature
    public void announceStop() {
        System.out.println("Bus is stopping. Please get down safely.");
    }

    public void showCapacity() {
        System.out.println("Bus can carry " + capacity + " passengers.");
    }
}

// Main class
public class TransportSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 4);
        car.start();           // inherited from Vehicle
        car.showCarDetails();  // Car-specific method

        System.out.println("---------------");

        Bike bike = new Bike("Honda", 80, true);
        bike.start();          // inherited from Vehicle
        bike.checkHelmet();    // Bike-specific method

        System.out.println("---------------");

        Bus bus = new Bus("Volvo", 60, 50);
        bus.start();           // inherited from Vehicle
        bus.showCapacity();    // Bus-specific method
        bus.announceStop();    // Bus-specific feature
    }
}
