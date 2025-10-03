package org.akk.oop2_advance.f_object_cloning.deep_copy;



class Address1 {
    String city;

    Address1(String city) { this.city = city; }
}



class Person1 {
    String name;
    Address1 address;

    Person1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    /// Deep copy constructor
    Person1(Person1 p) {
        this.name = p.name;
        this.address = new Address1(p.address.city);
    }
}


public class DeepCopyWithCopyConstructor {
    public static void main(String[] args) {

    }
}
