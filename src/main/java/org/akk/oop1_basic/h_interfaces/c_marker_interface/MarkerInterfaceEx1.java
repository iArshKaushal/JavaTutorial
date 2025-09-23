package org.akk.oop1_basic.h_interfaces.c_marker_interface;


/// Clonable
class User implements Cloneable{
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



public class MarkerInterfaceEx1 {
    public static void main(String[] args) {

        try {
            User original = new User("Ashwani", 35);
            User cloned = (User) original.clone();

            System.out.println("Original: " + original.name + ", " + original.age);
            System.out.println("Cloned: " + cloned.name + ", " + cloned.age);

            // Modifying the cloned object
            cloned.age = 20;
            cloned.name = "Cloned";

            System.out.println("\nAfter modification:");
            System.out.println("Original: " + original.name + ", " + original.age);
            System.out.println("Cloned: " + cloned.name + ", " + cloned.age);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
