
class Book {

    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Publication Year: " + publicationYear);
    }

}

class Author extends Book {

    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }

}

class Main {

    public static void main(String[] args) {
        Author a = new Author("Tales", 2005, "Khushi", "Btech");
        a.displayInfo();
    }
}
