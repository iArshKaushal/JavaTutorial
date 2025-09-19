package org.akk.oop1_basic.b_objects;



class Car {
    String color;

    void drive() {
        System.out.println("Car is driving");
    }
}


public class ObjectExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.drive();
        System.out.println("Color of the car is " + myCar.color);
    }
}
