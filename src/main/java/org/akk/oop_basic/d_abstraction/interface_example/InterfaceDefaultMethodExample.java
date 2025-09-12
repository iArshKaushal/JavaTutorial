package org.akk.oop_basic.d_abstraction.interface_example;

interface Vehicle {
    void start(); // abstract method

    default void honk() {   // default method
        System.out.println("Beep Beep!");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

public class InterfaceDefaultMethodExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start(); // Car starts with key
        car.honk();  // Beep Beep! (default method)
    }
}

