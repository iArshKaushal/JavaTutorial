package org.akk.oop_advance.inner_classes.static_nested_classes;



class Car {
    private String model;
    private static String company;

    // Static nested class
    static class Specifications {
        private int horsepower;
        private int seats;

        Specifications(int horsepower, int seats) {
            this.horsepower = horsepower;
            this.seats = seats;
        }

        void showSpecs() {
            System.out.println("Horsepower: " + horsepower + ", Seats: " + seats + " Company: " + company);
        }
    }
}



public class StaticNestedClassRealWorldEx2 {
    public static void main(String[] args) {
        Car.Specifications specifications = new Car.Specifications(120, 4);
        specifications.showSpecs();
    }
}
