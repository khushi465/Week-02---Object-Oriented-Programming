import java.util.ArrayList;

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle implements Insurable{
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insuranceNumber;
    Vehicle(String vehicleNumber, String type, double rentalRate, String insuranceNumber){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
        this.insuranceNumber=insuranceNumber;
    }
    String getNumber(){return vehicleNumber;}
    String getType(){return type;}
    double getRate(){return rentalRate;}
    String getInsNumber(){return insuranceNumber;}
    abstract double calculateRentalCost(int days);
    void getVehicleDetails(){
        System.out.println("Type: "+type+", Vehicle Number: "+vehicleNumber+", Rental Rate: "+rentalRate);
    }

}
class Car extends Vehicle{
    Car(String vehicleNumber, double rentalRate, String insuranceNumber){
        super(vehicleNumber, "Car", rentalRate, insuranceNumber);
    }
    double calculateRentalCost(int days){
        return getRate()*days+50;
    }
    public double calculateInsurance(){
        return getRate()*0.05;
    }
    public String getInsuranceDetails(){
        return "Car Insurance - Policy "+getInsNumber();
    }
}
class Bike extends Vehicle{
    Bike(String vehicleNumber, double rentalRate, String insuranceNumber){
        super(vehicleNumber, "Bike", rentalRate, insuranceNumber);
    }
    double calculateRentalCost(int days){
        return getRate()*days;
    }
    public double calculateInsurance(){
        return getRate()*0.02;
    }
    public String getInsuranceDetails(){
        return "Bike Insurance - Policy "+getInsNumber();
    }
}
class Truck extends Vehicle{
    Truck(String vehicleNumber, double rentalRate, String insuranceNumber){
        super(vehicleNumber, "Truck", rentalRate, insuranceNumber);
    }
    double calculateRentalCost(int days){
        return getRate()*days+100;
    }
    public double calculateInsurance(){
        return getRate()*0.08;
    }
    public String getInsuranceDetails(){
        return "Truck Insurance - Policy "+getInsNumber();
    }
}
public class P3{
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR001",70,"POL-CAR-001"));
        vehicles.add(new Bike("BIKE001",30,"POL-BIKE-001"));
        vehicles.add(new Truck("TRUCK001",120,"POL-TRUCK-001"));
        int rentalDays=5;
        System.out.println("=== Vehicle Rental Summary for " + rentalDays + " days ===\n");

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.printf("Rental Cost: $%.2f\n", v.calculateRentalCost(rentalDays));
            System.out.printf("Insurance Cost: $%.2f\n", v.calculateInsurance());
            System.out.println(v.getInsuranceDetails());
            System.out.println("-----------------------------------");
        }
    }
}
    
