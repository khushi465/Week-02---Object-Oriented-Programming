
import java.util.*;

public class P5_CartItem {

    private String itemName[] = new String[100];
    private int quantity[] = new int[100];
    private double price[] = new double[100];
    private static int index = 0;

    public void addItem(String item, int q, double p) {
        itemName[index] = item;
        quantity[index] = q;
        price[index] = p;
        index++;
    }

    public void removeItem(String item) {
        for (int i = 0; i < index; i++) {
            if (item.equalsIgnoreCase(itemName[i])) {
                index--;
                for (int j = i; j < itemName.length; j++) {
                    itemName[i] = itemName[i + 1];
                    quantity[i] = quantity[i + 1];
                    price[i] = price[i + 1];
                }
            }
        }

    }

    public void display() {
        double totalCost = 0;
        for (int i = 0; i < index; i++) {
            System.out.println("Item name: " + itemName[i]);
            System.out.println("Item quantity: " + quantity[i]);
            System.out.println("Item price: " + price[i]);
            System.out.println(index);
            totalCost += price[i] * quantity[i];
        }
        System.out.println("Total Cost: " + totalCost);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemName;
        int quantity;
        double price;
        P5_CartItem obj = new P5_CartItem();
        while (true) {
            System.out.println("Enter Item name, quantity and price to add");
            itemName = sc.next();
            if (itemName.equalsIgnoreCase("q")) {
                break;
            }
            quantity = sc.nextInt();
            price = sc.nextDouble();

            obj.addItem(itemName, quantity, price);
        }
        obj.display();
        while (true) {
            System.out.println("Enter Item name to remove");
            itemName = sc.next();
            if (itemName.equalsIgnoreCase("q")) {
                break;
            }
            obj.removeItem(itemName);
        }
        obj.display();
    }
}
