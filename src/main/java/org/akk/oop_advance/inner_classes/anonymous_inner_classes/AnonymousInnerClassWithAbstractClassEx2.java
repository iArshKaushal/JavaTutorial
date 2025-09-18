package org.akk.oop_advance.inner_classes.anonymous_inner_classes;


abstract class Animal{
    abstract void sound();
}

public class AnonymousInnerClassWithAbstractClassEx2 {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };
        dog.sound();
    }
}
