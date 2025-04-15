import java.util.ArrayList;

interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract  class LibraryItem implements Reservable{
    private int itemId;
    private String title;
    private String author;
    private String borrowerName;
    private boolean available;
   
    public LibraryItem(int itemId, String title, String author) {
        this.itemId=itemId;
        this.author=author;
        this.title=title;
        this.available=true;
    }
    String getTitle(){return title;}
    String getAuthor(){return author;}
    int getID(){return itemId;}
    
    abstract int getLoanDuration();
    
    void getItemDetails(){
        System.out.println("Item ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + (available ? "Yes" : "No"));
            if (!checkAvailability()) {
                System.out.println("Reserved by: " + borrowerName);
            }
    }
    public void reserveItem(String borrowerName){
        if(checkAvailability()){
            this.borrowerName=borrowerName;
            System.out.println(title+" borrowed successfully by "+borrowerName);
            available=false;
        }
        else{
            System.out.println(title+" not available. Already borrowed by "+this.borrowerName);
        }
    }
    public boolean checkAvailability(){
        return available;
    }
}
class Book extends LibraryItem{
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration(){
        return 3;
    }
}
class Magazine extends LibraryItem{
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration(){
        return 5;
    }
}
class DVD extends LibraryItem{
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration(){
        return 2;
    }
}

class LibSystem{
    void printAllItems(ArrayList<LibraryItem> items){
    System.out.println("=== Library Item Summary ===");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("-----------------------------");
        }
    }
}

class P5{
    public static void main(String[] args) {
        ArrayList<LibraryItem> items=new ArrayList<>();
        LibSystem Lib=new LibSystem();
        LibraryItem b1=new Book(11, "Tales of Adventure", "ABX");
        LibraryItem m1=new Magazine(111, "Fords Business", "ONM");
        items.add(b1);
        items.add(m1);
        b1.reserveItem("Khushi");
        b1.reserveItem("Esha");

        Lib.printAllItems(items);
        
    }
}