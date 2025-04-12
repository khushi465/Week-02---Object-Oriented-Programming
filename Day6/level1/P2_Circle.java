
import java.util.*;

public class P2_Circle {

    private int radius;

    P2_Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        P2_Circle cir = new P2_Circle(radius);
        cir.calculateArea();

    }
}
