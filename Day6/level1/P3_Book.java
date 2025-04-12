
import java.util.*;

public class P3_Book {

    private String title;
    private String author;
    private double price;

    P3_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
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
        P3_Book book = new P3_Book(title, author, price);
        book.display();

    }
}
