package org.akk.oop2_advance.h_covariant_return_type;

/**
 * More complex example of Covariant return type : using Method Chaining
 * */


class Vehicle {
    Vehicle setColor(String color) {
        System.out.println("Vehicle color set to " + color);
        return this;
    }
}

class Car extends Vehicle {
    @Override
    Car setColor(String color) {
        System.out.println("Car color set to " + color);
        return this;
    }

    Car enableAirbags() {
        System.out.println("Airbags enabled");
        return this;
    }
}


public class Ex3MethodChaining {
    public static void main(String[] args) {
        new Car().setColor("Red").enableAirbags(); // method chaining works perfectly
    }
}



