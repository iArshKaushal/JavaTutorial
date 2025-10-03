package org.akk.z1_other_concepts.other;


class Vehicle {
    private String type;

    /// Private constructor
    private Vehicle(String type) {
        this.type = type;
    }

    /// Static factory method
    public static Vehicle createCar() {
        return new Vehicle("Car");
    }

    public static Vehicle createBike() {
        return new Vehicle("Bike");
    }

    void display() {
        System.out.println("Vehicle type: " + type);
    }
}



public class StaticFactoryMethodEx1 {
    public static void main(String[] args) {
        Vehicle car = Vehicle.createCar();
        Vehicle bike = Vehicle.createBike();

        car.display();  // Vehicle type: Car
        bike.display(); // Vehicle type: Bike
    }
}

