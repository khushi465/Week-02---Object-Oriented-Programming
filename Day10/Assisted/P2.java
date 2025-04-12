
class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    int teamsize;

    Manager(String name, int id, double salary, int teamsize) {
        super(name, id, salary);
        this.teamsize = teamsize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamsize);
        System.out.println();
    }

}

class Developer extends Employee {

    String programmingLang;

    Developer(String name, int id, double salary, String programmingLang) {
        super(name, id, salary);
        this.programmingLang = programmingLang;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLang);
        System.out.println();
    }
}

class Intern extends Employee {

    int internPeriod;

    Intern(String name, int id, double salary, int internPeriod) {
        super(name, id, salary);
        this.internPeriod = internPeriod;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Period: " + internPeriod);
        System.out.println();
    }
}

class Main1 {

    public static void main(String[] args) {
        Manager d = new Manager("Spike", 1, 200000, 5);
        Developer c = new Developer("Tom", 2, 100000, "Python");
        Intern b = new Intern("Ronald", 3, 50000, 3);
        d.displayDetails();
        c.displayDetails();
        b.displayDetails();
    }
}
