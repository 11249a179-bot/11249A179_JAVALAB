interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Father owns a house");
    }

    public void motherProperty() {
        System.out.println("Mother owns a car");
    }

    void childProperty() {
        System.out.println("Child owns a bike");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Child c = new Child();

        c.fatherProperty();
        c.motherProperty();
        c.childProperty();
    }
}