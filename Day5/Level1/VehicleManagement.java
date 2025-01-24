// Superclass Vehicle
class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface Refuelable
interface Refuelable {
    void refuel();
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Electric Vehicle");
    }
}

// Subclass PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol Vehicle");
    }
}

// Main class to test the system
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle pv = new PetrolVehicle(200, "Ford Mustang");

        ev.displayInfo();
        ev.charge();
        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}

