package org.akk.oop_basic.f_polymorphism.vmt_mechanism;

class Animal {
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class VirtualMethodTableExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
