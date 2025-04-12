
import java.util.*;

public class Course {

    private String courseName;
    private double fee;
    private int duration;
    private static String institutionName;

    Course(String courseName, double fee, int duration) {
        this.courseName = courseName;
        this.fee = fee;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Fee: " + fee);
        System.out.println("Duration: " + duration);
        System.out.println("Institution Name: " + institutionName);
    }

    public static void updateInstitutionName(String i) {
        institutionName = i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course Name, Fee and Duration");
        String courseName = sc.nextLine();
        double fee = sc.nextDouble();
        int duration = sc.nextInt();
        Course obj = new Course(courseName, fee, duration);
        Course.updateInstitutionName("SRM");
        obj.displayCourseDetails();

    }
}
