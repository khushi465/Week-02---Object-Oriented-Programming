
import java.util.*;

public class Student {

    public static String universityName;
    public static int count;
    public String name;
    public char grade;
    public final int rollnumber;

    public static int displayTotalStudents() {
        return count;
    }

    public Student(String name, int rollnumber, char grade, String universityName) {
        count++;
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
        this.universityName = universityName;
    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Roll Number " + rollnumber);
        System.out.println("Grade " + grade);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter University Name, Name, Grade and Roll number");
        String universityName = sc.nextLine();
        String name = sc.nextLine();
        char grade = sc.next().charAt(0);
        int rollnumber = sc.nextInt();
        Student obj = new Student(name, rollnumber, grade, universityName);
        if (obj instanceof Student) {
            System.out.println("Total Students: "+Student.displayTotalStudents());
            obj.display();
            System.out.println("University Name " + Student.universityName);
        } else {
            System.out.println("Not an instance");
        }

    }
}
