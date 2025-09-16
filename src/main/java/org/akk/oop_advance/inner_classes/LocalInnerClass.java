package org.akk.oop_advance.inner_classes;

/// Local inner class in created inside, Method, constructor or a block
class OuterLocalInner{

    int number = 10; //


    void outerMethod(){
        class LocalInner {
            void display(){
                System.out.println("Number = " + number);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }
}


public class LocalInnerClass {
    public static void main(String[] args) {

        OuterLocalInner outerLocalInner = new OuterLocalInner();
        outerLocalInner.outerMethod();
    }
}
