package org.akk.oop2_advance.d_inner_classes.anonymous_inner_classes;


interface Greeting{
    void sayHello();
}



public class AnonymousInnerClassWithInterfaceEx1 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello form Anonymous Inner Class");
            }
        };
        greeting.sayHello();
    }
}
