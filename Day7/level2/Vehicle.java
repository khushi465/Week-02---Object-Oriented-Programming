
import java.util.*;

public class Vehicle {

    private String ownerName;
    private String vehicleType;
    private static double registrationFee;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("Registration fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double r) {
        registrationFee = r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Owner Name, Vehicle Type and Registration Fee");
        String ownerName = sc.nextLine();
        String vehicleType = sc.nextLine();
        double registrationFee = sc.nextDouble();
        Vehicle obj = new Vehicle(ownerName, vehicleType);
        Vehicle.updateRegistrationFee(registrationFee);
        obj.displayVehicleDetails();

    }
}
