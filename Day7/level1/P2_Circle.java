
import java.util.*;

public class P2_Circle {

    private int radius;

    P2_Circle() {
        this.radius = 0;
    }

    P2_Circle(int radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius " + radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        P2_Circle cir1 = new P2_Circle();
        P2_Circle cir2 = new P2_Circle(radius);
        cir1.display();
        cir2.display();

    }
}
