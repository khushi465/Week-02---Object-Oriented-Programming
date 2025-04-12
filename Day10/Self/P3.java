class Order {

    String orderDate;
    int OrderID;

    public Order(String orderDate, int OrderID) {
        this.orderDate = orderDate;
        this.OrderID = OrderID;
    }

    void getOrderStatus() {
        System.out.println("Order orderDate: " + orderDate);
        System.out.println("Order ID: " + OrderID);
    }

}

class ShippedOrder extends Order {

    int trackingNumber;

    ShippedOrder(String orderDate, int OrderID, int trackingNumber) {
        super(orderDate, OrderID);
        this.trackingNumber = trackingNumber;
    }

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }

}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(String orderDate, int OrderID, int trackingNumber, String deliveryDate) {
        super(orderDate, OrderID, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }

}

class Main2 {

    public static void main(String[] args) {

        ShippedOrder t = new ShippedOrder("02-01-2025", 25, 2222);
        t.getOrderStatus();
        DeliveredOrder d = new DeliveredOrder("02-01-2025", 25, 2222, "05-01-2025");
        d.getOrderStatus();
    }
}
