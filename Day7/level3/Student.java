import java.util.*;

public class Student {

    protected String name;
    public int rollno;
    private double cgpa;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void updateCgpa(double r) {
        cgpa = r;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class PostGraduateStudent extends Student {

    PostGraduateStudent(String name, int rollno, double cgpa) {
        super(name, rollno);
        updateCgpa(cgpa);
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("rollno: " + rollno);
        System.out.println("CGPA: " + getCgpa());
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, RollNo and CGPA");
        String name = sc.nextLine();
        int rollno = sc.nextInt();
        double cgpa = sc.nextDouble();
        PostGraduateStudent pg = new PostGraduateStudent(name, rollno, cgpa);
        Student s=new Student(name, rollno);
        System.out.println(s.name);
        pg.displayStudentDetails();

    }
}
