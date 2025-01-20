

class Product {
    String productName;
    int price ;
    static int totalProducts ;

    //Parameterized Constructor
    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price ;
        totalProducts++;
    }

    //Instance Method to display product details
    public void displayProductDetails() {
        System.out.println("Product details:");
        System.out.println("Product Name: " + productName + "\nPrice: " + price);
    }

    //Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total number of products: " + totalProducts);
    }
}
public class ProductInventory {

    public static void main(String[] args) {
        // Creating object of Product class
        Product p1 = new Product("Laptop", 45000); //Passing values for parameterised Constructor
        Product p2 = new Product("Mobile", 15000); //Passing values for parameterised Constructor
        Product p3 = new Product("Tablet", 25000); //Passing values for parameterised Constructor

        // Displaying product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Displaying total number of products
        Product.displayTotalProducts();
    }
    
}
