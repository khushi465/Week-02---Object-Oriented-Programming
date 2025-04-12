
import java.util.*;

public class Vehicle {

    public static double registrationFee;
    public String ownerName;
    public String vehicleType;
    public final int registrationNumber;

    public static void updateRegistrationFee(double d) {
        registrationFee = d;
    }

    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void display() {
        System.out.println("Owner Name " + ownerName);
        System.out.println("Vehicle Type " + vehicleType);
        System.out.println("registrationNumber " + registrationNumber);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Owner Name, vehicle type, registrationNumber, Registration Fee");
        String ownerName = sc.nextLine();
        String vehicleType = sc.nextLine();
        int registrationNumber = sc.nextInt();
        double registrationFee = sc.nextDouble();
        Vehicle obj = new Vehicle(ownerName, vehicleType, registrationNumber);
        if (obj instanceof Vehicle) {
            Vehicle.updateRegistrationFee(registrationFee);
            System.out.println("Registration Fee: " + Vehicle.registrationFee);
            obj.display();

        } else {
            System.out.println("Not an instance");
        }

    }
}
