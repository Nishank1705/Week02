// Main class to demonstrate the Online Food Delivery System
public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Curry", 300, 3);

        System.out.println(vegItem.getItemDetails() + ", Total Price: " + vegItem.calculateTotalPrice());
        System.out.println(nonVegItem.getItemDetails() + ", Total Price: " + nonVegItem.calculateTotalPrice());
    }
}

// Abstract class representing a food item
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
}

// Subclass VegItem
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

// Subclass NonVegItem
class NonVegItem extends FoodItem {
    private static final double NON_VEG_EXTRA_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_EXTRA_CHARGE) * getQuantity();
    }
}
