// Creating an Item class
public class Item {
    // Declaring attributes
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize the attributes
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to create and display item details and calculate total cost
    public static void main(String[] args) {
        Item item1 = new Item("101", "Laptop", 999.99);
        item1.displayDetails();

        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: " + totalCost);
    }
}
