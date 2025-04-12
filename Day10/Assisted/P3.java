
class Vehicle {

    String fuelType;
    int maxSpeed;

    Vehicle(String fuelType, int maxSpeed) {
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("fuelType: " + fuelType);
        System.out.println("maxSpeed: " + maxSpeed);
    }
}

class Truck extends Vehicle {

    int maxWeight;

    Truck(String fuelType, int maxSpeed, int maxWeight) {
        super(fuelType, maxSpeed);
        this.maxWeight = maxWeight;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Max Weight: " + maxWeight);
        System.out.println();
    }

}

class Car extends Vehicle {

    int seatCapacity;

    Car(String fuelType, int maxSpeed, int seatCapacity) {
        super(fuelType, maxSpeed);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println();
    }
}

class Motorcycle extends Vehicle {

    int zero2hundred;

    Motorcycle(String fuelType, int maxSpeed, int zero2hundred) {
        super(fuelType, maxSpeed);
        this.zero2hundred = zero2hundred;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Top Speed: " + zero2hundred);
        System.out.println();
    }
}

class Main2 {

    public static void main(String[] args) {
        Truck d = new Truck("Diesel", 150, 1000);
        Car c = new Car("Diesel", 220, 6);
        Motorcycle b = new Motorcycle("Petrol", 180, 2);
        d.displayInfo();
        c.displayInfo();
        b.displayInfo();
    }
}
