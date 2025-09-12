package org.akk.oop_basic.d_abstraction.abstractclass_example;



abstract class Vehicle {
    abstract void start(); // abstract method (no body)

    void stop() { // concrete method (with body)
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick.");
    }
}




public class AbstractClassExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start(); // Car starts with a key.
        v1.stop();  // Vehicle stopped.

        Vehicle v2 = new Bike();
        v2.start(); // Bike starts with a kick.
    }
}
