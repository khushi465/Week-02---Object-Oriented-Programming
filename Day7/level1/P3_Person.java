
import java.util.*;

public class P3_Person {

    private String name;
    private int age;

    P3_Person() {
        this.name = "";
        this.age = 0;
    }

    P3_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    P3_Person(P3_Person obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        P3_Person p1 = new P3_Person(name, age);
        P3_Person p2 = new P3_Person(p1);
        p1.display();
        p2.display();

    }
}
