package constructor;

class PersonModel {
    private String name;
    private int age;

    PersonModel() {
        this.name = "Unknown";
        this.age = 0;
    }

    PersonModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    PersonModel(PersonModel other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Person {
    public static void main(String[] args) {
        PersonModel p1 = new PersonModel("Alice", 22);
        PersonModel p2 = new PersonModel(p1);

        System.out.println("Original Person:");
        p1.display();

        System.out.println("Cloned Person:");
        p2.display();
    }
}
