
import java.util.ArrayList;

interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}
abstract class Patient implements MedicalRecord{
    private int patientId;
    private String name;
    private int age;
    private ArrayList<String> medicalHistory;
    private String diagnosis;
    Patient(int patientId, String name, int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
        this.medicalHistory=new ArrayList<>();
    }
    public void addRecord(String record){
        medicalHistory.add(record);
    }
    public void setDiagnosis(String diagnosis){
        this.diagnosis=diagnosis;
    }
    public void viewRecords(){
        System.out.println("Records");
        for (String r : medicalHistory) {
            System.out.println(r);
        }
    }
    abstract double calculateBill();
    void getPatientDetails(){
        System.out.println("Patient ID: "+patientId);
        System.out.println("Patient Name: "+name);
        System.out.println("Patient Age: "+age);
        System.out.println("Diagnosis: "+diagnosis);
        viewRecords();
        System.out.println("Total bill: "+calculateBill());
    }
    String getName(){return name;}
    int getID(){return patientId;}
    int getAge(){return age;}
    String getDiagnosis(){return diagnosis;}

}
class InPatient extends Patient{
    private int numberOfDays;
    private double roomRate;
    public InPatient(int patientId, String name, int age, int numberOfDays, double roomRate) {
        super(patientId, name, age);
        this.numberOfDays=numberOfDays;
        this.roomRate=roomRate;
    }
    double calculateBill(){
        return numberOfDays*roomRate+500;
    }
    
}
class OutPatient extends Patient{
    private double consultationFee;
    private int numberOfVisits;
    public OutPatient(int patientId, String name, int age, double consultationFee, int numberOfVisits) {
        super(patientId, name, age);
        this.consultationFee=consultationFee;
        this.numberOfVisits=numberOfVisits;
    }
    double calculateBill(){
        return consultationFee*numberOfVisits;
    }

}
class P7{
    public static void main(String[] args) {
        Patient p1=new InPatient(1, "Deepak", 27, 8, 600);
        p1.setDiagnosis("Pneumonia");
        p1.addRecord("Admitted for pneumonia");
        p1.addRecord("Given antibiotics");
        Patient p2=new OutPatient(2, "Mini", 22, 3, 1200);
        p2.setDiagnosis("Headachhe");
        p2.addRecord("Consulted for severe headache");
        p2.addRecord("Given painkillers");
        p1.getPatientDetails();
        p2.getPatientDetails();
    }
}