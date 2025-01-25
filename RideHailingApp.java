// Main class to demonstrate the Ride-Hailing Application
public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle car = new Car("V001", "John", 15);
        Vehicle bike = new Bike("V002", "Mike", 8);
        Vehicle auto = new Auto("V003", "Sam", 10);

        System.out.println(car.getVehicleDetails() + ", Fare for 10 km: " + car.calculateFare(10));
        System.out.println(bike.getVehicleDetails() + ", Fare for 10 km: " + bike.calculateFare(10));
        System.out.println(auto.getVehicleDetails() + ", Fare for 10 km: " + auto.calculateFare(10));
    }
}

// Abstract class representing a vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

// Subclass Car
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 15; // Rate for Car
    }
}

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 8; // Rate for Bike
    }
}

// Subclass Auto
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 10; // Rate for Auto
    }
}

