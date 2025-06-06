class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person(); // Default constructor

        // Displaying person details
        person1.displayPerson();
        person2.displayPerson();
    }
}
