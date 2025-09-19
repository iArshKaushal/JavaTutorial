package org.akk.oop1_basic.g_relationships.composition;


class Engine {
    void start(){
        System.out.println("Engine Started....");
    }
}

class Car {
    private Engine engine; // Composition

    Car(){
        this.engine = new Engine();  // Engine created inside Car
    }

    void startCar(){
        engine.start();
        System.out.println("Car Starts......");
    }
}


public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
