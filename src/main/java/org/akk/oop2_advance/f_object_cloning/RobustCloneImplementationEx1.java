package org.akk.oop2_advance.f_object_cloning;

import java.util.ArrayList;
import java.util.List;


class Address implements Cloneable {
    String street;

    public Address(String street) {
        this.street = street;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


class Employee implements Cloneable {
     String name;
    Address address;
    private List<String> skills;

    public Employee(String name, Address address, List<String> skills) {
        this.name = name;
        this.address = address;
        this.skills = skills;
    }

    @Override
    public Employee clone() {
        try {
            Employee copy = (Employee) super.clone(); // shallow copy
            // deep copy mutable fields:
            if (this.address != null) copy.address = this.address.clone();
            if (this.skills != null) copy.skills = new ArrayList<>(this.skills); // elements not cloned
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


public class RobustCloneImplementationEx1 {
    public static void main(String[] args) {

        Address a1 = new Address("124 Yankee St.");
        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("Spring Boot");
        skills.add("Flutter");
        skills.add("JavaScript");

        Employee emp1 = new Employee("Ashwani", a1, skills);
        Employee emp2 = emp1.clone(); // Shallow Copy

        emp2.name = "Rahul";
        emp2.address.street = "456 Market St";

        System.out.println(emp1.name);
        System.out.println(emp2.name);

        System.out.println(emp1.address.street);
        System.out.println(emp2.address.street);

    }
}
