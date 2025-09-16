package org.akk.oop_advance.inner_classes;


class Outer {
    private String message = "message from outer";

    class Inner {
        void display (){
            System.out.println(message);
        }
    }
}



public class MemberInnerClassExample {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.display();
    }

}
