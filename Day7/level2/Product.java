
import java.util.*;

public class Product {

    private String productName;
    private double price;
    private static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Name and price");
        String productName = sc.nextLine();
        double price = sc.nextDouble();
        Product obj = new Product(productName, price);
        Product obj1 = new Product(productName, price);
        Product obj2 = new Product(productName, price);
        obj.displayProductDetails();
        Product.displayTotalProducts();

    }
}
