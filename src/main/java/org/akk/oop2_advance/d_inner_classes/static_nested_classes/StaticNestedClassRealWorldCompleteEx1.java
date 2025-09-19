package org.akk.oop2_advance.d_inner_classes.static_nested_classes;

/** In this example
 * "Specifications" class is a static nested class inside "Vehicle"
 * */

class Vehicle {

    // 🔹 Static nested class
    static class Specification{
        private int horsepower;
        private int seats;

        public Specification(int horsepower, int seats){
            this.horsepower = horsepower;
            this.seats = seats;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public int getSeats() {
            return seats;
        }
    }
}

class Car1 extends Vehicle {
  private String model;
  private Specification specification;

  public Car1(String model, Specification specification){
      this.model = model;
      this.specification = specification;
  }

  public void showDetails(){
      System.out.println("Car Model: " + model + ", Horsepower: " + specification.getHorsepower() + ", Seats: " + specification.getSeats());
  }
}


class Truck1 extends Vehicle {
    private String model;
    private Specification specification;

    public Truck1(String model, Specification specification){
        this.model = model;
        this.specification = specification;
    }

    public void showDetails(){
        System.out.println("Truck Model: " + model + ", Horsepower: " + specification.getHorsepower() + ", Seats: " + specification.getSeats());
    }
}






public class StaticNestedClassRealWorldCompleteEx1 {
    public static void main(String[] args) {
        Vehicle.Specification carSpecs = new Vehicle.Specification(120, 4);
        Car1 car1 = new Car1("Hyundai Creta", carSpecs);
        car1.showDetails();

        Vehicle.Specification truckSpecs = new Vehicle.Specification(300, 4);
        Truck1 truck1 = new Truck1("Tata AB112", truckSpecs);
        truck1.showDetails();
    }
}
