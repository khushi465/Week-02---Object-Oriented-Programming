
import java.util.*;

class Department {

    private String departmentName;
    private int departmentID;
    private ArrayList<Employee> emp;

    Department(String departmentName, int departmentID) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
        this.emp = new ArrayList<>();
    }

    String getName() {
        return departmentName;
    }

    int getID() {
        return departmentID;
    }

    void addEmployee(String empName, int empID) {
        emp.add(new Employee(empName, empID));
    }

    void showEmployees() {
        System.out.println("Department " + departmentName);
        for (Employee e : emp) {
            System.out.println("Employee Name: " + e.getName());
            System.out.println("Employee ID: " + e.getID());
        }
    }
    ArrayList<Employee> getEmployees(){
        return emp;
    }

    class Employee {

        private String empName;
        private int empID;

        Employee(String empName, int empID) {
            this.empName = empName;
            this.empID = empID;
        }

        String getName() {
            return empName;
        }

        int getID() {
            return empID;
        }
    }
}

class Company {

    private String name;
    private ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    void addDepartment(String departmentName, int departmentID) {
        departments.add(new Department(departmentName, departmentID));
    }

    void addEmpToDepartment(String departmentName, String empName, int empID) {
        for (Department d : departments) {
            if (d.getName().equalsIgnoreCase(departmentName)) {
                d.addEmployee(empName, empID);
            }
        }
    }

    void show() {
        System.out.println("Company " + name);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    void closeCompany() {
        System.out.println("Company closed all departments and employees removed");
        for (Department d : departments) {
            d.getEmployees().clear();
        }
        departments.clear();
    }
}

class CompanyStructure {

    public static void main(String[] args) {
        Company c1 = new Company("Capgemini");
        c1.addDepartment("IT", 11);
        c1.addDepartment("Management", 12);
        c1.addEmpToDepartment("IT", "Khushi", 123);
        c1.addEmpToDepartment("IT", "Arya", 124);
        c1.addEmpToDepartment("Management", "Gaurav", 125);
        c1.addEmpToDepartment("Management", "Arohi", 126);
        c1.addEmpToDepartment("Management", "Mini", 127);

        c1.show();
        c1.closeCompany();
        c1.show();

    }
}
