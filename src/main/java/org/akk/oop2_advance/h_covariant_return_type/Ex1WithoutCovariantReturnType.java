package org.akk.oop2_advance.h_covariant_return_type;


/**
 * PRE-JAVA 5 -
 * */

class Animal {
    Animal reproduce() {
        System.out.println("Animal reproduces");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Animal reproduce() { /// must return Animal (same type)
        System.out.println("Dog reproduces");
        return new Dog();
    }
}

public class Ex1WithoutCovariantReturnType {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal baby = d.reproduce(); // returns Animal type

        Dog puppy = (Dog) baby; // unsafe, needs cast


    }
}
