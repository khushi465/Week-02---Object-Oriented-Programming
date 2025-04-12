
import java.util.*;

public class P4_HotelBooking {

    private String guestName;
    private String roomType;
    private int nights;

    P4_HotelBooking() {
        this.guestName = "";
        this.nights = 0;
    }

    P4_HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    P4_HotelBooking(P4_HotelBooking obj) {
        this.guestName = obj.guestName;
        this.roomType = obj.roomType;
        this.nights = obj.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Guest Name, roomType and nights");
        String guestName = sc.next();
        String roomType = sc.next();
        int nights = sc.nextInt();
        P4_HotelBooking b1 = new P4_HotelBooking(guestName, roomType, nights);
        P4_HotelBooking b2 = new P4_HotelBooking(b1);
        b1.display();
        b2.display();

    }
}
