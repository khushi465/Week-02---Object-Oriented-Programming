import java.util.ArrayList;

interface Discountable{
    void applyDiscount();
    int getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    abstract double calculateTotalPrice();
    private int discount;

    public FoodItem(String itemName,double price,int quantity) {
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    
    void getItemDetails(){
        System.out.println("Item name: "+itemName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Discount: "+discount);
        System.out.println("Total Price: "+calculateTotalPrice());
        System.out.println();
    }
    String getName(){return itemName;}
    double getPrice(){return price;}
    int getQuant(){return quantity;}

    public void applyDiscount(int discount){
        this.discount=discount;
    }
    int getDiscountDetails(){
        return discount;
    }

}
class VegItem extends FoodItem{

    public VegItem(String itemName,double price,int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice(){
        double total=getPrice()*getQuant();
        return total-(total*getDiscountDetails()/100);
    }
    
}
class NonVegItem extends FoodItem{
    private int nonvegCharge=20;
    public NonVegItem(String itemName,double price,int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice(){
        double total=(getPrice()+nonvegCharge)*getQuant();
        return total-(total*getDiscountDetails()/100);
    }
}
class Order{
    private ArrayList<FoodItem> items;
    int orderID;
    Order(int orderID){
        this.orderID=orderID;
        this.items=new ArrayList<>();
    }
    void addItem(FoodItem item){
        items.add(item);
    }
    void showOrder(){
        System.out.println("--Order Summary--");
        System.out.println("Order ID: "+orderID);
        double total=0;
        for (FoodItem f : items) {
            f.getItemDetails();
            total+=f.calculateTotalPrice();
        }
        System.out.println("Total amount to be paid "+total);
    }
}

class Main2{
    public static void main(String[] args) {
        FoodItem f1=new VegItem("Spring Roll", 100, 3);
        FoodItem f2=new NonVegItem("Chicken Roll", 120, 2);
        f1.applyDiscount(5);
        f2.applyDiscount(8);
        Order or=new Order(112);
        or.addItem(f1);
        or.addItem(f2);
        or.showOrder();
    }
}
