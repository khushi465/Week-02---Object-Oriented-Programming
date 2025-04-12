
import java.util.*;

public class P6_CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;

    P6_CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        double perDayCost = 1000;
        double totalCost = rentalDays * perDayCost;
        return totalCost;
    }

    public void display() {
        System.out.println("customerName: " + customerName);
        System.out.println("carModel: " + carModel);
        System.out.println("rentalDays: " + rentalDays);
        System.out.println("Total cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customerName, carModel and rentalDays");
        String customerName = sc.nextLine();
        String carModel = sc.nextLine();
        int rentalDays = sc.nextInt();
        P6_CarRental obj = new P6_CarRental(customerName, carModel, rentalDays);
        obj.display();

    }
}
