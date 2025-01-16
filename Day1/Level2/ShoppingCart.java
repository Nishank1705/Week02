
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize attributes
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

public class ShoppingCart {
    CartItem[] cartItems = new CartItem[10];
    int count = 0;

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (count < cartItems.length) {
            cartItems[count] = new CartItem(itemName, price, quantity);
            count++;
            System.out.println(itemName + " added to the cart.");
        } else {
            System.out.println("Cart is full.");
        }
    }

    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) {
        for (int i = 0; i < count; i++) {
            if (cartItems[i].itemName.equals(itemName)) {
                for (int j = i; j < count - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[count - 1] = null;
                count--;
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        for (int i = 0; i < count; i++) {
            cartItems[i].displayDetails();
        }
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < count; i++) {
            totalCost += cartItems[i].price * cartItems[i].quantity;
        }
        System.out.println("Total Cost: " + totalCost);
    }

    // Main method to simulate shopping cart operations
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item\n2. Remove Item\n3. Display Cart Items\n4. Display Total Cost\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    cart.removeItem(nameToRemove);
                    break;
                case 3:
                    cart.displayCartItems();
                    break;
                case 4:
                    cart.displayTotalCost();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
