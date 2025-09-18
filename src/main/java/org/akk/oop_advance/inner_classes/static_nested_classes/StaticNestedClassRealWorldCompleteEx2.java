package org.akk.oop_advance.inner_classes.static_nested_classes;

/** in this example
 * "Specifications" class is a top-level class
 * */
// 🔹 Top-level class
class Specifications {
    private int horsepower;
    private int seats;

    public Specifications(int horsepower, int seats) {
        this.horsepower = horsepower;
        this.seats = seats;
    }

    public int getHorsepower() { return horsepower; }
    public int getSeats() { return seats; }
}

class Car2 {
    private String model;
    private Specifications specs;

    public Car2(String model, Specifications specs) {
        this.model = model;
        this.specs = specs;
    }

    public void showDetails() {
        System.out.println("Car: " + model + " -> "
                + specs.getHorsepower() + " HP, " + specs.getSeats() + " seats");
    }
}

class Truck {
    private String model;
    private Specifications specs;

    public Truck(String model, Specifications specs) {
        this.model = model;
        this.specs = specs;
    }

    public void showDetails() {
        System.out.println("Truck: " + model + " -> "
                + specs.getHorsepower() + " HP, " + specs.getSeats() + " seats");
    }
}



public class StaticNestedClassRealWorldCompleteEx2 {
    public static void main(String[] args) {
        Specifications carSpecs = new Specifications(120, 5);
        Car2 car = new Car2("Honda City", carSpecs);
        car.showDetails();

        Specifications truckSpecs = new Specifications(400, 2);
        Truck truck = new Truck("Volvo", truckSpecs);
        truck.showDetails();
    }
}
