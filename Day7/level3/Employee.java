
import java.util.*;

public class Employee {

    protected String department;
    public int employeeID;
    private double salary;

    Employee(String department, int employeeID) {
        this.department = department;
        this.employeeID = employeeID;
    }

    public void setSalary(double r) {
        salary = r;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    Manager(String department, int employeeID, double salary) {
        super(department, employeeID);
        setSalary(salary);
    }

    public void displayEmployeeDetails() {
        System.out.println("department: " + department);
        System.out.println("employeeID: " + employeeID);
        System.out.println("salary: " + getSalary());
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department, employeeID and salary");
        String department = sc.next();
        int employeeID = sc.nextInt();
        double salary = sc.nextDouble();
        Manager m = new Manager(department, employeeID, salary);
        m.displayEmployeeDetails();
    }

}
