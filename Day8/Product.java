
import java.util.*;

public class Product {

    public static int discount;
    public String productName;
    public double price;
    public int quantity;
    public final int productID;

    public static void updateDiscount(int d) {
        discount = d;
    }

    public Product(String productName, int quantity, double price, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void display() {
        System.out.println("Product Name " + productName);
        System.out.println("Product ID " + productID);
        System.out.println("Quantity " + quantity);
        System.out.println("Price " + price);
        System.out.println("Total Price " + ((quantity*price)-discount));
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Name, Product ID, price, discount and quantity");
        String productName = sc.nextLine();
        int productID = sc.nextInt();
        double price = sc.nextDouble();
        int discount = sc.nextInt();
        int quantity = sc.nextInt();
        Product obj = new Product(productName, quantity, price, productID);
        if (obj instanceof Product) {
            Product.updateDiscount(discount);
            System.out.println("Discount: " + Product.discount);
            obj.display();

        } else {
            System.out.println("Not an instance");
        }

    }
}
