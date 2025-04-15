
import java.util.ArrayList;
import java.util.List;

interface GPS{
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle implements GPS{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;
    Vehicle(String vehicleId, String driverName, double ratePerKm, String location){
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
        updateLocation(location);
    }
    abstract double calculateFare(double distance);
    public void updateLocation(String location){
        this.location=location;
    }
    public String getCurrentLocation(){
        return location;
    }
    String getID(){return vehicleId;}
    String getName(){return driverName;}
    double getRate(){return ratePerKm;}
    void getVehicleDetails(){
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Driver name: "+driverName);
        System.out.println("Rate per Km: "+ratePerKm);
    }
}  
class Car extends Vehicle{
    Car(String vehicleId, String driverName, double ratePerKm, String location){
        super(vehicleId,driverName,ratePerKm, location);
    }
    double calculateFare(double distance){
        return distance*getRate()+50;
    }
}
class Auto extends Vehicle{

    Auto(String vehicleId, String driverName, double ratePerKm, String location){
        super(vehicleId,driverName,ratePerKm, location);
    }
    double calculateFare(double distance){
        return distance*getRate()+20;
    }
}
class Bike extends Vehicle{
    Bike(String vehicleId, String driverName, double ratePerKm, String location){
        super(vehicleId,driverName,ratePerKm, location);
    }
    double calculateFare(double distance){
        return distance*getRate();
    }
}
class FareCalculator {
    public static void printFareDetails(List<Vehicle> vehicles, double distance) {
        System.out.println("=== Fare Details for Distance: " + distance + " km ===\n");
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Location: " + v.getCurrentLocation());
            System.out.printf("Calculated Fare: INR %.2f\n", v.calculateFare(distance));
            System.out.println("-----------------------------");
        }
    }
}
public class P8{
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Car("C101", "Alice", 12.0, "Downtown"));
        vehicleList.add(new Bike("B202", "Bob", 5.0, "Uptown"));
        vehicleList.add(new Auto("A303", "Charlie", 8.0, "City Center"));

        double tripDistance = 10.0;

        FareCalculator.printFareDetails(vehicleList, tripDistance);
        
    }
}
