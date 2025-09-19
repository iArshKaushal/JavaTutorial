package org.akk.oop1_basic.f_polymorphism.run_time;


/** Run Time Polymorphism
 * using method overriding
 * */

class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RTPolymorphismExample {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // upcasting
        Animal a2 = new Cat();

        a1.sound(); // Dog barks (runtime decision)
        a2.sound(); // Cat meows (runtime decision)
    }
}



