
import java.util.*;

public class P1_Book {

    private String title;
    private String author;
    private double price;

    P1_Book() {
        this.title = "Book Name";
        this.author = "Author Name";
        this.price = 0;
    }

    P1_Book(String title, String author, double price) {
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
        P1_Book book1 = new P1_Book();
        P1_Book book2 = new P1_Book(title, author, price);
        book1.display();
        book2.display();

    }
}
