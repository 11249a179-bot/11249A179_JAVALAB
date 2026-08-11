class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog:");
        d.eat();
        d.bark();

        System.out.println("\nCat:");
        c.eat();
        c.meow();
    }
}