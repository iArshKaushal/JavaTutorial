package org.akk.zz_new_features.java8.e_method_reference;


// Reference to a static method
import java.io.*;
import java.util.*;
import java.util.function.Consumer;

class Person {
    private String name;
    private Integer age;

    // Constructor
    public Person(String name, int age)
    {
        // This keyword refers to current instance itself
        this.name = name;
        this.age = age;
    }

    // Getter-setters
    public Integer getAge() { return age; }
    public String getName() { return name; }
}



// Driver class
public class Ex2CompleteStaticMethodReference
{
    // Static method to compare with name
    public static int compareByName(Person a, Person b)	{
        return a.getName().compareTo(b.getName());
    }


    // Static method to compare with age
    public static int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }

    // Main driver method
    public static void main(String[] args) {

        // Creating an empty ArrayList of user-defined type, List of person
        List<Person> personList = new ArrayList<>();

        // Adding elements to above List, using add() method
        personList.add(new Person("Vicky", 24));
        personList.add(new Person("Poonam", 25));
        personList.add(new Person("Sachin", 19));

        // Using static method reference to ---> sort array by name
        Collections.sort(personList, Ex2CompleteStaticMethodReference::compareByName);

        // Display message only
        System.out.println("Sort by Name :");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        System.out.println();

        // Now using static method reference
        // to sort array by age
        Collections.sort(personList, Ex2CompleteStaticMethodReference::compareByAge);

        // Display message only
        System.out.println("Sort by Age :");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }
}

