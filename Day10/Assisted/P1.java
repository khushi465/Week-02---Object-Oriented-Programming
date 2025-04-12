
class Animal {

    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println(name + " Animal sound");
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Bark Bark");
    }

}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Meow Meow");
    }
}

class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

class Main {

    public static void main(String[] args) {
        Dog d = new Dog("Spike", 1);
        Cat c = new Cat("Tom", 2);
        Bird b = new Bird("Ducky", 3);
        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}
