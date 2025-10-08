package org.akk.oop2_advance.f_object_cloning.deep_copy;


class Address implements Cloneable {
    String street;
    public Address(String street) { this.street = street; }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) { throw new AssertionError(); }
    }
}

///
class Person implements Cloneable {
    String name;
    Address address; // mutable

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Person clone() {
        try {
            Person copy = (Person) super.clone(); // shallow copy fields
            // now deep-clone mutable fields:

            //System.out.println("ADDRESS 1: " + this.address);

            if (this.address != null) {
                //System.out.println("Person : Name : " + this.name + ", Address : " + this.address.street );

                copy.address = this.address.clone();

                //System.out.println("Cloned Address: " + copy.address);
                //System.out.println("Person : Name : " + copy.name + ", Address : " + copy.address.street );
            }
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}



public class DeepCopyManualEx1 {

    public static void main(String[] args) {
        Address addr = new Address("123 Main St");
        Person p1 = new Person("Alice", addr);

        Person p2 = p1.clone();

        p2.name = "Bob";
        p2.address.street = "456 Market St";

        System.out.println(p1.name + " lives at " + p1.address.street);
        System.out.println(p2.name + " lives at " + p2.address.street);
    }
}
