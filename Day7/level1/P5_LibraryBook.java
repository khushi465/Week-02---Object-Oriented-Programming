
import java.util.*;

public class P5_LibraryBook {

    private String title;
    private String author;
    private double price;
    private boolean available;

    P5_LibraryBook() {
        this.title = "Book Name";
        this.author = "Author Name";
        this.price = 0;
        this.available = true;
    }

    P5_LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrow() {
        if (available) {
            System.out.println("Borrowed book");
            available = false;
        } else {
            System.out.println("Book not available");
        }
        display();
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title, author and price");
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();
        P5_LibraryBook book1 = new P5_LibraryBook(title, author, price);
        // book1.display();
        book1.borrow();
        book1.borrow();

    }
}
