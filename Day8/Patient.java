
import java.util.*;

public class Patient {

    public static String hospitalName;
    public static int count;
    public String name;
    public int age;
    public String ailment;
    public final int patientID;

    public static int getTotalPatients() {
        return count;
    }

    public Patient(String name, int patientID, int age, String ailment, String hospitalName) {
        count++;
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        this.hospitalName = hospitalName;
    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Patient ID " + patientID);
        System.out.println("Age " + age);
        System.out.println("Ailment " + ailment);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hospital Name, Name, Age, Ailment and Patient ID");
        String hospitalName = sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();
        String ailment = sc.next();
        int patientID = sc.nextInt();
        Patient obj = new Patient(name, patientID, age, ailment, hospitalName);
        if (obj instanceof Patient) {
            System.out.println("Total Patients: "+Patient.getTotalPatients());
            obj.display();
            System.out.println("Hospital Name " + Patient.hospitalName);
        } else {
            System.out.println("Not an instance");
        }

    }
}
