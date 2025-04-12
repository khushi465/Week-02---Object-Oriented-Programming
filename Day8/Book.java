
public class Book {

    public static String libraryName;
    public String title;
    public String author;
    public final int isbn;

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public Book(String title, int isbn, String libraryName, String author) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.libraryName = libraryName;
    }

    public void display() {
        System.out.println("Title " + title);
        System.out.println("ISBN " + isbn);
        System.out.println("Author " + author);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Library name, Title, Author and ISBN");
        String libraryName = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        int isbn = sc.nextInt();
        Book obj = new Book(title, isbn, libraryName, author);
        if (obj instanceof Book) {
            Book.displayLibraryName();
            obj.display();
        } else {
            System.out.println("Not an instance");
        }

    }
}
