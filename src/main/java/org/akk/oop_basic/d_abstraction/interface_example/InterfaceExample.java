package org.akk.oop_basic.d_abstraction.interface_example;


interface Animal {
    void sound(); // abstract method by default
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}



public class InterfaceExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Dog barks
    }
}
