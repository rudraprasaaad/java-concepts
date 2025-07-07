package interface_concepts;

// key difference between interface and abstraction
// by default interface methods are public and abstract
// interface don't have constructors as it is not class
// use implements keyword to declare its functions in the class
// to implement multiple inheritance

interface Drivable {
    void drive();

    default void stop() {
        System.out.println("Vehicle stopped!!!");
    }
}

class Truck implements Drivable {
    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Drivable truck = new Truck();
        truck.drive();
        truck.stop();
    }
}
