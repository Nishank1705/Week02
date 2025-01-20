class Book{
    static String libraryName = "Default Library";
    String title;
    String author;
    final int isbn;
    public Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn = isbn;
    }
    void displayDetails(){
        System.out.println("book details are \n Book name "+ title + " \n author name "+ author +" \n isbn number "+isbn);
    }
    public static void displayLibraryName(){
        System.out.println("Library Name is "+ libraryName);
    }
}
public class LibraryManagementSystem{
    public static void main(String[] args) {
    Book book1=new Book("BaalBhasakar", "Rk Laxman", 78363);
    Book book2 = new Book("Harry Potter", "J K Roling", 73833);
    Book.displayLibraryName();
    if(book1 instanceof Book){
        book1.displayDetails();
    }
    if(book2 instanceof Book){
        book2.displayDetails();
    }
}
}