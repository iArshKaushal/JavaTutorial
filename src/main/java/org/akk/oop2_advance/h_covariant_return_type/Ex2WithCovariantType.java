package org.akk.oop2_advance.h_covariant_return_type;

class Animal2 {
    Animal2 reproduce() {
        System.out.println("Animal reproduces");
        return new Animal2();
    }
}

class Dog2 extends Animal2 {

    @Override
    Dog2 reproduce() { // covariant return type!
        System.out.println("Dog reproduces");
        return new Dog2();
    }
}


public class Ex2WithCovariantType {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        Dog2 puppy = d.reproduce(); // no casting needed!

    }
}
