class Animal {
    String Name;

    Animal(String name) {
        this.Name = name;
    }

    void display() {
        System.out.println("That is my animal.. " + Name);
    }

    void makeSound() { 
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    Dog(String Name) {
        super(Name);
    }

    @Override 
    void makeSound() { 
        System.out.println("Woof Woof Woof");
    }
}

class Bird extends Animal {
    Bird(String Name) {
        super(Name);
    }

    @Override 
    void makeSound() {
        System.out.println("Pue Pue");
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, world");

        Animal myAnimal1 = new Dog("Kutub.");
        Animal myAnimal2 = new Bird("Moyna.");

        myAnimal1.display();
        myAnimal1.makeSound(); 

        myAnimal2.display();
        myAnimal2.makeSound();
        
        Person person1 = new Person(1, "John Doe", "123 Main St", "555-555-5555", " john@gmail.com");
        person1.display();
    }
}
