
class Vehicle {

    int maxSpeed;
    String model;

    public Vehicle(String model, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void getVehicleDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
    }

}

interface Refuelable {

    void refuel();
    // interface methods are supposed to be public
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void display() {
        System.out.println("Electric Vehicle");
        super.getVehicleDetails();

    }

    public void charge() {
        System.out.println("Charging");
    }

}

class PetrolVehicle extends Vehicle implements Refuelable{

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void display() {
        System.out.println("Petrol Vehicle");
        super.getVehicleDetails();

    }
    @Override
    public void refuel() {
        System.out.println("Refueling");
    }

}

class Main7 {

    public static void main(String[] args) {

        ElectricVehicle t = new ElectricVehicle("Bougatti", 250);
        t.charge();
        t.display();
        PetrolVehicle s = new PetrolVehicle("BMW", 220);
        s.refuel();
        s.display();

    }
}
