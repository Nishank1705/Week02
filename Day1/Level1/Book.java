// Creating a Book class
public class Book {
    // Declaring attributes
    private String title;
    private String author;
    private double price;

    // Constructor to initialize the attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Main method to create and display book details
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 10.99);
        book1.displayDetails();
    }
}

