
import java.util.*;

public class P4_MovieTicket {

    private String movieName;
    private int seatNumber;
    private double price;

    P4_MovieTicket(String movieName) {
        this.movieName = movieName;
        seatNumber=0;
        price = 0;
    }

    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void display() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Movie name, seat number and price");
        String movieName = sc.nextLine();
        int seatNumber = sc.nextInt();
        double price = sc.nextDouble();
        P4_MovieTicket ticket = new P4_MovieTicket(movieName);
        // ticket.bookTicket(seatNumber,price);
        ticket.display();

    }
}
