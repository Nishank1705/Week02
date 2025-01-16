// Creating a MobilePhone class
public class MobilePhone {
    // Declaring attributes
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize the attributes
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // Main method to create and display mobile phone details
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 799.99);
        phone1.displayDetails();
    }
}

