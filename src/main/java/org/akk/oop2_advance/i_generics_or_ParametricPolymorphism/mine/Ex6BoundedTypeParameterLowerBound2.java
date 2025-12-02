package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism.mine;


import java.util.ArrayList;
import java.util.List;

class Vehicle{
    public void showType(){
        System.out.println("I am a Vehicle");
    }
}

class Car extends Vehicle{
    @Override
    public void showType(){
        System.out.println("I am a Car");
    }
}

class SportsCar extends Car{
    @Override
    public void showType(){
        System.out.println("I am a SuperCar");
    }
}


public class Ex6BoundedTypeParameterLowerBound2 {

    public static void addCars(List<? super Car> list){

        list.add(new Car());        // ✅ allowed
        list.add(new SportsCar());  // ✅ allowed (subclass of Car)
        //list.add(new Vehicle()); // ❌ Not allowed (superclass of Car)

        System.out.println("\nCars added to list.");
    }

    public static void printVehicles(List<?> list){
        for(Object obj : list){
            // We don’t know the exact type, so we must treat as Object
            if(obj instanceof Vehicle){
                ((Vehicle) obj).showType();
            }
            else {
                System.out.println(obj);
            }
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        List<SportsCar> sportsCars = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        // All these lists can be passed to addCars()
        addCars(vehicles); // Vehicle is superclass of Car ✅
        addCars(cars);     // Car itself ✅
        addCars(objects);  // Object is superclass of Car ✅
        //addCars(sportsCars);  // ❌ Not allowed (subclass of Car)

        System.out.println("\n=== Printing vehicles ===");
        printVehicles(vehicles);
        printVehicles(cars);
        printVehicles(objects);

    }
}
