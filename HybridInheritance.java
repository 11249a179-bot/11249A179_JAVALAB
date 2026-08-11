class Person {
    void speak() {
        System.out.println("Person can speak");
    }
}

interface Student {
    void study();
}

interface Sports {
    void play();
}

class CollegeStudent extends Person implements Student, Sports {

    public void study() {
        System.out.println("Student is studying");
    }

    public void play() {
        System.out.println("Student is playing");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        CollegeStudent s = new CollegeStudent();

        s.speak();
        s.study();
        s.play();
    }
}