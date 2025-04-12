
import java.util.*;

class Professor {

    private String professorName;
    private int professorID;
    private ArrayList<Course> courses;

    // private ArrayList<>
    public Professor(String professorName, int professorID) {
        this.professorID = professorID;
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    void addCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
            c.assignProfessor(this);
        }
    }

    String getName() {
        return professorName;
    }

    int getID() {
        return professorID;
    }

    void showCourses() {
        System.out.println("Professor: " + professorName);
        for (Course c : courses) {
            System.out.println("Course " + c.getName());
            System.out.println("ID " + c.getID());
        }
        System.out.println();
    }

    ArrayList<Course> getCourses() {
        return courses;
    }

}

class Student {

    private String studentName;
    private int studentID;
    private ArrayList<Course> courses;

    Student(String studentName, int studentID) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    void enrollInCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
            c.enrollStudent(this);
            System.out.println("Student " + studentName + " enrolled in course " + c.getName());
        }
    }

    void showCourses() {
        System.out.println("Student: " + studentName);
        for (Course c : courses) {
            System.out.println("Course " + c.getName());
            System.out.println("ID " + c.getID());
            System.out.println("Professor " + c.getInstructor().getName());
        }
        System.out.println();
    }

    String getName() {
        return studentName;
    }

    int getID() {
        return studentID;
    }

    ArrayList<Course> getCourses() {
        return courses;
    }

}

class Course {

    private String courseName;
    private int courseID;
    private Professor instructor;
    private ArrayList<Student> enrolledStudents;

    Course(String courseName, int courseID) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void enrollStudent(Student s) {
        if (!enrolledStudents.contains(s)) {
            enrolledStudents.add(s);
            s.enrollInCourse(this);
            // System.out.println("Student "+studentName+" enrolled in course "+courseName);
        }
    }

    void assignProfessor(Professor instructor) {
        this.instructor = instructor;
        if (!instructor.getCourses().contains(this)) {
            System.out.println("Professor " + instructor.getName() + " assigned to course " + courseName);
            instructor.addCourse(this);
        }
        // return instructor;
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        if (instructor != null) {
            System.out.println("Professor: " + instructor.getName());
        }
        for (Student s : enrolledStudents) {
            System.out.println("Student " + s.getName());
            System.out.println("ID " + s.getID());
        }
        System.out.println();
    }

    String getName() {
        return courseName;
    }

    int getID() {
        return courseID;
    }

    Professor getInstructor() {
        return instructor;
    }

}

class University {

    public static void main(String[] args) {
        Professor profSmith = new Professor("Dr. Smith", 101);
        Professor profLee = new Professor("Dr. Lee", 102);

        Student alice = new Student("Alice", 1001);
        Student bob = new Student("Bob", 1002);

        Course math = new Course("Calculus", 201);
        Course physics = new Course("Physics", 202);

        // Assign professors
        math.assignProfessor(profSmith);
        physics.assignProfessor(profLee);
        profLee.addCourse(math);

        // Enroll students
        alice.enrollInCourse(math);
        bob.enrollInCourse(math);
        alice.enrollInCourse(physics);

        // View relationships
        profSmith.showCourses();
        profLee.showCourses();
        alice.showCourses();
        bob.showCourses();
        math.showStudents();
        physics.showStudents();
    }
}
