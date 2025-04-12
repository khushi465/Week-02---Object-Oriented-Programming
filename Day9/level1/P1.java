
import java.util.*;

class Book {

    private String title;
    private String author;
    private final int isbn;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    String getTitle() {
        return title;
    }

    int getISBN() {
        return isbn;
    }

    String getAuthor() {
        return author;
    }

}

class Library {

    private String name;
    private ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book " + book.getTitle() + " has been added to " + name + " library");
    }

    void showBooks() {
        System.out.println("Books in the library " + name);
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book("Pirates", "Jane", 123);
        Book b2 = new Book("Highs", "Donald", 224);

        Library l1 = new Library("National");
        Library l2 = new Library("Community");

        l1.addBook(b1);
        l1.addBook(b2);
        l1.showBooks();

        l2.addBook(b2);
        l2.showBooks();
    }
}
