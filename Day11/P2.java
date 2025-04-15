
import java.util.*;

interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
abstract class Product{
    private String productID;
    private String name;
    private double price;

    public Product(String productID, String name, double price) {
        this.productID=productID;
        this.name=name;
        setPrice(price);
    }
    void setPrice(double price){
        this.price=price;
    }
    String getId(){return productID;}
    String getName(){return name;}
    double getPrice(){return price;}
    void getProductDetails(){
        System.out.println("Product ID: " + productID + ", Name: " + name + ", Price: INR " + price);
    }
    
    abstract double calculateDiscount();
}
class Electronics extends Product implements Taxable{
    Electronics(String productID, String name, double price){
        super(productID, name, price);
    }
    double calculateDiscount() {
        return getPrice()*0.10;
    }
    public double calculateTax(){
        return getPrice()*0.18;
    }
    public String getTaxDetails(){
        return "Electronics Tax: 18%";
    }
}
class Clothing extends Product implements Taxable{
    Clothing(String productID, String name, double price){
        super(productID, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; 
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12%";
    }
}
class Groceries extends Product{
    Groceries(String productID, String name, double price){
        super(productID, name, price);
    }
    @Override
    double calculateDiscount() {
        return getPrice() * 0.05; 
        
    }
}
class ProductProcessor {
    public static void printFinalPrices(List<Product> products) {
        System.out.println("=== Final Price Summary ===\n");
        for (Product p : products) {
            p.getProductDetails();
            double discount = p.calculateDiscount();
            double tax = 0.0;

            if (p instanceof Taxable) { 
                tax = ((Taxable)p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            }

            double finalPrice = p.getPrice() + tax - discount;
            System.out.printf("Discount: INR %.2f, Tax: INR %.2f\n", discount, tax);
            System.out.printf("Final Price: INR %.2f\n", finalPrice);
            System.out.println("-----------------------------");
        }
    }
}

// Main class
public class P2 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Electronics("E100", "Smartphone", 999.99));
        productList.add(new Clothing("C200", "Jeans", 59.99));
        productList.add(new Groceries("G300", "Rice Bag", 20.00));

        ProductProcessor.printFinalPrices(productList);
    }
}