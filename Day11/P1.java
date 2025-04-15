interface Department{
    void assignDepartment(String department);
    String getDepartmentDetails();
}

abstract class Employee implements Department{
    private int employeeId;
    private String name;
    private double baseSalary;
    // per hour sal
    private String department;
    abstract double calculateSalary();
    Employee(String name, int employeeId, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
        this.employeeId=employeeId;
    }

    public String getName(){return name;}
    public double getBaseSalary(){return baseSalary;}
    public int getId(){return employeeId;}
    
    @Override
    public void assignDepartment(String department){
        this.department=department;
    }
    @Override
    public String getDepartmentDetails(){
        return "Department: "+department;
    }

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Base Salary: "+baseSalary);
        System.out.println(getDepartmentDetails());
        System.out.println("Total salary :"+calculateSalary());
    }
}

class FullTimeEmployee extends Employee{
    private double monthlyBonus;
    private double salary;

    public FullTimeEmployee(String name, int employeeId, double baseSalary, double monthlyBonus) {
        super(name, employeeId, baseSalary);
        this.monthlyBonus=monthlyBonus;
    }
    
    @Override
    double calculateSalary() {
        salary=getBaseSalary()+monthlyBonus;
        return salary;
    }
    double getBonus(){return monthlyBonus;}
    double getSalary(){return salary;}
}
class PartTimeEmployee extends Employee{
    private int hours;
    private double hourRate;
    private double salary;
    public PartTimeEmployee(String name, int employeeId, double baseSalary, int hours, double hourRate) {
        super(name, employeeId, baseSalary);
        this.hours=hours;
        this.hourRate=hourRate;
    }
    @Override
    double calculateSalary() {
        salary=getBaseSalary()+hours*hourRate;
        return salary;
    }
    double getOvertime(){return hours;}
    double getSalary(){return salary;} 
}

class Main{
    public static void main(String[] args) {
        // FullTimeEmployee ft  e=new FullTimeEmployee();
        Employee e1= new FullTimeEmployee("Mini", 1, 25000, 12000);
        e1.assignDepartment("IT");
        Employee e2= new FullTimeEmployee("Mini", 1, 25000, 12000);
        e2.assignDepartment("IT");
        Employee e3= new FullTimeEmployee("Mini", 1, 25000, 12000);
        e3.assignDepartment("IT");

        Employee[] employee={e1,e2, e3};
        for (Employee e : employee) {
            e.displayDetails();
        }
    }
}