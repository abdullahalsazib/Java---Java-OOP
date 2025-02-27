class Animal {
    String Name;

    Animal(String name) {
        this.Name = name;
    }

    void display() {
        System.out.println("That is my animal.. " + Name);
    }

    void makeSound() { // ✅ "nakeSound()" -> "makeSound()" ঠিক করা হয়েছে
        System.out.println("Some sound...");
    }
}

// 🐶 Dog Class (Method Overriding)
class Dog extends Animal {
    Dog(String Name) {
        super(Name);
    }

    @Override // override
    void makeSound() { // ✅ Method Overriding
        System.out.println("Woof Woof Woof");
    }
}

// 🐦 Bird Class (Method Overriding)
class Bird extends Animal {
    Bird(String Name) {
        super(Name);
    }

    @Override // override
    void makeSound() { // ✅ Method Overriding
        System.out.println("Pue Pue");
    }
}

// 🎯 Polymorphism in Action!
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, world");

        // ✅ Parent class reference দিয়ে Child class ব্যবহার করছি (Polymorphism)
        Animal myAnimal1 = new Dog("Kutub.");
        Animal myAnimal2 = new Bird("Moyna.");

        myAnimal1.display();
        myAnimal1.makeSound(); // 🐶 Dog class-এর makeSound() রান করবে

        myAnimal2.display();
        myAnimal2.makeSound(); // 🐦 Bird class-এর makeSound() রান করবে
    }
}
