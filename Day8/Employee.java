
import java.util.*;

public class Employee {

    public static String companyName;
    public static int count;
    public String name;
    public String designation;
    public final int id;

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + count);
    }

    public Employee(String name, int id, String companyName, String designation) {
        count++;
        this.name = name;
        this.designation = designation;
        this.id = id;
        this.companyName = companyName;
    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Id " + id);
        System.out.println("Designation " + designation);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company Name, name, designation and id");
        String companyName = sc.nextLine();
        String name = sc.nextLine();
        String designation = sc.nextLine();
        int id = sc.nextInt();
        Employee obj = new Employee(name, id, companyName, designation);
        if (obj instanceof Employee) {
            Employee.displayTotalEmployees();
            obj.display();
            System.out.println("Company Name " + Employee.companyName);
        } else {
            System.out.println("Not an instance");
        }

    }
}
