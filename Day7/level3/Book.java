
import java.util.*;

public class Book {

    protected String title;
    public int isbn;
    private String author;

    Book(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public void setAuthor(String r) {
        author = r;
    }

    public String getauthor() {
        return author;
    }
}

class EBook extends Book {

    EBook(String title, int isbn, String author) {
        super(title, isbn);
        setAuthor(author);
    }

    public void displayBookDetails() {
        System.out.println("title: " + title);
        System.out.println("isbn: " + isbn);
        System.out.println("author: " + getauthor());
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title, isbn and author");
        String title = sc.next();
        int isbn = sc.nextInt();
        String author = sc.next();
        EBook b = new EBook(title, isbn, author);
        b.displayBookDetails();
    }

}
