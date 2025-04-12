
class Person {

    int age;
    String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    void getPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

class Teacher extends Person {

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher");
        super.getPersonDetails();
        System.out.println("Subject: " + subject);

    }

}

class Student extends Person {

    char grade;

    Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student");
        super.getPersonDetails();
        System.out.println("Grade: " + grade);

    }

}

class Staff extends Person {

    double salary;

    Staff(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void displayRole() {
        System.out.println("Staff");
        super.getPersonDetails();
        System.out.println("Salary: " + salary);
    }

}

class Main5 {

    public static void main(String[] args) {

        Teacher t = new Teacher("Mini", 12, "Mathematics");
        t.displayRole();
        Student s = new Student("Arya", 25, 'O');
        s.displayRole();
        Staff f = new Staff("Kari", 34, 30000);
        f.displayRole();
    }
}
