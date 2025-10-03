package org.akk.oop2_advance.f_object_cloning.cloning_and_inheritance;


/// Base Class
class Base implements Cloneable {
    int a;

    @Override
    protected Base clone() throws CloneNotSupportedException {
        return (Base) super.clone();
    }
}


/// Derived Class
class Derived extends Base {
    String name;

    @Override
    public Derived clone() {
        try {
            Derived d = (Derived) super.clone();
            /// deep-copy mutable fields here if needed
            return d;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


public class CloningAndInheritanceEx1 {
    public static void main(String[] args) {

    }
}
