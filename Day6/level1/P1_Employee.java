
import java.util.*;

public class P1_Employee {

    private String name;
    private int id;
    private int salary;

    P1_Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, id, salary of employee");
        String name = sc.nextLine();
        int id = sc.nextInt();
        int salary = sc.nextInt();
        P1_Employee emp = new P1_Employee(name, id, salary);
        emp.display();

    }
}
