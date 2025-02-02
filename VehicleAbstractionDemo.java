// Defining the interface
interface Vehicle {
    // Abstract method (no implementation)
    void startEngine();
}

// Implementing the interface in the Car class
class Car implements Vehicle {
    // Providing the implementation of the startEngine() method for Car
    @Override
    public void startEngine() {
        System.out.println("Car engine is starting...");
    }
}

// Implementing the interface in the Bike class
class Bike implements Vehicle {
    // Providing the implementation of the startEngine() method for Bike
    @Override
    public void startEngine() {
        System.out.println("Bike engine is starting...");
    }
}

// Implementing the interface in the Truck class
class Truck implements Vehicle {
    // Providing the implementation of the startEngine() method for Truck
    @Override
    public void startEngine() {
        System.out.println("Truck engine is starting...");
    }
}

// Main class to demonstrate abstraction using interfaces
public class VehicleAbstractionDemo {
    public static void main(String[] args) {
        // Creating objects of classes that implement the Vehicle interface
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        // Demonstrating polymorphism with abstraction
        System.out.println("Demonstrating Abstraction using Interfaces:");
        car.startEngine();  // Calls Car's startEngine() method
        bike.startEngine(); // Calls Bike's startEngine() method
        truck.startEngine(); // Calls Truck's startEngine() method
    }
}
