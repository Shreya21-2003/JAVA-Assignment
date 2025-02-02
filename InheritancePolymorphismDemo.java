// Parent class: Vehicle
class Vehicle {
    // Method to be overridden
    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Subclass: Car
class Car extends Vehicle {
    // Overriding move() method
    @Override
    public void move() {
        System.out.println("The car is driving on the road.");
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    // Overriding move() method
    @Override
    public void move() {
        System.out.println("The bike is zooming on the highway.");
    }
}

// Main class to demonstrate inheritance and polymorphism
public class InheritancePolymorphismDemo {
    public static void main(String[] args) {
        // Creating objects of subclasses using a parent class reference (polymorphism)
        Vehicle myVehicle1 = new Car();  // Vehicle reference to Car object
        Vehicle myVehicle2 = new Bike(); // Vehicle reference to Bike object

        // Demonstrating polymorphism
        System.out.println("Demonstrating Polymorphism:");
        myVehicle1.move();  // Calls Car's move() method
        myVehicle2.move();  // Calls Bike's move() method
    }
}
