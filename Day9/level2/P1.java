
import java.util.*;

class Student {

    private String studentName;
    private int studentID;
    private ArrayList<Course> courses;

    Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    String getName() {
        return studentName;
    }

    int getID() {
        return studentID;
    }

    void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    void showCourses() {
        System.out.println("Student " + studentName);
        for (Course c : courses) {
            System.out.println("Course name " + c.getName());
            System.out.println("Course ID " + c.getID());
        }
        System.out.println();
    }
}

class Course {

    private String courseName;
    private int courseID;
    private ArrayList<Student> enrolledStudents;

    Course(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.enrolledStudents = new ArrayList<>();
    }

    String getName() {
        return courseName;
    }

    int getID() {
        return courseID;
    }

    void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);
        }
    }

    void showStudents() {
        System.out.println("Course " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println("Student name " + s.getName());
            System.out.println("Student ID " + s.getID());
        }
        System.out.println();
    }
}

class School {

    private String schoolName;
    private ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudentsInSchool() {
        System.out.println("School: " + schoolName);
        for (Student stu : students) {
            System.out.println("Student name: " + stu.getName());
            System.out.println("Student ID: " + stu.getID());
        }
        System.out.println();
    }
}

class Management {

    public static void main(String[] args) {
        School s = new School("DPS");
        Course math = new Course("Mathematics", 1);
        Course comp = new Course("Computer Science", 2);
        Course chem = new Course("Chemistry", 3);
        Student s1 = new Student("Khushi", 111);
        Student s2 = new Student("Esha", 112);
        Student s3 = new Student("Mini", 113);
        s1.enrollInCourse(math);
        s1.enrollInCourse(comp);
        s2.enrollInCourse(chem);
        s2.enrollInCourse(math);
        s.addStudent(s1);
        s.addStudent(s2);
        s.addStudent(s3);
        chem.addStudent(s3);
        s1.showCourses();
        s2.showCourses();
        s3.showCourses();
        math.showStudents();
        comp.showStudents();
        chem.showStudents();
        s.showStudentsInSchool();
    }
}
