// Base class: Animal
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class: Dog
class Dog extends Animal {
    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Derived class: Cat
class Cat extends Animal {
    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Derived class: Cow
class Cow extends Animal {
    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

// Main class to demonstrate polymorphism
public class AnimalPolymorphism {
    public static void main(String[] args) {
        // Creating an array of Animal references
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        // Using polymorphism to call overridden methods
        System.out.println("Demonstrating Polymorphism:");
        for (Animal animal : animals) {
            animal.makeSound();  // Calls the overridden method dynamically
        }
    }
}
