
import java.util.*;

public class P5_MobilePhone {

    private String brand;
    private String model;
    private double price;

    P5_MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: INR " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand,  model and price");
        String brand = sc.nextLine();
        String model = sc.nextLine();
        double price = sc.nextDouble();
        P5_MobilePhone phone = new P5_MobilePhone(brand, model, price);
        phone.display();

    }
}
