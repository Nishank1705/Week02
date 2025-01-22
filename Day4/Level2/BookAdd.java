import java.util.ArrayList;

class Book {
    String title;
    String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    ArrayList<Book> books;
    
    public Library() {
        books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author);
        }
        System.out.println();
    }
}

public class BookAdd {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "Abhay");
        Book book2 = new Book("The Alchemist", "Nishank");
        Library library1 = new Library();
        Library library2 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book1);
        library1.displayBooks();
        library2.displayBooks();
    }
}