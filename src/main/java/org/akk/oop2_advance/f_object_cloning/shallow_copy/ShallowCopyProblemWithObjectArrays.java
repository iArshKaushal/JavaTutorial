package org.akk.oop2_advance.f_object_cloning.shallow_copy;

/**
 * Shallow Copy Problem With Object Arrays
 * */

class Address{
    public String city;

    public Address (String city){
        this.city = city;
    }

}

public class ShallowCopyProblemWithObjectArrays {
    public static void main(String[] args) {

        Address[] addresses = {
                new Address("London"),
                new Address("New York"),
                new Address("Paris")
        };

        Address[] addresses2 = addresses.clone();
        addresses2[0].city = "Sydney";

        System.out.println("address[0]: " +  addresses[0].city); // Sydney (changed)
        System.out.println("address2[0]: " +  addresses2[0].city); // Sydney

        //⚠️ Problem: addresses[0] and addresses2[0] still point to the same Address object.
    }
}
