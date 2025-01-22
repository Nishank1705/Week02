import java.util.ArrayList;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in the order:");
        for (Product product : products) {
            System.out.println("Name: " + product.name + ", Price: " + product.price);
        }
        System.out.println();
    }
}

class Customer {
    String name;
    ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        System.out.println("Orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Headphones", 150.00);
        Product product3 = new Product("Smartphone", 800.00);

        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(2);
        order2.addProduct(product3);

        Customer customer = new Customer("Abhay");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.displayCustomerOrders();
    }
}