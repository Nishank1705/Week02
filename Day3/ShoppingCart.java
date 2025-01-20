
class Product {
    // Static variables
    static double discount = 10.0; // Initial discount
    String productName;
    double price; // Not static
    int quantity;
    double revisedDiscount;
    final int productID;

    // Constructor with corrected variable names
    public Product(String productName, double price, int quantity, int productID, double revisedDiscount) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
        this.revisedDiscount = revisedDiscount;
    }

    // Static method should receive parameters rather than using instance variable
    static double updateDiscount(double price, double revisedDiscount) {
        return price - (price * revisedDiscount / 100);
    }

    // Method to display product details
    void display() {
        double result = updateDiscount(this.price, this.revisedDiscount);
        System.out.println("Product details are as follows:");
        System.out.println("Product name: " + productName);
        System.out.println("Product price: " + price);
        System.out.println("Product ID: " + productID);
        System.out.println("Initial discount in %: " + discount);
        System.out.println("Price after final discount: " + result);
    }
}

public class ShoppingCart{
 public static void main(String[] args) {
        Product product1 = new Product("Biscuit", 10, 2, 145, 5);
        Product product2 = new Product("Chips", 20, 3, 148, 4);

        if (product1 instanceof Product) {
            System.out.println("Product 1 is an instance of class Product");
            product1.display();
        }
        if (product2 instanceof Product) {
            System.out.println("Product 2 is an instance of class Product");
            product2.display();
        }
    }

}