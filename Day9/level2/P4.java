
import java.util.*;

class Order {

    private int orderID;
    private Customer customer;
    private ArrayList<Product> products;
    private boolean isPlaced;

    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.isPlaced = false;
    }

    void addProduct(String productName, int productID, double price) {
        if (isPlaced == false) {
            Product p = new Product(productName, productID, price);
            if (!products.contains(p)) {
                System.out.println("Product " + productName + " added to order " + orderID);
                products.add(p);
            } else {
                System.out.println("Order already has product " + productName);
            }
        } else {
            System.out.println("Order cannot be modified after placed");
        }
    }

    void removeProduct(String productName, int productID, double price) {
        if (isPlaced == false) {
            int k = 1;
            Iterator<Product> iterator = products.iterator();
            while (iterator.hasNext()) {
                Product p = iterator.next();
                if (p.getName().equalsIgnoreCase(productName)) {
                    k = 0;
                    iterator.remove();
                    System.out.println("Product " + productName + " removed from order " + orderID);
                }
                if (k == 1) {
                    System.out.println("No product " + productName + " found in order " + orderID);
                }
            }
        } else {
            System.out.println("Order cannot be modified after placed");
        }
    }

    int getID() {
        return orderID;
    }

    void setPlaced() {
        isPlaced = true;
    }

    void showProducts() {
        System.out.println("Order Number " + orderID);
        for (Product p : products) {
            System.out.println("Product name " + p.getName());
            System.out.println("Product ID " + p.getID());
        }
        System.out.println();
    }
    // customer name

}

class Customer {

    private String customerName;
    private int customerID;
    private Order o;

    Order createOrder(int orderID) {
        o = new Order(orderID, this);
        return o;
    }

    void placeOrder() {
        System.out.println("Order placed successfully!");
        o.setPlaced();
        show();
    }

    void show() {
        System.out.println("Customer name " + customerName);
        o.showProducts();
    }

    public Customer(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    String getName() {
        return customerName;
    }

    int getID() {
        return customerID;
    }

}

class Product {

    private String productName;
    private int productID;
    private double price;

    public Product(String productName, int productID, double price) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
    }

    String getName() {
        return productName;
    }

    int getID() {
        return productID;
    }

    double getPrice() {
        return price;
    }

}

class Ecommerce {

    public static void main(String[] args) {
        Customer c = new Customer("Khushi", 1);
        Order o = c.createOrder(11);
        o.addProduct("bread", 111, 20);
        o.removeProduct("bread", 111, 20);
        o.addProduct("egg", 112, 10);
        o.addProduct("cheese", 113, 12);
        c.placeOrder();

    }
}
