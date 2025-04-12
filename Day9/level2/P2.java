
import java.util.*;
// creating objects inside the manager they will exist eveen after closing university
// departments.clear clears the list. 
// static class faculty

class University {

    private String univName;
    private ArrayList<Faculty> faculties;
    private ArrayList<Department> departments;

    University(String univName) {
        this.univName = univName;
        this.faculties = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    String getName() {
        return univName;
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void addDepartment(String departmentName, int departmentID) {
        departments.add(new Department(departmentName, departmentID));
    }

    void show() {
        System.out.println("University " + univName);
        for (Department d : departments) {
            System.out.println(d.getName());
            System.out.println(d.getID());

        }
        for (Faculty f : faculties) {
            System.out.println(f.getName());
            System.out.println(f.getID());

        }
    }

    void closeUniversity() {
        System.out.println("University closed and departments cleared");
        departments.clear();
    }

    static class Faculty {

        private String facultyName;
        private int facultyID;

        public Faculty(String facultyName, int facultyID) {
            this.facultyName = facultyName;
            this.facultyID = facultyID;
        }

        String getName() {
            return facultyName;
        }

        int getID() {
            return facultyID;
        }

    }

    class Department {

        private String departmentName;
        private int departmentID;

        public Department(String departmentName, int departmentID) {
            this.departmentName = departmentName;
            this.departmentID = departmentID;
        }

        String getName() {
            return departmentName;
        }

        int getID() {
            return departmentID;
        }
    }
}

class Manager {

    public static void main(String[] args) {
        University.Faculty f1 = new University.Faculty("Khushi", 111);
        University.Faculty f2 = new University.Faculty("Mini", 111);
        University u = new University("SRM");
        // University.Department d1=u.new Department("IT",1 );
        u.addDepartment("IT", 1);
        u.addFaculty(f1);
        u.addFaculty(f2);
        u.show();
        u.closeUniversity();
        u.show();
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        // System.out.println(d1.getName());

    }
}
