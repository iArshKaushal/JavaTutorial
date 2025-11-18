package org.akk.z1_other_concepts.other.d_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class Ex1Comparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        /// Sorting by age using a lambda expression for Comparator
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("Sorted by Age: " + people);

        /// Sorting by name using Comparator.comparing()
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted by Name: " + people);
    }
}


