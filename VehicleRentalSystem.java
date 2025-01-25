// Main class to demonstrate the Vehicle Rental System
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C001", "Car", 1000));
        vehicles.add(new Bike("B001", "Bike", 500));
        vehicles.add(new Truck("T001", "Truck", 3000));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails() + 
                               ", Rental Cost (3 days): " + vehicle.calculateRentalCost(3));
        }
    }
}

// Abstract class representing a vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleDetails() {
        return "Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: " + rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

// Subclass Car
class Car extends Vehicle {
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 1000; // Daily rental rate for car
    }
}

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 500; // Daily rental rate for bike
    }
}

// Subclass Truck
class Truck extends Vehicle {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 3000; // Daily rental rate for truck
    }
}
