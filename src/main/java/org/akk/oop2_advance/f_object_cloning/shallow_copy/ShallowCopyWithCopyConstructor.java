package org.akk.oop2_advance.f_object_cloning.shallow_copy;


class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ShallowCopyWithCopyConstructor {
    public static void main(String[] args) {
        Person p1 = new Person("Ashwani", 35);
        Person p2 = new Person(p1);  // Using copy constructor

        p2.display();  // Output: Name: Ashwani, Age: 35
    }
}

