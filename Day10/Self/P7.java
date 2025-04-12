
class Person {

    int id;
    String name;

    public Person(String name, int id) {
        this.id = id;
        this.name = name;
    }

    void getPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

}

interface Worker{
    void performDuties();    
    // interface methods are supposed to be public
}

class Chef extends Person implements Worker {

    String speciality;

    Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    void displayRole() {
        System.out.println("Chef");
        super.getPersonDetails();
        System.out.println("Speciality: " + speciality);

    }
    @Override
    public void performDuties(){
        System.out.println("Cooking");
    }

}

class Waiter extends Person implements Worker {

    double tips;

    Waiter(String name, int id, double tips) {
        super(name, id);
        this.tips = tips;
    }

    void displayRole() {
        System.out.println("Waiter");
        super.getPersonDetails();
        System.out.println("Tips: " + tips);

    }
    @Override
    public void performDuties(){
        System.out.println("Waiting Tables");
    }

}

class Main6 {

    public static void main(String[] args) {

        Chef t = new Chef("Mini", 12, "Pasta");
        t.performDuties();
        t.displayRole();
        Waiter s = new Waiter("Arya", 25, 1200);
        s.performDuties();
        s.displayRole();
       
    }
}
