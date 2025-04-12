
import java.util.*;

public class P4_Item {

    private int itemCode;
    private String itemName;
    private double price;

    P4_Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: INR " + price);
        System.out.println("Total cost for " + quantity + " items is INR " + (quantity * price));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item name, item codee and price");
        String itemName = sc.nextLine();
        int itemCode = sc.nextInt();
        double price = sc.nextDouble();
        System.out.println("Enter quantity");
        int q = sc.nextInt();
        P4_Item item = new P4_Item(itemCode, itemName, price);
        item.display(q);

    }
}
