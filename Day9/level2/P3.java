import java.util.*;
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors; 
    private ArrayList<Patient> patients; 
    Hospital(String hospitalName){
        this.hospitalName=hospitalName;
        this.patients=new ArrayList<>();
        this.doctors=new ArrayList<>();
    }
    void addDoctor(Doctor d){
        doctors.add(d);
    }
    void addPatient(Patient p){
        patients.add(p);
    }
    void show(){
        System.out.println("Hospital "+hospitalName);
        System.out.println("Doctors");
        for (Doctor d : doctors) {
            System.out.println("Name: "+d.getName());
            System.out.println("ID: "+d.getID());
            System.out.println("Specialization: "+d.getSpecialization());
        }
        System.out.println();
        System.out.println("Patients");
        for (Patient p : patients) {
            System.out.println("Name: "+p.getName());
            System.out.println("ID: "+p.getID());
            System.out.println("Ailment: "+p.getAilment());
        }
        System.out.println();
    }
    String getName(){
        return hospitalName;
    }
    
    class Doctor{
        private String doctorName;
        private String specialization;
        private int doctorID;
        private ArrayList<Patient> patients;
        
        public Doctor(String doctorName, String specialization, int doctorID) {
            this.doctorName=doctorName;
            this.specialization=specialization;
            this.doctorID=doctorID;
            this.patients=new ArrayList<>();
        }
        
        void consult(Patient p){
            if(!patients.contains(p)){
            System.out.println("Consultation between Dr. "+doctorName+" and Patient "+p.getName()+" for "+p.getAilment()+"\n");
                patients.add(p);
                p.addDoctor(this);
            }
        }
        void showPatients(){
            System.out.println("Patients of Doctor "+doctorName);
            for(Patient p: patients){
                System.out.println("Name: "+p.getName());
            System.out.println("ID: "+p.getID());
            System.out.println("Ailment: "+p.getAilment());
        }
        System.out.println();
        
        }
        String getName(){
            return doctorName;
        }
        String getSpecialization(){
            return specialization;
        }
        int getID(){
            return doctorID;
        }
        
    }
    class Patient{
        private String patientName;
        private String ailment;
        private int patientID;
        private ArrayList<Doctor> doctors;
        
        Patient(String patientName, String ailment, int patientID){
            this.patientID=patientID;
            this.ailment=ailment;
            this.patientName=patientName;
            this.doctors=new ArrayList<>();
        }
        void addDoctor(Doctor d){
            if(!doctors.contains(d)){
                doctors.add(d);
                d.consult(this);
            }
        }
        void showDoctors(){
            System.out.println("Doctors for patient "+patientName);
            for(Doctor d: doctors){
                System.out.println("Name: "+d.getName());
            System.out.println("ID: "+d.getID());
            System.out.println("Specialization: "+d.getSpecialization());
            }
            System.out.println();
        }
        String getName(){
            return patientName;
        }
        String getAilment(){
            return ailment;
        }
        int getID(){
            return patientID;
        }
    }
}

class Consulation{
    public static void main(String[] args) {
        Hospital h=new Hospital("Manipal");
        Hospital.Doctor d1=h.new Doctor("Rudra","Heart Specialist", 112);
        Hospital.Doctor d2=h.new Doctor("Mini","ENT", 113);
        Hospital.Doctor d3=h.new Doctor("Khushi","Brain Surjeon", 114);
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addDoctor(d3);
        Hospital.Patient p1=h.new Patient("Arya", "Cough", 1);
        Hospital.Patient p2=h.new Patient("Gaurang", "heart pain", 2);
        Hospital.Patient p3=h.new Patient("Shikshit", "Headache", 3);
        h.addPatient(p1);
        h.addPatient(p2);
        h.addPatient(p3);
        d1.consult(p2);
        d1.consult(p1);
        d2.consult(p1);
        d3.consult(p3);
        d1.showPatients();
        p1.showDoctors();
        h.show();

    }
}
