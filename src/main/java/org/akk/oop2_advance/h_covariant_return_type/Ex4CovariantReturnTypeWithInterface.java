package org.akk.oop2_advance.h_covariant_return_type;


interface Factory {
    Product create();
}



class Product {

}

class Car1 extends Product {

}

class Bus1 extends Product {

}



class CarFactory implements Factory {
    @Override
    public Car1 create() { // valid: Car is a subclass of Product
        return new Car1();
    }
}
class BusFactory implements Factory {
    @Override
    public Bus1 create() { // valid: Car is a subclass of Product
        return new Bus1();
    }
}


public class Ex4CovariantReturnTypeWithInterface {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        System.out.println("INSTANCE_OF : " + carFactory.create() );

        BusFactory busFactory = new BusFactory();
        busFactory.create();
        System.out.println("INSTANCE_OF : " + busFactory.create() );

    }
}
