package Inheritance;

class Vehicle {
    void start() {
        System.out.println("Starting");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car drives...");
    }
}


public class Single {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
