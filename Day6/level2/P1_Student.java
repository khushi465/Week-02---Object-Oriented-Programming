
import java.util.*;

public class P1_Student {

    private String name;
    private int rollno;
    private double marks;

    P1_Student(String name, int rollno, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public char calculateGrade() {
        char grade;
        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'B';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'C';
        } else if (marks >= 50 && marks <= 59) {
            grade = 'D';
        } else if (marks >= 40 && marks <= 49) {
            grade = 'E';
        } else {
            grade = 'R';
        }
        return grade;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollno);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name,  Roll no and Marks");
        String name = sc.nextLine();
        int rollno = sc.nextInt();
        double marks = sc.nextDouble();
        P1_Student stu1 = new P1_Student(name, rollno, marks);
        stu1.display();

    }
}
