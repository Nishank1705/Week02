// Abstract class Product
abstract class Product {
    private int productId; // Product ID
    private String name; // Product name
    private double price; // Product price

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter and Setter methods
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Method to calculate final price (price - discount)
    public double getFinalPrice() {
        return price - calculateDiscount();
    }
}

// Electronics subclass
class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implement calculateDiscount method
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}

// Clothing subclass
class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implement calculateDiscount method
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}

// Groceries subclass
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implement calculateDiscount method
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

// Taxable interface
interface Taxable {
    double calculateTax(); // Method to calculate tax

    String getTaxDetails(); // Method to get tax details
}

// Main class for E-Commerce Platform
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create instances of Electronics, Clothing, and Groceries
        Product prod1 = new Electronics(1, "Laptop", 1000);
        Product prod2 = new Clothing(2, "T-shirt", 50);
        Product prod3 = new Groceries(3, "Apple", 1);

        // Display final price for each product
        System.out.println("Final Price of Laptop: " + prod1.getFinalPrice());
        System.out.println("Final Price of T-shirt: " + prod2.getFinalPrice());
        System.out.println("Final Price of Apple: " + prod3.getFinalPrice());
    }
}
