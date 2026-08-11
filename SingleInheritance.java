class Animal {
    String name = "Dog";

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println("Animal: " + d.name);
        d.eat();
        d.sleep();
        d.bark();
    }
}